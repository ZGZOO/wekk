import java.util.Scanner;

public class GameMethods {
	public static Scanner userScanner = new Scanner(System.in);

	/*-----------------------------------------------------
	 * playBattleship
	 *     This method plays the game from asking the player
	 *     to displaying the results.
	 * Parameters: shipGrid (int [][]), hitGrid (int [][]), 
	 * 				shipsNum (int), guessNum (int)
	 ------------------------------------------------------*/
	public static void playBattleship(int [][] shipGrid, int [][] hitGrid, int shipsNum, int guessNum){
		String rowLetter;
		int rowNum;
		int colNum;
		int gridStatus;
		int guess = 0;
		int setHitGridResult;
		int sunk = 0;
		
		do {
			System.out.println("\nHere's your Hit Grid:");
			displayGrid(hitGrid);
			System.out.print("Enter row letter and column number (sep. by a space):");
			
			rowLetter = userScanner.next();
			rowNum = rowLetter.charAt(0) - 'A';
			colNum = userScanner.nextInt();
			colNum--;
			
			gridStatus = checkGrid(shipGrid, hitGrid, rowNum, colNum);
			if(gridStatus == -1)
				System.out.println("Invalid row or column!");
			else if(gridStatus == -2)
				System.out.println("Spot already guessed!"); 
			else if(gridStatus == 0) 
				System.out.println("Not a hit.");
			else if(gridStatus > 0 ) 
				System.out.println("Made a hit!");
			if(gridStatus >= 0) {
				guess++;
				setHitGridResult = setHitGrid(shipGrid, hitGrid, rowNum, colNum);
				if(setHitGridResult > 0 && setHitGridResult < 10) {
					System.out.println("You SUNK ship #" + setHitGridResult);
					sunk++;
				}
			}	
		}while((guess < guessNum && sunk < shipsNum) && wantsToContinue("Keep playing?"));
		
		System.out.println("Game Over!");
		
		if(sunk == shipsNum)
			System.out.println("You sank all the ships!");
		if(guess == guessNum)
			System.out.println("You used up all your allowed guesses..");
		
		displayResults(shipGrid, hitGrid);
		
	} // end playBattleship
	
	
	/*------------------------------------------------------------------------
	 * setHitGrid
	 *     This method checks if valid rowNum (0 - 9) and colNum (0 – 9).  
	 *     If not valid, return –1.  
	 *     Otherwise: If the element in hitGrid at the rowNum & colNum 
	 *     isn't 0, return -2 (already chosen).
	 *     Return the element in shipGrid at the rowNum & colNum.
	 * Parameters: shipGrid (int [][]), hitGrid (int [][]), 
	 * 				rowNum (int), colNum (int)
	 ------------------------------------------------------------------------*/
	public static int setHitGrid(int [][] shipGrid, int [][] hitGrid, int rowNum, int colNum) {
		int result = 0;
		int counter = 0;
		int shipGridValue = shipGrid[rowNum][colNum];
		int hitGridValue = 0;
		
		//start if hit a part of a ship
		if(shipGridValue > 0) {
			hitGrid[rowNum][colNum] = 10 + shipGridValue;
			hitGridValue = hitGrid[rowNum][colNum];
			
			// start checking column
			for(int j = 0; j < hitGrid[0].length; j++) {
				if(hitGrid[rowNum][j] == hitGridValue) {
					counter++;
				}
			}
			if(counter == shipGridValue) {
				for(int j1 = 0; j1 < hitGrid[0].length; j1++) {
					if(hitGrid[rowNum][j1] == hitGridValue) {
						hitGrid[rowNum][j1] %= 10;
						shipGrid[rowNum][j1] = 0;
						result = shipGridValue;
					}
				}
				return result;
			}else {
				result = shipGridValue + 10;
			}// end checking column
			
			counter = 0; //reset counter
			
			// start checking row
			for(int i = 0; i < hitGrid.length; i++) {
				if(hitGrid[i][colNum] == hitGridValue) {
					counter++;
				}
			}
			if(counter == shipGridValue) {
				for(int i1 = 0; i1 < hitGrid.length; i1++) {
					if(hitGrid[i1][colNum] == hitGridValue) {
						hitGrid[i1][colNum] %= 10;
						shipGrid[i1][colNum] = 0;
						result = shipGridValue;
					}
				}
			}else {
				result = shipGridValue + 10;
			}// end checking row	
		}// end if hit a part of a ship
		//start if missed
		else {
			hitGrid[rowNum][colNum] = -1;
			result = -1;
		}// end if missed
		return result;
	}
	
