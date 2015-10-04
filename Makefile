DES = -d classes
CHE = -classpath classes
CC = javac
RUN = java -cp classes
DOC = javadoc -classpath src
JAR = jar cvfm
TST= java -jar test.jar

all: compGoose doc tst jar runJar

doc:  
	mkdir -p docs
	$(DOC) -subpackages goosegame -d docs

compGoose:
	$(CC) $(DES) -classpath src src/**/*.java

jar: 	
	make compGoose
	$(JAR) GooseGame.jar manifest-ex . -C classes .

tst:
	$(CC) -classpath test.jar test/test/*.java
	$(TST) test.NormalCellTest
	$(TST) test.TeleportCellTest
	$(TST) test.TrapCellTest
	$(TST) test.GooseCellTest
	$(TST) test.WaitingCellTest
	$(TST) test.ZeroCellTest
	$(TST) test.PlayerTest
	$(TST) test.NormalDiceTest
	$(TST) test.BoardTest

run:	
	$(RUN) goosegame.GameLauncher 0 "Taru" "Lalafell" "Lalafail"

runSpe:	
	$(RUN) goosegame.GameLauncher 1 "Taru" "Lalafell" "Lalafail"

runJar:
	java -jar GooseGame.jar 0 "Taru" "Lalafell" "Lalafail"


help: 
	@echo "You can use :"
	@echo "all : Launch compGoose then doc then tst then jar then runJar."
	@echo "compGoose : compil all the .java of the project."
	@echo "doc : product the doc of the goosegame."
	@echo "tst : /!\ USE COMPGOOSE BEFORE TST !! /!\ compile the test an launch all the test."
	@echo "jar : create a jar than we can run."
	@echo "runSpe : run the game with a board with only NormalCell."
	@echo "runJar : run the jar with en exemple."
	@echo "help : help with the Make file."
	@echo "clean : Clean all the folders. (.class, GooseGame.jar, temp files, doc...)"

.PHONY: clean

clean:
	@rm -rf classes/* docs/* test/test/*.class *~ */*~ */*/*~ */*/*/*~ GooseGame.jar
