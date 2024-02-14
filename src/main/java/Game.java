public class Game {
  //////////////////
  // Prop
  //////////////////
  private static final int SIZE = 3;
  private static int[][] STATE = new int[SIZE][SIZE];

  private Player[] players;

  //////////////////////
  // Constructor
  /////////////////////////

  public Game(Player x, Player o) {

    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        STATE[i][j] = -1;
      }
    }

    this.players = new Player[] { x, o };
  }

  ////////////////////////////
  // Method
  ////////////////////////////
  public int checkForWin() {
    int result = -1;

    // Check different win senarios
    result = vertical();
    
    if(result == -1) {
      result = horizontal();
    } 
    
    if(result == -1) {
      result = diagonalDecrease();
    } 
    
    if(result == -1) {
      result = diagonalIncrease();
    } 
    
    return result;
  }

  //Checks vertical win

  public int vertical() {
    int winner = -1;

    for (int x = 0; x < SIZE; x++) {
      int startingVal = STATE[x][0];
      for (int y = 1; y < SIZE; y++) {
        if (STATE[x][y] == startingVal) {
          winner = startingVal;
        } else {
          winner = -1;
          break;
        }
      }
      
      if (winner != -1) {
        break;
      }
    }

    return winner;
  }
  //Checks horizontal win

  public int horizontal() {
    int winner = -1;

    for (int y = 0; y < SIZE; y++) {
      int startingVal = STATE[y][0];
      for (int x = 1; x < SIZE; x++) {
        if (STATE[x][y] == startingVal) {
          winner = startingVal;
        } else {
          winner = -1;
          break;
        }
      }

      if (winner != -1) {
        break;
      }
    }

    return winner;
  }
//Checks diagonal decrease win
  public int diagonalDecrease() {
    int winner = -1;
    int startingVal = STATE[0][SIZE - 1];

    for (int x = SIZE - 2; x >= 0; x--) {
      if (STATE[x][x] == startingVal) {
        winner = startingVal;
      } else {
        winner = -1;
        break;
      }

    }

    return winner;
  }
//Checks diagonal increase win
  public int diagonalIncrease() {
    int winner = -1;

    int startingVal = STATE[0][0];

    for (int x = 1; x < SIZE; x++) {

      if (STATE[x][x] == startingVal) {
        winner = startingVal;
      } else {
        winner = -1;
        break;
      }

    }

    return winner;
  }
//If the game is over state if it is a win or tie
  public boolean isGameOver() {
    boolean result = false;
    int winningPlayer = checkForWin();
    if (winningPlayer != -1) {
      System.out.println("Player #" + winningPlayer + " is the winner!");
      result = true;
    } else if (isBoardFull()) {
      System.out.println("It is a tie game!");
      result = true;
    }
    return result;
  }

  //method to decide if it was a tie game
  public boolean isBoardFull() {
    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        if (STATE[i][j] == -1) {
          return false;
        }
      }     
    }
    
   return true;
  }

  public void setBoard(int[][] newBoard) {
    STATE = newBoard;
  }
}
