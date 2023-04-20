package blackjack;
/**
 * A class to initialize, play, determine winners,
 * and end the game round. This class is given an
 * arraylist of controllers and a name when initialized.
 *
 * @author Alex Kalicharan 04/17/2023
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	// the title of the game
    private final String name;
	// arraylist that holds the controller objects for players
	private ArrayList<Controller> players;
	// counts the number of players who went bust
	private int bustCount;
	// counts the number of players who stand
	private int standCount;
	// counts the number of players who achieved blackjack
	private int blackjackCount;
	
    public Game(String name, ArrayList<Controller> players) {
        this.name = name;
		this.players = players;		
		bustCount = 0;
		standCount = 0;
		blackjackCount = 0;

    }

    public String getName() {
        return name;
    }
	// this method starts the round
    public void play() {
		
		System.out.println(this.name);
		
		for (Controller x:players) {
			deal(x);
		}
		
		hitOrStand();
		
		setDealer();
		
		System.out.println(declareWinner());
	}
	// this method deals cards to the players	
	public void deal(Controller x) {
		System.out.println("--------------------");
		x.dealPlayer();
		System.out.println();
		System.out.println(x.updateView());
		System.out.println(x.getPlayerHand());
		if (x.getPlayerBlackjack()) {
			System.out.println("Blackjack for " + x.getPlayerName() + "!");
			blackjackCount += 1;
			x.setPlayerHasWon(true);
		}
		System.out.println("--------------------");	
	}
	// this method controls the hit or stand functionality of the game
	public void hitOrStand() {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			for (Controller x:players) {
				if (!(x.isStanding()) && !(x.isBust()) && !(x.getPlayerBlackjack())) {
					System.out.println("--------------------");
					System.out.println(x.getPlayerName() + ", [h]it or [s]tand? [h/s]");
					input = scanner.next();
					System.out.println();
					// check user input validity
					while (!(input.equals("h")) && !(input.equals("s"))) {
						System.out.println("Input is invalid!");
						System.out.println(x.getPlayerName() + ", [h]it or [s]tand? [h/s]");
						input = scanner.next();
					}
					// add card to player hand and determine status
					if (input.equals("h")) {
						x.HitPlayer();
						System.out.println(x.updateView());
						System.out.println(x.getPlayerHand());
						if (x.isBust()) {
							System.out.println(x.getPlayerName() + " went bust!");
							System.out.println();
							bustCount += 1;
						}
						else if (x.getPlayerBlackjack()) {
							System.out.println("Blackjack for " + x.getPlayerName() + "!");
							x.setPlayerHasWon(true);
							System.out.println();
							blackjackCount += 1;
						}
						System.out.println("--------------------");
					}
					// change player status to stand and proceed
					else if (input.equals("s")) {
						x.standPlayer();
						System.out.println(x.getPlayerName() + " stands.");
						System.out.println();
						System.out.println("--------------------");
						standCount += 1;
					}
				}
			} 
		}
		while ((bustCount + standCount + blackjackCount) < players.size());
	}
	// this method creates and programs the dealer
	public void setDealer() {
		AddDealer add = new AddDealer();
		Controller dealer = add.addDealer();
		dealer.dealPlayer();
		// deal cards to the dealer
		while (dealer.getPlayerCount() <= 16) {
			dealer.HitPlayer();
		}
		// determine if dealer has blackjack
		if (dealer.getPlayerCount() == 21) {
			dealer.setPlayerBlackjack(true);
			dealer.setPlayerHasWon(true);
			blackjackCount += 1;
		}
		// determine if dealer is bust
		else if (dealer.isBust()) {
			dealer.bustPlayer();
		}
		// stand dealer
		else {
			dealer.standPlayer();
		}

		System.out.println("--------------------");
		System.out.println(dealer.updateView());
		System.out.println(dealer.getPlayerHand());
		System.out.println("--------------------");
		players.add(dealer);
	}
	// this method determines teh winenr of the game
	public String declareWinner() {
		String winner = "Winner: ";
		System.out.println("--------------------");
		
		for (Controller x:players) {
			System.out.println(x.getPlayerName() + "'s hand sum: " + x.getPlayerCount());
		}
		// if all players are bust
		if ((bustCount) == (players.size() - 1)) {
			winner = "All players have gone bust, dealer wins.";
			return winner;
		}
		// if at least one player has blackjack
		else if (blackjackCount > 0) {
			for (Controller x:players) {
				if ((x.getPlayerHasWon()) && (winner.length() > 8) ) {
					winner += " & " + x.getPlayerName();
				}
				else if (x.getPlayerHasWon()) {
					winner += x.getPlayerName();
				}
			}
		}
		else {
			// determine who has the highest sum under 21
			int temp = 0;
			for (int i = 0; i < players.size(); i++) {
				if (players.get(i).isStanding() && (players.get(i).getPlayerCount() > temp)) {
					temp = players.get(i).getPlayerCount();
				}
			}
			for (int i = 0; i < players.size(); i++) {
				if ((players.get(i).getPlayerCount() == temp) && (winner.length() > 8)) {
					winner += " & " + players.get(i).getPlayerName();
					players.get(i).setPlayerHasWon(true);
				}
				else if (players.get(i).getPlayerCount() == temp) {
					winner += players.get(i).getPlayerName();
					players.get(i).setPlayerHasWon(true);
				}
			}
		}
		return winner;
	}
	// this method resets the players for the next round
	public void resetPlayers() {
		for (Controller x:players) {
			x.resetPlayer();
		}
		players.remove(players.size() - 1);
	}
}