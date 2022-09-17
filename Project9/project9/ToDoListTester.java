package project9;

import java.util.Scanner;

// Author: Kenry Yu
// Date: November 11, 2021
// Description: Design a ToDoListTester class that would demonstrate the Task class and ToDoList class

class ToDoListTester {
    // Initializing the scanner for user's input
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        // Initializing a ToDoList for user
        ToDoList myList = new ToDoList();
        // Continue to ask for user's input
        boolean _continue = true;
        // String to store user's input
        String line;
        // Displaying the menu
        System.out.println("To Do List - Please enter an option");
        System.out.println("  add priority description (add a new task)");
        System.out.println("  next (remove and print most urgent task)");
        System.out.println("  quit (exit the program)");
        // Loop for user's input
        while (_continue) {
            // Scanning user's input and store in the String
            System.out.print("> ");
            line = userInput.nextLine();
            // Stop the loop if user typed quit
            if (line.equalsIgnoreCase("quit"))
                _continue = false;
            // Remove and display the most urgent task if user typed next
            else if (line.equalsIgnoreCase("next"))
                myList.nextTask();
            // Attemp to add task to the ToDoList if the user typed add
            else if (line.substring(0, 3).equalsIgnoreCase("add"))
                myList.addTask(line);
            // Ask user to use correct command
            else
                System.out.println("Invalid command, please enter an option from the menu.");
        }
        // Run tester for remaining demonstration
        tester();
    }

    static void tester() {
        // Initializing a ToDoList for tester
        ToDoList test = new ToDoList();
        // Demonstrate the addTask method
        System.out.println("\nRunning tester...\nAdding the following 6 items to the list.");
        System.out.println("\"add 1 Complete Programming Exercise 15.11\"");
        System.out.println("\"add 8 Read for tomorrow's class\"");
        System.out.println("\"add 3 Soccer practice\"");
        System.out.println("\"add 6 Call parents\"");
        System.out.println("\"add 5 Have dinner with friends\"");
        System.out.println("\"add 9 Sleep well\"");
        test.addTask("add 1 Complete Programming Exercise 15.11");
        test.addTask("add 8 Read for tomorrow's class");
        test.addTask("add 3 Soccer practice");
        test.addTask("add 6 Call parents");
        test.addTask("add 5 Have dinner with friends");
        test.addTask("add 9 Sleep well");
        // Testing addTask method if user entered wrong command
        System.out.println("\nEntering 'add bad command'");
        test.addTask("add bad command");
        // Show expectation and demonstrate the nextTask method
        System.out.println(
                "Expected: The priority must be an integer between 1 and 9.\n\nPulling most urgent items out.");
        test.nextTask();
        System.out.println("Expected: Complete Programming Exercise 15.11");
        test.nextTask();
        System.out.println("Expected: Soccer practice");
        test.nextTask();
        System.out.println("Expected: Have dinner with friends");
        test.nextTask();
        System.out.println("Expected: Call parents");
        test.nextTask();
        System.out.println("Expected: Read for tomorrow's class");
        test.nextTask();
        System.out.println("Expected: Sleep well");
        test.nextTask();
        System.out.println("Expected: There are no tasks in the list.");
        System.out.println("\nTesting equals and hashCode method...\nAdding the following 2 items to the list.");
        // Demonstrate the hashCode method and equals method
        System.out.println("\"add 1 Something duplicated\"");
        System.out.println("\"add 3 Something duplicated\"");
        test.addTask("add 1 Something duplicated");
        test.addTask("add 3 Something duplicated");
    }
}
