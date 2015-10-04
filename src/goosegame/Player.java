package goosegame;

import goosegame.Cell;

/**
 * Class Player define a player of a Goose Game.
 */
public class Player {
	
	private Cell myCell;
	private String name;

	/**
	 * This is our player constructor
	 */
		public Player(String name) {
			this.name= name;
			this.myCell = null;
		}
	/**
	 * This method allow us to get the Cell of the current player
	 * @return Cell the cell of the player.
	 */
		public Cell getCell() {
			return this.myCell;
		}
		
	/**
	 * This method allow us to set the Cell of the current player
	 * @param newCell the new cell of the player.
	 */
		public void setCell(Cell newCell) {
			this.myCell=newCell;		
		}
		
	/**
	 *  toString print the name of the Player.
	 *  @return the name of the player as a string. 
	 */
		public String toString(){
			return this.name;
		}

}

