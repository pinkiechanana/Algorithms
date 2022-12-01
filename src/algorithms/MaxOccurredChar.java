package algorithms;

import java.util.Scanner;

public class MaxOccurredChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().replace(" ","");
        int[] hashTable = new int[256]; // 아스키코드
        int n = str.length();

        for (int i = 0; i < n; i++) {
            hashTable[str.charAt(i)]++;
        }
        int max = 0;
        char answer = 'a'; // 아스키 코드 디폴트 값
        for (int i = 0; i < 256; i++) {
            if (hashTable[i] > max) {
                max = hashTable[i];
                answer = (char)i;
            }
        }
        System.out.println("The answer is: " + answer);
    }
}
