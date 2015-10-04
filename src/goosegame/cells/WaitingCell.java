
package goosegame.cells;

import goosegame.Cell;
import goosegame.Player;

/**
 *	WaitingCell implements Cell. When the player go in this cell he have to wait for a certain amount of time before be able to move.
 */
public class WaitingCell extends NormalCell implements Cell {
	
	private int waitingCompter;
	private int waitingTime;
	
	/**
	 * Constructor. Create a WaitingCell without a player on it. Initialize the compter at 0 and the waitingTime at time.
	 * 
	 * @param index
	 * 		index of the Cell
	 * @param time
	 * 		time the player have to wait if he come on this Cell
	 */
	public WaitingCell (int index, int time){
		super(index);
		this.waitingCompter = 0;
		this.waitingTime = time;
	}
	
	/**
	 *  Say if the player can left the Cell or if he have to wait. If he have to wait, decrease the waitingCompter.
	 *  
	 *  @return true if and only if the player is allow to leave the Cell.
	 */
	public boolean canBeLeftNow() {
		if(this.waitingCompter == 0 )
			return true;
		else{
			this.waitingCompter = (this.waitingCompter -1);
			return false;
		}
	}
	/**
	 * Initialize the waitingCompter and change the current player.
	 */
	public void welcome (Player p){
		super.welcome(p);
		this.waitingCompter = this.waitingTime;	
	}
	
	/**
	 * Return the time left before the player is able to move.
	 * 
	 * @return the time left before the player can move.
	 */
	public int getTime(){
		return this.waitingCompter;
	}
}
