public class MaxNumArray {
    public static void main (String [] args) {
        int[] input = {3, 5, 6, 1, 2, 4};

        int max = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max)
                max = input[i];
        }
        System.out.println("Largest number in the array is " + max);
    }
}