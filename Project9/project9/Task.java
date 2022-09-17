package project9;

import java.util.Objects;

// Author: Kenry Yu
// Date: November 11, 2021
// Description: Design a Task class that would hold an integer as priority number
// and a String as description of the task. Override the hashCode() and equals()
// so that two tasks with the same description are considered equal.

public class Task implements Comparable<Task> {
    // Initializing private members
    private int priority;
    private String description;

    // Default constructor
    public Task() {
        setPriority(9);
        setDescription("N/A");
    }

    // Overload constructor
    public Task(int p, String d) {
        setPriority(p);
        setDescription(d);
    }

    // A void method that accepts an integer and change the priority of the private
    // members
    public void setPriority(int p) {
        this.priority = p;
    }

    // A void method that accepts a String and change the description of the private
    // members
    public void setDescription(String d) {
        this.description = d;
    }

    // toString method that return the description of the private members
    public String toString() {
        return this.description;
    }

    // Override the compareTo method so Task could be sorted in PriorityQueue
    @Override
    public int compareTo(Task obj) {
        if (this.priority < obj.priority)
            return -1;
        else if (this.priority > obj.priority)
            return 1;
        else
            return 0;
    }

    // Override the hashCode method to return hash of the description
    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    // Override the equals method so two tasks with the same description would be
    // considered equal
    @Override
    public boolean equals(Object obj) {
        Task right = (Task) obj;
        return this.description.equalsIgnoreCase(right.description);
    }
}
