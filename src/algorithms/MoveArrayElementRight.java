package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class MoveArrayElementRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }

        int temp = data[n-1];

        for (int i = n-2; i >= 0; i--) {
            data[i+1] = data[i];
        }
        data[0] = temp;

        System.out.println(Arrays.toString(data));
    }
}