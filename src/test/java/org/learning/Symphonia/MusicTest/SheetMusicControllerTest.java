package org.learning.Symphonia.MusicTest;

import org.learning.Symphonia.Music.SheetMusicController;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class SheetMusicControllerTest {
	private SheetMusicController smc = new SheetMusicController();

	@Test
	public void soundsLoaderTest() throws Exception {
		assertNotEquals(null, smc.loadSounds("src/main/resources/sounds.xml"));
	}
	@Test
	public void musicLoaderTest() throws Exception {
		assertNotEquals(null, smc.loadPiece("src/test/resources/pieces/test.xml"));
	}
}
