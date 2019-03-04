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
}