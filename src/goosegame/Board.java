package goosegame;

/**
 * Interface Board declare the basic methods we need on our different boards.
 */
public interface Board {

	/**
	 * This method allow us to add player 
	 * @param name  the name of the new player.	
	 */
	public void addPlayer(String name);

	/**
	 * This method allow us to check if a player is on the last cell
	 * @return true if and only if a player is on the last cell.
	 */
	public boolean getEndCell();

	/**
	 * This method allow us to change current Player
	 * @return Player
	 * who will be the new current player
	 */		
	public Player nextPlayer();

	/**
	 * If a player try to go on a cell with a number bigger than 63, modify this number 
	 * @param i : number bigger than 63
	 * @return the new number of the cell   
	 */
	public int normalize(int i);

	/**
	 * This method take an index in parameter and return corresponding cell 
	 * @param i : index
	 * @return the corresponding cell
	 */
	public Cell getCell(int i);

	/**
	 * This method allow us to swap player amongst themselves when they are on the same cell
	 * @param p : player who was already on the cell
	 * @param p2 : player who arrived on the same cell
	 * 		p go on the last cell of p2
	 */
	public void swapPlayer(Player p, Player p2);


}
