public class Runner {
    public static void main(String[] args) {
        Deck deck = new Deck();

        for (Card card : deck.getCards())
            System.out.println(card.getRank() + " of " + card.getSuit());

        deck.shuffle();
        for (Card card : deck.getCards())
            System.out.println(card.getRank() + " of " + card.getSuit());

    }
}
