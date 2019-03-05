import org.junit.Test;
import org.junit.Assert;


public class CharacterTest {
    @Test
    public void characterDeathTest(){
        Bonnie testBonnie = new Bonnie();
        Chicka testChicka = new Chicka();
        Freddy testFreddy = new Freddy();
        testBonnie.setRoom(8);
        testChicka.setRoom(8);
        testFreddy.setRoom(4);
        //Testing for killing player
        Office.monitorUp = true;
        Office.door1open = true;
        Assert.assertTrue(testBonnie.getPlayerDeath());
        Assert.assertTrue(testChicka.getPlayerDeath());
        Assert.assertTrue(testFreddy.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.setRoom(8);
        testFreddy.setRoom(4);
        testBonnie.setPlayerDeath(false);
        testChicka.setPlayerDeath(false);
        testFreddy.setPlayerDeath(false);
        Office.monitorUp = false;
        Assert.assertFalse(testBonnie.getPlayerDeath());
        Assert.assertFalse(testChicka.getPlayerDeath());
        Assert.assertFalse(testFreddy.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.setRoom(8);
        testFreddy.setRoom(4);
        testBonnie.setPlayerDeath(false);
        testChicka.setPlayerDeath(false);
        testFreddy.setPlayerDeath(false);
        Office.monitorUp = true;
        Office.door1open = false;
        Assert.assertFalse(testBonnie.getPlayerDeath());
        Assert.assertFalse(testChicka.getPlayerDeath());
        Assert.assertFalse(testFreddy.getPlayerDeath());
        testBonnie.setRoom(7);
        testChicka.setRoom(7);
        testFreddy.setRoom(3);
        testBonnie.setPlayerDeath(false);
        testChicka.setPlayerDeath(false);
        testFreddy.setPlayerDeath(false);
        Office.monitorUp = true;
        Office.door1open = true;
        Assert.assertFalse(testBonnie.getPlayerDeath());
        Assert.assertFalse(testChicka.getPlayerDeath());
        Assert.assertFalse(testFreddy.getPlayerDeath());
    }

    public void characterTickTest(){
        Bonnie testBonnie = new Bonnie();
        Chicka testChicka = new Chicka();
        Freddy testFreddy = new Freddy();
        //Bonnie Testing
        for(int i = 0; i < 9; i++) {
            testBonnie.setRoom(i);
            testChicka.setRoom(i+1);
            testFreddy.setRoom(i+1);
            Assert.assertEquals(testBonnie.isInRoom(), i);
        }
        for(int i = 0; i < 9; i++) {
            testChicka.setRoom(i);
            testBonnie.setRoom(i+1);
            testFreddy.setRoom(i+1);
            Assert.assertEquals(testChicka.isInRoom(), i);
        }
    }
}
