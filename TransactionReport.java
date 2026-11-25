
package reports;

import transaction.Account;

public class TransactionReport {

    public void generateReport(Account acc) {

        System.out.println("\n--- TRANSACTION REPORT ---");

        System.out.println("Account Number: "
                + acc.getAccountNumber());

        System.out.println("\nTransaction History:");

        for (String t : acc.getTransactions()) {

            System.out.println(t);
        }

        System.out.println("\nFinal Balance: "
                + acc.getBalance());
    }
}
