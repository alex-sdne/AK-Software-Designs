package blackjack;
/**
 * A class to generate playing cards for the game. This class uses the
 * PlayingCard class to create objects that are then returned.
 *
 * @author Alex Kalicharan 04/17/2023
 */
import blackjack.PlayingCard.Suit;
import blackjack.PlayingCard.Value;
import java.util.Random;

public class CardGenerator {
	// main method that generates cards
	public static PlayingCard generateCard() {
		
		Random random = new Random();
		
		int numSuits = PlayingCard.Suit.values().length;
		int numValues = PlayingCard.Value.values().length;
		
		Suit randomSuit = PlayingCard.Suit.values()[random.nextInt(numSuits)];
		Value randomValue = PlayingCard.Value.values()[random.nextInt(numValues)];
		
		return new PlayingCard(randomValue, randomSuit);
		
	}
}
