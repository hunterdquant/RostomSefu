/**
 * 
 * @author angry-avacado
 *
 */
public abstract class NPC extends Node implements Runnable {

	private int damage;
	private int [] pos;
	private boolean agressive;
	
	
	public int [] getPosition(){
		return pos;
	}
	public boolean getAgressive(){
		return agressive;
	}
	public int getDamage(){
		return damage;
	}
}
