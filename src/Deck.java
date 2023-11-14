import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<>();
        for (String suit : Constants.SUITS) {
            for (int i = 0; i < Constants.NAMES.length; i++) {
                Card card = new Card(suit, Constants.NAMES[i], Constants.VALUES[i]);
                deck.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void displayDeck() {
        System.out.println("Deck: ");
        for (Card card : deck) {
            card.display();
        }
    }

    public Card dealCard() {
        if (!deck.isEmpty()) {
            return deck.remove(0);
        } else {
            return null;
        }
    }

    public List<Card> dealCards(int count) {
        List<Card> dealtCards = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Card card = dealCard();
            if (card != null) {
                dealtCards.add(card);
            } else {
                break;
            }
        }

        return dealtCards;
    }

}