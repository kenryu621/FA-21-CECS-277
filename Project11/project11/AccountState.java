package project11;

// Author: Kenry Yu
// Date: December 5, 2021
// Description: Design an abstract AccountState class that extends by RestrictedAccountState,
// GoldAccountState, and NormalAccountState class.

public abstract class AccountState {
    // Initialize account member
    protected Account account;

    // Required method for all account status
    abstract public void deposit(double amount);

    abstract public void withdraw(double amount);

    abstract public void calculateInterest();

    abstract public void stateChangeCheck();
}
