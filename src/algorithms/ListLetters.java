package algorithms;

import java.util.Scanner;

public class ListLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int count;
        char letter;

        System.out.println("Please put in a line of text.");
        str = scan.nextLine();

        str = str.toUpperCase();

        count = 0;
        System.out.println("Your input contains the following letters:");
        for (letter = 'A'; letter <= 'Z'; letter++) {
            int i;
            for (i = 0; i < str.length(); i++) {
                if (letter == str.charAt(i)) {
                    System.out.print(letter);
                    System.out.print(' ');
                    count++;
                    break;
                }
            }
        }
        System.out.println("There were " + count + " different letters.");
    }
}
