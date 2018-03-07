import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player1, player2;

    @Before
    public void before() {
        player1 = new Player("Dan");
        player2 = new Player("Alex");
        game = new Game(player1, player2);
    }

    @Test
    public void gameHasTwoPlayers() {
        assertEquals(2, game.getPlayersCount());
    }

    @Test
    public void addPlayer() {
        game.addPlayer(player1);
        assertEquals(3, game.getPlayersCount());
    }

    @Test
    public void canDealOneCardGame() {
        game.deal(1);
        assertEquals(1, player1.getHand().size());
        assertEquals(1, player2.getHand().size());
    }

    @Test
    public void canDealTwoCardGame() {
        game.deal(2);
        assertEquals(2, player1.getHand().size());
        assertEquals(2, player2.getHand().size());
    }

    @Test
    public void findHighestHandValue() {
        game.deal(2);
        assertEquals(8, game.highestHandValue());
    }

    @Test
    public void findWinnerOneWinner() {
        game.deal(1);
        assertEquals(player2, game.findWinner().get(0));
    }
}
