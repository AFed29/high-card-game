import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private Deck deck;
    private ArrayList<Player> players;

    public Game(Player ...initialPlayers) {
        deck = new Deck();
        players = new ArrayList<>();
        players.addAll(Arrays.asList(initialPlayers));
    }

    public int getPlayersCount() {
        return players.size();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void deal(int cardsPerPlayer) {
        int index = 0;
        for (int dealRound = 0; dealRound < cardsPerPlayer ; dealRound++) {
            for (Player player : players) {
                Card card = deck.getCard(index);
                player.addCard(card);
                index++;
            }
        }
    }

    public int highestHandValue() {
        int highestHandValue = 0;
        for (Player player : players) {
            if (player.getHandValue() > highestHandValue) {
                highestHandValue = player.getHandValue();
            }
        }
        return highestHandValue;
    }

    public ArrayList<Player> findWinner() {
        ArrayList<Player> winners = new ArrayList<>();
        int highestHandValue = highestHandValue();
        for (Player player : players) {
            if (player.getHandValue() == highestHandValue) {
                winners.add(player);
            }
        }
        return winners;
    }

    public ArrayList<Player> playGame(int cardsPerPlayer) {
        deck.shuffle();
        deal(cardsPerPlayer);
        return findWinner();
    }
}
