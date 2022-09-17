package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design a CourseGrades class that store scores of tests and assignments.

class CourseGrades implements Analyzable {
    // Initialize an array of GradedActivity
    private GradedActivity grades[];
    private int NUM_GRADES = 4;

    // Default constructor
    public CourseGrades() {
        grades = new GradedActivity[NUM_GRADES];
    }

    // Accept a GradedActivity object and set it to element 0 of the array
    public void setLab(GradedActivity aLab) {
        grades[0] = aLab;
    }

    // Accept a PassFailExam object and set it to element 1 of the array
    public void setPassFailExam(PassFailExam aPassFailExam) {
        grades[1] = aPassFailExam;
    }

    // Accept an Essay object and set it to element 2 of the array
    public void setEssay(Essay anEssay) {
        grades[2] = anEssay;
    }

    // Accept a FinalExam object and set it to element 3 of the array
    public void setFinalExam(FinalExam aFinalExam) {
        grades[3] = aFinalExam;
    }

    // Return the average of numeric scores
    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < NUM_GRADES; i++)
            sum += grades[i].getScore();
        return sum / NUM_GRADES;
    }

    // Return the object with highest numeric score
    public GradedActivity getHighest() {
        GradedActivity highest = grades[0];
        for (int i = 1; i < NUM_GRADES; i++)
            if (grades[i].getScore() > highest.getScore())
                highest = grades[i];
        return highest;
    }

    // Return the object with lowest numeric score
    public GradedActivity getLowest() {
        GradedActivity lowest = grades[0];
        for (int i = 1; i < NUM_GRADES; i++)
            if (grades[i].getScore() < lowest.getScore())
                lowest = grades[i];
        return lowest;
    }

    // Return a formatted string for print
    public String toString() {
        return String.format(
                "Lab Score: %.1f Grade: %c%nPass/Fail Exam Score: %.1f Grade: %c%nEssay Score: %.1f Grade: %c%nFinal Exam Score: %.1f Grade: %c%nAverage score: %.1f%nHighest score: %.1f%nLowest score: %.1f%n",
                grades[0].getScore(), grades[0].getGrade(), grades[1].getScore(), grades[1].getGrade(),
                grades[2].getScore(), grades[2].getGrade(), grades[3].getScore(), grades[3].getGrade(),
                this.getAverage(), this.getHighest().getScore(), this.getLowest().getScore());
    }
}
