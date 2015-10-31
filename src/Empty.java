
public class Empty implements Node {

	private int[] position;
	private boolean visited;
	
	public Empty(int x, int y){
		position[0] = x;
		position[1] = y;
		
		visited = false;
		
 	}
	
	/*
	 * Setters
	 */
	
	public void visitNode(){
		visited = true;
	}
	
	/*
	 * Getters
	 */
	
	@Override
	public int[] getPosition() {
		return pos;
	}

	@Override
	public boolean getVisited() {
		return visited;
	}
	

}
