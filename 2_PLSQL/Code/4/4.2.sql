CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_LoanAmount IN NUMBER,
    p_InterestRate IN NUMBER,
    p_DurationYears IN NUMBER
) RETURN NUMBER IS
    v_MonthlyRate NUMBER := p_InterestRate / 12 / 100;
    v_TotalMonths NUMBER := p_DurationYears * 12;
    v_EMI NUMBER;
BEGIN
    IF v_MonthlyRate = 0 THEN
        v_EMI := p_LoanAmount / v_TotalMonths;
    ELSE
        v_EMI := p_LoanAmount * v_MonthlyRate * POWER(1 + v_MonthlyRate, v_TotalMonths)
                 / (POWER(1 + v_MonthlyRate, v_TotalMonths) - 1);
    END IF;

    RETURN ROUND(v_EMI, 2);
END;

SELECT CalculateMonthlyInstallment(50000, 5, 5) AS EMI FROM dual;
