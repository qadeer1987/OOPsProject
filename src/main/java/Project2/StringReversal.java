package Project2;

public class StringReversal {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello";
        String reversedString = reverseString(input);
        System.out.println(reversedString); // Output: olleH
    }
}

