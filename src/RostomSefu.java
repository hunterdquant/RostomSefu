/**
 * 
 * @author Hunter Quant
 * @author Collin Walling
 * @author Zach McNulty
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class RostomSefu extends Application {
	
	
	public static void main(String[] args) {
		
		launch(args);
		boolean playing = true;
		while (playing) {
		} 
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Rostom Sefu!");
		Pane root = new Pane();
		StackPane stackPane = new StackPane();
		Canvas canvas = new Canvas(800, 600);
		stackPane.getChildren().add(canvas);
		root.getChildren().add(stackPane);
		stackPane.setStyle("-fx-background-color: black");
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
