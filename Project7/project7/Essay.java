package project7;

// Author: Kenry Yu
// Date: October 27, 2021
// Description: Design an Essay class that inherits from the GradedActivity class.

class Essay extends GradedActivity {
    // Initialize the private members
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    // Overloaded constructor
    public void setScore(double gr, double sp, double len, double cnt) {
        this.setgrammar(gr);
        this.setSpelling(sp);
        this.setCorrectLength(len);
        this.setContent(cnt);
        super.setScore(this.getScore());
    }

    // Accept a double object and change the grammar member
    public void setgrammar(double g) {
        grammar = g;
    }

    // Accept a double object and change the spelling member
    public void setSpelling(double s) {
        spelling = s;
    }

    // Accept a double object and change the correctLength member
    public void setCorrectLength(double c) {
        correctLength = c;
    }

    // Accept a double object and change the content member
    public void setContent(double c) {
        content = c;
    }

    // Return the score of grammar
    public double getGrammar() {
        return grammar;
    }

    // Return the score of spelling
    public double getSpelling() {
        return spelling;
    }

    // Return the score of correctLength
    public double getCorrectLength() {
        return correctLength;
    }

    // Return the score of content
    public double getContent() {
        return content;
    }

    // Add up the scores to return the total score
    public double getScore() {
        return this.getGrammar() + this.getSpelling() + this.getCorrectLength() + this.getContent();
    }
}
