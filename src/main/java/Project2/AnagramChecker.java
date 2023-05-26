package Project2;

import java.util.Arrays;

import java.util.Arrays;

public class AnagramChecker {
    private String firstString; // Stores the first input string
    private String secondString; // Stores the second input string

    public AnagramChecker(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public boolean areAnagrams() {
        if (firstString.length() != secondString.length()) {
            return false; // If the strings have different lengths, they cannot be anagrams
        }

        char[] firstArray = firstString.toLowerCase().toCharArray(); // Convert the first string to lowercase and then to a character array
        char[] secondArray = secondString.toLowerCase().toCharArray(); // Convert the second string to lowercase and then to a character array

        Arrays.sort(firstArray); // Sort the characters in the first array in ascending order
        Arrays.sort(secondArray); // Sort the characters in the second array in ascending order

        // Compare the sorted character arrays to determine if they are equal (anagrams)
        return Arrays.equals(firstArray, secondArray);
    }

    public static void main(String[] args) {
        String firstString = "listen"; // First input string
        String secondString = "silent"; // Second input string

        AnagramChecker anagramChecker = new AnagramChecker(firstString, secondString); // Create an instance of AnagramChecker
        boolean areAnagrams = anagramChecker.areAnagrams(); // Call the areAnagrams method to check if the strings are anagrams
        System.out.println(areAnagrams); // Output: true (prints whether the strings are anagrams or not)
    }
}

