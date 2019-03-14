import javax.sound.sampled.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class InitializeGame {
    AudioInputStream audioIn;
    public InitializeGame() {
    }

    public void mouseClicked(MouseEvent e) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        if (!Window.startGame && e.getX() >= 100 && e.getX() <= 310
                && e.getY() >= 400 && e.getY() <= 450) {
            Window.startClicked = true;
        }
        if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 383 && e.getY() <= 437
                && !Office.light1on) {
            Office.light1on = true;
            playSound(Window.light);
        } else if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 383 && e.getY() <= 437
                && Office.light1on) {
            Office.light1on = false;
        }
        if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246
                && e.getY() >= 383 && e.getY() <= 437
                && !Office.light2on) {
            Office.light2on = true;
            playSound(Window.light);
        } else if (Window.startGame && e.getX() >= 1212
                && e.getX() <= 1246 && e.getY() >= 383 && e.getY() <= 437
                && Office.light2on) {
            Office.light2on = false;
        }
        if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 300 && e.getY() <= 357
                && Office.door1open) {
            Office.door1open = false;
        } else if (Window.startGame && e.getX() >= 30 && e.getX() <= 68
                && e.getY() >= 300 && e.getY() <= 357
                && !Office.door1open) {
            Office.door1open = true;
            playSound(Window.door);
        }
        if (Window.startGame && e.getX() >= 1212 && e.getX() <= 1246
                && e.getY() >= 300 && e.getY() <= 357
                && Office.door2open) {
            Office.door2open = false;
            playSound(Window.door);
        } else if (Window.startGame && e.getX() >= 1212
                && e.getX() <= 1246 && e.getY() >= 300 && e.getY() <= 357
                && !Office.door2open) {
            Office.door2open = true;
            playSound(Window.door);
        }
        if (Office.monitorUp) {
            if (e.getX() >= 923 && e.getX() <= 973 && e.getY() >= 343
                    && e.getY() <= 377) {
                Window.cameraLocation = "Show Stage";
                playSound(Window.blip);
            }
            if (e.getX() >= 904 && e.getX() <= 954 && e.getY() >= 399
                    && e.getY() <= 433) {
                Window.cameraLocation = "Dining Area";
                playSound(Window.blip);
            }
            if (e.getX() >= 877 && e.getX() <= 927 && e.getY() >= 481
                    && e.getY() <= 515) {
                Window.cameraLocation = "Pirate Cove";
                playSound(Window.blip);
            }
            if (e.getX() >= 926 && e.getX() <= 976 && e.getY() >= 596
                    && e.getY() <= 630) {
                Window.cameraLocation = "West Hall A";
                playSound(Window.blip);
            }
            if (e.getX() >= 926 && e.getX() <= 976 && e.getY() >= 631
                    && e.getY() <= 665) {
                Window.cameraLocation = "West Hall B";
                playSound(Window.blip);
            }
            if (e.getX() >= 850 && e.getX() <= 900 && e.getY() >= 578
                    && e.getY() <= 612) {
                Window.cameraLocation = "Supply Closet";
                playSound(Window.blip);
            }
            if (e.getX() >= 1034 && e.getX() <= 1084 && e.getY() >= 596
                    && e.getY() <= 630) {
                Window.cameraLocation = "East Hall A";
                playSound(Window.blip);
            }
            if (e.getX() >= 1034 && e.getX() <= 1084 && e.getY() >= 631
                    && e.getY() <= 665) {
                Window.cameraLocation = "East Hall B";
                playSound(Window.blip);
            }
            if (e.getX() >= 796 && e.getX() <= 846 && e.getY() >= 431
                    && e.getY() <= 465) {
                Window.cameraLocation = "Backstage";
                playSound(Window.blip);
            }
            if (e.getX() >= 1146 && e.getX() <= 1196 && e.getY() >= 436
                    && e.getY() <= 470) {
                Window.cameraLocation = "Restrooms";
                playSound(Window.blip);
            }
        }
    }

    public void playSound(String fileName) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File f = new File(fileName);
        audioIn = AudioSystem.getAudioInputStream((f.toURI().toURL()));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
    }

    public String testCamera(int x, int y) {
        String ret = "nothing";
        if (x >= 923 && x <= 973 && y >= 343
                && y <= 377) {
            ret =  "Show Stage";
            
        }
        if (x >= 904 && x <= 954 && y >= 399
                && y <= 433) {
            ret =  "Dining Area";
            
        }
        if (x >= 877 && x <= 927 && y >= 481
                && y <= 515) {
            ret =  "Pirate Cove";
            
        }
        if (x >= 926 && x <= 976 && y >= 596
                && y <= 630) {
            ret =  "West Hall A";
            
        }
        if (x >= 926 && x <= 976 && y >= 631
                && y <= 665) {
            ret =  "West Hall B";
            
        }
        if (x >= 850 && x <= 900 && y >= 578
                && y <= 612) {
            ret =  "Supply Closet";
            
        }
        if (x >= 1034 && x <= 1084 && y >= 596
                && y <= 630) {
            ret =  "East Hall A";
            
        }
        if (x >= 1034 && x <= 1084 && y >= 631
                && y <= 665) {
            ret =  "East Hall B";
            
        }
        if (x >= 796 && x <= 846 && y >= 431
                && y <= 465) {
            ret =  "Backstage";
            
        }
        if (x >= 1146 && x <= 1196 && y >= 436
                && y <= 470) {
            ret =  "Restrooms";
        }
        return ret;
    }
    public String testSounds(int x, int y) {
        String ret = "nothing";
        if (x >= 30 && x <= 68
                && y >= 383 && y <= 437
                ) {
            ret = "light";
        }
        if (x >= 1212 && x <= 1246
                && y >= 383 && y <= 437
                ) {
            ret = "light";
        }
        if (x >= 30 && x <= 68
                && y >= 300 && y <= 357) {
            ret = "door";
        }
        if (x >= 1212 && x <= 1246
                && y >= 300 && y <= 357
                ) {
            ret = "door";
        }
        return ret;
    }

    public void testStartGame(int x, int y){
        if(x >= 100 && x <= 310 && y >= 400 && y <= 450){
            Window.startClicked = true;
        }
        else{
            Window.startClicked = false;
        }
    }

    public void testLight1(Office o, int x, int y){
        if(!o.light1on && x >= 30 && x <= 68 && y >= 383 && y <= 437){
            o.light1on = true;
        }
    }

    public void testLight1Off(Office o, int x, int y){
        if (o.light1on && x >= 30 && x <= 68 && y >= 383 && y <= 437){
            o.light1on = false;
        }
    }

    public void testLight2(Office o, int x, int y){
        if(!o.light2on && x >= 1212 && x <= 1246 && y >= 383 && y <= 437){
            o.light2on = true;
        }
    }

    public void testLight2Off(Office o, int x, int y){
        if (o.light2on && x >= 1212 && x <= 1246 && y >= 383 && y <= 437){
            o.light2on = false;
        }
    }

    public void testDoor1(Office o, int x, int y){
        if(!o.door1open && x >= 30 && x <= 68 && y >= 300 && y <= 357){
            o.door1open = true;
        }
    }

    public void testDoor1Off(Office o, int x, int y){
        if (o.door1open && x >= 30 && x <= 68 && y >= 300 && y <= 357){
            o.door1open = false;
        }
    }

    public void testDoor2(Office o, int x, int y){
        if(!o.door2open && x >= 1212 && x <= 1246 && y >= 300 && y <= 357){
            o.door2open = true;
        }
    }

    public void testDoor2Off(Office o, int x, int y){
        if (o.door2open && x >= 1212 && x <= 1246 && y >= 300 && y <= 357){
            o.door2open = false;
        }
    }

    public String testCamera2(int x, int y){
        if (x >= 923 && x <= 973 && y >= 343 && y <= 377) {
            return "Show Stage";
        }
        if (x >= 904 && x <= 954 && y >= 399 && y <= 433) {
            return "Dining Area";
        }
        if (x >= 877 && x <= 927 && y >= 481 && y <= 515) {
            return "Pirate Cove";
        }
        if (x >= 926 && x <= 976 && y >= 596 && y <= 630) {
            return "West Hall A";
        }
        if (x >= 926 && x <= 976 && y >= 631 && y <= 665) {
            return "West Hall B";
        }
        if (x >= 850 && x <= 900 && y >= 578 && y <= 612) {
            return "Supply Closet";
        }
        if (x >= 1034 && x <= 1084 && y >= 596 && y <= 630) {
            return "East Hall A";
        }
        if (x >= 1034 && x <= 1084 && y >= 631 && y <= 665) {
            return "East Hall B";
        }
        if (x >= 796 && x <= 846 && y >= 431 && y <= 465) {
            return "Backstage";
        }
        if (x >= 1146 && x <= 1196 && y >= 436 && y <= 470) {
            return "Restrooms";
        }
        return "nothing";
    }
}