package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
	
	public PlayerTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}

	/**
	 * Test of getName method, of class Player.
	 */
	@Test
	public void testGetName() {
		System.out.println("getName");
		Player instance = new Player(1, "test");
		String expResult = "test";
		String result = instance.getName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setName method, of class Player.
	 */
	@Test
	public void testSetName() {
		System.out.println("setName");
		String name = "test2";
		Player instance = new Player(1, "test");
		instance.setName(name);
	}

	/**
	 * Test of getPlayerNum method, of class Player.
	 */
	@Test
	public void testGetPlayerNum() {
		System.out.println("getPlayerNum");
		Player instance = new Player(1, "test");
		int expResult = 1;
		int result = instance.getPlayerNum();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setPlayerNum method, of class Player.
	 */
	@Test
	public void testSetPlayerNum() {
		System.out.println("setPlayerNum");
		int playerNum = 0;
		Player instance = new Player(1, "test");
		instance.setPlayerNum(playerNum);
	}

	/**
	 * Test of getHand method, of class Player.
	 */
	@Test
	public void testGetHand() {
		System.out.println("getHand");
		Player instance = new Player(1, "test");
		String expResult = "No cards in hand.";
		String result = instance.getHand();
		assertEquals(expResult, result);
	}

	/**
	 * Test of deal method, of class Player.
	 */
	@Test
	public void testDeal() {
		System.out.println("deal");
		Player instance = new Player(1, "test");
		instance.deal();
		boolean expResult = true;
		boolean result = (instance.getCount() > 0);
		assertEquals(expResult, result);
	}

	/**
	 * Test of hit method, of class Player.
	 */
	@Test
	public void testHit() {
		System.out.println("hit");
		Player instance = new Player(1, "test");
		instance.hit();
		boolean expResult = true;
		boolean result = (instance.getCount() > 0);
		assertEquals(expResult, result);
	}

	/**
	 * Test of setStand method, of class Player.
	 */
	@Test
	public void testSetStand() {
		System.out.println("setStand");
		boolean stand = true;
		Player instance = new Player(1, "test");
		instance.setStand(stand);
		boolean expResult = true;
		boolean result = instance.getStand();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getStand method, of class Player.
	 */
	@Test
	public void testGetStand() {
		System.out.println("getStand");
		Player instance = new Player(1, "test");
		boolean expResult = false;
		boolean result = instance.getStand();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setBust method, of class Player.
	 */
	@Test
	public void testSetBust() {
		System.out.println("setBust");
		boolean bust = false;
		Player instance = new Player(1, "test");
		instance.setBust(bust);
		boolean expResult = false;
		boolean result = instance.getBust();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getBust method, of class Player.
	 */
	@Test
	public void testGetBust() {
		System.out.println("getBust");
		Player instance = new Player(1, "test");
		boolean expResult = false;
		boolean result = instance.getBust();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getCount method, of class Player.
	 */
	@Test
	public void testGetCount() {
		System.out.println("getCount");
		Player instance = new Player(1, "test");
		int expResult = 0;
		int result = instance.getCount();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setBlackjack method, of class Player.
	 */
	@Test
	public void testSetBlackjack() {
		System.out.println("setBlackjack");
		boolean blackjack = true;
		Player instance = new Player(1, "test");
		instance.setBlackjack(blackjack);
		boolean expResult = true;
		boolean result = instance.getBlackjack();
		assertEquals(expResult, result);

	}

	/**
	 * Test of getBlackjack method, of class Player.
	 */
	@Test
	public void testGetBlackjack() {
		System.out.println("getBlackjack");
		Player instance = new Player(1, "test");
		boolean expResult = false;
		boolean result = instance.getBlackjack();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setHasWon method, of class Player.
	 */
	@Test
	public void testSetHasWon() {
		System.out.println("setHasWon");
		boolean hasWon = true;
		Player instance = new Player(1, "test");
		instance.setHasWon(hasWon);
		boolean expResult = true;
		boolean result = instance.getHasWon();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getHasWon method, of class Player.
	 */
	@Test
	public void testGetHasWon() {
		System.out.println("getHasWon");
		Player instance = new Player(1, "test");
		boolean expResult = false;
		boolean result = instance.getHasWon();
		assertEquals(expResult, result);
	}

	/**
	 * Test of reset method, of class Player.
	 */
	@Test
	public void testReset() {
		System.out.println("reset");
		Player instance = new Player(1, "test");
		instance.hit();
		instance.reset();
		int expResult = 0;
		int result = instance.getCount();
		assertEquals(expResult, result);
	}

	/**
	 * Test of toString method, of class Player.
	 */
	@Test
	public void testToString() {
		System.out.println("toString");
		Player instance = new Player(1, "test");
		String expResult = "Player 1: test";
		String result = instance.toString();
		assertEquals(expResult, result);
	}
	
}
