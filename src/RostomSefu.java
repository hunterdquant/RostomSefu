import javafx.application.Application;
import javafx.stage.Stage;

/**
 * 
 * @author Hunter Quant
 * @author Collin Walling
 * @author Zach McNulty
 */

public class RostomSefu extends Application {
	
	
	public static void main(String[] args) {
		
		launch(args);
		boolean playing = true;
		while (playing) {
			System.out.println("erg");
		} 
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Rostom Sefu!");
		primaryStage.show();
	}
	
	
}
