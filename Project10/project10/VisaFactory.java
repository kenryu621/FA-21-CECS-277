package project10;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: Design an VisaFactory extends from CardFactory

class VisaFactory extends CardFactory {
    // Initialize private members
    private int creditLimit;
    private int annualCharge;

    // Overloaded constructor
    public VisaFactory(int creditLimit, int annualCharge) {
        this.creditLimit = creditLimit;
        this.annualCharge = annualCharge;
    }

    // CreditCard method initialize the VisaCreditCard
    public CreditCard GetCreditCard() {
        return new VisaCreditCard(creditLimit, annualCharge);
    }
}
