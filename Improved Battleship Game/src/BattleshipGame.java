import java.util.Scanner;

public class BattleshipGame {
	public static Scanner userScanner = new Scanner(System.in);
	private BattleshipBoard battleshipBoard = new BattleshipBoard(5);
	private int numShips = 5;
	private int maxGuesses = 25;
	
	
	/*---------------------------------------
	 * displayInstructions
	 * 		This method displays the rules 
	 *      of the game.
	 ---------------------------------------*/
	public void displayInstructions() {
		System.out.println("Welcome to CIS 35A's One-person Battleship game!\n\n"
				+ "There will be " + numShips + " ships placed on a " 
				+ battleshipBoard.ORIGINAL_DIMENSION_SIZE +" x " + battleshipBoard.ORIGINAL_DIMENSION_SIZE +" grid, "
				+ "one of each of\nsize 1, size 2 , size 3, etc.  "
				+ "The game ends when you sink them all,\nmake " + maxGuesses + " guesses, "
				+ "or decide to quit at the end of a turn.\n");
	}
	
	/*-----------------------------------------------------
	 * playBattleship
	 *     This method plays the game from asking the player
	 *     to displaying the results.
	 * Parameters: none
	 ------------------------------------------------------*/
	public void playBattleship() {
		String rowLetter;
		int rowNum;
		int colNum;
		int gridStatus;
		int guess = 0;
		int sunk = 0;
		
		battleshipBoard.resetOrFillGrid();
//		battleshipBoard.displayShipGrid();   //need it when testing.
		do {
			System.out.println("\nHere's your Hit Grid:");
			battleshipBoard.displayHitGrid();
			System.out.print("Enter row letter and column number (sep. by a space):");
			
			rowLetter = userScanner.next();
			rowNum = rowLetter.charAt(0) - 'A';
			colNum = userScanner.nextInt();
			colNum--;
			
			gridStatus = battleshipBoard.checkGridAndSetHitGrid(rowNum, colNum);
			if(gridStatus == -1)
				System.out.println("Invalid row or column!");
			else if(gridStatus == -2)
				System.out.println("Spot already guessed!"); 
			else if(gridStatus == 0) 
				System.out.println("Missed a hit.");
			else if(gridStatus > 0) 
				System.out.println("Made a hit!");
			if(gridStatus >= 0) {
				guess++;
				if(gridStatus > 0 && gridStatus < 10) {
					System.out.println("You SUNK ship #" + gridStatus);
					sunk++;
				}
			}	
		}while((guess < maxGuesses && sunk < numShips) && wantsToContinue("Keep playing?"));
		
		System.out.println("Game Over!");
		
		if(sunk == numShips)
			System.out.println("You sank all the ships, CONGRATULATIONS!");
		if(guess == maxGuesses)
			System.out.println("You used up all your allowed guesses..");
		
		battleshipBoard.displayResults();
	}
	
	/*-----------------------------------------------------
	 * wantsToContinue method
	 * 
	 * This method displays the String parameter (prompt)
	 * and reads a one-word String from the user (System.in).
	 * If the input String begins with 'n' or 'N', the method 
	 * returns false, otherwise, the method returns true.
	  -----------------------------------------------------*/
	public boolean wantsToContinue(String prompt){
		String answer;

		System.out.print(prompt + " (N for no): ");
		answer = userScanner.next();
		return answer.charAt(0)!= 'n' && answer.charAt(0) != 'N';
	} // end wantsToContinue
}

