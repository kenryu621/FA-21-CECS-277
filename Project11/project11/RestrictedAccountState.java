package project11;

// Author: Kenry Yu
// Date: December 5, 2021
// Description: Design a RestrictedAccountState class that extends from the AccountState class.
// If the balance in the account is less than or equal to 0. Then the status of the account is
// Restricted. At this time, users can deposit but it can’t withdraw money from the account.
// No interest for this account.

public class RestrictedAccountState extends AccountState {
    // Overloaded constructor with Account
    public RestrictedAccountState(Account account) {
        this.account = account;
    }

    // Overloaded constructor with AccountState
    public RestrictedAccountState(AccountState state) {
        this.account = state.account;
    }

    // deposit method that adds money to the Account
    // and check status after the operation
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateChangeCheck();
    }

    // withdraw method that deducts money from the Account
    // but since the Account is Restricted, withdraw is disallowed
    public void withdraw(double amount) {
        System.out.println("Account limited, withdrawal failed!");
    }

    // calculateInterest method that calculate and apply the interest to the Account
    // since the account status is not Gold, no interest applies
    public void calculateInterest() {
        System.out.println("Restricted state, no interest applies!");
    }

    // stateChangeCheck method that change the status of the account after every
    // transaction
    public void stateChangeCheck() {
        if (account.getBalance() > 0 && account.getBalance() < 20000)
            account.setState(new NormalAccountState(account));
        else if (account.getBalance() >= 20000)
            account.setState(new GoldAccountState(account));
    }
}
