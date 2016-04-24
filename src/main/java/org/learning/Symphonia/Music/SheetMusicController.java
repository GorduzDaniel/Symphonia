package org.learning.Symphonia.Music;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.Serializer;

import java.io.File;

public class SheetMusicController {
	private SheetMusic sheetMusic;
	
	private Sounds sounds;
	
	public SheetMusic loadPiece(String filename) throws Exception {
		Serializer serializer = new Persister();
		File file = new File(filename);
		sheetMusic = serializer.read(SheetMusic.class, file);
		return sheetMusic;
	}
	public Sounds loadSounds(String filename) throws Exception {
		Serializer serializer = new Persister();
		File file = new File(filename);
		sounds = serializer.read(Sounds.class, file);
		return sounds;
	}
}
