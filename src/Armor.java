
public abstract class Armor {
	
	private int armor;
	private String name;
	
	public Armor(int armorRating, String n){
		name = n;
		armor = armorRating;
	}
	
	public int getArmor(){
		return armor;
	}
	
	public String getName(){
		return name;
	}

}
