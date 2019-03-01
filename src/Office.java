public class Office {
	public static boolean light1on = false;
	public static boolean light2on = false;
	public static boolean door1open = true;
	public static boolean door2open = true;
	public static boolean monitorUp = false;
	public static double powerRemaining = 100;
	public static int devicedUsed;


	public Office(){
		light1on = false;
		light2on = false;
		door1open = true;
		door2open = true;
		monitorUp = false;
		powerRemaining = 100;
		devicedUsed = 0;
	}

	public static void setMonitorUp(Boolean MonitorUp){
		monitorUp = MonitorUp;
	}

	public static boolean getMonitorUp(){
		return monitorUp;
	}

	static double getPower() {
		return powerRemaining;
	}

	public static void setLight1On(boolean light1On){
		light1on = light1On;
	}

	public static boolean getLight1On(){
		return light1on;
	}

	public static void setLight2On(boolean light2On){
		light2on = light2On;
	}

	public static boolean getLight2On(){
		return light2on;
	}

	public static void setDoor1Open(boolean door1Open){
		door1open = door1Open;
	}

	public static boolean getDoor1Open(){
		return door1open;
	}

	public static void setDoor2Open(boolean door2Open){
		door2open = door2Open;
	}

	public static boolean getDoor2Open(){
		return door2open;
	}

	public static void setPowerRemaining(double PowerRemaining){
		powerRemaining = PowerRemaining;
	}

	public static void setDevicedUsed(int DevicedUsed){
		devicedUsed = DevicedUsed;
	}

	public static int getDeviceUsed(){
		return devicedUsed;
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
