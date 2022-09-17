package project10;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: Design a DiscoverCreditCard that extends from the abstract class of CreditCard

class DiscoverCreditCard extends CreditCard {
    // Initialize private members
    private String cardType = "Discover";
    private int creditLimit;
    private int annualCharge;

    // Overloaded constructor
    public DiscoverCreditCard(int creditLimit, int annualCharge) {
        this.creditLimit = creditLimit;
        this.annualCharge = annualCharge;
    }

    // String method return the cardType
    public String CardType() {
        return cardType;
    }

    // int method return the creditLimit
    public int CreditLimit() {
        return creditLimit;
    }

    // int method return the annualCharge
    public int AnnualCharge() {
        return annualCharge;
    }
}