	/*------------------------------------------------------------------------
	 * checkGrid
	 *     This method checks if valid rowNum (0 - 9) and colNum (0 – 9).  
	 *     If not valid, return –1.  
	 *     Otherwise: If the element in hitGrid at the rowNum & colNum 
	 *     isn't 0, return -2 (already chosen).
	 *     Return the element in shipGrid at the rowNum & colNum.
	 * Parameters: shipGrid (int [][]), hitGrid (int [][]), 
	 * 				rowNum (int), colNum (int)
	 ------------------------------------------------------------------------*/
	public static int checkGrid(int [][] shipGrid, int [][] hitGrid, int rowNum, int colNum) {
		int result = 0;
		
		if((rowNum < 0 || rowNum >= hitGrid.length) || (colNum < 0 || colNum > hitGrid[0].length))
			result = -1;
		
		else if(hitGrid[rowNum][colNum] != 0)
			result = -2;
		
		else
			result = shipGrid[rowNum][colNum];
			
		return result;
	}

	
	/*-----------------------------------------------------
	 * displayGrid
	 *     This method displays the grids.
	 *     '-' (hyphen) means spot not checked yet;
	 *     'm' means a miss;
	 *     Number of the ship shows which ship has been sunk;
	 *     'H' means a hit.
	 * Parameters: Grid (int [][])
	 ------------------------------------------------------*/
	public static void displayGrid(int [][] Grid){
		System.out.print("   |");
		for(int i = 1; i < 10; i++) {
			System.out.print("   " + i);
		}
		System.out.print("  10\n");
		System.out.println("---+----------------------------------------");
		for(int row = 0; row < Grid.length; ++row) {
		    System.out.print(" " + (char)(row + 65) + " |");
			for( int col = 0; col < Grid[row].length; ++col ) {
				if(Grid[row][col] == 0) {
					System.out.print("   -");
				}
				if(Grid[row][col] == -1) {
					System.out.print("   m");
				}
				if(Grid[row][col] > 0 && Grid[row][col] < 10) {
					System.out.print("   " + Grid[row][col]);
				}
				if(Grid[row][col] > 10) {
					System.out.print("   H");
				}
			}
		    System.out.println("");
		}
	} // end displayGrid
	

	/*----------------------------------------------------------
	 * displayResults
	 * 		This method displays the results of the game,
	 * 		which are "Ships not sunk" and "Players results".
	 * Parameters: shipGrid (int [][])
	 * 			hitGrid (int [][])
	 -----------------------------------------------------------*/
	public static void displayResults(int [][] shipGrid, int [][] hitGrid) {
		System.out.println("Ships not sunk:");
		displayGrid(shipGrid);
		System.out.println("\nYour results: ");
		displayGrid(hitGrid);	
	}
	

