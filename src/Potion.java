
public class Potion extends Item {
	
	private int healAMT;
	private String name;
	
	public Potion(int amt){
		healAMT = amt;
		name = "Potion";
	}
	
	@Override
	public int[] getPosition() {
		return super.pos;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	public boolean getVisited() {
		return false;
	}
	
	public int getHealAmount(){
		return healAMT;
	}

}
