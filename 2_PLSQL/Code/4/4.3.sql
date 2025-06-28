CREATE OR REPLACE FUNCTION HasSufficientBalance(
    p_AccountID IN NUMBER,
    p_Amount IN NUMBER
) RETURN BOOLEAN IS
    v_Balance NUMBER;
BEGIN
    SELECT Balance INTO v_Balance
    FROM Accounts
    WHERE AccountID = p_AccountID;

    RETURN v_Balance >= p_Amount;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RETURN FALSE;
    WHEN OTHERS THEN
        RETURN FALSE;
END;

DECLARE
    v_Result BOOLEAN;
BEGIN
    v_Result := HasSufficientBalance(1, 500);

    IF v_Result THEN
        DBMS_OUTPUT.PUT_LINE('Sufficient balance!');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Insufficient balance!');
    END IF;
END;
