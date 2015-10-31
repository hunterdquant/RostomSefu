import java.util.Random;

public class Friend extends NPC {

	private int HP;
	private String name;
	private int movementSpeed;
	private boolean dead;
	private int[] curPos; //current position
	private int maxX;
	private int maxY;
	
	public Friend(String name, int hp, int movementSpeed, int x, int y){
		this.HP = hp;
		this.name = name;
		this.movementSpeed = movementSpeed * 1000;
		dead = false;
		curPos = new int [2];
		
		maxX = x;
		maxY = y;
	}
	
	public void setPosition(int x, int y){
		curPos[0] = x;
		curPos[1] = y;
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
	
	public boolean getVisited() {
		return false;
	}

	public void run() {
		waitToMove();
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
