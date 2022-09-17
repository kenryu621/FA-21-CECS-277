package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design an interface to modify the CourseGrades class.

interface Analyzable {
    public double getAverage(); // Return the average of numeric scores

    public GradedActivity getHighest(); // Return a reference to the element that has highest numeric score

    public GradedActivity getLowest(); // Return a reference to the element that has lowest numeric score
}
