package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design a FinalExam class that inherits from the GradedActivity class

class FinalExam extends GradedActivity {
    // Initialize the private members
    private int numQuestions = 50;
    private double pointsEach = 100 / numQuestions;
    private int numMissed;

    // Default constructor
    public FinalExam() {
        this.setNumQuestions(50);
        this.setPointsEach(100 / this.getNumQuestion());
        this.setNumMissed(0);
        // Calculate the total score
        super.setScore(100 - (numMissed * pointsEach));
    }

    // Overloaded constructor
    public FinalExam(int nq, int nm) {
        this.setNumQuestions(nq);
        this.setPointsEach(100 / this.getNumQuestion());
        this.setNumMissed(nm);
        // Calculate the total score
        super.setScore(100 - (numMissed * pointsEach));
    }

    // Accept a integer object and change the numQuestions
    public void setNumQuestions(int n) {
        numQuestions = n;
    }

    // Accept a double object and change the pointsEach
    public void setPointsEach(double p) {
        pointsEach = p;
    }

    // Accept a integer object and change the numMissed
    public void setNumMissed(int n) {
        numMissed = n;
    }

    // Return the numQuestions
    public int getNumQuestion() {
        return numQuestions;
    }

    // Return the pointsEach
    public double getPointsEach() {
        return pointsEach;
    }

    // Return the numMissed
    public int getNumMissed() {
        return numMissed;
    }
}
