package test;
import static org.junit.Assert.*;
import goosegame.Player;
import goosegame.cells.WaitingCell;

import org.junit.Test;



public class WaitingCellTest {

	@Test
	public void testCanBeLeftNow() {
		WaitingCell wcell = new WaitingCell(5, 1);
		Player p = new Player("test");
		wcell.welcome(p);
		assertFalse("Player can move ?", wcell.canBeLeftNow());
		assertTrue("Player can't move ?", wcell.canBeLeftNow());
	}

	@Test
	public void testWelcome() {
		WaitingCell wcell = new WaitingCell(1, 5);
		Player p = new Player("test");
		wcell.welcome(p);
		assertEquals("Player not on the cell ?", wcell.getPlayer(), p );
		assertTrue("Time not good ?", wcell.getTime() == 5);
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(WaitingCellTest.class);
    }
}
