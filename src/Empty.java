
public class Empty implements Node {

	private boolean visited;
	
	public Empty(){
		
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
