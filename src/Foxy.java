import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Foxy {

	private int Difficulty;
	static int stage = 0;
	private boolean seen;
	private double startTime;
	public static boolean playerdeath = false;
	static AudioInputStream audioIn;

	private void foxy(int difficulty) {
		this.Difficulty = difficulty;
	}

	public static void tick() {
		if (Office.monitorUp == true && Window.cameraLocation == "Pirate Cove") {
			return;
		} else {
			if (stage != 3) {
				stage = stage + 1;
			} else {
				if (Office.door1open == false) {
					stage = 1;
					try {
						Window.playSound(Window.knock);
					} catch (LineUnavailableException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} catch (UnsupportedAudioFileException e) {
						e.printStackTrace();
					}
				} else {
					playerdeath = true;
				}
			}
		}
	}

	static int getStage() {
		return stage;
	}
}
