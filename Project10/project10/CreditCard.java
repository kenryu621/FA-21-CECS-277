package project10;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: Design an abstract CreditCard class implemented by AmericanExpressCreditCard, DiscoverCreditCard, and VisaCreditCard

abstract class CreditCard {
    // String method return cardType
    abstract public String CardType();

    // int method return creditLimit
    abstract public int CreditLimit();

    // int method return annualCharge
    abstract public int AnnualCharge();
}
