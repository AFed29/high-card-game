import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
    Card[] cards;

    public Deck() {
        cards = new Card[52];
        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i] = new Card(suit, rank);
                i++;
            }
        }
    }

    public int getSize() {
        return cards.length;
    }

    public Card[] getCards() {
        return cards;
    }

    public void shuffle() {
        List<Card> shuffledList = Arrays.asList(this.cards);
        Collections.shuffle(shuffledList);
        shuffledList.toArray(this.cards);
    }
}
