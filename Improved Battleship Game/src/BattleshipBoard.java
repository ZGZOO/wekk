
public class BattleshipBoard {
	public static final int DEFAULT_NUMBER_OF_SHIPS = 4;
	public final int ORIGINAL_DIMENSION_SIZE = 10;
	private int [][] shipGrid;
	private int [][] hitGrid;
	private int numShips;
	
	public BattleshipBoard(int num) {
		shipGrid = new int[ORIGINAL_DIMENSION_SIZE][ORIGINAL_DIMENSION_SIZE];
		hitGrid = new int[ORIGINAL_DIMENSION_SIZE][ORIGINAL_DIMENSION_SIZE];
		if(num >= 4 && num <= 9)
			this.numShips = num;
		else
			this.numShips = DEFAULT_NUMBER_OF_SHIPS;
	}// end constructor #1
	
	public BattleshipBoard() {
		this(DEFAULT_NUMBER_OF_SHIPS);
	}// end default constructor
	
	/*-----------------------------------------------------
	 * getNumberOfShips
	 *     This method returns the number of the ships.
	 * Parameters: none
	 ------------------------------------------------------*/
	public int getNumberOfShips() {
		return numShips;
	}
	
	/*-----------------------------------------------------
	 * fillHitGrid
	 *     This method fills the 2-dim. array of ints
	 *     with all 0s.
	 * Parameters: none
	 ------------------------------------------------------*/
	public void fillHitGrid() {
		if( hitGrid == null )
			return;

		// initialize grid to all 0's (in case set before)
		for( int row = 0; row < hitGrid.length; ++row )
			for( int col = 0; col < hitGrid[row].length; ++col )
				hitGrid[row][col] = 0;
	}
	
