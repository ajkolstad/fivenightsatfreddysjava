public class BonnieInitialize {
    public static int BonnieTimer = 0;

    public BonnieInitialize() {
    }

    void Bonnie() {
        if (Bonnie.playerdeath == true && Office.monitorUp == false) {
            if (BonnieTimer < 4) {
                BonnieTimer++;
            }
            if (BonnieTimer == 4) {

                switch (Window.bonnie) {
                    case 1:
                        Window.bonnie = 2;
                        BonnieTimer = 0;
                        break;
                    case 2:
                        Window.bonnie = 3;
                        BonnieTimer = 0;
                        break;
                    case 3:
                        Window.bonnie = 4;
                        BonnieTimer = 0;
                        break;
                    case 4:
                        Window.bonnie = 5;
                        BonnieTimer = 0;
                        break;
                    case 5:
                        Window.bonnie = 6;
                        BonnieTimer = 0;
                        break;
                    case 6:
                        Window.bonnie = 7;
                        BonnieTimer = 0;
                        break;
                    case 7:
                        Window.bonnie = 8;
                        BonnieTimer = 0;
                        break;
                    case 8:
                        Window.bonnie = 9;
                        BonnieTimer = 0;
                        break;
                    case 9:
                        Window.bonnie = 10;
                        BonnieTimer = 0;
                        break;
                    case 10:
                        Window.bonnie = 11;
                        BonnieTimer = 0;
                        break;
                    case 11:
                        Window.bonnie = 0;
                        Main.death = true;
                        BonnieTimer = 0;
                        break;
                }
            }
        }
    }
}