	/*---------------------------------------
	 * displayRules
	 * 		This method displays the rules 
	 *      of the game.
	 ---------------------------------------*/
	public static void displayRules() {
		System.out.println("Welcome to CIS 35A's One-person Battleship game!\n\n"
				+ "There will be 5 ships placed on a 10 x 10 grid, one of each of\nsize 1, size 2 , size 3, etc.  "
				+ "The game ends when you sink them all,\nmake 25 guesses, or decide to quit at the end of a turn.\n");
	}
	
	
	/*-----------------------------------------------------
	 * fillShipGrid
	 *     This method fills the 2-dim. array of ints
	 *     with all 0s first, then for each ship from
	 *     1 to numShips, places randomly in consecutive
	 *     spots the ship number (1 for ship 1, 2 for ship 2,
	 *     3 for ship 3, etc.) either in a row or column
	 * Parameters: shipGrid (int [][])
	 *  			numShips (int), forced to be 4 to 9
	 *  			(default 4)
	 ------------------------------------------------------*/
	public static void fillShipGrid(int [][] shipGrid, int numShips){
		if( shipGrid == null )
			return;
		if( numShips < 4 || numShips > 9 )// must be 4 to 9 ships
			numShips = 4;

		// initialize grid to all 0's (in case set before)
		for( int row = 0; row < shipGrid.length; ++row )
			for( int col = 0; col < shipGrid[row].length; ++col )
				shipGrid[row][col] = 0;

		// fill in ships randomly
		int randRow, randCol;
		for( int shipNum = 1; shipNum <= numShips; ++shipNum )
		{
			do
			{
				randRow = (int)(Math.random() * shipGrid.length);
				randCol = (int)(Math.random() * shipGrid[0].length);
			}while(!placedShip(shipNum, randRow, randCol, shipGrid));
		} // end for
	} // end fillShipGrid
	
	
	/*-----------------------------------------------------
	 * fillHitGrid
	 *     This method fills the 2-dim. array of ints
	 *     with all 0s.
	 * Parameters: hitGrid (int [][])
	 ------------------------------------------------------*/
	public static void fillHitGrid(int [][] hitGrid){
		if( hitGrid == null )
			return;

		// initialize grid to all 0's (in case set before)
		for( int row = 0; row < hitGrid.length; ++row )
			for( int col = 0; col < hitGrid[row].length; ++col )
				hitGrid[row][col] = 0;
	} // end fillHitGrid
	
	
	/*-----------------------------------------------------
     * placedShip method
     *      This method tries to assign a ship in the shipGrid
     *  if it fits in randRow row (if a randomly chosen direction
     *  is 0) or the randCol column.  It will assign the same number
     *  of spots as the shipNum and return true if successful
     *  or false if the spot is already assigned, or no room
     *  to assign at the randRow, randCol coordinates.
	 ------------------------------------------------------*/
	public static boolean placedShip(int shipNum, int randRow, int randCol, int [][] shipGrid){
		if( shipGrid[randRow][randCol] != 0 ) // already used spot
			return false;
		// pick right (0) or down (1)
		int direction = (int)(Math.random()*2);
		boolean blocked;
		// try to fill right if direction is 0 and there's room
		if( direction==0 && (randCol + shipNum) <= shipGrid[0].length )
		{
			blocked = false;
			// check if row is blocked
			for( int count = 1; count < shipNum ; ++count )
				if( shipGrid[randRow][randCol+count] != 0 )
				{
					blocked = true;
					break;
				}
			if( !blocked ) // not blocked, so place ship
			{
				for(int col = 0; col < shipNum; ++col )
					shipGrid[randRow][randCol+col] = shipNum;
				return true;
			}
		} // end if try to fill right
		// try to fill down if above fails and there's room
		if( (randRow + shipNum) <= shipGrid.length )
		{
			blocked = false;
			// check if column is blocked
			for( int count = 1; count < shipNum ; ++count )
				if( shipGrid[randRow+count][randCol] != 0 )
				{
					blocked = true;
					break;
				}
			if( !blocked ) // not blocked so place ship
			{
				for(int row = 0; row < shipNum; ++row )
					shipGrid[randRow+row][randCol] = shipNum;
				return true;
			}
		} // end if try to fill down
		return false; // coordinates didn't work
	} // ends placedShip method
	
	
	/*-----------------------------------------------------
	 * wantsToContinue method
	 * 
	 * This method displays the String parameter (prompt)
	 * and reads a one-word String from the user (System.in).
	 * If the input String begins with 'n' or 'N', the method 
	 * returns false, otherwise, the method returns true.
	  -----------------------------------------------------*/
	public static boolean wantsToContinue(String prompt){
		String answer;

		System.out.print(prompt + " (N for no): ");
		answer = userScanner.next();
		return answer.charAt(0)!= 'n' && answer.charAt(0) != 'N';
	} // end wantsToContinue
}