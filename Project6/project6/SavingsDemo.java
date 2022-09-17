package project6;

import java.util.Scanner;

// Author: Kenry Yu
// Date: October 13, 2021
// Description: Write a main class that demonstrate the SavingsAccount class.
// main(args : String[]);
// display(acc : SavingsAccount) : void;
// _continue(trans : String) : boolean;

class SavingsDemo {
    // Initialize a scanner for user's input
    static Scanner input = new Scanner(System.in);

    // main method
    public static void main(String[] args) {
        // Create a SavingsAccount object
        System.out.println(
                "Create a SavingsAccount object with a $100 balance, 3% interest rate, and a monthly service charge of $2.50.");
        SavingsAccount newAcc = new SavingsAccount(100, 0.03, 2.5);
        display(newAcc);
        // Ask user for the amount of deposit, and loop if the user want to to make
        // another transaction
        do {
            System.out.print("Please enter the amount you want to deposit: $");
            double depositAmount = Integer.parseInt(input.nextLine());
            newAcc.deposit(depositAmount);
        } while (_continue("deposit"));
        // Display the current datas after the deposits
        System.out.println("Display what we've done so far.");
        display(newAcc);
        // Ask user for the amount of withdrawal, and loop if the user want to to make
        // another transaction
        do {
            System.out.print("Please enter the amount you want to withdrawal: $");
            double withdrawalAmount = Integer.parseInt(input.nextLine());
            newAcc.withdraw(withdrawalAmount);
        } while (_continue("withdrawal"));
        // Display the current datas after the withdrawals
        System.out.println("Display what we've done so far.");
        display(newAcc);
        // Make a monthly process that would process the interest and monthly service
        // charge
        System.out.println("Doing the monthly process.");
        newAcc.monthlyProcess();
        // Display the current datas after the monthly process
        display(newAcc);
    }

    // display method that would print the balance, number of deposits, and number
    // of withdrawals
    static void display(SavingsAccount acc) {
        System.out.println(String.format("%nBalance: $%.2f%nNumber of deposits: %d%nNumber of withdrawals: %d%n",
                acc.getBalance(), acc.getNumDeposits(), acc.getNumWithdrawals()));
    }

    // _continue method that would ask the user want to make another transaction
    static boolean _continue(String trans) {
        String sel;
        System.out.print(String.format("Do you want to make another %s? ", trans));
        sel = input.nextLine();
        // Return true if yes and return false if no. If invalid input is made, calls
        // the method again.
        if (sel.equalsIgnoreCase("yes"))
            return true;
        else if (sel.equalsIgnoreCase("no"))
            return false;
        else {
            System.out.println("You input should be only yes or no, try again.");
            return _continue(trans);
        }
    }
}
