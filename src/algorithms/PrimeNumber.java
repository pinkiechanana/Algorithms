package algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        // ** 자기 자신과 1로만 나눠질 수 있는 숫자들. **

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 2; i <= x; i++) {
            int count = 0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    count++;
                }
            }
            if (count == 0) {
                arrayList.add(i);
            }
        }
        System.out.println(arrayList);
    }
}
