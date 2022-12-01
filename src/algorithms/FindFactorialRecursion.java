package algorithms;

import java.util.Scanner;

public class FindFactorialRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println(MultiplyNum(x));
    }

    public static int MultiplyNum (int n) {
        if (n >= 1) {
            return n * MultiplyNum(n-1);
        }
        return 1;
    }
}
