import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        Player dan, alex, kate, jussi, amy;
        Game game;

        dan = new Player("Dan");
        alex = new Player("Alex");
        kate = new Player("Kate");
        jussi = new Player("Jussi");
        amy = new Player("Amy");
        game = new Game(dan, alex, kate, jussi, amy);

        ArrayList<Player> winners = game.playGame(1);

        if (winners.size() > 1) {
            System.out.print("The winners are: ");
            for (Player player : winners) {
                System.out.print(player.getName()+ ", ");
            }
        }
        else {
            System.out.println("The winner is: " + winners.get(0).getName());
        }
    }
}
