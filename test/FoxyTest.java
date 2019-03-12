import org.junit.Assert;
import org.junit.Test;

class FoxyTest {
    @Test
    public void tickTest(){
        Window.cameraLocation = "Pirate Cove";
        Office.monitorUp = true;
        f.tick();
        Office.door1open = true;
        Office.monitorUp = false;
        for(int i = 0; i < 2000; i++){
            f.tick();
        }
    }

    @Test
    public void stageTest(){
        Foxy sFoxy = new Foxy();
        assertEquals(sFoxy.getStage(), 0);
        sFoxy.tick();
        assertEquals(sFoxy.getStage(), 1);
        sFoxy.tick();
        assertEquals(sFoxy.getStage(), 2);
        sFoxy.tick();
        assertEquals(sFoxy.getStage(), 3);
        sFoxy.tick();
        assertEquals(sFoxy.getStage(), 3);
    }

}