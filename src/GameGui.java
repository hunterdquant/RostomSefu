/**
 * 
 * @author Hunter Quant <hunterdquant@gmail.com>
 *
 */


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.DialogPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class GameGui extends Application {
	
	private RostomSefu rs;
	private Text name = new Text();
	private Text health = new Text();
	private Text defense = new Text();
	private Text damage = new Text();
	private Text message = new Text();
	
	public GameGui(RostomSefu rs) {
		this.rs = rs;
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		primaryStage.setTitle("Rostom Sefu!");
		Pane root = new Pane();
		GridPane grid = new GridPane();
		StackPane stackPane = new StackPane();
		
		Canvas canvas = new Canvas(800, 600);
		stackPane.getChildren().add(canvas);
		root.getChildren().add(stackPane);
		
		name.setText("Name: " + rs.getPlayerName());
		name.setFill(Color.WHITE);
		health.setText("Health: " + rs.getPlayerHealth());
		health.setFill(Color.WHITE);
		defense.setText("Defense: " + rs.getPlayerDefense());
		defense.setFill(Color.WHITE);
		damage.setText("Damage: " + rs.getPlayerDamage());
		damage.setFill(Color.WHITE);
		message.setText("You lost your wife, and now you are blind.");
		message.setFill(Color.WHITE);
		grid.add(name, 0, 0);
		grid.add(health, 0, 1);
		grid.add(defense, 0, 2);
		grid.add(damage,  0,  3);
		
		HBox hb = new HBox();
		hb.getChildren().add(message);
		hb.setAlignment(Pos.CENTER);
		hb.setLayoutX(250);
		hb.setLayoutY(250);
		message.setTextAlignment(TextAlignment.CENTER);
		root.getChildren().addAll(grid, hb);
		
		stackPane.setStyle("-fx-background-color: black");
		Scene scene = new Scene(root, 800, 600);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void setHealth(String s) {
		health.setText("Health: " + s);
	}
	
	public void setDefense(String s) {
		defense.setText("Defense: " + s);
	}
	public void setDamage(String s) {
		defense.setText("Damage: " + s);
	}
	public void setMessage(String s) {
		message.setText(s);
	}
}
