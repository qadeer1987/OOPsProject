package Project2;

import java.util.HashMap;
import java.util.Map;

/*
Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character.
For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacterFinder {
    private String input;

    public NonRepeatingCharacterFinder(String input) {
        this.input = input;
    }

    public Character findFirstNonRepeatingCharacter() {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Convert the input string to lowercase
        String lowercaseInput = input.toLowerCase();

        // Traverse the string to count character occurrences
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char currentChar = lowercaseInput.charAt(i);

            // Increment the count for the current character
            charFrequencyMap.put(currentChar, charFrequencyMap.getOrDefault(currentChar, 0) + 1);
        }

        // Find the first non-repeating character
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char lowercaseChar = Character.toLowerCase(currentChar);

            // Check if the frequency of the current character is 1
            if (charFrequencyMap.get(lowercaseChar) == 1) {
                return currentChar;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String input = "abracadabra";

        NonRepeatingCharacterFinder finder = new NonRepeatingCharacterFinder(input);
        Character firstNonRepeatingChar = finder.findFirstNonRepeatingCharacter();
        System.out.println(firstNonRepeatingChar); // Output: 'c'
    }
}


