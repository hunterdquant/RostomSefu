import java.util.Random;

public class Friend extends NPC {

	private int HP;
	private String name;
	private int movementSpeed;
	private boolean dead;
	private int[] curPos; //current position
	
	public Friend(String name, int hp, int movementSpeed){
		this.HP = hp;
		this.name = name;
		this.movementSpeed = movementSpeed * 1000;
		dead = false;
		curPos = new int [2];
		
	}
	
	public void setPosition(int x, int y){
		curPos[0] = x;
		curPos[1] = y;
	}
	
	public boolean getVisited() {
		return false;
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
				
				Thread.sleep(movementSpeed);
				move();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/*
	 * getters
	 */
	
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

}
