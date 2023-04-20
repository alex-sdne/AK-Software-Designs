package blackjack;
/**
 * This main class sets up the game. Players are
 * generated here and entered into each round.
 *
 * @author Alex Kalicharan 04/17/2023
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to BLACKJACK");
		System.out.println("How many players are there? [1-7]");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		// checks validity of user input
		while ((input < 1) || (input > 7)) {
			System.out.println("Input is invalid!");
			System.out.println("How many players are there? [1-7]");
			input = scanner.nextInt();
		}
		
		Players players = new Players();
		
		for (int i = 1; i <= input; i++) {
			System.out.println("Player " + i + ", please enter your name:");
			String name = scanner.next();
			Player player = new Player(i, name);
			PlayerView view = new PlayerView();
			Controller x = new Controller(player, view);
			players.addPlayer(x);
			System.out.println("Welcome, " + x.getPlayerName() + "!");
			System.out.println("");
		}
		// creates 10 games to be played in succession
		for (int i = 1; i < 11; i++) {
			System.out.println("--------------------");
			Game x = new Game(("Blackjack Round " + i + "/10"), players.getPlayers());
			x.play();
			System.out.println("--------------------");
			System.out.println("--------------------");
			System.out.println();
			x.resetPlayers();
		}
	}
	
}
