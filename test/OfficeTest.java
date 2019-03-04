import org.junit.Test;
import org.junit.Assert;

public class OfficeTest {
    Office o = new Office();

    @Test
    public void testGetters(){
        Assert.assertFalse(Office.getLight1On());
        Assert.assertFalse(Office.getLight2On());
        Assert.assertFalse(Office.getMonitorUp());
        Assert.assertTrue(Office.getDoor1Open());
        Assert.assertTrue(Office.getDoor2Open());
        Assert.assertEquals(Office.getPower(), 100, .000001);
        Assert.assertEquals(Office.getDeviceUsed(), 0);
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

        Assert.assertTrue(Office.getDoor1Open());
        Assert.assertTrue(Office.getLight1On());
        Assert.assertTrue(Office.getLight2On());
        Assert.assertTrue(Office.getMonitorUp());
        Assert.assertFalse(Office.getDoor2Open());
        Assert.assertEquals(Office.getPower(), 25.6, .000001);
        Assert.assertEquals(Office.getDeviceUsed(), 2);
    }

    @Test
    public void testUsage(){
        //Lights on, doors open, monitor down
        Office.setLight1On(true);
        Office.setLight2On(true);
        Office.setDoor1Open(true);
        Office.setDoor2Open(true);
        Office.setMonitorUp(false);
        Assert.assertEquals(Office.getUsage(), 2);

        //Lights on, doors closed, monitor up
        Office.setLight1On(true);
        Office.setLight2On(true);
        Office.setDoor1Open(false);
        Office.setDoor2Open(false);
        Office.setMonitorUp(true);
        Assert.assertEquals(Office.getUsage(), 5);


        //Lights off, doors open, monitor down
        Office.setLight1On(false);
        Office.setLight2On(false);
        Office.setDoor1Open(true);
        Office.setDoor2Open(true);
        Office.setMonitorUp(false);
        Assert.assertEquals(Office.getUsage(), 0);
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
        Assert.assertEquals(Office.getPower(), 81.5, .000001);
    }
}