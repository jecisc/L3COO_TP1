package test;
import static org.junit.Assert.*;
import goosegame.Player;
import goosegame.cells.NormalCell;

import org.junit.Test;



public class NormalCellTest {

	@Test
	public void testCanBeLeftNow() {
		NormalCell ncell = new NormalCell(1);
		assertTrue("We can't leave the cell ?", ncell.canBeLeftNow());
	}

	@Test
	public void testIsRetaining() {
		NormalCell ncell = new NormalCell(1);
		assertFalse("The player is retaining?", ncell.isRetaining());
	}

	@Test
	public void testGetIndex() {
		NormalCell ncell = new NormalCell(1);
		assertTrue("Not the good Index?", ncell.getIndex()== 1);
	}

	@Test
	public void testHandleMove() {
		NormalCell ncell = new NormalCell(6);
		assertTrue("Not the good cell?", ncell.handleMove(4)==6);
	}

	@Test
	public void testIsBusy() {
		NormalCell ncell = new NormalCell(6);
		Player p = new Player("test");
		assertFalse("The cell is busy ?", ncell.isBusy());
		ncell.welcome(p);
		assertTrue("The cell is not busy ?", ncell.isBusy());
	}

	@Test
	public void testGetPlayer() {
		NormalCell ncell = new NormalCell(6);
		Player p = new Player("test");
		ncell.welcome(p);
		assertEquals("The player is not the good one ?", ncell.getPlayer(), p);
	}

	@Test
	public void testWelcome() {
		NormalCell ncell = new NormalCell(6);
		Player p = new Player("test");
		assertEquals("A player is on the cell ?", ncell.getPlayer(), null);
		ncell.welcome(p);
		assertEquals("The player is on the cell?", ncell.getPlayer(), p);
	}
	
	@Test
	public void testGoodBye() {
		NormalCell ncell = new NormalCell(6);
		Player p = new Player("test");
		ncell.welcome(p);
		assertEquals("The player is on the cell?", ncell.getPlayer(), p);
		ncell.goodBye();
		assertEquals("A player on the cell ?", ncell.getPlayer(), null);
	}
	
	@Test
	public void testToString() {
		NormalCell ncell = new NormalCell(6);
		assertEquals(" Wrong toString ?", ncell.toString(), Integer.toString(ncell.getIndex()));
	}
	

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(NormalCellTest.class);
    }

}
