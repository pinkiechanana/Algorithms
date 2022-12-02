package cardgames.objects;

public class Hand {
    // Create a Hand object which is initially empty

    public void clear() {
        // Discard all cards in hand.
    }

    public void addCard(Card c) {
        // Add the c in the hand. c should be non-null.
        // If c is null, NullPointerException should be thrown.

    }

    public void removeCard(Card c) {
        // If the specified card is in the hand, it will be removed.

    }

    public void removeCard(int position) {
        // The card in the # position will be removed.
        // Cards are counted starting from 0.
        // If the position does not exist, an exception will be thrown.

    }

    public int getCardCount() {
        // return the number of cards in hand.
        return 0;
    }

    public void sortBySuit() {
        // Sort the cards in hand by suit in groups.
        // For each groups of suits, they are sorted in order by value.
        // Ace is the lowest.

    }

    public void sortByValue() {
        // Sort the cards in hand by value.
        // Each group then will be sorted in order by suit.
        // Ace is the lowest.

    }
}
