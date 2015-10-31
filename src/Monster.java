import java.util.Random;

public class Monster extends NPC {

	private int damage;
	private int HP;
	private String name;
	private int movementSpeed;
	private boolean dead;
	private boolean destroy;
	private int[] curPos; //current position
	
	public Monster(int damage, String name, int hp, int movementSpeed){
		this.damage = damage;
		this.HP = hp;
		this.name = name;
		this.movementSpeed = movementSpeed * 1000;
		dead = false;
		curPos = new int [2];
		destroy = false;
	}
	
	public void run() {
		waitToMove();
	}

	private void move(){
		Random rand = new Random();
		int choice = rand.nextInt(4);
		
		switch(choice){
		case 0: //north
			
		}
		
	}
	
	private void waitToMove(){
		while(true){
			try {
				if(dead)
					break;
				if(destroy)
					break;
				
				Thread.sleep(movementSpeed);
				move();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * Setters
	 */
	
	public void setPosition(int x, int y){
		curPos[0] = x;
		curPos[1] = y;
	}
	
	public void destroyMonster(){
		destroy = true;
	}
	
	
	/*
	 * getters
	 */
	
	public int getDamage(){
		return damage;
	}
	
	public int getHP(){
		return HP;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean isDead(){
		return dead;
	}
	
	public int[] getPosition(){
		return curPos;
	}	
	
	public boolean getVisited() {
		return false;
	}

}
