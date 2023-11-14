import java.util.List;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();

        System.out.println("Original deck: ");
        deck.displayDeck();

        System.out.println("Shuffled deck: ");
        deck.shuffle();
        deck.displayDeck();

        System.out.println("Taking a card from the deck: ");
        Card dealtCard = deck.dealCard();
        dealtCard.display();

        System.out.println("Taking 3 cards from the deck: ");
        List<Card> dealtCards = deck.dealCards(3);
        for (Card card : dealtCards){
            card.display();
        }
    }
}