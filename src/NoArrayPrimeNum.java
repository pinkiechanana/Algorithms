import java.util.Scanner;

public class NoArrayPrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean isPrime = true;

        // reason why it is n/2 is because the divisor can't be bigger than n/2 (2,3,4, ..... , n/2)
        for (int i = 2; i <= n / 2 && isPrime; i++) {
            if (n % i == 0) isPrime = false;
        }
        if (isPrime) System.out.println("Yes, " + n + " is a prime number.");
        else System.out.println("Nope, " + n + " is not a prime number.");
    }
}
