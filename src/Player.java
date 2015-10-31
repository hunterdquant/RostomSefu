import java.util.*;

public class Player {
	
	private String name; //players name
	private int HP; //health of the player
	private int[] pos; //the position of the player
	private int damage; //the damage the player can deal
	private HashMap<Item, String> equiptable;
	private List<Item> inventory;
	private boolean dead;
	
	public Player(String n, int Hp){
		name = n;
		HP = Hp;
		dead = false;
		
		equiptable = new HashMap(8);
		inventory = new ArrayList();
		
		damage = 1;
		pos = new int[2];
	}
	
	/*
	 * setter
	 */
	public void setPosition(int x, int y){
		pos[0] = x;
		pos[1] = y;
	}
	
	public void damagePlayer(int x){
		HP = HP - x;
	}
	
	/***********
	 * Getters *
	 ***********/
	
	public int getHealth(){
		return HP;
	}
}
