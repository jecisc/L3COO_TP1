package test;
import static org.junit.Assert.*;
import goosegame.cells.GooseCell;

import org.junit.Test;



public class GooseCellTest {

	@Test
	public void testHandleMove() {
		GooseCell gcell = new GooseCell(6);
		assertEquals("The cell is good?", gcell.handleMove(5), 11);
	}
	

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(GooseCellTest.class);
    }

}
