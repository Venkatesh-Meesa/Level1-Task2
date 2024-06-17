import java.util.Scanner;

public class palindromemadam {

    // Function to remove non-alphanumeric characters and convert to lowercase
    public static String cleanString(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String input) {
        String cleanedInput = cleanString(input);
        int length = cleanedInput.length();

        for (int i = 0; i < length / 2; i++) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker");

        // Get the input string from the user
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Check if the input is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The entered word or phrase is a palindrome.");
        } else {
            System.out.println("The entered word or phrase is not a palindrome.");
        }

        scanner.close();
    }
}
