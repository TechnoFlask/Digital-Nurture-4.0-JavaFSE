CREATE TABLE AuditLog (
    LogID NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    TransactionID NUMBER,
    AccountID NUMBER,
    Action VARCHAR2(50),
    ActionDate DATE
);

CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (TransactionID, AccountID, Action, ActionDate)
    VALUES (:NEW.TransactionID, :NEW.AccountID, 'INSERT', SYSDATE);
END;
