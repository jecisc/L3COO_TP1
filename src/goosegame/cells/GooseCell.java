package goosegame.cells;

import goosegame.Cell;

/**
 * GooseCell implements Cell. When a player come on this cell he move an other time of the same distance.
 */
public class GooseCell extends NormalCell implements Cell {

	public GooseCell(int index) {
		super(index);
	}

	/**
	 * handleMove of a gooseCell double the distance where the player have to go.
	 * @param d the number we obtain after throwing the dice.
	 */
	public int handleMove(int d){
		return (this.index + d);
	}
}
