package goosegame;

import goosegame.boards.*;
import goosegame.dice.*;

/**
 *Class Game contain the methods for play a party of a Goose Game.
 */
public class Game {
	
	private BoardNormal board;
	
	/**
	 * Constructor of Game.
	 */
	public Game(int i){
		if (i ==1 ){
			OnlyNormalBoard b = new OnlyNormalBoard();
			this.board = b;
		}
		else{
			BoardNormal b = new BoardNormal();
			this.board = b;
		}
	}
	
	/**
	 * addPlayer add a player to the board of the game.
	 * @param name the name of the new Player.
	 */
	public void addPlayer(String name){
		board.addPlayer(name);
	}
	
	/**
	 * isFinished allow to know if a player went to the last cell of the game.
	 * 
	 * @return true if and only if a Player win the game.
	 */
	public boolean isFinished(){
		// This version works with a NormalBoard. 
		//If we have more than 2 TrapCell we need to update this methode for check if all the players are stuck on a TrapCell. 
		//If it's the case, everyone lose the game.
		if (this.board.getEndCell())
			return true;
		else
			return false;		
	}

	private Cell computeTargetCell(Player p, int d){
		Cell targetCell = board.getCell(board.normalize((p.getCell().getIndex()) + d));
		return board.getCell(board.normalize(targetCell.handleMove(d)));		
	}
	
	private void movePlayer(Player p, Cell realCell){
		if(realCell.isBusy())
			board.swapPlayer(p, realCell.getPlayer());
		else{
			realCell.welcome(p);
			p.getCell().goodBye();
			p.setCell(realCell);
		}
	}
	
	private void printBegin(Player p){
		System.out.print(p.toString()); 
		System.out.print(" is in "); 
		System.out.print(p.getCell().toString()); 
		System.out.print(", ");
	}
	
	private void printEnd(Player p, Boolean b, int d){
		if (b){
			System.out.print(p.toString());
			System.out.print(" throws ");
			System.out.print(Integer.toString(d));
			System.out.print(", reaches cell ");
			System.out.print(p.getCell().toString()+"\n"); 
		}else{
			System.out.print(p.toString());
			System.out.print(" cannot play.\n");		
		}
			
	}
	
	/**
	 * The method play the game when all the players are addto the board b.
	 */
	public void play(){
		Player p = null; int d; Cell realCell; 
		Dice dice = new NormalDice();
		
		//If the game is not finish we play our next move.
		while(!(isFinished())){
			p = board.nextPlayer();
			
			this.printBegin(p);
			
			if (p.getCell().canBeLeftNow()){
				d = dice.throwDice(); //we throw the two die. d is a number between 2 and 12.
				realCell = computeTargetCell(p, d);
				movePlayer(p, realCell);
				this.printEnd(p, true, d);
			}		
			else 
				this.printEnd(p, false, 0);
		}	

		System.out.print(p.toString()); 
		System.out.println(" WINS !!");
	}
}
