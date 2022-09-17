package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design a CourseGradesDemo class to demonstrate the CourseGrades class

class CourseGradesDemo {
    public static void main(String[] args) {
        // Initialize CourseGrades object
        CourseGrades student = new CourseGrades();
        // Initialize a GradedActivity object and add it to the CourseGrades
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);
        student.setLab(lab);
        // Initialize an Essay object and add it to the CourseGrades
        Essay e = new Essay();
        e.setScore(25, 18, 17, 20);
        student.setEssay(e);
        // Initialize a PassFailExam object and add it to the CourseGrades
        PassFailExam exam = new PassFailExam(20, 3);
        student.setPassFailExam(exam);
        // Initialize a FinalExam object and add it to the CourseGrades
        FinalExam finalExam = new FinalExam(50, 10);
        student.setFinalExam(finalExam);
        // Demostrate the toString method and print out the result
        System.out.println(student);
    }
}
