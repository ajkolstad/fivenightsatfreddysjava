import java.awt.event.MouseEvent;

public class InitializeGame {
    public InitializeGame() {
    }

    public void mouseClicked(MouseEvent e) {
        if (!Window.startGame && e.getX() >= 100 && e.getX() <= 310
                && e.getY() >= 400 && e.getY() <= 450) {
            Window.startClicked = true;
        }
        if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 383 && e.getY() <= 437
                && !Office.light1on) {
            Office.light1on = true;
            Window.light.play();
        } else if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 383 && e.getY() <= 437
                && Office.light1on) {
            Office.light1on = false;
            Window.light.stop();
        }
        if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246
                && e.getY() >= 383 && e.getY() <= 437
                && !Office.light2on) {
            Office.light2on = true;
            Window.light.play();
        } else if (Window.startGame && e.getX() >= 1212
                && e.getX() <= 1246 && e.getY() >= 383 && e.getY() <= 437
                && Office.light2on) {
            Office.light2on = false;
            Window.light.stop();
        }
        if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 300 && e.getY() <= 357
                && Office.door1open) {
            Office.door1open = false;
            Window.door.play();
        } else if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 300 && e.getY() <= 357
                && !Office.door1open) {
            Office.door1open = true;
            Window.door.play();
        }
        if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246
                && e.getY() >= 300 && e.getY() <= 357
                && Office.door2open) {
            Office.door2open = false;
            Window.door.play();
        } else if (Window.startGame && e.getX() >= 1212
                && e.getX() <= 1246 && e.getY() >= 300 && e.getY() <= 357
                && !Office.door2open) {
            Office.door2open = true;
            Window.door.play();
        }
        if (Office.monitorUp) {
            if (e.getX() >= 923 && e.getX() <= 973 && e.getY() >= 343
                    && e.getY() <= 377) {
                Window.cameraLocation = "Show Stage";
                Window.blip.play();
            }
            if (e.getX() >= 904 && e.getX() <= 954 && e.getY() >= 399
                    && e.getY() <= 433) {
                Window.cameraLocation = "Dining Area";
                Window.blip.play();
            }
            if (e.getX() >= 877 && e.getX() <= 927 && e.getY() >= 481
                    && e.getY() <= 515) {
                Window.cameraLocation = "Pirate Cove";
                Window.blip.play();
            }
            if (e.getX() >= 926 && e.getX() <= 976 && e.getY() >= 596
                    && e.getY() <= 630) {
                Window.cameraLocation = "West Hall A";
                Window.blip.play();
            }
            if (e.getX() >= 926 && e.getX() <= 976 && e.getY() >= 631
                    && e.getY() <= 665) {
                Window.cameraLocation = "West Hall B";
                Window.blip.play();
            }
            if (e.getX() >= 850 && e.getX() <= 900 && e.getY() >= 578
                    && e.getY() <= 612) {
                Window.cameraLocation = "Supply Closet";
                Window.blip.play();
            }
            if (e.getX() >= 1034 && e.getX() <= 1084 && e.getY() >= 596
                    && e.getY() <= 630) {
                Window.cameraLocation = "East Hall A";
                Window.blip.play();
            }
            if (e.getX() >= 1034 && e.getX() <= 1084 && e.getY() >= 631
                    && e.getY() <= 665) {
                Window.cameraLocation = "East Hall B";
                Window.blip.play();
            }
            if (e.getX() >= 796 && e.getX() <= 846 && e.getY() >= 431
                    && e.getY() <= 465) {
                Window.cameraLocation = "Backstage";
                Window.blip.play();
            }
            if (e.getX() >= 1146 && e.getX() <= 1196 && e.getY() >= 436
                    && e.getY() <= 470) {
                Window.cameraLocation = "Restrooms";
                Window.blip.play();
            }
        }
    }
}