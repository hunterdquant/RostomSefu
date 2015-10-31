
public class Potion extends Item {
	
	private int healAMT;
	
	public Potion(int amt){
		healAMT = amt;
	}
	
	@Override
	public int[] getPosition() {
		return super.pos;
	}
	
	@Override
	public String getName() {
		return super.name;
	}
	
	public boolean getVisited() {
		return false;
	}
	
	public int getHealAmount(){
		return healAMT;
	}

}
