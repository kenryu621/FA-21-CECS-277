package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design a PassFailExam class that inherits from the PassFailActivity class

class PassFailExam extends PassFailActivity {
    // Initialize the private member
    private int numQuestions = 10;
    private double pointsEach = 100 / numQuestions;
    private int numMissed;

    // Default constructor
    public PassFailExam() {
        super(70);
        this.setNumQuestions(10);
        this.setPointsEach(100 / this.getNumQuestion());
        this.setNumMissed(0);
        // Calculate the total score
        super.setScore(100 - (numMissed * pointsEach));
    }

    // Overloaded constructor
    public PassFailExam(int nq, int nm) {
        super(70);
        this.setNumQuestions(nq);
        this.setPointsEach(100 / this.getNumQuestion());
        this.setNumMissed(nm);
        // Calculate the total score
        super.setScore(100 - (numMissed * pointsEach));
    }

    // Accept an integer object and change the numQuestions
    public void setNumQuestions(int n) {
        numQuestions = n;
    }

    // Accept a double object and change the pointsEach
    public void setPointsEach(double p) {
        pointsEach = p;
    }

    // Accept an integer object and change the numMissed
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
