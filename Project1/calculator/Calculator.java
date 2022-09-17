import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// Initialize Scanner
		Scanner userInput = new Scanner(System.in);
		// Ask for number of employee
		System.out.print("Enter the amount of employee: ");
		int empNum = userInput.nextInt();
		userInput.nextLine();
		// Begin a loop for calculator
		for (int i = 0; i < empNum; i++) {
			// Ask user for employee's information
			System.out.print("Please enter the employee name: ");
			String empName = userInput.nextLine();
			System.out.print("Please enter " + empName + "'s salary: ");
			int empSal = userInput.nextInt();
			userInput.nextLine();
			System.out.print("Please enter " + empName + "'s marital status: ");
			String empMari = userInput.nextLine();
			// Check valid input
			if (!empMari.equalsIgnoreCase("Single") && !empMari.equalsIgnoreCase("Married")) {
				do {
					System.out.print("There is an invalid input, please give a valid input: ");
					empMari = userInput.nextLine();
				} while (!empMari.equalsIgnoreCase("Single") && !empMari.equalsIgnoreCase("Married"));
			}
			System.out.print("Please enter the state " + empName + " living in: ");
			String empState = userInput.nextLine();
			// Find federal tax rate and fixed tax
			int fedTaxRate, fixTax, amountOver;
			if (empMari.equalsIgnoreCase("Single")) {
				if (empSal <= 8000) {
					fedTaxRate = 10;
					fixTax = 0;
					amountOver = 0;
				} else if (empSal <= 32000) {
					fedTaxRate = 15;
					fixTax = 800;
					amountOver = 8000;
				} else {
					fedTaxRate = 25;
					fixTax = 4400;
					amountOver = 32000;
				}
			} else {
				if (empSal <= 16000) {
					fedTaxRate = 10;
					fixTax = 0;
					amountOver = 0;
				} else if (empSal <= 64000) {
					fedTaxRate = 15;
					fixTax = 1600;
					amountOver = 16000;
				} else {
					fedTaxRate = 25;
					fixTax = 8800;
					amountOver = 64000;
				}
			}
			// Find state tax rate
			int stateTaxRate = 12;
			if (Arrays.asList("CA", "NV", "AZ", "TX").contains(empState.toUpperCase())) {
				stateTaxRate = 10;
			}
			// Calculate tax and net salary
			float fedTax = (empSal - amountOver) / 100 * fedTaxRate + fixTax;
			float stateTax = empSal / 100 * stateTaxRate;
			float netSal = empSal - fedTax - stateTax;
			// Output calculation
			System.out.println("Federal tax: " + fedTax + " State tax : " + stateTax + " Net salary: " + netSal);
		}
		// Close scanner
		userInput.close();
	}
}
