package goosegame.cells;

import goosegame.Cell;

/**
 * TrapCell implements Cell. When a player come on this cell he can't move until an other player come on this cell. 
 */
public class TrapCell extends NormalCell implements Cell {

	public TrapCell(int index) {
		super(index);
	}
	
	public boolean canBeLeftNow(){
		return false;
	}
	
	public boolean isRetaining(){
		return true;
	}

}
