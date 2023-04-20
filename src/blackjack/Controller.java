package blackjack;
/**
 * A class to represent the controller of an MVC model.
 * This class uses Player objects as models.
 * This class controls all functionality of Player objects.
 * This class creates new PlayerView objects that are paired
 * with each Player object.
 *
 * @author Alex Kalicharan 04/17/2023
 */
public class Controller {
	
	private Player model;
	private PlayerView view;
	
	// initializes with a Player and PlayerView object
	public Controller (Player model, PlayerView view) {
		this.model = model;
		this.view = view;
	}
	// sets name of Player object
	public void setPlayerName(String name) {
		model.setName(name);
	}
	// retrieves name of Player object
	public String getPlayerName() {
		return model.getName();
	}
	// sets the player number e.g. Player 1, Player 2 etc.
	public void setPlayerNum(int num) {
		model.setPlayerNum(num);
	}
	// retrieves the player number
	public int getPlayerNum() {
		return model.getPlayerNum();
	}
	// deals the first two cards to the player
	public void dealPlayer() {
		model.deal();
	}
	// retrieves the cards in the player's hand
	public String getPlayerHand() {
		return model.getHand();
	}
	// gives the player a card
	public void HitPlayer() {
		model.hit();
	}
	// sets the player's position as a stand
	public void standPlayer() {
		model.setStand(true);
	}
	// checks if the player is standing
	public boolean isStanding() {
		return model.getStand();
	}
	// sets the player's status to bust
	public void bustPlayer() {
		model.setBust(true);
	}
	// retrieves the sum of the cards in the player's hand
	public int getPlayerCount() {
		return model.getCount();
	}
	// checks if the player achieved blackjack
	public boolean getPlayerBlackjack() {
		return model.getBlackjack();
	}
	// sets the player's blackjack status
	public void setPlayerBlackjack(boolean blackjack) {
		model.setBlackjack(blackjack);
	}
	// retrieves the player's bust status
	public boolean isBust() {
		return model.getBust();
	}
	// retrieves the player's win status
	public boolean getPlayerHasWon() {
		return model.getHasWon();
	}
	// sets the player's win status
	public void setPlayerHasWon(boolean hasWon) {
		model.setHasWon(hasWon);
	}
	// resets the Player object for the next round
	public void resetPlayer() {
		model.reset();
	}
	// prints the player details
	public String updateView() {
		return view.printPlayerDetails(model);
	}
}
