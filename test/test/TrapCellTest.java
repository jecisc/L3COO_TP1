package test;
import static org.junit.Assert.*;
import goosegame.cells.TrapCell;

import org.junit.Test;



public class TrapCellTest {

	@Test
	public void testCanBeLeftNow() {
		TrapCell trcell = new TrapCell(6);
		assertFalse("The player can leave the cell ?", trcell.canBeLeftNow());
	}

	@Test
	public void testIsRetaining() {
		TrapCell trcell = new TrapCell(6);
		assertTrue("The player isn't retaining?", trcell.isRetaining());
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(TrapCellTest.class);
    }
}
