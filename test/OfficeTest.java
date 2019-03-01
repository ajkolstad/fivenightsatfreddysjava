import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeTest {
    Office o = new Office();

    @Test
    public void testGetters(){
        assertFalse(Office.getLight1On());
        assertFalse(Office.getLight2On());
        assertFalse(Office.getMonitorUp());
        assertTrue(Office.getDoor1Open());
        assertTrue(Office.getDoor2Open());
        assertEquals(Office.getPower(), 100);
        assertEquals(Office.getDeviceUsed(), 0);
    }

    @Test
    public void testSetters(){
        Office.setDoor1Open(true);
        Office.setDoor2Open(false);
        Office.setLight1On(true);
        Office.setLight2On(true);
        Office.setMonitorUp(true);
        Office.setPowerRemaining(25.6);
        Office.setDevicedUsed(2);

        assertTrue(Office.getDoor1Open());
        assertTrue(Office.getLight1On());
        assertTrue(Office.getLight2On());
        assertTrue(Office.getMonitorUp());
        assertFalse(Office.getDoor2Open());
        assertEquals(Office.getPower(), 25.6);
        assertEquals(Office.getDeviceUsed(), 2);
    }

    @Test
    public void testUsage(){
        //Lights on, doors open, monitor down
        Office.setLight1On(true);
        Office.setLight2On(true);
        Office.setDoor1Open(true);
        Office.setDoor2Open(true);
        Office.setMonitorUp(false);
        assertEquals(Office.getUsage(), 2);

        //Lights on, doors closed, monitor up
        Office.setLight1On(true);
        Office.setLight2On(true);
        Office.setDoor1Open(false);
        Office.setDoor2Open(false);
        Office.setMonitorUp(true);
        assertEquals(Office.getUsage(), 5);


        //Lights off, doors open, monitor down
        Office.setLight1On(false);
        Office.setLight2On(false);
        Office.setDoor1Open(true);
        Office.setDoor2Open(true);
        Office.setMonitorUp(false);
        assertEquals(Office.getUsage(), 0);
    }

    @Test
    public void testDecreasePower(){
        //BUG: Power can possibly go negative
        Office.setPowerRemaining(100);
        Office.setDevicedUsed(0);
        Office.descreasepower();
        Office.setDevicedUsed(1);
        Office.descreasepower();
        Office.setDevicedUsed(2);
        Office.descreasepower();
        Office.setDevicedUsed(3);
        Office.descreasepower();
        Office.setDevicedUsed(4);
        Office.descreasepower();
        Office.setDevicedUsed(5);
        Office.descreasepower();
        assertEquals(Office.getPower(), 81.5);
    }
}