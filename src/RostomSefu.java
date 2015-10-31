/**
 * 
 * @author Hunter Quant
 * @author Collin Walling
 * @author Zach McNulty
 */

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.stage.Stage;

public class RostomSefu extends Application {
	
	private StartGui startGui;
	private GameGui gameGui;
	private Stage primaryStage;
	 
	private Player player;
	private Board board;
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
		
	public RostomSefu() {
		player = new Player("Keith", 100);
		gameGui = new GameGui(this);
		startGui = new StartGui(this);
	}

	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		startGui.start(primaryStage);
        
		Task<Void> task = new Task<Void>() {
		      @Override 
		      protected Void call() throws Exception {
		          gameGui.setDamage(""+player.getDamage());
		          gameGui.setDefense(""+player.getDefense());
		          gameGui.setHealth(""+player.getHealth());
				return null;
		      }
		  };

		  task.run();
	}
	
	public void moveUp() {
		int [] a = player.getPosition();
		if (board.isValidMove(a[0], a[1]+1)) {
			player.moveUp();
			encounter();
		}
	}

	public void moveDown() {
		int [] a = player.getPosition();
		if (board.isValidMove(a[0], a[1]-1)) {
			player.moveDown();
			encounter();
		}
	}

	public void moveLeft() {
		int [] a = player.getPosition();
		if (board.isValidMove(a[0]-1, a[1])) {
			player.moveLeft();
			encounter();
		}
	}

	public void moveRight() {
		int [] a = player.getPosition();
		if (board.isValidMove(a[0]+1, a[1])) {
			player.moveRight();
			encounter();
		}
	}

	public void changeToGameGui () {
		try {
			gameGui.start(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	public void initPlayer(String name) {
		player = new Player(name, 100);
		player.setPosition(1, 1);
	}
	
	public String getPlayerName() {
		return player.getName();
	}
	
	public String getPlayerHealth() {
		return "" + player.getHealth();
	}
	
	public String getPlayerDefense() {
		return "" + player.getDefense();
	}
	
	public String getPlayerDamage() {
		return "" + player.getDamage();
	}
	
	public void encounter() {
		int[] a = player.getPosition();
		Node n = board.getNode(a[0], a[1]);
		if (n instanceof Monster) {
			player.damagePlayer(5);
			n = new Empty();
			gameGui.setMessage("You killed a monster!");
		}else if (n instanceof Friend) {
			gameGui.setMessage("You killed " + ((Friend)n).getName());
			n = new Empty();
		}else if (n instanceof Item) {
			player.drinkPotion(3);
			n = new Empty();
			gameGui.setMessage("You picked up a potion!");
		} else if (n instanceof Empty) {
			gameGui.setMessage("You continue to stumble in the dark!");
		}
	}
}
