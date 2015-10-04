package goosegame.boards;

import goosegame.Cell;
import goosegame.Player;
import goosegame.cells.*;
import java.util.LinkedList;

/**
 *Class Board is a normal board of the GooseGame. Board implements Board. 
 */
public class BoardNormal {
	
	protected LinkedList<Player> players;
	protected Cell[] tabBoard ;
	protected Player current;
	
	/**
	 *Build a normal Board for a Goose Game.
	 */
	public BoardNormal() {
		this.players = new LinkedList<Player>();
		this.current = null;
		this.tabBoard = new Cell[64];
		
		//At the beginning we put NormalCell in all the Table.
		for(int i = 0; i<64 ; i++){
			this.tabBoard[i] = new NormalCell(i);
		}
		
		// We put a ZeroCell at the beginning. 
		this.tabBoard[0] = new ZeroCell(0);
		
		// We put a GooseCell at the index 9, 18, 27, 36, 45, 54.
		for(int j = 9; j < 63; j+=9){
			this.tabBoard[j] = new GooseCell(j);
		}
		
		// We put a TrapCell at the index 31 and 52.
		this.tabBoard[31] = new TrapCell(31);
		this.tabBoard[52] = new TrapCell(52);		
		
		// We put a WaitingCell for 2 round  at the index 19.
		this.tabBoard[19] = new WaitingCell(19, 2);
		
		// We put a TeleportCell from index 6 to 12, from 42 to 30 and from 58 to 1. 
		this.tabBoard[6] = new TeleportCell(6,12);
		this.tabBoard[42] = new TeleportCell(42,30);
		this.tabBoard[58] = new TeleportCell(58,1);
	}
	
	/**
	 * This method allow us to add player 
	 * @param name  the name of the new player.	
	 */
	public void addPlayer(String name){
		Player p = new Player(name);
		p.setCell(this.tabBoard[0]);
		this.players.add(p);
		this.tabBoard[0].welcome(p);
	}
	
	/**
	 * This method allow us to check if a player is on the last cell
	 * @return true if and only if a player is on the last cell.
	 */
	public boolean getEndCell() {
		if(this.current == null)
			return false;
		else{
			if(this.current.getCell().getIndex() == 63)
				return true;
			else
				return false;
		}
	}
	
	/**
	 * This method allow us to change current Player
	 * @return Player
	 * who will be the new current player
	 */		
	public Player nextPlayer() {
		if (this.current == null){
			this.current = this.players.getFirst();
			return this.current;
		}
		else{
			int nextP = this.players.indexOf(this.current)+1;
			if (nextP == this.players.size())
				this.current = this.players.getFirst();
			else
				this.current = this.players.get(nextP); 
			
			return this.current;
		}
	}
	
	/**
	 * If a player try to go on a cell with a number bigger than 63, modify this number 
	 * @param i : number bigger than 63
	 * @return the new number of the cell   
	 */
	public int normalize(int i) {
		if(i>63)
			return (63-(i-63));
		else
			return i;
	}
	
	/**
	 * This method take an index in parameter and return corresponding cell 
	 * @param i : index
	 * @return the corresponding cell
	 */
	public Cell getCell(int i) {
		return this.tabBoard[i];
	}
	
	/**
	 * This method allow us to swap player amongst themselves when they are on the same cell
	 * @param p : player who was already on the cell
	 * @param p2 : player who arrived on the same cell
	 * 		p go on the last cell of p2
	 */
	public void swapPlayer(Player p, Player p2) {
		Cell c= p.getCell();
		Cell c2 = p2.getCell();

		c2.goodBye();
		c2.welcome(p);
		p.setCell(c2);
		
		c.goodBye();
		c.welcome(p2);	
		p2.setCell(c);
	}
}
