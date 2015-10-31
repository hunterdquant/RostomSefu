import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 
 * @author Hunter Quant <hunterdquant@gmail.com>
 *
 */
public class StartGui extends Application {
	
	private RostomSefu rs;

	public StartGui(RostomSefu rs) {
		this.rs = rs;
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		

		primaryStage.setTitle("Rostom Sefu!");
		GridPane grid = new GridPane();
		File file = new File("RostomSefu.png");
		Image img = new Image("RostomSefu.png");
		ImageView imgView = new ImageView();
		imgView.setFitWidth(600);
		imgView.setFitHeight(200);
		imgView.setImage(img);
		Button butt = new Button("Start");
		TextField tf = new TextField("Keith");
		butt.setOnAction(event -> {
			rs.setName(tf.getText());
			rs.changeToGameGui();
		});
		grid.add(imgView, 0, 0);
		grid.add(butt, 0, 2);
		grid.add(tf, 0, 1);
		
		Scene scene = new Scene(grid, 600, 300);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
