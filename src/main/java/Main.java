/*
This project must play Tic-Tac-Toe.


For the first in-class demonstration, you must have the following:
1) a static constand 2-D Array the represnets the board and holds the STATE data for the game.
2) You must correctly resolve:
  horizontal, 
  diagonal, 
  vertical winner conditions
  And a draw
3) You must have 1 player.

For the future and more points above an A-...
0) You must correctly resolve all win and draw states
1) You should have a seond player
2) You should be able to play on a 4 x 4 board
3) You should correctly resolve turns
4) The player and the game should be in seperate classes from your static Main


For more in the future and more awesomer...
1) You can have a text file documenting player win-loss records and another stat of your choice
2) You can have a 3rd or 4th player
3) You can have a 3rd dimension to the game
4) You can make a new class for a game session as well as a single game
5) You can make a new class for a turn, or a piece, or a screen painter
*/
//Ethan Wilde



import java.util.Arrays;

public  class Main {
  public static final int[][] EMPTY_BOARD = {
      { -1, -1, -1},
      { -1, -1, -1},
      { -1, -1, -1},
  };

  public static final int[][] DIAGNAL_INCREASING_BOARD = {
      { 1, 0, 0},
      { -1, 1, -1},
      { 0, -1, 1},
  };

  public static final int[][] DIAGNAL_DECREASING_BOARD = {
      { 0, 0, 1},
      { -1, 1, -1},
      { 1, -1, 0},
  };

  public static final int[][] VERTICAL_BOARD = {
    { -1, 1, -1},
    { 0, 1, 0},
    { -1, 1, 0},
  };

  public static final int[][] HORIZONTAL_BOARD = {
      { -1, 0, -1},
      { 1, 1, 1},
      { 0, 0, -1},
  };

  public static final int[][] TIE_BOARD = {
      { 0, 1, 0},
      { 1, 1, 0},
      { 0, 0, 1},
  };
  
  public static void main(String[] args) {
    Game game = new Game(new Player("X"), new Player("O"));
    game.setBoard(DIAGNAL_INCREASING_BOARD);
    game.isGameOver();

  }

}