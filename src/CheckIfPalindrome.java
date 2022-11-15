import java.util.Scanner;

public class CheckIfPalindrome {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        String original = scan.nextLine();
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }
        boolean palindrome = true;

        for (int i = 0; i < original.length(); i++) {
            if (reverse.charAt(i) != original.charAt(i)) {
                palindrome = false;
            }
        }
        if (palindrome == false) {
            System.out.println("It is not a palindrome!");
        } else {
            System.out.println("It is a palindrome!!");
        }
    }
}
