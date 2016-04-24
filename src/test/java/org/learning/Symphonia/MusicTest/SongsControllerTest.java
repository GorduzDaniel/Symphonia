package org.learning.Symphonia.MusicTest;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.learning.Symphonia.Piece.SongsController;

public class SongsControllerTest {
	private SongsController controller = new SongsController();
	
	@Test
	public void songsLoaderTest() throws Exception {
		assertNotEquals(null, controller.loadSongs("src/test/resources/pieces/test.xml"));
	}
}
