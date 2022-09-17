package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design a PassFailActivity class that inherits from the GradedActivity class.

class PassFailActivity extends GradedActivity {
    // Initialize the private member
    private double minPassingScore = 70;

    // Default constructor
    public PassFailActivity() {
        this.setMinPassingScore(70);
    }

    // Overloaded constructor
    public PassFailActivity(double ps) {
        this.setMinPassingScore(ps);
    }

    // Accept a double object and change the minPassingScore
    public void setMinPassingScore(double p) {
        minPassingScore = p;
    }

    // Return the minPassingScore
    public double getMinPassingScore() {
        return minPassingScore;
    }

    // Return Pass or Fail based on the score and minPassingScore
    public char getGrade() {
        if (super.getScore() >= this.getMinPassingScore())
            return 'P';
        else
            return 'F';
    }
}
