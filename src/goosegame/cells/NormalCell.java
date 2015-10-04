package goosegame.cells;

import goosegame.Cell;
import goosegame.Player;

/**
 * NormalCell implements Cell with the normal cell of the board.
 */
public class NormalCell implements Cell {

	protected int index;
	protected Player p;
	
	/**
	 * Constructor of a NormalCell. Create a NormalCell without on player on it and with the index pass in parameter.
	 * 
	 * @param index
	 * 		index of the Cell on the Board.
	 */
	public NormalCell (int index){
		this.index = index;
		this.p = null;
	}
	
	public boolean canBeLeftNow() {
		return true;
	}

	public boolean isRetaining() {
		return false;
	}

	public int getIndex() {
		return this.index;
	}

	public int handleMove(int diceThrow) {
		return this.index;
	}

	public boolean isBusy() {
		if(this.p == null)
			return false; 
		else 
			return true;	
	}
	
	public Player getPlayer(){
		return this.p;
	}
	
	public void welcome (Player player){
		this.p = player;
	}
	
	public void goodBye(){
		this.p = null;
	}
	
	public String toString(){
		return Integer.toString(this.index);
	}

}
