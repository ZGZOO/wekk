package classes;

import java.awt.*;

public class World2048 {
	Panel2048 panel_hold;
	Block2048 [][] gameblock = new Block2048[4][4];
	boolean gameover = false;
	
	public World2048() {
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				gameblock[i][j] = null;
	}
	
	public void newGame()
	{
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				gameblock[i][j] = null;
	}
	
	public void randomGenerator() {
		int row = (int)(Math.random() * 4);
		int col = (int)(Math.random() * 4);
		
		while(gameblock[row][col] != null) {
            row = (int) (Math.random() * 4);
            col = (int) (Math.random() * 4);
        }
		// ==0 ?
        if ((int) (Math.random() * 2) == 0) {
            	gameblock[row][col] = new Block2048(2, row, col, new Color(255,230,210), this);
        } else
            	gameblock[row][col] = new Block2048(4, row, col, new Color(255,220,200), this);
	}
	 

    public void Calculation(int keyCode) {
//    		if(gameover)
//    			return;
    		if(!gameover) {
    			switch (keyCode) {
                //left arrow key
                case 37:
                		System.out.println("left");
                    for (int i = 1; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                        		if (i > 0 && gameblock[i][j] != null) {
                                if (gameblock[i-1][j] == null) {
                                    while (i > 0 && gameblock[i-1][j] == null) {
                                        gameblock[i-1][j] = gameblock[i][j];
                                        gameblock[i][j] = null;
                                        gameblock[i-1][j].row = gameblock[i-1][j].row - 1;
                                        i--;
                                        while (i > 0 && gameblock[i-1][j] != null
                                                && blockValue(i-1,j) == blockValue(i,j)) {
                                            gameblock[i-1][j].number += gameblock[i][j].number;
                                            gameblock[i][j] = null;
                                            i--;
                                        }
                                    }
                                } else if (blockValue(i-1,j) == blockValue(i,j)) {
                                    gameblock[i-1][j].number += gameblock[i][j].number;
                                    gameblock[i][j] = null;
                                    i--;
                                }
                            }
                        }
                    }
                    break;
                //up arrow key
                case 38:
                		System.out.println("up");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 1; j < 4; j++) {
                        		if (j > 0 && gameblock[i][j] != null) {
                                if (gameblock[i][j-1] == null) {
                                    while (j > 0 && gameblock[i][j-1] == null) {
                                        gameblock[i][j-1] = gameblock[i][j];
                                        gameblock[i][j] = null;
                                        gameblock[i][j-1].column = gameblock[i][j-1].column - 1;
                                        j--;
                                        while (j > 0 && gameblock[i][j-1] != null
                                                && blockValue(i,j-1) == blockValue(i,j)) {
                                            gameblock[i][j-1].number += gameblock[i][j].number;
                                            gameblock[i][j] = null;
                                            j--;
                                        }
                                    }
                                } else if (blockValue(i,j-1) == blockValue(i,j)) {
                                    gameblock[i][j-1].number += gameblock[i][j].number;
                                    gameblock[i][j] = null;
                                    j--;
                                }
                            }
                        }
                    }
                    break;
                //right arrow key
                case 39:
                		System.out.println("right");
                    for (int i = 3; i >= 0; i--) {
                        for(int j = 0; j < 4; j++) {
                        		if (i < 3 && gameblock[i][j] != null) {
                                if (gameblock[i+1][j] == null) {
                                    while (i < 3 && gameblock[i+1][j] == null) {
                                        gameblock[i+1][j] = gameblock[i][j];
                                        gameblock[i][j] = null;
                                        gameblock[i+1][j].row = gameblock[i+1][j].row + 1;
                                        i++;
                                        while (i < 3 && gameblock[i+1][j] != null
                                                && blockValue(i+1,j) == blockValue(i,j)) {
                                            gameblock[i+1][j].number += gameblock[i][j].number;
                                            gameblock[i][j] = null;
                                            i++;
                                        }
                                    }
                                } else if (blockValue(i+1,j) == blockValue(i,j)) {
                                    gameblock[i+1][j].number += gameblock[i][j].number;
                                    gameblock[i][j] = null;
                                    i++;
                                }
                            }
                        }
                    }
                    break;

                //down arrow key
                case 40:
                		System.out.println("down");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 3; j >= 0; j--) {
                        		if (j < 3 && gameblock[i][j] != null) {
                                if (gameblock[i][j+1] == null) {
                                    while (j < 3 && gameblock[i][j+1] == null) {
                                        gameblock[i][j+1] = gameblock[i][j];
                                        gameblock[i][j] = null;
                                        gameblock[i][j+1].column = gameblock[i][j+1].column + 1;
                                        j++;
                                        while (j < 3 && gameblock[i][j+1] != null &&
                                                blockValue(i,j+1) == blockValue(i,j)) {
                                            gameblock[i][j+1].number += gameblock[i][j].number;
                                            gameblock[i][j] = null;
                                            j++;
                                        }
                                    }
                                } else if (blockValue(i,j+1) == blockValue(i,j)) {
                                    gameblock[i][j+1].number += gameblock[i][j].number;
                                    gameblock[i][j] = null;
                                    j++;
                                }
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Please operate only with UP, DOWN, RIGHT, and LEFT keys.");
                    break;
            }
        		randomGenerator();
        		panel_hold.repaint();
        		if(winOrLose()) {
        			gameover = true;
        		}
    		}else {
    			System.out.println("Game Over!");
    			newGame();
    			panel_hold.repaint();
    			gameover = false;
    		}
    }

    public boolean winOrLose() {
    		boolean lose = false;
        int count = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                if (gameblock[row][col] != null && gameblock[row][col].number == 2048) {
                    lose = true;
                } else if (gameblock[row][col] != null) {
                    count++;
                }
            }
        }
        if (count == 16) {
            for (int i = 1; i < 3; i++) {
                for (int j = 1; j < 3; j++) {
                    if (blockValue(i,j) == blockValue(i-1,j) ||
                            blockValue(i,j) == blockValue(i+1,j) ||
                            blockValue(i,j) == blockValue(i,j-1) ||
                            blockValue(i,j) == blockValue(i,j+1))
                    lose = true;
                }
            }
            if (blockValue(0,0) == blockValue(0,1)
                    || blockValue(0,1) == blockValue(0,2) ||
                    blockValue(0,2) == blockValue(0,3))
                lose = true;
            else if (blockValue(0,0) == blockValue(1,0)
                    || blockValue(1,0) == blockValue(2,0) ||
                    blockValue(2,0) == blockValue(3,0))
            		lose = true;
            else if (blockValue(0,3) == blockValue(1,3)
                    || blockValue(1,3) == blockValue(2,3) ||
                   blockValue(2,3) == blockValue(3,3))
            		lose = true;
            else if (blockValue(3,0) == blockValue(3,1)
                    || blockValue(3,1) == blockValue(3,2) ||
                    blockValue(3,2) == blockValue(3,3))
            		lose = true;
            else
            		lose = false;
        }
        else
            lose = false;
        return lose;
    }
    
    public int blockValue(int rol, int col) {
        return gameblock[rol][col].number;
    }
	
	/*
    public static void main(String [] args) {
		World2048 newgame = new World2048();
		newgame.randomGenerator();
		Frame2048 frame1 = new Frame2048();
		Panel2048 panel1 = new Panel2048(newgame);
		frame1.add(panel1, BorderLayout.CENTER);
	}
	*/
}
