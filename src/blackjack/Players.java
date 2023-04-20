package blackjack;
/**
 * This class holds the players accumulated
 * in the initial set-up of the game. The 
 * players are then given to the game. 
 *
 * @author Alex Kalicharan 04/17/2023
 */

import java.util.ArrayList;

public class Players {
	
	private ArrayList<Controller> players;
	
	public Players() {
		players = new ArrayList();
	}
	
	public void addPlayer(Controller player) {
		players.add(player);
	}
	
	public ArrayList getPlayers() {
		return this.players;
	}
}
