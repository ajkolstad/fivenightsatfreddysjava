import org.junit.Assert;
import org.junit.Test;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class SoundsTest {

    @Test
    public void screamTest() {
        Window w = new Window();
        Office.monitorUp = false;
        Bonnie.playerdeath = false;
        Chicka.playerdeath = false;
        Foxy.playerdeath = false;
        Freddy.playerdeath = false;

        // Test screams
        Bonnie.playerdeath = true;
        Assert.assertEquals("scream", w.soundsTest()); // make sure scream plays
        Bonnie.playerdeath = false;
        Chicka.playerdeath = true;
        Assert.assertEquals("scream", w.soundsTest()); // make sure scream plays
        Chicka.playerdeath = false;
        Freddy.playerdeath = true;
        Assert.assertEquals("scream", w.soundsTest()); // make sure scream plays
        Freddy.playerdeath = false;
        Foxy.playerdeath = true;
        Office.door1open = true;
        Assert.assertEquals("scream", w.soundsTest()); // make sure scream plays
    }

    @Test
    public void officeSoundTest() {
        Window w = new Window();
        InitializeGame it = new InitializeGame();

        Assert.assertEquals("light", it.testSounds(30, 383));
        Assert.assertEquals("light", it.testSounds(1212, 383));

        Assert.assertEquals("door", it.testSounds(30, 300));
        Assert.assertEquals("door", it.testSounds(1212, 300));
        Assert.assertEquals("nothing", it.testSounds(29, 383));
        Assert.assertEquals("nothing", it.testSounds(30, 1212));
        Assert.assertEquals("nothing", it.testSounds(1247, 300));
    }

    @Test
    public void testPlaySound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Main m = new Main();
        m.playSound(Window.blip);
        m.playSound(Window.scream);
    }
}
