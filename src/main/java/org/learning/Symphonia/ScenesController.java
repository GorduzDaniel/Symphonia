package org.learning.Symphonia;

import java.util.HashMap;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

public class ScenesController extends StackPane {
	private HashMap<String, Node> scenes = new HashMap<>();
	
	public ScenesController() {
		super();
	}
	public void addScene(String name, Node scene) {
		scenes.put(name, scene);
	}
	public Node getScene(String name) {
		return scenes.get(name);
	}
	public void loadScene(String name, String resource) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
			Parent loadScene = (Parent) loader.load();
			ControllerTemplate scene = ((ControllerTemplate) loader.getController());
			scene.setSceneParent(this);
			addScene(name, loadScene);
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	public void setScene(final String name) {
		if (scenes.get(name) != null) {
			if (!getChildren().isEmpty()) {
				getChildren().remove(0);
				getChildren().add(0, scenes.get(name));
			}
			else {
				getChildren().add(scenes.get(name));
			}
		}
	}
	public void unloadScene(String name) {
		scenes.remove(name);
	}
}
