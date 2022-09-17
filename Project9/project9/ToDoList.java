package project9;

import java.util.PriorityQueue;

// Author: Kenry Yu
// Date: November 11, 2021
// Description: Design a ToDoList class that use PriorityQueue to sort the importance of tasks.
// Tasks have a priority between 1 and 9, and a description. When the user enters the command
// add priority description, the program adds a new task. When the user enters next,
// the program removes and prints the most urgent task. The quit command quits the program.

public class ToDoList {
    // Initializing the PriorityQueue
    PriorityQueue<Task> list = new PriorityQueue<>();

    // addTask method that would adds a new task to the PriorityQueue
    public void addTask(String command) {
        // Splitting the command line
        String[] args = command.split(" ", 3);
        // Checking the format of the command line
        // Stop the method if the conditions are not met
        if (!args[0].equalsIgnoreCase("add") || args.length != 3) {
            System.out.println("Invalid add command, please follor the format.");
            return;
        }
        // Checking if the priority number is an integer and in the valid range
        // Stop the method if the conditions are not met
        int priNum;
        try {
            priNum = Integer.parseInt(args[1]);
            if (priNum < 1 || priNum > 9)
                throw new Exception();
        } catch (Exception e) {
            System.out.println("The priority must be an integer between 1 and 9.");
            return;
        }
        // Finding potential duplicated task in the PriorityQueue
        // Stop the method if there is duplicated task
        Task newTask = new Task(priNum, args[2]);
        for (Task taskInList : list) {
            if (newTask.equals(taskInList)) {
                System.out.println(
                        String.format("Task already exist in the list.%nTask in the list: %s Task attempted to add: %s",
                                taskInList.hashCode(), newTask.hashCode()));
                return;
            }
        }
        // Add new task to the PriorityQueue if the command line is valid and no
        // duplicated task in the PriorityQueue
        this.list.add(newTask);
    }

    // nextTask method that would removes and prints the most urgent task
    public void nextTask() {
        if (list.peek() == null)
            System.out.println("There are no tasks in the list.");
        else
            System.out.println(list.poll());
    }
}
