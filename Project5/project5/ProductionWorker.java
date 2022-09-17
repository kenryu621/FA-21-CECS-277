package project5;

// Author: Kenry Yu
// Date: October 6, 2021
// Description: Write a class named ProductionWorker that inherits from the Employee class.
// The productionWorker class stores data about an employee that is a production worker.
// shift : int
// payRate : double
// DAY_SHIFT : int = 1
// NIGHT_SHIFT : int = 2
// ProductionWorker(n : String, num : String, date : String, sh : int, rate : double)
// ProductionWorker()
// setShift(s : int) : void
// setPayRate(p : double) : void
// getShift() : int
// getPayRate() : double
// toString() : String

public class ProductionWorker extends Employee {
    // Initialize private member variables
    private int shift;
    private double payRate;
    private final int DAY_SHIFT = 1;
    private final int NIGHT_SHIFT = 2;

    // Default constructor
    public ProductionWorker() {
        this.shift = 0;
        this.payRate = 0;
    }

    // Overloaded constructor
    public ProductionWorker(String n, String num, String date, int sh, double rate) {
        setName(n);
        setEmployeeNumber(num);
        setHireDate(date);
        setShift(sh);
        setPayRate(rate);
    }

    // Accepts an int argument and change the shift member of the class
    public void setShift(int sh) {
        // Validate user's input and loop for input if the input is not 1 or 2
        while (sh != 1 && sh != 2) {
            System.out
                    .print("Your input of shift time is invalid!\nPlease enter 1 for day shift or 2 for night shift: ");
            sh = userInput.nextInt();
        }
        this.shift = sh;
    }

    // Accepts a double argument and change the payRate member of the class
    public void setPayRate(double p) {
        this.payRate = p;
    }

    // Returns the value in shift
    public int getShift() {
        return this.shift;
    }

    // Returns the value in payRate
    public double getPayRate() {
        return this.payRate;
    }

    // Return a string representation of this class
    public String toString() {
        // Check day or night shift
        String shift_time = new String();
        if (this.shift == DAY_SHIFT)
            shift_time = "Day";
        else if (this.shift == NIGHT_SHIFT)
            shift_time = "Night";
        // Returns the formatted String
        return String.format("%sShift: %s%nHourly Pay Rate: $%.2f%n", super.toString(), shift_time, payRate);
    }
}
