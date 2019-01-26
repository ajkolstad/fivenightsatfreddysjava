public class FreddyInitialize {
    public static int FreddyTimer = 0;

    public FreddyInitialize() {
    }

    void Freddy() {
        if (Freddy.playerdeath == true && Office.monitorUp == false) {
            if (FreddyTimer < 4) {
                FreddyTimer++;
            }
            if (FreddyTimer == 4) {
                switch (Window.freddie) {
                    case 1:
                        Window.freddie = 2;
                        FreddyTimer = 0;
                        break;
                    case 2:
                        Window.freddie = 3;
                        FreddyTimer = 0;
                        break;
                    case 3:
                        Window.freddie = 4;
                        FreddyTimer = 0;
                        break;
                    case 4:
                        Window.freddie = 5;
                        FreddyTimer = 0;
                        break;
                    case 5:
                        Window.freddie = 6;
                        FreddyTimer = 0;
                        break;
                    case 6:
                        Window.freddie = 7;
                        FreddyTimer = 0;
                        break;
                    case 7:
                        Window.freddie = 8;
                        FreddyTimer = 0;
                        break;
                    case 8:
                        Window.freddie = 9;
                        FreddyTimer = 0;
                        break;
                    case 9:
                        Window.freddie = 10;
                        FreddyTimer = 0;
                        break;
                    case 10:
                        Window.freddie = 11;
                        FreddyTimer = 0;
                        break;
                    case 11:
                        Window.freddie = 12;
                        FreddyTimer = 0;
                        break;
                    case 12:
                        Window.freddie = 13;
                        FreddyTimer = 0;
                        break;
                    case 13:
                        Window.freddie = 14;
                        FreddyTimer = 0;
                        break;
                    case 14:
                        Window.freddie = 15;
                        FreddyTimer = 0;
                        break;
                    case 15:
                        Window.freddie = 16;
                        FreddyTimer = 0;
                        break;
                    case 16:
                        Window.freddie = 17;
                        FreddyTimer = 0;
                        break;
                    case 17:
                        Window.freddie = 18;
                        FreddyTimer = 0;
                        break;
                    case 18:
                        Window.freddie = 19;
                        FreddyTimer = 0;
                        break;
                    case 19:
                        Window.freddie = 20;
                        FreddyTimer = 0;
                        break;
                    case 20:
                        Window.freddie = 21;
                        FreddyTimer = 0;
                        break;
                    case 21:
                        Window.freddie = 22;
                        FreddyTimer = 0;
                        break;
                    case 22:
                        Window.freddie = 23;
                        FreddyTimer = 0;
                        break;
                    case 23:
                        Window.freddie = 24;
                        FreddyTimer = 0;
                        break;
                    case 24:
                        Window.freddie = 25;
                        FreddyTimer = 0;
                        break;
                    case 25:
                        Window.freddie = 26;
                        FreddyTimer = 0;
                        break;
                    case 26:
                        Window.freddie = 27;
                        FreddyTimer = 0;
                        break;
                    case 27:
                        Window.freddie = 28;
                        FreddyTimer = 0;
                        break;
                    case 28:
                        Window.freddie = 0;
                        Main.death = true;
                        FreddyTimer = 0;
                        break;
                }
            }
        }
    }
}