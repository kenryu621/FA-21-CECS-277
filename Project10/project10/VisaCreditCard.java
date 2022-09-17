package project10;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: Design a VisaCreditCard that extends from the abstract class of CreditCard

class VisaCreditCard extends CreditCard {
    // Initialize private members
    private String cardType = "Visa";
    private int creditLimit;
    private int annualCharge;

    // Overloaded constructor
    public VisaCreditCard(int creditLimit, int annualCharge) {
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
