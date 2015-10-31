/** Board.java
  * ==========
  * Main movement grid of the game world.
  * This will contain all of the nodes for the game.
  */

import java.util.*;

class Board {
    

   /**
      * Constructor for the board object.
      *
      * @param x the number of x cells
      * @param y the number of y cells
      */
    public Board(int x, int y, int monsters, int friends, int items) {
 
        // Set the default chances for each node type
        setMonsterChance(monsters);
        setFriendChance(friends);
        setItemChance(items);

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
    public void setNode(Node n, int x, int y) {
        board[x][y] = n;
    }

}
