package blackjack;
/**
 * A class used as a model for MVC. This class
 * represents the players in each game. 
 *
 * @author Alex Kalicharan 04/17/2023
 */
public class Player {
	// holds the player number e.g. Player 1, Player 2 etc.
    private int playerNum;
	// holds the name of the player
	private String name;
	// holds the Hand of the player
	private Hand hand;
	// holds the value of stand for the player
	private boolean stand = false;
	// holds the value of bust for the player
	private boolean bust = false;
	// holds the value of blackjack for the player
	private boolean blackjack = false;
	// holds the win value for the player
	private boolean hasWon = false;
	
    public Player(int playerNum, String name) {
        this.playerNum = playerNum;
		this.name = name;
		this.hand = new Hand();
    }

	// returns name of the player
    public String getName() {
        return name;
    }
	// sets name of the player
    public void setName(String name) {
        this.name = name;
    }
	// returns the player number
	public int getPlayerNum() {
		return this.playerNum;
	}
	// sets the player number
	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}
	// returns the hand of the player
	public String getHand() {
		return this.hand.toString();
	}
	// deals two cards to the player
	public void deal() {
		this.hand.deal();
	}
	// gives the player a card
	public void hit() {
		this.hand.addCard();
	}
	// sets the player as standing
	public void setStand(boolean stand) {
		this.stand = stand;
	}
	// returns stand value for the player
	public boolean getStand() {
		return this.stand;
	}
	// sets if the player is bust
	public void setBust(boolean bust) {
		this.bust = bust;
	}
	// returns the bust status of the player
	public boolean getBust() {
		return this.hand.isBust();
	}
	// returns the sum of the player's cards
	public int getCount() {
		return this.hand.count();
	}
	// sets the player's blackjack status
	public void setBlackjack (boolean blackjack) {
		this.blackjack = blackjack;
	}
	// returns the player's blackjack status
	public boolean getBlackjack () {
		if (hand.count() == 21) {
			this.blackjack = true;
		}
		return this.blackjack;
	}
	// sets the player's win value
	public void setHasWon(boolean hasWon) {
		this.hasWon = hasWon;
	}
	// returns the player's win value
	public boolean getHasWon() {
		return this.hasWon;
	}
	// resets the player for the next round
	public void reset() {
		this.hand.clear();
		this.stand = false;
		this.bust = false;
		this.blackjack = false;
		this.hasWon = false;
	}
	
	@Override
	public String toString() {
		return "Player " + this.playerNum + ": " + this.name;
	}

}
