
import transaction.Account;
import reports.TransactionReport;

public class Main {

    public static void main(String[] args) {

        // Create Account
        Account a = new Account(1001, 5000);

        // Deposit money
        a.deposit(2000);

        // Withdraw money
        a.withdraw(1000);

        // Generate Transaction Report
        TransactionReport report =
                new TransactionReport();

        report.generateReport(a);
    }
}
