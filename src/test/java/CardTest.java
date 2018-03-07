import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before() {
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void cardHasSuit() {
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void cardHasRank() {
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void getCardValue() {
        assertEquals(14, card.getValue());
    }
}
