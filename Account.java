
package transaction;

import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private double balance;

    private ArrayList<String> transactions =
            new ArrayList<>();

    public Account(int accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;

        transactions.add("Initial Balance: " + balance);
    }

    public void deposit(double amount) {

        if (amount > 0) {

            balance = balance + amount;

            transactions.add("Deposited: " + amount);

            System.out.println("Amount Deposited Successfully");

        } else {

            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance = balance - amount;

            transactions.add("Withdrawn: " + amount);

            System.out.println("Amount Withdrawn Successfully");

        } else {

            System.out.println("Insufficient Balance or Invalid Amount");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }
}
