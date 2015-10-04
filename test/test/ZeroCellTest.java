package test;
import static org.junit.Assert.*;
import goosegame.Player;
import goosegame.cells.ZeroCell;

import org.junit.Test;

public class ZeroCellTest {

	@Test
	public void testGetPlayer() {
		ZeroCell zcell = new ZeroCell(0);
		Player p1 = new Player("test");
		Player p2 = new Player("test");
		zcell.welcome(p1);
		zcell.welcome(p2);
		assertEquals("Not the good player ? 1", zcell.getPlayer(), p1);
		assertEquals("Not the good player ? 2", zcell.getPlayer(), p2);
		assertEquals("Not the good player ? 3", zcell.getPlayer(), null);
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(ZeroCellTest.class);
    }
}
