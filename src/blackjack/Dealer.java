package blackjack;
/**
 * A child class of Player to act as a dealer in the game.
 * This class is used as a model for MVC.
 * The PlayerNum of this object will always be 0.
 * The name of this object will always be "Dealer".
 *
 * @author Alex Kalicharan 04/17/2023
 */
public class Dealer extends Player{
	// initializes with PlayerNum as 0 and name as "Dealer"
	public Dealer() {
		super(0, "Dealer");
	}
}
