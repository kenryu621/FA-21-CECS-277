package project4;

import java.util.Scanner;

// Author: Kenry Yu
// Date: September 27, 2021
// Description: Design an Inventory class that can hold information for an item in a retail store’s inventory.
// Inventory();
// Inventory(int, int, double);
// setItemNumber(int);
// setQuantity(int);
// setCost(double);
// setItemNumber();
// setQuantity();
// setCost();
// getItemNumber();
// getQuantity();
// getCost();
// getTotalCost();
// ValidInt(int);
// ValidFloat(double);

public class Inventory {
  // Initialize scanner for user input
  Scanner userInput = new Scanner(System.in);
  // Initialize private member variables
  private int itemNumber;
  private int quantity;
  private double cost;

  // Default constructor
  public Inventory() {
    itemNumber = 0;
    quantity = 0;
    cost = 0;
  }

  // Overloaded constructor
  public Inventory(int iN, int q, double c) {
    while (ValidInt(iN) == false) {
      System.out.print("Item number must be equal or greater than 0. Please enter a valid input: ");
      iN = userInput.nextInt();
    }
    itemNumber = iN;
    while (ValidInt(q) == false) {
      System.out.print("Quantity must be equal or greater than 0. Please enter a valid input: ");
      q = userInput.nextInt();
    }
    quantity = q;
    while (ValidFloat(c) == false) {
      System.out.print("Cost must be equal or greater than 0. Please enter a valid input: $");
      c = userInput.nextFloat();
    }
    cost = c;
  }

  // Accepts an int argument and copies it into the itemNumber member variable.
  public void setItemNumber(int iN) {
    // Validate input and loop for valid input if input is invalid
    while (ValidInt(iN) == false) {
      System.out.print("Item number must be equal or greater than 0. Please enter a valid input: ");
      iN = userInput.nextInt();
    }
    itemNumber = iN;
  }

  // Accepts an int argument and copies it into the quantity member variable.
  public void setQuantity(int q) {
    // Validate input and loop for valid input if input is invalid
    while (ValidInt(q) == false) {
      System.out.print("Quantity must be equal or greater than 0. Please enter a valid input: ");
      q = userInput.nextInt();
    }
    quantity = q;
  }

  // Accepts a double argument and copies it into the cost member variable.
  public void setCost(double c) {
    // Validate input and loop for valid input if input is invalid
    while (ValidFloat(c) == false) {
      System.out.print("Cost must be equal or greater than 0. Please enter a valid input: $");
      c = userInput.nextDouble();
    }
    cost = c;
  }

  // Ask for an int input and copies it into the itemNumber member variable.
  public void setItemNumber() {
    // Ask for input from user
    System.out.print("\nEnter the item number: ");
    int iN = userInput.nextInt();
    // Validate input and loop for valid input if input is invalid
    while (ValidInt(iN) == false) {
      System.out.print("Item number must be equal or greater than 0. Please enter a valid input: ");
      iN = userInput.nextInt();
    }
    itemNumber = iN;
  }

  // Ask for an int input and copies it into the quantity member variable.
  public void setQuantity() {
    // Ask for input from user
    System.out.print("\nEnter the quantity: ");
    int q = userInput.nextInt();
    // Validate input and loop for valid input if input is invalid
    while (ValidInt(q) == false) {
      System.out.print("Quantity must be equal or greater than 0. Please enter a valid input: ");
      q = userInput.nextInt();
    }
    quantity = q;
  }

  // Ask for an double input and copies it into the cost member variable.
  public void setCost() {
    // Ask for input from user
    System.out.print("\nEnter the cost for each item: $");
    double c = userInput.nextDouble();
    // Validate input and loop for valid input if input is invalid
    while (ValidFloat(c) == false) {
      System.out.print("Cost must be equal or greater than 0. Please enter a valid input: $");
      c = userInput.nextDouble();
    }
    cost = c;
  }

  // Returns the value in itemNumber.
  public int getItemNumber() {
    return itemNumber;
  }

  // Returns the value in quantity.
  public int getQuantity() {
    return quantity;
  }

  // Returns the value in cost.
  public double getCost() {
    return cost;
  }

  // Computes and returns the totalCost.
  public double getTotalCost() {
    return cost * quantity;
  }

  // Validates for integer values entered by the user not to be negative.
  public boolean ValidInt(int input) {
    if (input < 0)
      return false;
    return true;
  }

  // Validates for cost entered by the user not to be negative.
  public boolean ValidFloat(double input) {
    if (input < 0)
      return false;
    return true;
  }
}
