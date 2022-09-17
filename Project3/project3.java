import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Date: September 20, 2021
* Description:
* Write programs that will read students' from scores.txt
* Program should calculate the average test score and letter grade.
* Use 1-D ArrayList only
* readData();
* calculateAverage();
* findLowestScore();
* writeData();
* classAverage();
*/

class project3 {
  /* Initialize Scanner for user's input */
  static Scanner userInput = new Scanner(System.in);
  /* Initialize three ArrayLists to store informations */
  static ArrayList<String> nameList = new ArrayList<String>();
  static ArrayList<Double> scoresList = new ArrayList<Double>();
  static ArrayList<String> grade = new ArrayList<String>();

  /* Read information from the file */
  static void readData() {
    boolean flag = true;
    /* While loop to obtain the name of the source file */
    while (flag) {
      System.out.print("Enter a valid file name: ");
      String fileName = userInput.nextLine();
      try {
        /* Open the source file to obtain informations */
        FileInputStream fileInput = new FileInputStream(fileName);
        Scanner scanScore = new Scanner(fileInput);
        /* Break the loop if the source file does exist */
        flag = false;
        String lineData;
        /* While loop to read through lines in the source file */
        while (scanScore.hasNextLine()) {
          lineData = scanScore.nextLine();
          String[] datas = lineData.split(" ");
          /* Store student's test scores */
          for (int i = 0; i < 10; i++)
            scoresList.add(Double.parseDouble(datas[i + 2]));
          /* Store student's name */
          String name = datas[1] + " " + datas[0];
          nameList.add(name);
        }
        scanScore.close();
      } catch (FileNotFoundException e) {
        /* Alert the user if the source file doesn't exist */
        System.out.println("File is not found.");
      }
    }
  }

  /* Convert average score to letter grade for all students */
  static void getGradeList() {
    /* Loop through each student's test scores */
    for (int i = 0; i < nameList.size(); i++) {
      /* Obtain average score of specific student */
      double averageScore = calculateAverage(new ArrayList<Double>(scoresList.subList(10 * i, 10 * (i + 1))));
      /* Convert average score to letter grade with if else statement */
      if (averageScore < 60)
        grade.add("NC");
      else if (averageScore < 70)
        grade.add("D");
      else if (averageScore < 74)
        grade.add("C");
      else if (averageScore < 79)
        grade.add("C+");
      else if (averageScore < 83)
        grade.add("B-");
      else if (averageScore < 87)
        grade.add("B");
      else if (averageScore < 90)
        grade.add("B+");
      else if (averageScore < 94)
        grade.add("A-");
      else if (averageScore < 97)
        grade.add("A");
      else
        grade.add("A+");
    }
  }

  /* Calculate average score from an ArrayList of test scores */
  static double calculateAverage(ArrayList<Double> scores) {
    double sum = 0;
    for (int i = 0; i < scores.size(); i++)
      sum += scores.get(i);
    /* Remove the lowest test score and return the adjusted average score */
    return (sum - findLowestScore(scores)) / (scores.size() - 1);
  }

  /* Find the lowest test scores from an ArrayList of test scores */
  static double findLowestScore(ArrayList<Double> scores) {
    double low = scores.get(0);
    for (int i = 1; i < scores.size(); i++)
      /* Replace lowest test score if a lower score is found */
      if (scores.get(i) < low)
        low = scores.get(i);
    return low;
  }

  /* Output data to a readable file */
  static void writeData() {
    /* Ask for the name of output file */
    System.out.print("Name of the output file: ");
    String outputFileName = userInput.nextLine();
    try {
      /* Create the output file with file name */
      File outputFile = new File(outputFileName);
      if (outputFile.createNewFile()) {
        FileOutputStream output = new FileOutputStream(outputFileName);
        /* Write the header line for the output file */
        String line = String.format("%-20s%-10s%-15s\n", "Student Name", "Average", "Final Grade");
        writeLine(line, output);
        /* Write a decorator line */
        line = String.format("%45s\n", "").replace(' ', '=');
        writeLine(line, output);
        /* Write converted informations of each students */
        for (int i = 0; i < nameList.size(); i++) {
          /* Obtain specific student's test scores from the list of scores */
          ArrayList<Double> scores = new ArrayList<Double>(scoresList.subList(10 * i, 10 * (i + 1)));
          /* Obtain the average score of the student */
          double averageScore = calculateAverage(scores);
          /* Combined informations into one readable line */
          line = String.format("%-20s%-10.2f%-15s\n", nameList.get(i), averageScore, grade.get(i));
          writeLine(line, output);
        }
        /* Write a decorator line */
        line = String.format("%45s\n", "").replace(' ', '=');
        writeLine(line, output);
        /* Write the average score of the entire class */
        line = String.format("\n%-20s%-10.2f", "Class Average: ", classAverage());
        writeLine(line, output);
        /* Close FileOutputStream */
        output.close();
      } else {
        System.out.println("File already exist");
      }
    } catch (IOException e) {
      System.out.println("An error occured when creating output file.");
    }
  }

  /* Write line into the output file, used by the writeDate() */
  static void writeLine(String line, FileOutputStream file) {
    try {
      /* Convert string to array of byte */
      byte[] lineInByte = line.getBytes();
      /* Write byte into file */
      file.write(lineInByte);
    } catch (IOException e) {
      /* Alert user that an error has occured */
      System.out.println("An error occured when creating output file.");
    }
  }

  /* Method to calculate the average score of entire class */
  static double classAverage() {
    double sum = 0;
    /* Obtaining the adjusted average score of each students */
    for (int i = 0; i < nameList.size(); i++)
      sum += calculateAverage(new ArrayList<Double>(scoresList.subList(i * 10, (i + 1) * 10)));
    return sum / nameList.size();
  }

  /* Main method to start the program */
  public static void main(String[] args) {
    readData();
    getGradeList();
    writeData();
    userInput.close();
  }
}
