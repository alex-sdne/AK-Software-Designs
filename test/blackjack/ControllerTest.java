/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alex
 */
public class ControllerTest {
	
	public ControllerTest() {
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
	 * Test of setPlayerName method, of class Controller.
	 */
	@Test
	public void testSetPlayerName() {
		System.out.println("setPlayerName");
		String name = "test";
		Player x = new Player(1, "");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.setPlayerName(name);
		String expResult = "test";
		String result = x.getName();
		assertEquals(expResult, result);
		
	}

	/**
	 * Test of getPlayerName method, of class Controller.
	 */
	@Test
	public void testGetPlayerName() {
		System.out.println("getPlayerName");
		String name = "test";
		Player x = new Player(1, "");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.setPlayerName(name);
		String expResult = "test";
		String result = instance.getPlayerName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setPlayerNum method, of class Controller.
	 */
	@Test
	public void testSetPlayerNum() {
		System.out.println("setPlayerNum");
		int num = 1;
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.setPlayerNum(num);
		int expResult = 1;
		int result = x.getPlayerNum();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPlayerNum method, of class Controller.
	 */
	@Test
	public void testGetPlayerNum() {
		System.out.println("getPlayerNum");
		int num = 1;
		Player x = new Player(num, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		int expResult = 1;
		int result = instance.getPlayerNum();
		assertEquals(expResult, result);
	}

	/**
	 * Test of dealPlayer method, of class Controller.
	 */
	@Test
	public void testDealPlayer() {
		System.out.println("dealPlayer");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.dealPlayer();
		boolean expResult = true;
		boolean result = (instance.getPlayerCount() > 0);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPlayerHand method, of class Controller.
	 */
	@Test
	public void testGetPlayerHand() {
		System.out.println("getPlayerHand");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.getPlayerHand();
		boolean expResult = true;
		boolean result = (instance.getPlayerHand().length() > 0);
		assertEquals(expResult, result);
	}

	/**
	 * Test of HitPlayer method, of class Controller.
	 */
	@Test
	public void testHitPlayer() {
		System.out.println("HitPlayer");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.HitPlayer();
		boolean expResult = true;
		boolean result = (instance.getPlayerCount() > 0);
		assertEquals(expResult, result);
	}

	/**
	 * Test of standPlayer method, of class Controller.
	 */
	@Test
	public void testStandPlayer() {
		System.out.println("standPlayer");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.standPlayer();
		boolean expResult = true;
		boolean result = (x.getStand());
		assertEquals(expResult, result);
	}

	/**
	 * Test of isStanding method, of class Controller.
	 */
	@Test
	public void testIsStanding() {
		System.out.println("isStanding");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		boolean expResult = false;
		boolean result = (instance.isStanding());
		assertEquals(expResult, result);
	}

	/**
	 * Test of bustPlayer method, of class Controller.
	 */
	@Test
	public void testBustPlayer() {
		System.out.println("bustPlayer");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.bustPlayer();
		boolean expResult = true;
		boolean result = (instance.isBust());
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPlayerCount method, of class Controller.
	 */
	@Test
	public void testGetPlayerCount() {
		System.out.println("getPlayerCount");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.dealPlayer();
		boolean expResult = true;
		boolean result = (instance.getPlayerCount() > 0);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPlayerBlackjack method, of class Controller.
	 */
	@Test
	public void testGetPlayerBlackjack() {
		System.out.println("getPlayerBlackjack");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		boolean expResult = false;
		boolean result = (instance.getPlayerBlackjack());
		assertEquals(expResult, result);
	}

	/**
	 * Test of setPlayerBlackjack method, of class Controller.
	 */
	@Test
	public void testSetPlayerBlackjack() {
		System.out.println("setPlayerBlackjack");
		boolean blackjack = true;
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.setPlayerBlackjack(blackjack);
		boolean expResult = true;
		boolean result = (instance.getPlayerBlackjack());
		assertEquals(expResult, result);

	}

	/**
	 * Test of isBust method, of class Controller.
	 */
	@Test
	public void testIsBust() {
		System.out.println("isBust");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		x.setBust(true);
		boolean expResult = true;
		boolean result = instance.isBust();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPlayerHasWon method, of class Controller.
	 */
	@Test
	public void testGetPlayerHasWon() {
		System.out.println("getPlayerHasWon");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		x.setHasWon(true);
		boolean expResult = true;
		boolean result = instance.getPlayerHasWon();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setPlayerHasWon method, of class Controller.
	 */
	@Test
	public void testSetPlayerHasWon() {
		System.out.println("setPlayerHasWon");
		boolean hasWon = true;
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.setPlayerHasWon(hasWon);
		boolean expResult = true;
		boolean result = instance.getPlayerHasWon();
		assertEquals(expResult, result);

	}

	/**
	 * Test of resetPlayer method, of class Controller.
	 */
	@Test
	public void testResetPlayer() {
		System.out.println("resetPlayer");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		instance.dealPlayer();
		instance.resetPlayer();
		boolean expResult = true;
		boolean result = (instance.getPlayerCount() == 0);
		assertEquals(expResult, result);
	}

	/**
	 * Test of updateView method, of class Controller.
	 */
	@Test
	public void testUpdateView() {
		System.out.println("updateView");
		Player x = new Player(0, "test");
		PlayerView view = new PlayerView();
		Controller instance = new Controller(x, view);
		String expResult = "Player 0: test";
		String result = instance.updateView();
		assertEquals(expResult, result);
	}
	
}
