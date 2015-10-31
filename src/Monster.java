import java.util.Random;

public class Monster extends NPC {

	private int damage;
	private int HP;
	private String name;
	private int movementSpeed;
	private boolean dead;
	private boolean destroy;
	private int[] curPos; //current position
	private int maxX;
	private int maxY;
	
	public Monster(int damage, String name, int hp, int movementSpeed, int maxX, int maxY){
		this.damage = damage;
		this.HP = hp;
		this.name = name;
		this.movementSpeed = movementSpeed * 1000;
		dead = false;
		curPos = new int [2];
		destroy = false;
		
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public void run() {
		waitToMove();
	}

	private void move(){
		Random rand = new Random();
		int choice = rand.nextInt(4);
		
		switch(choice){
		case 0: //north
			if(curPos[1] == 0)
				break;
			else
				curPos[1]++;
			break;
		case 1: //east
			if(curPos[0] == maxX - 1)
				break;
			else 
				curPos[0]++;
			break;
		case 2: //south
			if(curPos[1] == maxY - 1)
				break;
			else curPos[1]--;
			break;
		case 3: //west
			if(curPos[0] == 0)
				break;
			else 
				curPos[0]--;
			break;
		default : break;
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
