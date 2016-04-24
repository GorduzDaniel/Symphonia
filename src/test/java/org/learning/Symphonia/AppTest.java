package org.learning.Symphonia;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.learning.Symphonia.MusicTest.SheetMusicControllerTest;
import org.learning.Symphonia.MusicTest.SongsControllerTest;

@RunWith(Suite.class)
@SuiteClasses({ SheetMusicControllerTest.class, SongsControllerTest.class })

public class AppTest {
}
