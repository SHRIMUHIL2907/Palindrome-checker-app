public class PalindromeCheckerApp {
    static void main(String[] args) {
        String input = "madam";

        // Convert string to character array
        char[] chars = input.toCharArray();

        boolean isPalindrome = true;

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}
