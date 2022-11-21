// With an array with both positive and negative numbers, add from [a] to [b] for largest sum
// example:  [1, 2, -23, 45, 2, 1, -12, 9, 12, -32, -2, 45]

import java.util.Scanner;

public class AddLineOfNumForLargestSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int [] data = new int[x];

        for (int i = 0; i < x; i++)
            data[i] = scan.nextInt();
        scan.close();

        int max = 0;
        for (int i = 0; i < x; i++) {
            int sum = 0;
            for (int j = i; j < x; j++) {
                    sum += data[j];
                    if (sum > max) max = sum;
            }
        }
        System.out.println(max);
    }
}
