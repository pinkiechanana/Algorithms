package cardgames.recipe;

public class Deck {

    // An array of 52~54 cards. 54-card-deck contains two Joker cards.
    private Card[] deck;

    // Keeps track of the cards dealt from the deck so far.
    private int cardsUsed;


    // Deck of cards without jokers.
    public Deck() {
        this(false);
    }

    // Constructor. Create a deck of unshuffled cards
    public Deck (boolean includeJokers) {
        if (includeJokers) deck = new Card[54];
        else deck = new Card[52];
        int cardCount = 0; // How many cards have been created so far

        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value<= 13; value++) {
                deck[cardCount] = new Card(value, suit);
                cardCount++;
            }
        }
        if (includeJokers) {
            deck[52] = new Card(1, Card.JOKER);
            deck[53] = new Card(2, Card.JOKER);
        }
        cardsUsed = 0;
    }


    // Put all the used cards back into the deck(if any), and shuffle the deck in a random order.
    public void shuffle() {
        for (int i = deck.length - 1; i > 0; i--) {
            int random = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
        cardsUsed = 0;

    }

    // As cards are dealt, the number of cards in the deck will decrease.
    // Will return the number of cards left in the deck.
    public int cardsLeft() {
        return deck.length - cardsUsed;
    }


    // Deals one card from the deck and returns it.
    // Throws an exception if there are none left in the deck.
    public Card dealCard() {
        if (cardsUsed == deck.length) {
            throw new IllegalStateException("There are no cards left in the deck!");
        }
        cardsUsed++;
        return deck[cardsUsed-1];
    }

    public boolean hasJokers () {
        return (deck.length == 54);
    }
}
