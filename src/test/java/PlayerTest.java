import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Card card;

    @Before
    public void before() {
        player = new Player("Bob");
        card = new Card(Suit.CLUBS, Rank.JACK);
    }

    @Test
    public void playerHasName() {
        assertEquals("Bob", player.getName());
    }

    @Test
    public void playerHasHand() {
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void canAddCard() {
        player.addCard(card);
        assertEquals(card, player.getHand().get(0));
    }

    @Test
    public void canRemoveCards() {
        player.addCard(card);
        player.removeCards();
        assertEquals(0, player.getHand().size());
    }

    @Test
    public void canGetHandValueOneCard() {
        player.addCard(card);
        assertEquals(11, player.getHandValue());
    }

    @Test
    public void canGetHandValueTwoCards() {
        player.addCard(card);
        player.addCard(card);
        assertEquals(22, player.getHandValue());
    }
}
