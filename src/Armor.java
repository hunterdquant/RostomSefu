
public class Armor extends Item {
	
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

    @Override
    public boolean getVisited() {
        return false;
    }

}
