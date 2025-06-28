DECLARE
    CURSOR acc_cursor IS
        SELECT AccountID, Balance
        FROM Accounts;

    v_Fee CONSTANT NUMBER := 100;
BEGIN
    FOR acc IN acc_cursor LOOP
        UPDATE Accounts
        SET Balance = Balance - v_Fee,
            LastModified = SYSDATE
        WHERE AccountID = acc.AccountID;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Annual maintenance fee applied to all accounts.');
END;
