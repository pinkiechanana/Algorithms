package cardgames.recipe;

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

    public Card getCard (int position) {
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("Position does not exist in hand: " + position);
        }
        return hand.get(position);
    }

    // ******************************** 이건 좀 헷갈리네. 다시 보자 **************************************

    // Sorts the cards in hand by suit. Each group of suit are sorted by value.
    public void sortBySuit () {
        ArrayList<Card> newHand = new ArrayList<>();
        while (hand.size() > 0) {
            int position = 0;
            Card c1 = hand.get(0);
            for (int i = 1; i < hand.size(); i++) {
                Card c2 = hand.get(i);
                if (c2.getSuit() < c1.getSuit() || (c2.getSuit() == c1.getSuit() && c2.getValue() == c1.getValue())) {
                    position = i;
                    c1 = c2;
                }
            }
            hand.remove(position);
            newHand.add(c1);
        }
        hand = newHand;
    }


    // same thing but sort by value.
    public void sortByValue () {
        ArrayList<Card> newHand = new ArrayList<>();
        while (hand.size() > 0) {
            int position = 0;
            Card c1 = hand.get(0);
            for (int i = 1; i < hand.size(); i++) {
                Card c2 = hand.get(i);
                if (c2.getValue() < c1.getValue() || (c2.getValue() == c1.getValue() && c2.getSuit() == c1.getSuit())) {
                    position = i;
                    c1 = c2;
                }
            }
            hand.remove(position);
            newHand.add(c1);
        }
        hand = newHand;
    }
}
