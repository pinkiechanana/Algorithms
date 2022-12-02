import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i+1;
        }
        System.out.println(Arrays.toString(deck));

        for (int i = deck.length-1; i > 0; i--) {
            int rand = (int)(Math.random()*(i+1));
            int temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        System.out.println(Arrays.toString(deck));
    }
}
