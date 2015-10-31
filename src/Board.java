/** Board.java

  * ==========
  * Main movement grid of the game world.
  */

public class Board {  

    private Node[][] board;   // Array of Nodes
    int xMax = 0;
    int yMax = 0;

    /**
      * Constructor for the board object.
      *
      * @param x the number of x cells
      * @param y the number of y cells
      */
    public Board(int x, int y, int monsters, int friends, int items) {
        // Set bounds
        xMax = x;
        yMax = y;
    
        // Instantiate board
        board = new Node[x][y];

        // Iterate through x 
        for (int i = 0; i < x; i++) {
            // Iterate through y
            for (int j = 0; j < y; j++) {
                // Assign a generated node to x,y
                board[i][j] = NodeGenerator.nodeGen(monsters, friends, items, x, y);
            }
        }
    }       

    /**
      * Checks if a given location is within the bounds of the board.
      *
      * @param x x location to check
      * @param y y location to check
      */
    public boolean isValidMove(int x, int y) {
        return 0 <= x && x < xMax && 0 <= y && y < yMax;
    }

    /**
      * Gets the node at the given x and y coordinates.
      *
      * @param x the x coordinate
      * @param y the y coordinate
      */
    public Node getNode(int x, int y) {
        return board[x][y];
    }

    /**
      * Sets the node at the given x and y coordinates.
      *
      * @param n the Node to set at the coordinates.
      * @param x the x coordinate
      * @param y the y coordinate
      */
    public void setNode(int x, int y, Node n) {
        board[x][y] = n;
    }
}
