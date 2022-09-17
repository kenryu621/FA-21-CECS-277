import java.util.Scanner; // Needed for user's input
import java.util.Arrays; // Needed for initialize array

public class examScore { // Class to store information and operate calculation and display
  // Variables including the one dimensional array and two dimensional array
  static int size;
  static String[] names;
  static int[][] scores;

  public static void main(String[] args) { // Main method
    Scanner userIn = new Scanner(System.in); // Initialize scanner for user's input
    System.out.print("Enter the number of students in the class: "); // Ask for the number of students
    size = userIn.nextInt();
    userIn.nextLine();
    names = new String[size]; // Initialize the one dimensional array
    scores = new int[size][5]; // Initialize the two dimensional array
    getStudentInfo(); // Ask user for students' information
    print(); // Print the table
    userIn.close(); // Close scanner
  }

  static void getStudentInfo() { // Ask user for names and exam scores
    Scanner input = new Scanner(System.in); // New scanner for user input
    for (int i = 0; i < names.length; i++) { // For loop to get each student's name and their 5 exam scores
      printDivLine();
      System.out.println("For student No." + (i + 1)); // Ask for name
      System.out.print("Enter the name of student: ");
      names[i] = input.nextLine(); // Store name to one dimensional array
      for (int j = 0; j < 5; j++) { // Loop to ask for scores
        System.out.print("Enter the score of exam " + (j + 1) + ": ");
        String score = input.nextLine();
        while (!ValidateUserInput(score)) { // Check valid score and ask for score again if score is invalid
          System.out.println("Invalid input, please try again!");
          System.out.print("Enter the score of exam " + (j + 1) + ": ");
          score = input.nextLine();
        }
        scores[i][j] = Integer.parseInt(score); // Store score to two dimensional array
      }
    }
    input.close(); // Close scanner
  }

  static boolean ValidateUserInput(String scoreStr) { // Method to return the validation of score from user's input
    try { // Try to convert string to integer
      int score = Integer.parseInt(scoreStr);
      if (score < 0 || score > 100) // Check score
        throw new Exception("No negative input!");
    } catch (Exception e) { // Catch the exception from coverting string to integer
      return false; // If the string cannot convert to integer or valid score then return
                    // False
    }
    return true; // Return True if satisfied
  }

  static int findLowest(int studentNo) { // Find the lowest score
    int low = scores[studentNo][0];
    for (int i = 1; i < 5; i++)
      if (scores[studentNo][i] < low) // Replace the lowest score
        low = scores[studentNo][i];
    return low;
  }

  static int findHighest(int studentNo) { // Find the highest score
    int high = scores[studentNo][0];
    for (int i = 1; i < 5; i++)
      if (scores[studentNo][i] > high) // Replace the highest score
        high = scores[studentNo][i];
    return high;
  }

  static float calcScore(int studentNo) { // Calculate the average score
    float sum = 0;
    for (int i = 0; i < 5; i++)
      sum += scores[studentNo][i];
    sum = sum - findHighest(studentNo) - findLowest(studentNo); // Subtracting the lowest and highest score
    return sum / 3;
  }

  static void print() { // Print the table
    printDivLine();
    System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student name", "Exam 1", "Exam 2", "Exam 3", "Exam 4",
        "Exam 5", "Average"); // Header of the table
    printDivLine();
    for (int i = 0; i < size; i++) // for loop to print each student's record
      System.out.printf("%-20s%-10s%-10s%-10s%-10s%-10s%-10.2f\n", names[i], scores[i][0], scores[i][1], scores[i][2],
          scores[i][3], scores[i][4], calcScore(i));
    printDivLine();
  }

  static void printDivLine() { // Print line for decorating
    System.out.println(String.format("%80s", "").replace(' ', '='));
  }
}
