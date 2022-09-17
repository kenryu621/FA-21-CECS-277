package project8;

// Import required library
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

// Author: Kenry Yu
// Date: November 3, 2021
// Description: Design a FirstLetterMap class that read all words from the test1.txt file
// and add them to a map whose keys are the first letters of the words and
// whose values are sets of words. Then print out the word sets in alphabetical order.

// Initialize main class
class FirstLetterMap {
    // Initialize main method
    public static void main(String args[]) {
        // Try to open test1.txt file
        try {
            // Initialize Scanner
            Scanner input = new Scanner(new File("test1.txt"));
            // Initialize a TreeMap which key will be a String object that holds the letter
            // and the value will be set of words
            Map<String, Set<String>> firstLetterMap = new TreeMap<String, Set<String>>();
            // Initialize a TreeSet that holds the words
            Set<String> words;
            // Loop through the file
            while (input.hasNext()) {
                // Find the next word and convert it to lower case
                String word = input.next().toLowerCase();
                // Remove punctuation marks
                if (!Character.isLetter(word.charAt(word.length() - 1)))
                    word = word.substring(0, word.length() - 1);
                // Remove hyphen
                if (word.contains("-"))
                    word = word.replaceAll("-", "");
                // Find the first letter of the word
                String firstLetter = Character.toString(word.charAt(0));
                // If the map contains the first letter as a key
                // take the existing value to update
                if (firstLetterMap.containsKey(firstLetter))
                    words = firstLetterMap.get(firstLetter);
                // If the map does not contains the first letter as a key
                // Initialize a new empty TreeSet
                else
                    words = new TreeSet<String>();
                // Add current word to the TreeSet
                words.add(word);
                // Update the TreeSet to the TreeMap
                firstLetterMap.put(firstLetter, words);
            }
            // Loop through map and print out the first letter and words
            for (Map.Entry<String, Set<String>> entry : firstLetterMap.entrySet())
                System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));
            // Close Scanner
            input.close();
        } catch (FileNotFoundException e) {
            // Catch error if file is not found
            System.out.println("Cannot find the file.");
            e.printStackTrace();
        }
    }
}
