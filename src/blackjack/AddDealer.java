package blackjack;
/**
 * A class to create a Dealer object and configure the dealer to be used in the game.
 * Dealer object is given to its controller which is then given to the main game.
 *
 * @author Alex Kalicharan 04/17/2023
 */
public class AddDealer {
	// variable to hold controllwe object
	private Controller dealer;
	
	//method to generate Delaer object and add to controller
	public AddDealer() {
		Dealer dealerModel = new Dealer();
		PlayerView view = new PlayerView();
		dealer = new Controller(dealerModel, view);
	}
	
	//returns the Controller object with dealer inside
	public Controller addDealer() {
		return this.dealer;
	}

}
