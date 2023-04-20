package blackjack;
/**
 * This is a child class of Card. This class 
 * represents the playing cards in the game 
 * of Blackjack. Random values and suits are
 * assigned to cards using the enums provided.
 *
 * @author Alex Kalicharan 04/17/2023
 */

public class PlayingCard extends Card {
	// enum holding the suits
	public enum Suit{
        HEARTS, CLUBS, DIAMONDS, SPADES
    }
    // enum holding the values
	public enum Value{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
       
    private Value value;
    private Suit suit;

    public PlayingCard(Value value, Suit suit) {
		this.value = value;
		this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
	}
	
	@Override
	public String toString() {
		return this.getValue() + " of " + this.getSuit();
	}
    
}