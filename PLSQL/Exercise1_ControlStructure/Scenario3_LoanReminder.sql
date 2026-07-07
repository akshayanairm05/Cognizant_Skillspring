DECLARE
    CURSOR loan_cursor IS
        SELECT CustomerID,
               LoanID,
               DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR loan_record IN loan_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan ID '
            || loan_record.LoanID
            || ' for Customer ID '
            || loan_record.CustomerID
            || ' is due on '
            || TO_CHAR(loan_record.DueDate, 'DD-MON-YYYY')
        );

    END LOOP;

END;
/
