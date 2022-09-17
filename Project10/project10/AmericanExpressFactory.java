package project10;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: Design an AmericanExpressFactory extends from CardFactory

class AmericanExpressFactory extends CardFactory {
    // Initialize private members
    private int creditLimit;
    private int annualCharge;

    // Overloaded constructor
    public AmericanExpressFactory(int creditLimit, int annualCharge) {
        this.creditLimit = creditLimit;
        this.annualCharge = annualCharge;
    }

    // CreditCard method initialize the AmericanExpressCreditCard
    public CreditCard GetCreditCard() {
        return new AmericanExpressCreditCard(creditLimit, annualCharge);
    }
}
