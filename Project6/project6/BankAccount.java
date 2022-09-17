package project6;

// Author: Kenry Yu
// Date: October 13, 2021
// Description: Design an abstract class named BankAccount.
// The class should hold the data of balance, number of deposits, number of withdrawals,
// annual interest rate, and monthly service charge.
// balance : double
// numDeposits : int
// numWithdrawals : int
// interestRate : double
// monthlyServiceCharge : double
// BankAccount();
// BankAccount(bal : double, intRate : double, mon : double);
// deposit(amount : double) : void;
// withdraw(amount : double) : void;
// calcInterest() : void;
// monthlyProcess() : void;
// setMonthlyServiceCharges(amount : double) : void;
// getBalance() : double;
// getNumDeposits() : int;
// getNumWithdrawals() : int;
// getInterestRate() : double;
// getMonthlyServiceCharges() : double;

class BankAccount {
    // Initialize protected variables
    protected double balance;
    protected int numDeposits = 0;
    protected int numWithdrawals = 0;
    protected double interestRate;
    protected double monthlyServiceCharge;

    // Default constructor
    public BankAccount() {
        balance = 0;
        interestRate = 0;
        monthlyServiceCharge = 0;
    }

    // Overloaded constructor
    public BankAccount(double bal, double rate, double mon) {
        balance = bal;
        interestRate = rate;
        monthlyServiceCharge = mon;
    }

    // deposit method accepts an argument for the amount
    // The method should add the amount to the balance
    // and increment the number of deposits
    public void deposit(double amount) {
        balance += amount;
        ++numDeposits;
    }

    // withdraw method accepts an argument for the amount
    // The method should subtract the amount from the balance
    // and increment the number of withdrawals
    public void withdraw(double amount) {
        balance -= amount;
        ++numWithdrawals;
    }

    // calcInterest method updates the balance by calculating
    // the monthly interest earned by the account, and adding this
    // interest to the balance
    private void calcInterest() {
        balance += interestRate / 12 * balance;
    }

    // monthlyProcess method that subtracts the monthly service
    // charge from the balance, calls the calcInterest method, then
    // sets the variables to zero
    public void monthlyProcess() {
        balance -= monthlyServiceCharge;
        calcInterest();
        numDeposits = 0;
        numWithdrawals = 0;
    }

    // setMonthlyServiceCharges method accepts a double argument
    // and change the monthlyServiceCharge field
    public void setMonthlyServiceCharges(double amount) {
        monthlyServiceCharge = amount;
    }

    // getBalance method returns the current balance
    public double getBalance() {
        return balance;
    }

    // getNumDeposits method returns the current number of deposits
    public int getNumDeposits() {
        return numDeposits;
    }

    // getNumWithdrawals method returns the current number of withdrawals
    public int getNumWithdrawals() {
        return numWithdrawals;
    }

    // getInterestRate method returns the interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // getMonthlyServiceCharges method returns the monthly service charge
    public double getMonthlyServiceCharges() {
        return monthlyServiceCharge;
    }
}
