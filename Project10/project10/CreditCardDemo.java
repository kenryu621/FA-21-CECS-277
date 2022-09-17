package project10;

import java.util.Scanner;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: In CreditCardDemo: You should be creating an instance of CardFactory and based
// on user input you will instantiate the right credit card. Values for credit limit and
// annual Charges is hard coded. Program is looping until user enters quit.

public class CreditCardDemo {
    public static void main(String[] args) {
        // Welcome prompt
        System.out.println("Welcome to Banking\n====================");
        // Initialize Scanner for user input, CardFactory and continue boolean
        Scanner userInput = new Scanner(System.in);
        CardFactory getYourCreditCard = null;
        boolean _continue = true;
        // Start looping program
        while (_continue) {
            // Print credit cards menu
            System.out.println("\n- AmericanExpress\n- Visa\n- Discover\n- Quit\n");
            // Ask for user input
            System.out.print("Enter the card type you would like to visit: ");
            String userChoice = userInput.nextLine();
            // Determine operation based on user input
            if (userChoice.equalsIgnoreCase("quit")) { // Break the loop if user input is quit
                _continue = false;
                break;
            } else if (userChoice.equalsIgnoreCase("visa"))
                // Initialize VisaFactory if user input is Visa
                getYourCreditCard = new VisaFactory(100000, 0);
            else if (userChoice.equalsIgnoreCase("discover"))
                // Initialize DiscoverFactory if user input is Discover
                getYourCreditCard = new DiscoverFactory(50000, 75);
            else if (userChoice.equalsIgnoreCase("americanexpress"))
                // Initialize AmericanExpressFactory if user input is AmericanExpress
                getYourCreditCard = new AmericanExpressFactory(500000, 100);
            else {
                // Ask for user input again if user input doesn't match all of above
                System.out.println("Invalid input...Please try again!");
                continue;
            }
            // Print credit card details
            System.out.printf(
                    "%nYour card details are below: %n%nCard Type: %s%nCredit Limit: $%s%nAnnual Charge: $%s%n",
                    getYourCreditCard.GetCreditCard().CardType(), getYourCreditCard.GetCreditCard().CreditLimit(),
                    getYourCreditCard.GetCreditCard().AnnualCharge());
        }
        // Exit program
        System.out.println("Exiting the program...Good bye!");
    }
}
