package test;
import static org.junit.Assert.*;
import goosegame.Player;
import goosegame.cells.NormalCell;
import goosegame.cells.ZeroCell;

import org.junit.Test;


public class PlayerTest {

	@Test
	public void testGetCell() {
		Player p = new Player("test");
		assertEquals("Wrong Cell ?", p.getCell(), null);
		ZeroCell zcell = new ZeroCell(0);
		p.setCell(zcell);
		assertEquals("Wrong Cell ? 2", p.getCell(), zcell);
		
	}

	@Test
	public void testSetCell() {
		Player p = new Player("test");
		NormalCell cell = new NormalCell(1);
		p.setCell(cell);
		assertEquals("Wrong Cell 2 ?", p.getCell(), cell);
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(PlayerTest.class);
    }
}
