public class FoxyInitialize {
    public static int FoxTimer = 0;

    public FoxyInitialize() {
    }

    void Foxy() {
    if (Foxy.playerdeath == true){
        if (FoxTimer < 4){
            FoxTimer++;
        }
        else if (FoxTimer == 4){
            if (Window.foxdie > 0 && Window.foxdie < 19){
                Window.foxdie++;
                FoxTimer = 0;
            }
            else if (Window.foxdie == 19){
                Window.foxdie = 0;
                Main.death = true;
                FoxTimer = 0;
            }
        }
    
    }

}