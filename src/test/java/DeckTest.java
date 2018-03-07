import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DeckTest {
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void deckHasFiftyTwoCards() {
        assertEquals(52, deck.getSize());
    }

    @Test
    public void canGetCardsFromDeck() {
        assertNotNull(deck.getCards());
    }

    @Test
    public void deckIsPopulated() {
        for (Card card : deck.getCards()) {
            assertNotNull(card);
        }
    }

    @Test
    public void deckContainsQueenOfHearts() {
        boolean searchResult = false;
        for (Card card : deck.getCards()) {
            if (card.getSuit() == Suit.HEARTS && card.getRank() == Rank.QUEEN) {
                searchResult = true;
            }
        }
        assertEquals(true, searchResult);
    }
}
