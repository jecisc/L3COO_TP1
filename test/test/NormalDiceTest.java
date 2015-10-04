package test;
import static org.junit.Assert.*;
import goosegame.dice.NormalDice;

import org.junit.Test;


public class NormalDiceTest {

	@Test
	public void testThrowDice() {
		NormalDice nD = new NormalDice();
		int i = nD.throwDice();
		assertTrue("Not a good number ?", i <13);
		assertTrue("Not a good number ?", i >1);
	}

    // ---Pour permettre l'execution des test----------------------
    public static junit.framework.Test suite() {
	return new junit.framework.JUnit4TestAdapter(NormalDiceTest.class);
    }
}
