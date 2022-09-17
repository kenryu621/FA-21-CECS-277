package project11;

// Author: Kenry Yu
// Date: December 5, 2021
// Description: Design an account class that combines an AccountState class.

public class Account {
    // Initialize private members
    private AccountState state = new RestrictedAccountState(this);
    private String owner;
    private double balance;

    // Overloaded constructor
    public Account(String owner, double init) {
        this.owner = owner;
        setBalance(init);
        stateChangeCheck();
    }

    // deposit method that adds amount of money to the account
    public void deposit(double amount) {
        state.deposit(amount);
    }

    // withdraw method that deducts amount of money from the account
    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    // calculateInterest method that calculate and apply interest to the account
    // only if the account status is Gold
    public void calculateInterest() {
        state.calculateInterest();
    }

    // stateChangeCheck method that change the status of the account after every
    // transaction
    public void stateChangeCheck() {
        state.stateChangeCheck();
    }

    // getBalance method that returns the balance
    public double getBalance() {
        return this.balance;
    }

    // getState method that returns the account status
    public AccountState getState() {
        return this.state;
    }

    // setBalance method that change the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // setState method that change the account status
    public void setState(AccountState state) {
        this.state = state;
    }
}
