package test;

import static org.junit.Assert.*;
import goosegame.boards.OnlyNormalBoard;

import org.junit.Test;

public class OnlyNormalBoardTest {

	@Test
	public void testOnlyNormalBoard() {
		assertNotNull("Board null ?", new OnlyNormalBoard());
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(OnlyNormalBoardTest.class);
    }

}
