CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_AccountBalance NUMBER;
BEGIN
    SELECT Balance INTO v_AccountBalance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;

    IF :NEW.TransactionType = 'Withdrawal' AND :NEW.Amount > v_AccountBalance THEN
        RAISE_APPLICATION_ERROR(-20001, 'Withdrawal exceeds account balance.');
    ELSIF :NEW.TransactionType = 'Deposit' AND :NEW.Amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive.');
    ELSIF :NEW.TransactionType = 'Withdrawal' AND :NEW.Amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20003, 'Withdrawal amount must be positive.');
    END IF;
END;
