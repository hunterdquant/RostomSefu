
public class Monster extends NPC {

	private int damage;
	private int HP;
	private String name;
	private int movementSpeed;
	
	public Monster(int damage, String name, int hp, int movementSpeed){
		this.damage = damage;
		this.HP = hp;
		this.name = name;
		this.movementSpeed = movementSpeed * 1000;
	}
	
	public boolean getVisited() {
		return false;
	}

	public void run() {
		
	}

	
	
}
