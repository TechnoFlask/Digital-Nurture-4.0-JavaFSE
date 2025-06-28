DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID, InterestRate, StartDate, EndDate
        FROM Loans;

    v_NewRate NUMBER;
    v_DurationMonths NUMBER;
BEGIN
    FOR loan IN loan_cursor LOOP
        v_DurationMonths := MONTHS_BETWEEN(loan.EndDate, loan.StartDate);

        IF v_DurationMonths > 36 THEN
            v_NewRate := loan.InterestRate - 0.5;
        ELSIF v_DurationMonths < 12 THEN
            v_NewRate := loan.InterestRate + 0.25;
        ELSE
            v_NewRate := loan.InterestRate;  -- No change
        END IF;

        UPDATE Loans
        SET InterestRate = v_NewRate
        WHERE LoanID = loan.LoanID;
    END LOOP;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Loan interest rates updated as per policy.');
END;
