import org.junit.Test;
import org.junit.Assert;
import java.awt.*;

public class WindowTest {
    @Test
    public void testWindow() {
        Window w = new Window();
        InitializeGame it = new InitializeGame();
        Assert.assertEquals(it.testCamera(923, 343), "Show Stage");
        Assert.assertEquals(it.testCamera(973, 377), "Show Stage");
        Assert.assertEquals(it.testCamera(904, 399), "Dining Area");
        Assert.assertEquals(it.testCamera(954, 433), "Dining Area");

        Assert.assertEquals(it.testCamera(877, 481), "Pirate Cove");
        Assert.assertEquals(it.testCamera(927, 515), "Pirate Cove");
        Assert.assertEquals(it.testCamera(926, 596), "West Hall A");
        Assert.assertEquals(it.testCamera(976, 630), "West Hall A");
        Assert.assertEquals(it.testCamera(976, 665), "West Hall B");
        Assert.assertEquals(it.testCamera(926, 631), "West Hall B");

        Assert.assertEquals(it.testCamera(900, 612), "Supply Closet");
        Assert.assertEquals(it.testCamera(850, 578), "Supply Closet");
        Assert.assertEquals(it.testCamera(1034, 630), "East Hall A");
        Assert.assertEquals(it.testCamera(1084, 596), "East Hall A");
        Assert.assertEquals(it.testCamera(1034, 665), "East Hall B");
        Assert.assertEquals(it.testCamera(1084, 631), "East Hall B");
        Assert.assertEquals(it.testCamera(796, 465), "Backstage");
        Assert.assertEquals(it.testCamera(846, 431), "Backstage");
        Assert.assertEquals(it.testCamera(1146, 470), "Restrooms");
        Assert.assertEquals(it.testCamera(1196, 436), "Restrooms");
        Assert.assertEquals(it.testCamera(11923, 11343), "nothing");


    }
}