package test;
import static org.junit.Assert.*;
import goosegame.Player;
import goosegame.boards.BoardNormal;
import goosegame.cells.NormalCell;

import org.junit.Test;


public class BoardTest {

	@Test
	public void testAddPlayer() {
		BoardNormal b = new BoardNormal();
		Player p = new Player("test");
		b.addPlayer("test");
		assertEquals("No player ?", p.toString(), b.nextPlayer().toString());	
	}

	@Test
	public void testGetEndCell() {
		BoardNormal b = new BoardNormal();
		b.addPlayer("test");
		Player p; NormalCell nCell;
		assertFalse("End cell ?", b.getEndCell());

		p = b.nextPlayer();
		nCell = new NormalCell(62);
		p.setCell(nCell);
		assertFalse("End Cell 2?", b.getEndCell());
		
		p.setCell(new NormalCell(63));
		assertTrue("Not end Cell ?", b.getEndCell());
	}

	@Test
	public void testNextPlayer() {
		BoardNormal b = new BoardNormal();
		b.addPlayer("test");
		b.addPlayer("test2");
		assertEquals("Not the first player ?", b.nextPlayer().toString() , "test" );
		assertEquals("Not the second player ?", b.nextPlayer().toString(), "test2");
		assertEquals("Not the first again ?", b.nextPlayer().toString(), "test");
	}

	@Test
	public void testNormalize() {
		BoardNormal b = new BoardNormal();
		assertTrue("Need to change the number ?", b.normalize(15) == 15);
		assertTrue("No need to change the number ?", b.normalize(65) == 61);
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(BoardTest.class);
    }
}
