package goosegame;

/**
 * GameLauncher is the main class of the GooseGame.
 */
public class GameLauncher {

	/**
	 * Launcher of the Game
	 */
	public static void main(String[] args) {
		if ((args.length) <= 3){
			System.out.println("Please, use at least 3 player, else the game can be infiny ! ");
		}
		else{
			Game game = new Game(Integer.parseInt(args[0]));
			for (int i = 1; i <= args.length-1; i++){
				game.addPlayer(args[i]);
			}
			game.play();
		}
	}

}
