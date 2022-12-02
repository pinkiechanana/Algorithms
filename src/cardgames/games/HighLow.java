package cardgames.games;

import cardgames.recipe.Card;
import cardgames.recipe.Deck;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------High Low----------");
        System.out.println("Rule: A card is dealt from a deck of cards.");
        System.out.println("You have to predict whether the next card will be higher or lower.");
        System.out.println("Your score in the game is the number of correct predictions you make.");
        System.out.println();

        int gamesPlayed = 0;
        int sumOfScores = 0;
        double averageScore;
        boolean playAgain;

        do {
            int scoreThisGame;
            scoreThisGame = play();
            sumOfScores += scoreThisGame;
            gamesPlayed++;
            System.out.println("Play again? ");
            playAgain = scan.nextBoolean();

        } while (playAgain);

        averageScore = ((double) sumOfScores) / gamesPlayed;
        System.out.println();
        System.out.println("You played " + gamesPlayed + " games.");
        System.out.printf("Your average score was %1.3f.\n", averageScore);
    }


    /* Lets the user play one game of HighLow, and returns the user's score on that game.
    The score is the umber of correct guesses that the user makes.
     */
    private static int play() {
        Scanner scan = new Scanner(System.in);
        Deck deck = new Deck();

        Card currentCard;
        Card nextCard;

        int correctGuesses;
        char guess;
        deck.shuffle();

        correctGuesses = 0;
        currentCard = deck.dealCard();
        System.out.println("The first card is " + currentCard);

        while (true) { // loop ends when the player guesses wrong.
            System.out.print("Will the next card be higher(H) or lower(L)? Answer: ");
            do {
                guess = scan.next().charAt(0);
                guess = Character.toUpperCase(guess);
                System.out.println("------------------------------");
                if (guess != 'H' && guess != 'L') {
                    System.out.println("Please respond with 'H' or 'L'.");
                }
            } while (guess != 'H' && guess != 'L');

            nextCard = deck.dealCard();
            System.out.println("The next card is " + nextCard);
            System.out.println("------------------------------");

            if (nextCard.getValue() == currentCard.getValue()) {
                System.out.println("The value is the same as the previous card!");
                System.out.println("Sorry, you lose on ties!");
                break;
            } else if (nextCard.getValue() > currentCard.getValue()) {
                if (guess == 'H') {
                    System.out.println("Your prediction is correct!");
                    correctGuesses++;
                    System.out.println("Number of correct guesses: " + correctGuesses);
                    System.out.println("------------------------------");
                } else {
                    System.out.println("Wrong answer!");
                    break;
                }
            } else {
                if (guess == 'L') {
                    System.out.println("Your prediction is correct!");
                    correctGuesses++;
                    System.out.println("Number of correct guesses: " + correctGuesses);
                    System.out.println("------------------------------");
                } else {
                    System.out.println("Wrong answer!");
                    break;
                }
            }
            // To set up for the next iteration of the loop, current card becomes next card.
            currentCard = nextCard;
            System.out.println();
            System.out.println("The card is " + currentCard);
        }
        System.out.println();
        System.out.println("Game over.");
        System.out.println("You made " + correctGuesses + " correct prediction(s).");
        System.out.println();
        return correctGuesses;
    }
}