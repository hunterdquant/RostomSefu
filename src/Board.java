/** Board.java
  * ==========
  * Main movement grid of the game world.
  */

public class Board {
    
    private Node[][] board;   // Array of Nodes
    
    /**
      * Constructor for the board object.
      *
      * @param x the number of x cells
      * @param y the number of y cells
      */
    public Board(int x, int y, int monsters, int friends, int items) {
        // Instantiate board
        board = new Node[x][y];

        // Iterate through x 
        for (int i = 0; i < x; i++) {
            // Iterate through y
            for (int j = 0; j < y; j++) {
                // Assign a generated node to x,y
                board[i][j] = NodeGenerator.nodeGen(monsters, friends, items);
            }
        }
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
