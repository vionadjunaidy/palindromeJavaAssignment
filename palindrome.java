import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome (String userInput) {
        int lengthOfInput = userInput.length();
        arrayStack stack = new arrayStack(lengthOfInput);

        for (int i = 0; i < lengthOfInput; i++){
            stack.push(userInput.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }

        if (userInput.equals(reverseString)) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = scanner.nextLine();

        if (isPalindrome(userInput)) {
            System.out.println( userInput + " is a palindrome.");
        } else {
            System.out.println( userInput + " is not a palindrome.");
        }
    }
}
