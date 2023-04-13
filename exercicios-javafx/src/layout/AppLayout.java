package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
//		Scene cena = new Scene(new TesteAnchorPane(), 800, 600);
//		Scene cena = new Scene(new TesteBorderPane(), 800, 600);
//		Scene cena = new Scene(new TesteFlowPane(), 800, 600);
//		Scene cena = new Scene(new TesteGridPane(), 800, 600);
//		Scene cena = new Scene(new TesteStackPane(), 800, 600);
		Scene cena = new Scene(new TesteTilePane(), 800, 600);
		
		primaryStage.setScene(cena);
		
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
