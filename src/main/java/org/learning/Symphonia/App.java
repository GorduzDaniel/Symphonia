package org.learning.Symphonia;

import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;

public class App extends Application {
	public static String MAIN_MENU_SCENE_ID = "mainMenu";
	public static String PLAY_MENU_SCENE_ID = "playMenu";
	public static String PIANO_SHEET_SCENE_ID = "pianoSheet";
	
	@Override
	public void start(Stage primaryStage) {
		ScenesController container = new ScenesController();
		container.loadScene(App.MAIN_MENU_SCENE_ID, "/scenes/MainMenu.fxml");
		container.loadScene(App.PLAY_MENU_SCENE_ID, "/scenes/PlayMenu.fxml");
		container.loadScene(App.PIANO_SHEET_SCENE_ID, "/scenes/PianoSheet.fxml");
		container.setScene(App.MAIN_MENU_SCENE_ID);
		
		Group root = new Group();
		root.getChildren().addAll(container);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Symphonia");
		primaryStage.show();
	}
}