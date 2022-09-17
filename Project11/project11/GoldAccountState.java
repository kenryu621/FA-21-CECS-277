package project11;

// Author: Kenry Yu
// Date: December 5, 2021
// Description: Design a GoldAccountState class that extends from the AccountState class.
// If the balance in the account is equal or greater than to $20000.00. Then the status of the
// account is Gold.  The interest will be calculated by day. To calculate the interest, use
// hard coded value of 0.01 over one year.

public class GoldAccountState extends AccountState {
    // Overloaded constructor with Account
    public GoldAccountState(Account account) {
        this.account = account;
    }

    // Overloaded constructor with AccountState
    public GoldAccountState(AccountState state) {
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
    public void calculateInterest() {
        System.out.println("Gold account, interest amount will be applied!");
        double interest = account.getBalance() * (0.01 / 12);
        account.setBalance(account.getBalance() + interest);
        System.out.println(
                String.format("Interest amount: $%.2f%nBalance after interest: $%.2f", interest, account.getBalance()));
    }

    // stateChangeCheck method that change the status of the account after every
    // transaction
    public void stateChangeCheck() {
        if (account.getBalance() > 0 && account.getBalance() < 20000)
            account.setState(new NormalAccountState(account));
        else if (account.getBalance() <= 0) {
            account.setState(new RestrictedAccountState(account));
            System.out.println("Limited operation!");
        }
    }
}