	/*-----------------------------------------------------
	 * fillShipGrid
	 *     This method fills the 2-dim. array of ints
	 *     with all 0s first, then for each ship from
	 *     1 to numShips, places randomly in consecutive
	 *     spots the ship number (1 for ship 1, 2 for ship 2,
	 *     3 for ship 3, etc.) either in a row or column
	 * Parameters: none
	 ------------------------------------------------------*/
	public void fillShipGrid() {
		if( shipGrid == null )
			return;
		if( numShips < 4 || numShips > 9 )// must be 4 to 9 ships
			numShips = DEFAULT_NUMBER_OF_SHIPS;

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
			}while(!placedShip(shipNum, randRow, randCol));
		} // end for
	}
	
	/*-----------------------------------------------------
     * placedShip method
     *      This method tries to assign a ship in the shipGrid
     *  if it fits in randRow row (if a randomly chosen direction
     *  is 0) or the randCol column.  It will assign the same number
     *  of spots as the shipNum and return true if successful
     *  or false if the spot is already assigned, or no room
     *  to assign at the randRow, randCol coordinates.
	 ------------------------------------------------------*/
	private boolean placedShip(int shipNm, int ranRow, int ranCol) {
		if( shipGrid[ranRow][ranCol] != 0 ) // already used spot
			return false;
		// pick right (0) or down (1)
		int direction = (int)(Math.random()*2);
		boolean blocked;
		// try to fill right if direction is 0 and there's room
		if( direction==0 && (ranCol + shipNm) <= shipGrid[0].length )
		{
			blocked = false;
			// check if row is blocked
			for( int count = 1; count < shipNm ; ++count )
				if( shipGrid[ranRow][ranCol+count] != 0 )
				{
					blocked = true;
					break;
				}
			if( !blocked ) // not blocked, so place ship
			{
				for(int col = 0; col < shipNm; ++col )
					shipGrid[ranRow][ranCol+col] = shipNm;
				return true;
			}
		} // end if try to fill right
		// try to fill down if above fails and there's room
		if( (ranRow + shipNm) <= shipGrid.length )
		{
			blocked = false;
			// check if column is blocked
			for( int count = 1; count < shipNm ; ++count )
				if( shipGrid[ranRow+count][ranCol] != 0 )
				{
					blocked = true;
					break;
				}
			if( !blocked ) // not blocked so place ship
			{
				for(int row = 0; row < shipNm; ++row )
					shipGrid[ranRow+row][ranCol] = shipNm;
				return true;
			}
		} // end if try to fill down
		return false; // coordinates didn't work
	}
	
	/*-----------------------------------------------------
	 * resetOrFillGrid
	 *     This method calls the method fillHitGrid & 
	 *     the method fillShipGrid.
	 * Parameters: none
	 ------------------------------------------------------*/
	public void resetOrFillGrid() {
		this.fillHitGrid();
		this.fillShipGrid();
	}
	
	/*------------------------------------------------------------------------
	 * checkGridAndSetHitGrid
	 *     This method checks if valid rowNum (0 - 9) and colNum (0 – 9).  
	 *     If not valid, return –1.  
	 *     Otherwise: If the element in hitGrid at the rowNum & colNum 
	 *     isn't 0, return -2 (already chosen).
	 *     Return the element in shipGrid at the rowNum & colNum.
	 *     If the element in shipGrid at the rowNum & colNum is 0, 
	 *     set the hitGrid at the same rowNum & colNum to -1, then return 0
	 *     check if the element in shipGrid at the rowNum & colNum is > 0, and if so...
	 *     add 10 to the element value and assign it to the hitGrid element at the same 
	 *     rowNum & colNum. For example, if the element in shipGrid at the rowNum & colNum 3, 
	 *     assign 13 to the hitGrid's corresponding element. 	Check if there are the same 
	 *     number of elements as the element value in the same row, or same column 
	 *     (you may assume the same number will always be contiguous in a row 
	 *     or column).  If so, change the hitGrid elements to the element %10 
	 *     change the shipGrid elements at the same locations to 0 (ship was sunk, 
	 *     remove from shipGrid) return the ship number (for example 3) if sunk, return 
	 *     ship number + 10 if not sunk.
	 * Parameters: rowNum (int), colNum (int)
	 ------------------------------------------------------------------------*/
	public int checkGridAndSetHitGrid(int rowNum, int colNum) {
		int result = 0;
		
		if((rowNum < 0 || rowNum >= hitGrid.length) || (colNum < 0 || colNum >= hitGrid[rowNum].length)) {
			result = -1;
			return result;
		}
		else if(hitGrid[rowNum][colNum] != 0) {
			result = -2;
			return result;
		}
		else if(shipGrid[rowNum][colNum] == 0) {
			hitGrid[rowNum][colNum]= -1;
			result = 0;
			return result;
		}
		else if(shipGrid[rowNum][colNum] > 0) {
			int shipGridValue = shipGrid[rowNum][colNum];
			int counter = 0;
			
			hitGrid[rowNum][colNum] = 10 + shipGridValue;
			int hitGridValue = hitGrid[rowNum][colNum];
			
			// start checking column
			for(int j = 0; j < hitGrid[rowNum].length; j++) {
				if(hitGrid[rowNum][j] == hitGridValue) {
					counter++;
				}
			}
			if(counter == shipGridValue) {
				for(int j1 = 0; j1 < hitGrid[rowNum].length; j1++) {
					if(hitGrid[rowNum][j1] == hitGridValue) {
						hitGrid[rowNum][j1] %= 10;
						shipGrid[rowNum][j1] = 0;
					}
				}
				result = shipGridValue;
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
					}
				}
				result = shipGridValue;
			}else {
				result = shipGridValue + 10;
			}// end checking row	
		}// end if hit a part of a ship	
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
	private void displayGrid(int [][] Grid) {
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
	}
	
	/*----------------------------------------------------------
	 * displayHitGrid
	 * 		This method displays the hit grid.
	 * Parameters: none
	 -----------------------------------------------------------*/
	public void displayHitGrid() {
		this.displayGrid(hitGrid);
	}
	
	/*----------------------------------------------------------
	 * displayShipGrid
	 * 		This method displays the ship grid. 
	 * 		(make life easier when testing)
	 * Parameters: none
	 -----------------------------------------------------------*/
	public void displayShipGrid() {
		this.displayGrid(shipGrid);
	}
	
	/*----------------------------------------------------------
	 * displayResults
	 * 		This method displays the results of the game,
	 * 		which are "Ships not sunk" and "Players results".
	 * Parameters: none
	 -----------------------------------------------------------*/
	public void displayResults() {
		System.out.println("Ship Grid Result:");
		this.displayGrid(shipGrid);
		System.out.println("Your Hit Grid:");
		this.displayGrid(hitGrid);
		
	}
}
