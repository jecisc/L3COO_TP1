package goosegame.cells;

import java.util.LinkedList;
import java.util.NoSuchElementException;

import goosegame.Cell;
import goosegame.Player;

/**
 * ZeroCell implements Cell. This cell can have more than 1 player on it. The index is 0 on a normal game. 
 */
public class ZeroCell extends NormalCell implements Cell {

	private LinkedList<Player> players;


	public ZeroCell(int index) {
		super(index);
		this.players = new LinkedList<Player>();
	}

	public Player getPlayer() { 
		try{
			return this.players.removeFirst();
		} catch (NoSuchElementException e){
			return null;
		}
	}
	
	public void welcome(Player p){
		this.players.add(p);
	}

}
