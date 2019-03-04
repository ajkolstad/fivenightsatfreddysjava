import org.junit.Test;
import org.junit.Assert;
import java.awt.event.MouseEvent;


class InitializeGameTest {

    //Testing mouse even for starting the game
    @Test
    public void testStartGame(){
        InitializeGame it = new InitializeGame();
        it.testStartGame(200, 420);
        Assert.Assert.assertTrue(Window.startClicked);
        it.testStartGame(500, 1000);
        Assert.Assert.assertFalse(Window.startClicked);
    }

    @Test
    public void testLights(){
        InitializeGame it = new InitializeGame();
        Office o = new Office();
        o.light1on = false;
        o.light2on = false;
        it.testLight1(o, 50, 400);
        Assert.assertTrue(o.light1on);
        it.testLight1Off(o, 60, 437);
        Assert.assertFalse(o.light1on);
        it.testLight2(o, 1212, 383);
        Assert.assertTrue(o.light2on);
        it.testLight2Off(o, 1246, 437);
        Assert.assertFalse(o.light2on);
    }

    @Test
    public void testDoors(){
        InitializeGame it = new InitializeGame();
        Office o = new Office();
        o.door1open = false;
        o.door2open = false;
        it.testDoor1(o, 35, 320);
        Assert.assertTrue(o.door1open);
        it.testDoor1Off(o, 40, 320);
        Assert.assertFalse(o.door1open);
        it.testDoor2(o, 1212, 300);
        Assert.assertTrue(o.door2open);
        it.testDoor2Off(o, 1246, 357);
        Assert.assertFalse(o.door2open);
    }

    @Test
    public void testCamera(){
        InitializeGame it = new InitializeGame();
        Assert.assertEquals(it.testCamera(923, 343), "Show Stage");
        Assert.assertEquals(it.testCamera(904, 399), "Dining Area");
        Assert.assertEquals(it.testCamera(877, 481), "Pirate Cove");
        Assert.assertEquals(it.testCamera(926, 596), "West Hall A");
        Assert.assertEquals(it.testCamera(976, 665), "West Hall B");
        Assert.assertEquals(it.testCamera(900, 612), "Supply Closet");
        Assert.assertEquals(it.testCamera(1034, 630), "East Hall A");
        Assert.assertEquals(it.testCamera(1034, 665), "East Hall B");
        Assert.assertEquals(it.testCamera(796, 465), "Backstage");
        Assert.assertEquals(it.testCamera(1146, 470), "Restrooms");
        Assert.assertEquals(it.testCamera(11923, 11343), "nothing");
    }




}