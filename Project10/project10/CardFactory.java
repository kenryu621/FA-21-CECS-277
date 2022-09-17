package project10;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: Design an abstract CardFactory class implemented by AmericanExpressFactory, DiscoverFactory, and VisaFactory

abstract class CardFactory {
    // CreditCard method that initialize the Credit Card cooresponding to user input
    abstract public CreditCard GetCreditCard();
}
