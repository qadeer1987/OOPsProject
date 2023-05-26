package Project2;

public class WordCounter {
    private String input;

    public WordCounter(String input) {
        this.input = input; // Assign the input string to the instance variable
    }

    public int countWords() {
        if (input == null || input.isEmpty()) {
            return 0; // If the input string is null or empty, return 0
        }

        String[] words = input.split("\\s+"); // Split the input string into an array of words
        return words.length; // Return the length of the words array, which represents the word count
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        WordCounter wordCounter = new WordCounter(input); // Create a WordCounter instance with the input string
        int wordCount = wordCounter.countWords(); // Invoke the countWords() method to get the word count
        System.out.println(wordCount); // Output the word count to the console
    }
}


