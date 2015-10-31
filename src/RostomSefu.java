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
	
	
	public static void main(String[] args) {
		
		launch(args);
		boolean playing = true;
		while (playing) {
		} 
	}
	
	public RostomSefu() {
		gameGui = new GameGui(this);
		startGui = new StartGui(this);
	}

	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		startGui.start(primaryStage);
	}
	
	public void changeToGameGui () {
		try {
			gameGui.start(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	
	public void setName(String name) {
		
	}
}
