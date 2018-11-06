public class Chicka {
	static int inRoom = 0;
	private static int Difficulty;
	public static boolean playerdeath = false;

	public void Chicka(int Diffuculty) {
		this.Difficulty = Difficulty;
	}

	public static int isInRoom() {
		return inRoom;
	}

	public static void tick() {
		if (inRoom == 8 && Office.door2open == true && Office.monitorUp == true) {
			inRoom = 9;
			playerdeath = true;
			return;
		}
		int rand1 = 1 + (int) (Math.random() * Difficulty);
		if (rand1 == Difficulty) {
			return;
		} else {
			int rand2 = 1 + (int) (Math.random() * 8);
			if (rand2 >= 4) {
				if (rand2 >= inRoom) {
					if (Bonnie.inRoom == inRoom + 1
							|| Freddy.inRoom == inRoom + 1) {
						return;
					} else {
						if (inRoom + 1 > 8) {
							return;
						} else {
							inRoom = 1 + inRoom;
						}
					}
				} else {
					return;
				}
			} else {
				if (rand2 >= inRoom) {
					if (Bonnie.inRoom == inRoom + 1
							|| Freddy.inRoom == inRoom + 1) {
						return;
					} else {
						if (inRoom + 1 > 8) {
							return;
						} else {
							inRoom = inRoom + 1;
						}
					}
				} else {
					if (rand2 == inRoom) {
						if (Bonnie.inRoom == inRoom + 1
								|| Freddy.inRoom == inRoom + 1) {
							return;
						} else {
							inRoom = inRoom - 1;
						}
						return;
					}
					return;
				}
			}
		}
	}
}
