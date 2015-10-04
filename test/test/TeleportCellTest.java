package test;
import static org.junit.Assert.*;
import goosegame.cells.TeleportCell;

import org.junit.Test;



public class TeleportCellTest {

	@Test
	public void testHandleMove() {
		TeleportCell tcell = new TeleportCell(6, 5);
		assertTrue("Good destination cell ?", tcell.handleMove(6)==5);
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(TeleportCellTest.class);
    }
}
