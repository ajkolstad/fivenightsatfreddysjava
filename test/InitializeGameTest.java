import org.junit.jupiter.api.Test;

import java.awt.event.MouseEvent;

import static org.junit.jupiter.api.Assertions.*;

class InitializeGameTest {

    //Testing mouse even for starting the game
    @Test
    public void testStartGame(){
        InitializeGame it = new InitializeGame();
        it.testStartGame(200, 420);
        assertTrue(Window.startClicked);
        it.testStartGame(500, 1000);
        assertFalse(Window.startClicked);
    }

    @Test
    public void testLights(){
        InitializeGame it = new InitializeGame();
        Office o = new Office();
        o.light1on = false;
        o.light2on = false;
        it.testLight1(o, 50, 400);
        assertTrue(o.light1on);
        it.testLight1Off(o, 60, 437);
        assertFalse(o.light1on);
        it.testLight2(o, 1212, 383);
        assertTrue(o.light2on);
        it.testLight2Off(o, 1246, 437);
        assertFalse(o.light2on);
    }

    @Test
    public void testDoors(){
        InitializeGame it = new InitializeGame();
        Office o = new Office();
        o.door1open = false;
        o.door2open = false;
        it.testDoor1(o, 35, 320);
        assertTrue(o.door1open);
        it.testDoor1Off(o, 40, 320);
        assertFalse(o.door1open);
        it.testDoor2(o, 1212, 300);
        assertTrue(o.door2open);
        it.testDoor2Off(o, 1246, 357);
        assertFalse(o.door2open);
    }

    @Test
    public void testCamera(){
        InitializeGame it = new InitializeGame();
        assertEquals(it.testCamera(923, 343), "Show Stage");
        assertEquals(it.testCamera(904, 399), "Dining Area");
        assertEquals(it.testCamera(877, 481), "Pirate Cove");
        assertEquals(it.testCamera(926, 596), "West Hall A");
        assertEquals(it.testCamera(976, 665), "West Hall B");
        assertEquals(it.testCamera(900, 612), "Supply Closet");
        assertEquals(it.testCamera(1034, 630), "East Hall A");
        assertEquals(it.testCamera(1034, 665), "East Hall B");
        assertEquals(it.testCamera(796, 465), "Backstage");
        assertEquals(it.testCamera(1146, 470), "Restrooms");
        assertEquals(it.testCamera(11923, 11343), "nothing");
    }




}