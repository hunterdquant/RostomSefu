
public abstract class Item implements Node {

	protected int[] pos;
	protected String name;
	
	public int [] getPosition(){
		return pos;
	}
	public String getName(){
		return name;
	}
}
