package blackjack;
/**
 * This class is used as the view element for MVC.
 * Player objects are viewed by the controller using 
 * this class as a method to view.
 *
 * @author Alex Kalicharan 04/17/2023
 */
public class PlayerView {
	
	public String printPlayerDetails(Player player) {
		return player.toString();
	}
}
