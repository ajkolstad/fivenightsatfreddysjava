public class ChickaInitialize {
    public static int ChickaTimer = 0;

    public ChickaInitialize() {
    }

    void Chicka() {
        if (Chicka.playerdeath == true && Office.monitorUp == false) {
            if (ChickaTimer < 4) {
                ChickaTimer++;
            }
            if (ChickaTimer == 4) {
                switch (Window.chicka) {
                    case 1:
                        Window.chicka = 2;
                        ChickaTimer = 0;
                        break;
                    case 2:
                        Window.chicka = 3;
                        ChickaTimer = 0;
                        break;
                    case 3:
                        Window.chicka = 4;
                        ChickaTimer = 0;
                        break;
                    case 4:
                        Window.chicka = 5;
                        ChickaTimer = 0;
                        break;
                    case 5:
                        Window.chicka = 6;
                        ChickaTimer = 0;
                        break;
                    case 6:
                        Window.chicka = 7;
                        ChickaTimer = 0;
                        break;
                    case 7:
                        Window.chicka = 8;
                        ChickaTimer = 0;
                        break;
                    case 8:
                        Window.chicka = 9;
                        ChickaTimer = 0;
                        break;
                    case 9:
                        Window.chicka = 10;
                        ChickaTimer = 0;
                        break;
                    case 10:
                        Window.chicka = 11;
                        ChickaTimer = 0;
                        break;
                    case 11:
                        Window.chicka = 12;
                        ChickaTimer = 0;
                        break;
                    case 12:
                        Window.chicka = 13;
                        ChickaTimer = 0;
                        break;
                    case 13:
                        Window.chicka = 14;
                        ChickaTimer = 0;
                        break;
                    case 14:
                        Window.chicka = 15;
                        ChickaTimer = 0;
                        break;
                    case 15:
                        Window.chicka = 16;
                        ChickaTimer = 0;
                        break;
                    case 16:
                        Window.chicka = 0;
                        Main.death = true;
                        ChickaTimer = 0;
                        break;
                }
            }
        }
    }
}