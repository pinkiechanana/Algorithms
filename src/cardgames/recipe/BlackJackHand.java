package cardgames.recipe;


// **************** I don't understand shite you are dumb as fuuuuuuuuuuuuuuuuk ******************
public class BlackJackHand extends Hand {
    public int getBlackJackValue() {
        int value; // the value computed for the hand
        boolean ace; // this will be set true if the hand contains an ace
        int cards;  // number of cards in hand

        value = 0;
        ace = false;
        cards = getCardCount(); // method defined in class Hand

        for (int i = 0; i < cards; i++) {
            Card card;
            int cardValue;
            card = getCard(i);
            cardValue = card.getValue();
            if (cardValue > 10) {
                cardValue = 10;
            }
            if (cardValue == 1) {
                ace = true;
            }
            value = value + cardValue;
        }

        if (ace == true && value + 10 <= 21) {
            value = value + 10;
        }
        return value;
    }
}
