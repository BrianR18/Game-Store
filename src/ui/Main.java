package ui;
import model.GameStore;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application {
	
	private GameStoreGUI GameStoreGUI;
	private GameStore GameStore;
	
	public Main() throws ClassNotFoundException, IOException {
		GameStore = new GameStore();
        GameStoreGUI = new GameStoreGUI(GameStore);
    
}

	public static void main(String[] args) {
		launch(args);

	}
	
	@Override
    public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Welcome.fxml"));

		fxmlLoader.setController(GameStoreGUI);
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Game store Colombia");
		primaryStage.show();

    }

}
