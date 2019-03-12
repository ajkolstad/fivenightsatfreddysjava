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
        testBonnie.tick();
        Assert.assertTrue(testBonnie.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.tick();
        Assert.assertTrue(testChicka.getPlayerDeath());
        testChicka.setRoom(8);
        testFreddy.tick();
        Assert.assertTrue(testFreddy.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.setRoom(8);
        testFreddy.setRoom(4);
        testBonnie.setPlayerDeath(false);
        testChicka.setPlayerDeath(false);
        testFreddy.setPlayerDeath(false);
        Office.monitorUp = false;
        testBonnie.tick();
        Assert.assertFalse(testBonnie.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.tick();
        Assert.assertFalse(testChicka.getPlayerDeath());
        testChicka.setRoom(8);
        testFreddy.tick();
        Assert.assertFalse(testFreddy.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.setRoom(8);
        testFreddy.setRoom(4);
        testBonnie.setPlayerDeath(false);
        testChicka.setPlayerDeath(false);
        testFreddy.setPlayerDeath(false);
        Office.monitorUp = true;
        Office.door1open = false;
        testBonnie.tick();
        Assert.assertFalse(testBonnie.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.tick();
        Assert.assertFalse(testChicka.getPlayerDeath());
        testChicka.setRoom(8);
        testFreddy.tick();
        Assert.assertFalse(testFreddy.getPlayerDeath());
        testBonnie.setRoom(7);
        testChicka.setRoom(7);
        testFreddy.setRoom(3);
        testBonnie.setPlayerDeath(false);
        testChicka.setPlayerDeath(false);
        testFreddy.setPlayerDeath(false);
        Office.monitorUp = true;
        Office.door1open = true;
        testBonnie.tick();
        Assert.assertFalse(testBonnie.getPlayerDeath());
        testBonnie.setRoom(8);
        testChicka.tick();
        Assert.assertFalse(testChicka.getPlayerDeath());
        testChicka.setRoom(8);
        testFreddy.tick();
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
            testBonnie.tick();
            Assert.assertEquals(testBonnie.isInRoom(), i);
        }
        for(int i = 0; i < 9; i++) {
            testChicka.setRoom(i);
            testBonnie.setRoom(i+1);
            testFreddy.setRoom(i+1);
            testChicka.tick();
            Assert.assertEquals(testChicka.isInRoom(), i);
        }
        for(int i = 0; i < 5; i++) {
            testFreddy.setRoom(i);
            testBonnie.setRoom(i+1);
            testChicka.setRoom(i+1);
            testFreddy.tick();
            Assert.assertEquals(testFreddy.isInRoom(), i);
        }
    }
}
