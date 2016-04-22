package org.learning.Symphonia;

import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.application.Application;

public class App extends Application {
	public static String MAIN_MENU_SCENE_ID = "mainMenu";
	public static String OPTIONS_MENU_SCENE_ID = "settingsMenu";
	public static String PLAY_MENU_SCENE_ID = "playMenu";
	
	@Override
	public void start(Stage primaryStage) {
		ScenesController container = new ScenesController();
		container.loadScene(App.MAIN_MENU_SCENE_ID, "/scenes/MainMenu.fxml");
		container.loadScene(App.OPTIONS_MENU_SCENE_ID, "/scenes/OptionsMenu.fxml");
		container.loadScene(App.PLAY_MENU_SCENE_ID, "/scenes/PlayMenu.fxml");
		
		container.setScene(App.MAIN_MENU_SCENE_ID);
		
		Group root = new Group();
		root.getChildren().addAll(container);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}