package goosegame.boards;

import java.util.LinkedList;

import goosegame.Board;
import goosegame.Cell;
import goosegame.Player;
import goosegame.cells.NormalCell;
import goosegame.cells.ZeroCell;

public class OnlyNormalBoard extends BoardNormal implements Board {

	public OnlyNormalBoard(){
		this.players = new LinkedList<Player>();
		this.current = null;
		this.tabBoard = new Cell[64];
		
		//At the beginning we put NormalCell in all the Table.
		for(int i = 0; i<64 ; i++){
			this.tabBoard[i] = new NormalCell(i);
		}
		
		// We put a ZeroCell at the beginning. 
		this.tabBoard[0] = new ZeroCell(0);
		
	}

}
