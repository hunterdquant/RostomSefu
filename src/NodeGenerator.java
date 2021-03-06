import java.util.*;

public abstract class NodeGenerator {

    private static final int RAND_RANGE = 100;
    private static Thread p;
    private static Thread o;
    private static int maxX;
    private static int maxY;

    private static int getLB(int chance) {
        chance = chance == 0 ? 1 : chance;
        Random rand = new Random(System.nanoTime());
        return Math.abs(rand.nextInt() % (RAND_RANGE - chance));
    }

    private static int getUB(int lb, int chance) {
        return lb + chance;
    }
    
    /**
     * Generates a pseudo-random node for the game board.
     *
     * @param number the value that will determine what type of node is
     * generated.
     */
    public static Node nodeGen(int monsChance, int frndChance, int itemChance, int x, int y) {
    	//hold the bounds for the monster and friend classes
    	maxX = x;
    	maxY = y;
    	
        // Variables for generator bounds
        int monsChanceLB; // lower bound for monster chance
        int monsChanceUB; // upper bound for monster chance
        int frndChanceLB; // lower bound for friendly chance
        int frndChanceUB; // upper bound for friendly chance
        int itemChanceLB; // lower bound for item chance
        int itemChanceUB; // upper bound for item chance

        // Calculate bounds
        monsChanceLB = getLB(monsChance);
        monsChanceUB = getUB(monsChanceLB, monsChance);
        frndChanceLB = getLB(frndChance);
        frndChanceUB = getUB(frndChanceLB, frndChance);
        itemChanceLB = getLB(itemChance);
        itemChanceUB = getUB(itemChanceLB, itemChance);

        // Random number generator... duh?
        Random rand = new Random(System.nanoTime());

        // Get the number that will determine which node is generated
        int number = Math.abs(rand.nextInt() % RAND_RANGE);
        
        // -- MONSTER GEN --
        if (monsChanceLB < number && number < monsChanceUB) {
            return monsterGen();
            // -- FRIEND GEN --
        } else if (frndChanceLB < number && number < frndChanceUB) {
            return friendGen();
            // -- ITEM GEN --
        } else if (itemChanceLB < number && number < itemChanceUB) {
            return itemGen();
            // -- EMPTY GEN --
        } else {
            return new Empty();
        }
    }

    private static Item itemGen() {
        Random rand = new Random(System.nanoTime());
        int number = Math.abs(rand.nextInt() % 3);
        switch (number) {
            case 0: return armorGen();
            case 1: return potionGen();
            case 2: return weaponGen();
            default: return null;
        } 
    }

    private static Potion potionGen() {
        return new Potion(10);
    }

    private static Armor armorGen() {
        return new Armor(5, "Shield");
    }

    private static Weapon weaponGen() {
        return new Weapon(10, "Sefu");
    }

    //TODO
    private static Monster monsterGen() {
    		Monster a = new Monster(1000,"Goblin", 100, 10,maxX, maxY);
    		p = new Thread(a);
    		p.start();
    		return a;
    }

    //TODO
    private static Friend friendGen() {
    	Friend a = new Friend("Little Girl", 100, 10, maxX, maxY);
		o = new Thread(a);
		o.start();
		return a;
    }

}
