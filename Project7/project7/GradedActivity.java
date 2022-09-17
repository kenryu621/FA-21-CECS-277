package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design a GradedActivity class to hold the score and grade of the activities

class GradedActivity {
    // Initialize the private member
    private double score;

    // Accept a double object and change the score
    public void setScore(double s) {
        score = s;
    }

    // Return the score
    public double getScore() {
        return score;
    }

    // Return a letter grade based on the score
    public char getGrade() {
        if (score < 60)
            return 'F';
        else if (score < 70)
            return 'D';
        else if (score < 80)
            return 'C';
        else if (score < 90)
            return 'B';
        else
            return 'A';
    }
}
