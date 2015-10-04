package goosegame.cells;

import goosegame.Cell;

/**
 * TeleportCell implements Cell. If the player come on this cell he's automatically teleport to an other cell pass in argument.
 */
public class TeleportCell extends NormalCell implements Cell {

	private int destination;
	
	/**
	 * Constructor of the Teleport cell, take in parameter a int which will be the final destination of the player who come on this cell.
	 * 
	 * @param index
	 * 		destination of the player if he come on this cell.
	 */
	public TeleportCell(int index, int dest) {
		super(index);
		this.destination = dest;
	}
	
	public int handleMove (int d){
		return this.destination;
	}

}
