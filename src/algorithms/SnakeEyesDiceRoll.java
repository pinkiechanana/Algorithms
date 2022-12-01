package algorithms;

public class SnakeEyesDiceRoll {
    public static void main(String[] args) {

        int roll1;
        int roll2;
        int count = 0;

        while(true) {
            roll1 = (int) (6*Math.random()+1);
            System.out.println("First roll: " + roll1);
            roll2 = (int) (6*Math.random()+1);
            System.out.println("Second roll: " + roll2);
            count++;
            System.out.println("Count: " + count);
            int sum = roll1 + roll2;
            System.out.println("Sum: " + sum);
            if (sum==2) {
                break;
            }
        }
        System.out.println("It took " + count + " rolls for a snake-eye.");
    }
}
