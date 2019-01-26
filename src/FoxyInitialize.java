public class FoxyInitialize {
    public static int FoxTimer = 0;

    public FoxyInitialize() {
    }

    void Foxy() {
        if (Foxy.playerdeath == true) {
            if (FoxTimer < 4) {
                FoxTimer++;
            }
            if (FoxTimer == 4) {
                switch (Window.foxdie) {
                    case 1:
                        Window.foxdie = 2;
                        FoxTimer = 0;
                        break;
                    case 2:
                        Window.foxdie = 3;
                        FoxTimer = 0;
                        break;
                    case 3:
                        Window.foxdie = 4;
                        FoxTimer = 0;
                        break;
                    case 4:
                        Window.foxdie = 5;
                        FoxTimer = 0;
                        break;
                    case 5:
                        Window.foxdie = 6;
                        FoxTimer = 0;
                        break;
                    case 6:
                        Window.foxdie = 7;
                        FoxTimer = 0;
                        break;
                    case 7:
                        Window.foxdie = 8;
                        FoxTimer = 0;
                        break;
                    case 8:
                        Window.foxdie = 9;
                        FoxTimer = 0;
                        break;
                    case 9:
                        Window.foxdie = 10;
                        FoxTimer = 0;
                        break;
                    case 10:
                        Window.foxdie = 11;
                        FoxTimer = 0;
                        break;
                    case 11:
                        Window.foxdie = 12;
                        FoxTimer = 0;
                        break;
                    case 12:
                        Window.foxdie = 13;
                        FoxTimer = 0;
                        break;
                    case 13:
                        Window.foxdie = 14;
                        FoxTimer = 0;
                        break;
                    case 14:
                        Window.foxdie = 15;
                        FoxTimer = 0;
                        break;
                    case 15:
                        Window.foxdie = 16;
                        FoxTimer = 0;
                        break;
                    case 16:
                        Window.foxdie = 17;
                        FoxTimer = 0;
                        break;
                    case 17:
                        Window.foxdie = 18;
                        FoxTimer = 0;
                        break;
                    case 18:
                        Window.foxdie = 19;
                        FoxTimer = 0;
                        break;
                    case 19:
                        Window.foxdie = 0;
                        Main.death = true;
                        FoxTimer = 0;
                        break;
                }
            }
        }
    }
}