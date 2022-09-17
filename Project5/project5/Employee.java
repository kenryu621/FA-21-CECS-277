package project5;

import java.util.Scanner;

// Author: Kenry Yu
// Date: October 6, 2021
// Description: Design a class named Employee.
// The class should keep the name, number, and hire date of the employee.
// name : String
// employeeNumber : String
// hireDate : String
// Employee(n : String, num : String, date : String)
// Employee()
// setName(n : String) : void
// setEmployeeNumber(e : String) : void
// setHireDate(h : String) : void
// getName() : String
// getEmployeeNumber() : String
// getHireDate() : String
// isValidEmpNum() : boolean
// toString() : String

public class Employee {
    // Initialize protected member variables
    protected String name;
    protected String employeeNumber;
    protected String hireDate;
    // Initialize scanner for user's input
    Scanner userInput = new Scanner(System.in);

    // Default constructor
    public Employee() {
        this.name = "";
        this.employeeNumber = "";
        this.hireDate = "";
    }

    // Overloaded constructor
    public Employee(String n, String num, String date) {
        setName(n);
        setEmployeeNumber(num);
        setHireDate(date);
    }

    // Accepts a String variable and change the name member
    public void setName(String n) {
        this.name = n;
    }

    // Accepts a String variable and change the employeeNumber member
    public void setEmployeeNumber(String num) {
        while (!isValidEmpNum(num)) {
            System.out.print(
                    "Invalid employee number. The correct format is XXX-L.\nEach X is a digit within the range 0 to 9.\nThe L is an alphabet letter.\nPlease try again: ");
            num = userInput.nextLine();
        }
        this.employeeNumber = num;
    }

    // Accepts a String variable and change the hireDate member
    public void setHireDate(String date) {
        this.hireDate = date;
    }

    // Returns the value in name member
    public String getName() {
        return this.name;
    }

    // Returns the value in employeeNumber member
    public String getEmployeeNumber() {
        return this.employeeNumber;
    }

    // Returns the value in hireDate member
    public String getHireDate() {
        return this.hireDate;
    }

    // Validate the user's input of employee number.
    // Check if the String is XXX-L format
    private boolean isValidEmpNum(String e) {
        // Check if the String is in correct length
        if (e.length() != 5) {
            return false;
        } else {
            // Check the first three digits
            for (int i = 0; i < 5; i++) {
                if (i < 3 && (e.charAt(i) < 48 || e.charAt(i) > 57))
                    return false;
                // Checks the hyphon
                else if (i == 3 && e.charAt(i) != 45)
                    return false;
                // Checks the letter
                else if (i == 4 && (e.charAt(i) < 65 || e.charAt(i) > 90) && (e.charAt(i) < 97 || e.charAt(i) > 122))
                    return false;
            }
            // If the String is in correct length and format, return true
            return true;
        }
    }

    // Return a string representation of this class
    public String toString() {
        // Returns the formatted String
        return String.format("Name: %s%nEmployee Number: %s%nHire Date: %s%n", this.name, this.employeeNumber,
                this.hireDate);
    }
}
