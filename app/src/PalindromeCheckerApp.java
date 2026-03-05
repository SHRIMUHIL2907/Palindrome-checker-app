import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Input : ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 2 & 3: Enqueue and Push
        for (char c : input.toCharArray()) {
            queue.add(c);   // FIFO
            stack.push(c);  // LIFO
        }

        // Step 4 & 5: Compare dequeue vs pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}