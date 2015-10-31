/** Board.java
  * ==========
  * Main movement grid of the game world.
  * This will contain all of the nodes for the game.
  */

import java.util.*;

class Board {
    
    private static final int RAND_RANG = 100;

    private Node[][] board;     // Array of Nodes
    private double mons_chance; // chance for a node to be a monster
    private double frnd_chance; // chance for a node to be a friend
    private double item_chance; // chance for a node to be an item

    /**
      * Constructor for the board object.
      *
      * @param x the number of x cells
      * @param y the number of y cells
      */
    public Board(int x, int y) {

        // Set the chances for each node type
        setMonsterChance(25.0);
        setFriendChance(25.0);
        setItemChance(25.0);

        // Iterate through x 
        for (int i = 0; i < x; i++) {
            // Iterate through y
            for (int j = 0; j < y; j++) {
                // Assign a generated node to x,y
                board[x][y] = nodeGen();
            }
        }
    }

    /**
      * Sets the chance for node to be a monster.
      *
      * @param chance chance for this node type.
      */
    private void setMonsterChance(double chance) {
       mons_chance = chance < 0 ? 0 : chance; 
    }

    /**
      * Sets the chance for node to be a friend.
      *
      * @param chance chance for this node type.
      */
    private void setFriendChance(double chance) {
       frnd_chance = chance < 0 ? 0 : chance;
       frnd_chance += mons_chance;
    }
 
    /**
      * Sets the chance for node to be an item.
      *
      * @param chance chance for this node type.
      */
    private void setItemChance(double chance) {
       item_chance = chance < 0 ? 0 : chance;
       item_chance += frnd_chance;
    }

    /**
      * Generates a pseudo-random node for the game board.
      *
      * @param number the value that will determine what type of node is
      * generated.
      */
    private Node nodeGen() {
        // Random number generator... duh?
        Random rand = new Random(9001);

        // Get the number range
        int number = rand.nextInt() % RAND_RANG;

        System.out.print(number + ": ");

        // -- ITEM GEN --
        if (number <= item_chance) {
            System.out.println("Item");
            //return new Item();
            return null;
        // -- MONSTER GEN --
        } else if (number <= mons_chance) {
            System.out.println("Monster");
            //return new Monster();
            return null;
        // -- FRIEND GEN --
        } else if (number <= frnd_chance) {
            System.out.println("Friend");
            //return new Friend();
            return null;
        // -- EMPTY GEN --
        } else {
            System.out.println("Empty");
            return null;
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
