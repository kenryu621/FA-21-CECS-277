package project5;

import java.util.Scanner;

// Author: Kenry Yu
// Date: October 6, 2021
// Description: Write a class named WorkerDemo to demostrate the classes.
// Create objects of ProductionWorker class.
// One object is using the overloaded constructor.
// The other object will ask for user inputs to set those values.
// main(String[])

public class WorkerDemo {
    public static void main(String[] args) {
        // Initialize scanner for user's input
        Scanner userInput = new Scanner(System.in);
        // Demostrating the overloaded constructor
        System.out.println("Here's the first production worker.");
        ProductionWorker john_smith = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 16.50);
        // Demostrating the toString method and prints the first object
        System.out.println(john_smith);
        // Demonstrating the default and setters
        System.out.println("Demostrating the input validation ...");
        ProductionWorker temp = new ProductionWorker();
        // Demostrating the name setter
        System.out.print("\nEnter the employee's name: ");
        String name = userInput.nextLine();
        temp.setName(name);
        // Demostrating the employeeNumber setter
        System.out.print("\nEnter the employee number: ");
        String eN = userInput.nextLine();
        temp.setEmployeeNumber(eN);
        // Demostrating the hireDate setter
        System.out.print("\nEnter the employee's hired date: ");
        String hD = userInput.nextLine();
        temp.setHireDate(hD);
        // Demostrating the shift setter
        System.out.print("\nEnter the employee's shift (Day = 1, Night = 2): ");
        int sh = userInput.nextInt();
        temp.setShift(sh);
        // Demostrating the payRate setter
        System.out.print("\nEnter the employee's pay rate: ");
        double pR = userInput.nextFloat();
        temp.setPayRate(pR);
        // Demostrating the toString method and prints the second object
        System.out.println("\nHere's the second production worker.");
        System.out.println(temp);
        // Close the scanner
        userInput.close();
    }
}
