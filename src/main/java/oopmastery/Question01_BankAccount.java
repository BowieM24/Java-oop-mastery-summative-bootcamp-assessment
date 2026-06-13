package oopmastery;

public class Question01_BankAccount {

    private String owner;
    private double balance;

    public Question01_BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    public void deposit(double amount) {
        // TODO:
        // Add the amount to the balance
        // Ignore negative deposits
    }

    public void withdraw(double amount) {
        // TODO:
        // Only withdraw if:
        // 1. amount is positive
        // 2. sufficient funds exist
        // Balance may never become negative
    }

    public double getBalance() {
        // TODO:
        return 0;
    }

    public String getOwner() {
        return owner;
    }
}
