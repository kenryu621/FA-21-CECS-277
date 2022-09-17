package project11;

// Author: Kenry Yu
// Date: December 5, 2021
// Description: Design a NormalAccountState class that extends from the AccountState class.
// If the balance in the account is greater than 0 and less than $20000
// the status of the account is normal

public class NormalAccountState extends AccountState {
    // Overloaded constructor with Account
    public NormalAccountState(Account account) {
        this.account = account;
    }

    // Overloaded constructor with AccountState
    public NormalAccountState(AccountState state) {
        this.account = state.account;
    }

    // deposit method that adds money to the Account
    // and check status after the operation
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateChangeCheck();
    }

    // withdraw method that deducts money from the Account
    // and check status after the operation
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateChangeCheck();
    }

    // calculateInterest method that calculate and apply the interest to the Account
    // since the account status is not Gold, no interest applies
    public void calculateInterest() {
        System.out.println("Normal state, no interest applies!");
    }

    // stateChangeCheck method that change the status of the account after every
    // transaction
    public void stateChangeCheck() {
        if (account.getBalance() <= 0) {
            account.setState(new RestrictedAccountState(account));
            System.out.println("Limited operation!");
        } else if (account.getBalance() >= 20000)
            account.setState(new GoldAccountState(account));
    }
}
