/**
 * 
 * @author Hunter Quant
 * @author Collin Walling
 * @author Zach McNulty
 */

import javafx.application.Application;

import javafx.stage.Stage;

public class RostomSefu extends Application {
	
	private StartGui startGui;
	private GameGui gameGui;
	private Stage primaryStage;
	 
	private Player player;
	
	
	public static void main(String[] args) {
		
		launch(args);
	}
	
	public RostomSefu() {
		gameGui = new GameGui(this);
		startGui = new StartGui(this);
	}

	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		startGui.start(primaryStage);
		//play();
	}
	
	private void play() {
		boolean playing = true;
		while (playing) {
			
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
	}
	
	public Player getPlayer() {
		return player;
	}
}
