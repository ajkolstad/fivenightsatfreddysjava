public class Office {
	public static boolean light1on = false;
	public static boolean light2on = false;
	public static boolean door1open = true;
	public static boolean door2open = true;
	public static boolean monitorUp = false;
	public static double powerRemaining = 100;
	public static int devicedUsed;

	static double getPower() {
		return powerRemaining;
	}

	public static int getUsage() {
		int usage = 0;
		if (light1on == true) {
			usage = usage + 1;
		}
		if (light2on == true) {
			usage = usage + 1;
		}
		if (door1open == false) {
			usage = usage + 1;
		}
		if (door2open == false) {
			usage = usage + 1;
		}
		if (monitorUp == true) {
			usage = usage + 1;
		}
		return usage;
	}

	static void descreasepower() {
		if (devicedUsed == 0) {
			powerRemaining = powerRemaining - .5;
		}
		if (devicedUsed == 1) {
			powerRemaining = powerRemaining - 1;
		}
		if (devicedUsed == 2) {
			powerRemaining = powerRemaining - 2;
		}
		if (devicedUsed == 3) {
			powerRemaining = powerRemaining - 4;
		}
		if (devicedUsed == 4) {
			powerRemaining = powerRemaining - 5;
		}
		if (devicedUsed == 5) {
			powerRemaining = powerRemaining - 6;
		}
	}
}
