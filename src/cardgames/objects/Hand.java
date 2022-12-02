package cardgames.objects;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand; // The cards in the hand.

    // create a hand that is initially empty
    public Hand() {
        hand = new ArrayList<>();
    }

    // remove all cards in hand
    public void clear() {
        hand.clear();
    }

    // add a card at the end of the cards in hand
    // @param 'c' the non-null to be added
    // @throws NullPointerException if 'c' is null
    public void addCard (Card c) {
        if (c == null) throw new NullPointerException("Can't add a null card to the hand.");
        hand.add(c);
    }

    // remove a card from the hand, if present.
    // @param 'c' the card to be removed if present. If 'c' is null or not present, nothing happens.
    public void removeCard (Card c) {
        hand.remove(c);
    }

    // Remove the card in a specific location in hand.
    // @param position of the card to be removed. Positions are numbered starting from 0.
    // @throws IllegalArgumentException if the position does not exist in hand.
    // (position < 0 || position >= hand.length)
    public void removeCard(int position) {
        if (position < 0 || position >= hand.size()) throw new IllegalArgumentException("Position does not exist in hand: " + position);
        hand.remove(position);
    }

    // return the number of cards in hand.
    public int getCardCount() {
        return hand.size();
    }

    
}
