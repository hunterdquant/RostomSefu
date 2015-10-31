/** Node.java
  * =========
  * Abstract class for all board locations. 
  */

public interface Node {

	int [] pos = new int[2];
	boolean visited = false;
	
	public int[] getPosition();
	public boolean getVisited();
}
