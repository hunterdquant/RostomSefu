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
		  
		  gameGui.getScene().setOnKeyPressed(event -> {
	                switch (event.getCode()) {
	                    case W: {
	                    	moveUp();
	                    }
	                    case S: {
	                    	moveDown();
	                    }
	                    case A: {
	                    	moveLeft();
	                    }
	                    case D: {
	                    	moveRight();
	                    }
	                }
	            });
	}
	
	private void moveUp() {
		// TODO Auto-generated method stub
		
	}

	private void moveDown() {
		// TODO Auto-generated method stub
		
	}

	private void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	private void moveRight() {
		// TODO Auto-generated method stub
		
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
}
