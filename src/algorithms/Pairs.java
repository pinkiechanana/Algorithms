package algorithms;

import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        int [] data = new int[x];

        for (int i = 0; i < x; i++) {
            data[i] = scan.nextInt();
        }

        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int k = i + 1; k < data.length; k++) { // k = i + 1; 첫 숫자 반복 & i = k, k = i 중복 방지
                if (data[i] == data[k]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
