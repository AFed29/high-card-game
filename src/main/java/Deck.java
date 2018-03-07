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
}
