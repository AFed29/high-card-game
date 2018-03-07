import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void removeCards() {
        hand.clear();
    }

    public int getHandValue() {
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
    }
}
