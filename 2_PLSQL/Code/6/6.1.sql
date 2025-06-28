DECLARE
    CURSOR txn_cursor IS
        SELECT C.CustomerID, C.Name, T.TransactionID, T.TransactionDate, T.Amount, T.TransactionType
        FROM Customers C
        JOIN Accounts A ON C.CustomerID = A.CustomerID
        JOIN Transactions T ON A.AccountID = T.AccountID
        WHERE TO_CHAR(T.TransactionDate, 'MMYYYY') = TO_CHAR(SYSDATE, 'MMYYYY')
        ORDER BY C.CustomerID;

    v_LastCustomerID NUMBER := NULL;
BEGIN
    FOR txn IN txn_cursor LOOP
        IF v_LastCustomerID IS NULL OR v_LastCustomerID != txn.CustomerID THEN
            DBMS_OUTPUT.PUT_LINE('--- Statement for ' || txn.Name || ' (Customer ID: ' || txn.CustomerID || ') ---');
            v_LastCustomerID := txn.CustomerID;
        END IF;

        DBMS_OUTPUT.PUT_LINE(
            '  [' || TO_CHAR(txn.TransactionDate, 'DD-Mon') || '] '
            || txn.TransactionType || ' - $' || txn.Amount
        );
    END LOOP;
END;
