package project11;

// Author: Kenry Yu
// Date: December 5, 2021
// Description: Design an AccountStateDesignDemo class that demonstrate the Account and AccountState classes.

public class AccountStateDesignDemo {
    public static void main(String[] args) {
        // Initialize Tom Zank's Account
        Account tomZankAccount = new Account("Tom Zank", 0);
        System.out.println(String.format("Tom Zank: Opened an account with an initial amount of $%.2f.",
                tomZankAccount.getBalance()));
        splitLine();
        // Demonstrating the deposit method
        // Deposit 3000 dollar to Tom Zank's Account
        System.out.println(String.format("Tom Zank deposited $%.2f", 3000.00));
        tomZankAccount.deposit(3000);
        printBalanceAndState(tomZankAccount);
        // Deposit 2000 dollar to Tom Zank's Account
        System.out.println(String.format("Tom Zank deposited $%.2f", 2000.00));
        tomZankAccount.deposit(2000);
        printBalanceAndState(tomZankAccount);
        // Deposit 5000 dollar to Tom Zank's Account
        System.out.println(String.format("Tom Zank deposited $%.2f", 5000.00));
        tomZankAccount.deposit(5000);
        printBalanceAndState(tomZankAccount);
        // Demonstrating the calculateInterest method
        // Interest should not be calculated and applied since the account is not Gold
        tomZankAccount.calculateInterest();
        // Demonstrating the withdraw method
        // AccountState should be set to Restricted after this withdrawal
        System.out.println(String.format("Tom Zank withdraw money: $%.2f", 10000.00));
        tomZankAccount.withdraw(10000);
        printBalanceAndState(tomZankAccount);
        // Withdrawal should be denied since the account is Restricted
        System.out.println(String.format("Tom Zank withdraw money: $%.2f", 1100.00));
        tomZankAccount.withdraw(1100);
        printBalanceAndState(tomZankAccount);
        // Deposit 20000 dollar to Tom Zank's Account
        // AccountState should be set to Gold after this deposit
        System.out.println(String.format("Tom Zank deposited $%.2f", 20000.00));
        tomZankAccount.deposit(20000);
        printBalanceAndState(tomZankAccount);
        // Demonstrating the calculateInterest method
        // Interest should be calculated and applied since the AccountState is Gold now
        tomZankAccount.calculateInterest();
        // Deposit 1500 dollar to Tom Zank's Account
        System.out.println(String.format("Tom Zank deposited $%.2f", 1500.00));
        tomZankAccount.deposit(1500);
        printBalanceAndState(tomZankAccount);
    }

    // printBalanceAndState method that prints the balance and state of the account
    private static void printBalanceAndState(Account account) {
        System.out.println(String.format("Now the balance is: $%.2f%nThe account status is now: %s",
                account.getBalance(), account.getState().getClass().getSimpleName()));
        splitLine();
    }

    // splitLine method that serve decorating purpose
    private static void splitLine() {
        System.out.println(String.format("%50s", "").replaceAll(" ", "-"));
    }
}
