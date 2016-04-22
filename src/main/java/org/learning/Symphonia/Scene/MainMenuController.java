package org.learning.Symphonia.Scene;

import java.net.URL;
import java.util.ResourceBundle;

import org.learning.Symphonia.App;
import org.learning.Symphonia.ControllerTemplate;
import org.learning.Symphonia.ScenesController;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class MainMenuController implements Initializable, ControllerTemplate {
	private ScenesController controller;
	
	@Override
	public void setSceneParent(ScenesController scenePage) {
		controller = scenePage;
		
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	}
	@FXML
	private void onMousePlayClicked() {
		controller.setScene(App.PLAY_MENU_SCENE_ID);
	}
	@FXML
	private void onMouseOptionsClicked() {
		controller.setScene(App.OPTIONS_MENU_SCENE_ID);
	}
	@FXML
	private void onMouseExitClicked() {
		System.exit(0);
	}
}
