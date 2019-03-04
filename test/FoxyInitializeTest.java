import org.junit.Assert;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class FoxyInitializeTest {
    public void testInit(){
        it.Foxy();
        assertEquals(0, it.FoxTimer);
        f.playerdeath = true;
        assertEquals(0, it.FoxTimer);
        it.FoxTimer = 1;
        assertEquals(1, it.FoxTimer);
        it.Foxy();
        assertEquals(2, it.FoxTimer);
        it.Foxy();
        assertEquals(3, it.FoxTimer);
        it.Foxy();
        assertEquals(4, it.FoxTimer);
        for (int i = 0; i < 100; i++){
            it.Foxy();
        }
    }

}