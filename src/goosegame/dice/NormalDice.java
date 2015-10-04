package goosegame.dice;

import java.util.Random;

import goosegame.Dice;

/**
 * NormalDice return a number between 2 and 12 when we throw the dice.
 */
public class NormalDice implements Dice {

	public NormalDice() {
	}

	/* (non-Javadoc)
	 * @see goosegame.Dice#throwDice()
	 */
	public int throwDice() {
		Random r = new Random();
		return ((r.nextInt(5) + 1)+(r.nextInt(5) + 1));
	}

}
