import java.util.*;

public class Player {
	
	private String name; //players name
	private int HP; //health of the player
	private int[] pos; //the position of the player
	private int damage; //the damage the player can deal
	private int defense;
	private HashMap<Armor, String> equiptable;
	private List<Item> inventory;
	private boolean dead;
	
	public Player(String n, int Hp){
		name = n;
		HP = Hp;
		dead = false;
		
		equiptable = new HashMap<Armor, String>(8);
		inventory = new ArrayList<Item>();
		
		damage = 1;
		defense = 1;
		pos = new int[2];
	}
	
	private void recalcdefence(){
		Set<Armor> a = equiptable.keySet();
		int x = 0;
		for(Armor b : a){
			x += b.getArmor();
		}
		defense = x;
	}
	
	/*
	 * setter
	 */
	public void setPosition(int x, int y){
		pos[0] = x;
		pos[1] = y;
	}
	
	
	public void moveUp() {
		pos[1]++;
	}

	public void moveDown() {
		pos[1]--;
	}

	public void moveLeft() {
		pos[0]--;
	}

	public void moveRight() {
		pos[0]++;
	}
	
	public void damagePlayer(int x){
		HP = HP - x;
		if(HP < 0)
			dead = true;
	}
	
	public void equiptAnItem(Armor x){
		if(equiptable.size() > 8){
			
		}else{
			equiptable.put(x, x.getName());
			recalcdefence();
		}
	}
	
	public void addToInventory(Item x){
		inventory.add(x);
	}
	
	public void drinkPotion(int healAMT){
		HP += healAMT;
	}
	
	/***********
	 * Getters *
	 ***********/
	
	public int getHealth(){
		return HP;
	}
	
	public String getName(){
		return name;
	}
	
	public int[] getPosition(){
		return pos;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public List<Item> getInventory(){
		return inventory;
	}
	
	public int getDefense(){
		return defense;
	}
	
	public HashMap<Armor, String> getEquiptedItems(){
		return equiptable;
	}
	
	public boolean getDead(){
		return dead;
	}
}
