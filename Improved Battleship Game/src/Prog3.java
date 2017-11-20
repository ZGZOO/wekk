//Name of program:              A one-player, simplified Battleship game
//Programmer's name:            Zhijie Xu
//Current Date:                 11/02/2017
//Computer system and compiler: MacOS Sierra and JDK8
//Description:                  This Java program plays a one-player, simplified Battleship game.
//Variable names: 			   game1 (a BattleshipGame object variable)

public class Prog3 {
	public static void main(String[] args) {
		BattleshipGame game1 = new BattleshipGame();
		game1.displayInstructions();
		do {
			game1.playBattleship();
		}while(game1.wantsToContinue("Want to play another game?"));
	}
}

/*  
Welcome to CIS 35A's One-person Battleship game!						(Game #1: Quit Early)

There will be 5 ships placed on a 10 x 10 grid, one of each of
size 1, size 2 , size 3, etc.  The game ends when you sink them all,
make 25 guesses, or decide to quit at the end of a turn.


Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 1
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   H   -   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 4
Not a hit.
Keep playing? (N for no): N
Game Over!
Ships not sunk:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   2   2   -   -   -   1   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   5   5   5   5   5   3   3   3   -
 E |   -   -   -   -   -   -   -   -   -   4
 F |   -   -   -   -   -   -   -   -   -   4
 G |   -   -   -   -   -   -   -   -   -   4
 H |   -   -   -   -   -   -   -   -   -   4
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -

Your results: 
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   H   -   -   -   -   -   -   -   -   -
 B |   -   -   -   m   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Want to play another game? (N for no): Y

Here's your Hit Grid:						      (Game #2: reach 25 guesses without sinking all the ships)
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 1
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   -   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 2
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 3
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 4
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 5
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 6
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 4
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 5
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 7
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):C 5
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   -   -   -   m   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):C 6
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   -   -   -   m   m   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):C 7
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   -   -   -   m   m   m   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):C 2
Not a hit.
Keep playing? (N for no): T

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 7
Spot already guessed!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):D 5
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   -   -   -   m   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):F 9
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   -   -   -   m   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):D 2
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):D 6
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 2
Spot already guessed!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   -   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 9
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):D 10
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   H
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):G 1
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   H
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   m   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):G 2
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   H
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   m   m   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):G 4
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   H
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   m   m   -   m   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):G 6
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   H
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   m   m   -   m   -   m   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):I 5
Not a hit.
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   H
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   m   m   -   m   -   m   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   m   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):I 6
Not a hit.
Game Over!
You used up all your allowed guesses..
Ships not sunk:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   3
 C |   -   -   -   -   -   -   -   -   -   3
 D |   -   -   -   -   -   -   -   -   -   3
 E |   -   -   -   -   -   -   -   -   -   4
 F |   -   -   -   -   -   -   5   -   2   4
 G |   -   -   -   -   -   -   5   -   2   4
 H |   1   -   -   -   -   -   5   -   -   4
 I |   -   -   -   -   -   -   5   -   -   -
 J |   -   -   -   -   -   -   5   -   -   -

Your results: 
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   m   m   m   m   m   m   -   -   m   -
 B |   -   -   -   m   m   -   m   -   -   -
 C |   -   m   -   -   m   m   m   -   -   -
 D |   -   m   -   -   m   m   -   -   -   H
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   H   -
 G |   m   m   -   m   -   m   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   m   m   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Want to play another game? (N for no): N


Welcome to CIS 35A's One-person Battleship game!							(Game #3: guess all the ships)

There will be 5 ships placed on a 10 x 10 grid, one of each of
size 1, size 2 , size 3, etc.  The game ends when you sink them all,
make 25 guesses, or decide to quit at the end of a turn.

   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   1   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   5   -   -   -   -   -   -
 E |   -   -   -   5   -   -   -   -   -   -
 F |   4   -   -   5   -   -   -   -   -   -
 G |   4   -   -   5   -   -   -   -   -   -
 H |   4   -   -   5   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -

Here's your Hit Grid:										
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 1
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   H   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):C 1
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   H   -   -   -   -   -   -   -   -   -
 C |   H   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):D 1
Made a hit!
You SUNK ship #3
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   3   -   -   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):F 1
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   3   -   -   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   H   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):G 1
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   3   -   -   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   H   -   -   -   -   -   -   -   -   -
 G |   H   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):H 1
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   3   -   -   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   H   -   -   -   -   -   -   -   -   -
 G |   H   -   -   -   -   -   -   -   -   -
 H |   H   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):I 1
Made a hit!
You SUNK ship #4
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   3   -   -   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   4   -   -   -   -   -   -   -   -   -
 G |   4   -   -   -   -   -   -   -   -   -
 H |   4   -   -   -   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):A 3
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   H   -   -   -   -   -   -   -
 B |   3   -   -   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   4   -   -   -   -   -   -   -   -   -
 G |   4   -   -   -   -   -   -   -   -   -
 H |   4   -   -   -   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 3
Made a hit!
You SUNK ship #2
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   4   -   -   -   -   -   -   -   -   -
 G |   4   -   -   -   -   -   -   -   -   -
 H |   4   -   -   -   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):D 4
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   H   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   4   -   -   -   -   -   -   -   -   -
 G |   4   -   -   -   -   -   -   -   -   -
 H |   4   -   -   -   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):E 4
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   H   -   -   -   -   -   -
 E |   -   -   -   H   -   -   -   -   -   -
 F |   4   -   -   -   -   -   -   -   -   -
 G |   4   -   -   -   -   -   -   -   -   -
 H |   4   -   -   -   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):F 4
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   H   -   -   -   -   -   -
 E |   -   -   -   H   -   -   -   -   -   -
 F |   4   -   -   H   -   -   -   -   -   -
 G |   4   -   -   -   -   -   -   -   -   -
 H |   4   -   -   -   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):G 4
Made a hit!
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   H   -   -   -   -   -   -
 E |   -   -   -   H   -   -   -   -   -   -
 F |   4   -   -   H   -   -   -   -   -   -
 G |   4   -   -   H   -   -   -   -   -   -
 H |   4   -   -   -   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):H 4
Made a hit!
You SUNK ship #5
Keep playing? (N for no): Y

Here's your Hit Grid:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   -   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   5   -   -   -   -   -   -
 E |   -   -   -   5   -   -   -   -   -   -
 F |   4   -   -   5   -   -   -   -   -   -
 G |   4   -   -   5   -   -   -   -   -   -
 H |   4   -   -   5   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Enter row letter and column number (sep. by a space):B 5
Made a hit!
You SUNK ship #1
Game Over!
You sank all the ships!
Ships not sunk:
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   -   -   -   -   -   -   -   -
 B |   -   -   -   -   -   -   -   -   -   -
 C |   -   -   -   -   -   -   -   -   -   -
 D |   -   -   -   -   -   -   -   -   -   -
 E |   -   -   -   -   -   -   -   -   -   -
 F |   -   -   -   -   -   -   -   -   -   -
 G |   -   -   -   -   -   -   -   -   -   -
 H |   -   -   -   -   -   -   -   -   -   -
 I |   -   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -

Your results: 
   |   1   2   3   4   5   6   7   8   9  10
---+----------------------------------------
 A |   -   -   2   -   -   -   -   -   -   -
 B |   3   -   2   -   1   -   -   -   -   -
 C |   3   -   -   -   -   -   -   -   -   -
 D |   3   -   -   5   -   -   -   -   -   -
 E |   -   -   -   5   -   -   -   -   -   -
 F |   4   -   -   5   -   -   -   -   -   -
 G |   4   -   -   5   -   -   -   -   -   -
 H |   4   -   -   5   -   -   -   -   -   -
 I |   4   -   -   -   -   -   -   -   -   -
 J |   -   -   -   -   -   -   -   -   -   -
Want to play another game? (N for no): N

*/
