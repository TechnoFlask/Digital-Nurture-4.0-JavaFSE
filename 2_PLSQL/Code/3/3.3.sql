CREATE OR REPLACE PROCEDURE TransferFunds(
    p_FromAccountID IN NUMBER,
    p_ToAccountID IN NUMBER,
    p_Amount IN NUMBER
) IS
    v_FromBalance NUMBER;
    v_FromCustomerID NUMBER;
    v_ToCustomerID NUMBER;
BEGIN
    SELECT CustomerID, Balance INTO v_FromCustomerID, v_FromBalance
    FROM Accounts WHERE AccountID = p_FromAccountID FOR UPDATE;

    SELECT CustomerID INTO v_ToCustomerID
    FROM Accounts WHERE AccountID = p_ToAccountID FOR UPDATE;

    IF v_FromCustomerID != v_ToCustomerID THEN
        RAISE_APPLICATION_ERROR(-20010, 'Accounts do not belong to the same customer.');
    END IF;

    IF v_FromBalance < p_Amount THEN
        RAISE_APPLICATION_ERROR(-20011, 'Insufficient funds in source account.');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_Amount,
        LastModified = SYSDATE
    WHERE AccountID = p_FromAccountID;

    UPDATE Accounts
    SET Balance = Balance + p_Amount,
        LastModified = SYSDATE
    WHERE AccountID = p_ToAccountID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Funds transferred successfully.');

EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
