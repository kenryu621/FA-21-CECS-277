package project10;

// Author: Kenry Yu
// Date: November 29, 2021
// Description: Design an DiscoverFactory extends from CardFactory

class DiscoverFactory extends CardFactory {
    // Initialize private members
    private int creditLimit;
    private int annualCharge;

    // Overloaded constructor
    public DiscoverFactory(int creditLimit, int annualCharge) {
        this.creditLimit = creditLimit;
        this.annualCharge = annualCharge;
    }

    // CreditCard method initialize the DiscoverCreditCard
    public CreditCard GetCreditCard() {
        return new DiscoverCreditCard(creditLimit, annualCharge);
    }
}
