Ferlicot-Delbecque Cyril & Flament Julien
02/10/2014
GooseGame's project.

On this project we created a Goose Game on java. On our work we have a normal Goose Game but it's easy to add new rules, different Board, different Dice, new special Cells etc...

Our work is on a package "goosegame".
On this package we have the GameLauncher, the main class of the project. This class use the class Game for play a party. The basic party print on the terminal what's happen on a party.
The Game use a Board with Player on it and some Dice. So the package contain a Player class. 
He contain also a Board interface. 
The class who implement this interface are on a goosegame.boards package. Inside we have a BoardNormal with the normal cells of a goose game and we also have an exemple of a different board with a board which contain only NormalCell. 
On the goosegame package we also have a Dice interface and a goosegame.dice package. This package contain different dice which can be use on a game. On basic we have a NormalDice and I also add a Dice9 who return every-time 9.
Finnally we have a Cell interface and a goosegame.cells package which contain all the different cells from the NormalCell to the ZeroCell (starting cell) and all the special cells.

For play with a Normal Board we need at least 3 players because we have 2 trap cells. If we want to add so trap cell we need to update the Game's class.
If a Player go on a special cell which send him on an other special cell the player don't take the new special effect, like we said on the TD. 

For use the GooseGame, the first parameter is an int. For now if it's "1" the board will contain only NormalCell. If it's something else than "1" that will use the Normal Board. After we have to write at least 3 name. The names will be the players of the game. 
I did a MakeFile and test all the MakeFile, everything works. 
You can have information on the makefile with a "make help".
You can clean the Folders with a "make clean". 
You can create the documentation with a "make doc".
You have 2 examples for run the GooseGame on the MakeFile. 
You can create a .jar than you can run with the "make jar". (then you can run the .jar with "make runJar".)

On the last test I did I didn't see any bug or failure. 

We have a coverage of 61% on the test. I didn't test the Game class because a lot of methods was private and the public methods was complicated to test.


