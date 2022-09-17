package project4;

// Author: Kenry Yu
// Date: September 27, 2021
// Description: Demonstrate the calss by writing a simple client program that uses it.
// main()
// display(Inventory)

public class InventorySimulator {
    public static void main(String[] args) {
        // Demonstrate the default constructor
        System.out.println("Demostrating the default constructor...");
        Inventory defaultExample = new Inventory();
        display(defaultExample);
        // Demonstrate the overloaded constructor
        System.out.println("Demostrating the overloaded constructor...");
        Inventory overloadedExample = new Inventory(124, 12, 84.95);
        display(overloadedExample);
        // Demonstrate the setter methods
        System.out.println("Demostrating the \"set\" functions...");
        Inventory setExample = new Inventory();
        setExample.setItemNumber(243);
        setExample.setQuantity(50);
        setExample.setCost(9.50);
        display(setExample);
        // Demonstrate the validation methods
        System.out.println("Demostrating the input validation functions...");
        Inventory inputValidationExample = new Inventory();
        inputValidationExample.setItemNumber();
        inputValidationExample.setQuantity();
        inputValidationExample.setCost();
        display(inputValidationExample);
    }

    // Print the informations of the inventory item
    static void display(Inventory item) {
        System.out.printf("%n%-11s: %d%n%-11s: %d%n%-11s: $%.2f%n%-11s: $%.2f%n%n", "Item number", item.getItemNumber(),
                "Quantity", item.getQuantity(), "Cost", item.getCost(), "Total cost", item.getTotalCost());
    }
}
