package org.learning.Symphonia.Music;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.Serializer;

import java.io.File;
import java.io.FileNotFoundException;

public class SheetMusicController {
	private SheetMusic sheetMusic;
	
	private Sounds sounds;
	
	public void loadPiece(String filename) throws Exception {
		Serializer serializer = new Persister();
		File file = new File(filename);
		sheetMusic = serializer.read(SheetMusic.class, file);
	}
	private void loadSounds() throws Exception {
		Serializer serializer = new Persister();
		File file = new File("src/main/resources/sounds.xml");
		sounds = serializer.read(Sounds.class, file);
	}
	public SheetMusicController() {
		try {
			loadSounds();
		}
		catch (FileNotFoundException exception) {
			exception.printStackTrace();
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
