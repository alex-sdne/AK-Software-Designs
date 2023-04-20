package blackjack;
/**
 * A class that holds the playing cards of a player.
 * Cards can be added to the hand, and the hand 
 * handles the dealing of the cards at the beginning
 * of every round. This class also handles counting the
 * sum of all cards in a hand.
 *
 * @author Alex Kalicharan 04/17/2023
 */

import java.util.ArrayList;

public class Hand {

	private int size;
	private boolean bust;
	private ArrayList<PlayingCard> cards;
	
	public Hand() {
		this.size = 0;
		cards = new ArrayList<PlayingCard>();
	}
	// creates two cards for the player
	public void deal() {
		while (cards.size() < 2 ) {
			cards.add(CardGenerator.generateCard());
		}
	}
	// adds a card to the player's hand
	public void addCard() {
		cards.add(CardGenerator.generateCard());
	}
	// returns the array of cards
	public ArrayList<PlayingCard> getCards () {
		return this.cards;
	}
	// counts the sum of all cards in hand
	public int count() {
		int count = 0;
		for (PlayingCard x:cards) {
			PlayingCard.Value value = x.getValue();
			switch(value) {
				case TWO:
					count += 2;
					break;
				case THREE:
					count += 3;
					break;
				case FOUR:
					count += 4;
					break;
				case FIVE:
					count += 5;
					break;
				case SIX:
					count += 6;
					break;
				case SEVEN:
					count += 7;
					break;
				case EIGHT:
					count += 8;
					break;
				case NINE:
					count += 9;
					break;
				case TEN:
					count += 10;
					break;
				case JACK:
					count += 10;
					break;
				case QUEEN:
					count += 10;
					break;
				case KING:
					count += 10;
					break;
				case ACE:
					if (count < 11) {
						count += 11;
					}
					else {
						count += 1;
					}
					break;		
				}
			}
		return count;
	}
	// determines if the hand is a bust
	public boolean isBust() {
		return (count() > 21);
	}
	// clears all cards from the hand
	public void clear() {
		cards.clear();
	}
	
	public void setBust(boolean bust) {
		this.bust = bust;
	}
	
	public boolean getBust() {
		if (isBust()) {
			this.bust = true;
		}
		return this.bust;
	}
	
	@Override
	public String toString() {
		if (cards.isEmpty()) {
			return "No cards in hand.";
		}
		else {
			System.out.println("Cards in hand:");
			for (int i = 0; i < cards.size(); i++) {
				System.out.println(cards.get(i));
			}
			System.out.println("Card Sum: " + count());
		}
		return "";
	}
}