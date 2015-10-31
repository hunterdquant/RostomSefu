
public class Weapon extends Item {

	private int damage;
	private String name;
	
	public Weapon(int damage, String name){
		this.damage = damage;
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getDamage(){
		return damage;
	}
	
	@Override
	public boolean getVisited() {
		return false;
	}

}
