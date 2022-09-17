package project6;

// Author: Kenry Yu
// Date: October 13, 2021
// Description: Design a SavingsAccount class that extends the BankAccount class.
// The class should have a status field to represent an active or inactive account
// status : boolean;
// SavingsAccount(bal : double, intRate : double, mon : double);
// withdraw(amount : double) : void;
// deposit(amount : double) : void;
// monthlyProcess() : void;

class SavingsAccount extends BankAccount {
    // Initialize the private variables
    private boolean status = true;

    // Overloaded constructor
    public SavingsAccount(double bal, double intRate, double mon) {
        balance = bal;
        interestRate = intRate;
        monthlyServiceCharge = mon;
    }

    // withdraw method accepts a double argument
    // If the status of SavingsAccount is active, then calls the withdraw method of
    // BankAccount class
    // If the status of SavingsAccount is inactive, abandon the transaction
    // If the balance falls below $25 after the transaction, change status to
    // inactive
    public void withdraw(double amount) {
        if (!status)
            System.out.println(
                    "Your transaction is not allowed because your savings account is inactive.\nPlease deposit and make sure the balance is above $25.");
        else {
            super.withdraw(amount);
            if (balance < 25)
                status = false;
        }
    }

    // deposit method accepts a double argument
    // Calls the deposit method of BankAccount class
    // If the balance raised over $25 after the deposit, change the status to active
    public void deposit(double amount) {
        super.deposit(amount);
        if (status == false && balance > 25)
            status = true;
    }

    // monthlyProcess method checks the number of withdrawals and add $1 for each
    // withdrawal above 4
    // Check if the balance falls below $25 and determine the status of the account
    public void monthlyProcess() {
        if (numWithdrawals > 4)
            monthlyServiceCharge += numWithdrawals - 4;
        super.monthlyProcess();
        if (balance < 25)
            status = false;
        else
            status = true;
    }
}
