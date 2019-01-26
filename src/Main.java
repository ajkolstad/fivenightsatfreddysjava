import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Main implements Runnable, MouseListener, MouseMotionListener {

	public static int limit = 200;
	public static int timer = 3000;
	public static boolean isReversed = false;
	public static int FoxyTimer = 0;
	public static int newsTimer = 0;
	public static int powerOutTimer = 0;
	public static int monitorTimer = 0;
	public static int BonnieTick = 0;
	public static int ChickaTick = 0;
	public static int FreddyTick = 0;
	public static int FoxyTick = 0;
	public static boolean monitorTransition = false;
	public static int movementRepeater = 0;
	public static int staticTimer = 0;
	public static boolean death = false;
	public static boolean canMove = false;
	public static boolean move = false;
	public static int deathTimer = 0;
	public static boolean foxyTime = false;
	public static int foxyTimeTimer = 0;
	public static boolean deather = false;
	public static int mouseX;
	public static int gameTimer = 0;
	public static boolean gameWin = false;
	public static int mouseY;
	public static int powerTick;
	public static int gameWinTimer = 0;
	private final InitializeGame initializeGame = new InitializeGame();
	private final BonnieInitialize bonnieInitialize = new BonnieInitialize();
	private final FreddyInitialize freddyInitialize = new FreddyInitialize();
	private final FoxyInitialize foxyInitialize = new FoxyInitialize();
	private final ChickaInitialize chickaInitialize = new ChickaInitialize();
	JFrame frame = new JFrame();
	public int StaticTimer = 0;

	public static void main(String[] args) {
		Main main = new Main();
		Thread thread = new Thread(main);
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
				if (death == true) {
					Window.needStatic = true;
					if (deathTimer < 1000) {
						deathTimer++;
					}
					if (deathTimer > 0 && deathTimer < 200) {
						Window.needStatic = true;
					} else {
						Window.needStatic = false;
						deather = true;
					}
					if (deathTimer == 1000) {
						death = false;
						Window.startGame = false;
						limit = 200;
						timer = 3000;
						isReversed = false;
						FoxyTimer = 0;
						FoxyInitialize.FoxTimer = 0;
						FreddyInitialize.FreddyTimer = 0;
						BonnieInitialize.BonnieTimer = 0;
						ChickaInitialize.ChickaTimer = 0;
						newsTimer = 0;
						powerOutTimer = 0;
						monitorTimer = 0;
						BonnieTick = 0;
						ChickaTick = 0;
						FreddyTick = 0;
						FoxyTick = 0;
						monitorTransition = false;
						movementRepeater = 0;
						staticTimer = 0;
						death = false;
						canMove = false;
						move = false;
						deathTimer = 0;
						foxyTime = false;
						foxyTimeTimer = 0;
						deather = false;
						gameTimer = 0;
						gameWin = false;
						gameWinTimer = 0;
						
						Window.needToMove = true;
						Window.needStatic = false;
						Window.Static = 1;
						Window.startGame = false;
						Window.startClicked = false;
						Window.cameraLocation = "Show Stage";
						Window.officeView = -100;
						Window.Fox = 1;
						Window.bonnie = 1;
						Window.foxdie = 1;
						Window.freddie = 1;
						Window.chicka = 1;
						Window.powerOut = 1;
						
						Bonnie.inRoom = 0;
						Bonnie.playerdeath = false;
						
						Chicka.inRoom = 0;
						Chicka.playerdeath = false;
						
						Freddy.inRoom = 0;
						Freddy.playerdeath = false;
						
						Foxy.stage = 0;
						
						Office.light1on = false;
						Office.light2on = false;
						Office.door1open = true;
						Office.door2open = true;
						Office.monitorUp = false;
						Office.powerRemaining = 100;
					}
				}
				if(Window.startGame == true) {
					if(gameTimer < 27000) {
						gameTimer++;
					}
					if(gameTimer == 27000) {
						gameWin = true;
					}
				}
				if(gameWin == true) {
					if(gameWinTimer < 700) {
						gameWinTimer++;
					}
					if(gameWinTimer == 700) {
						gameWin = false;
						Window.startGame = false;
						limit = 200;
						timer = 3000;
						isReversed = false;
						FoxyTimer = 0;
						FoxyInitialize.FoxTimer = 0;
						FreddyInitialize.FreddyTimer = 0;
						BonnieInitialize.BonnieTimer = 0;
						ChickaInitialize.ChickaTimer = 0;
						newsTimer = 0;
						powerOutTimer = 0;
						monitorTimer = 0;
						BonnieTick = 0;
						ChickaTick = 0;
						FreddyTick = 0;
						FoxyTick = 0;
						monitorTransition = false;
						movementRepeater = 0;
						staticTimer = 0;
						death = false;
						canMove = false;
						move = false;
						deathTimer = 0;
						foxyTime = false;
						foxyTimeTimer = 0;
						deather = false;
						gameTimer = 0;
						gameWin = false;
						gameWinTimer = 0;
						
						Window.needToMove = true;
						Window.needStatic = false;
						Window.Static = 1;
						Window.startGame = false;
						Window.startClicked = false;
						Window.cameraLocation = "Show Stage";
						Window.officeView = -100;
						Window.Fox = 1;
						Window.bonnie = 1;
						Window.foxdie = 1;
						Window.freddie = 1;
						Window.chicka = 1;
						Window.powerOut = 1;
						
						Bonnie.inRoom = 0;
						Bonnie.playerdeath = false;
						
						Chicka.inRoom = 0;
						Chicka.playerdeath = false;
						
						Freddy.inRoom = 0;
						Freddy.playerdeath = false;
						
						Foxy.stage = 0;
						
						Office.light1on = false;
						Office.light2on = false;
						Office.door1open = true;
						Office.door2open = true;
						Office.monitorUp = false;
						Office.powerRemaining = 100;
					}
				}
				if(foxyTime == true) {
					if(foxyTimeTimer < 50) {
						foxyTimeTimer++;
					}
					if(foxyTimeTimer == 50) {
						if(Office.door1open == true) {
							Foxy.playerdeath = true;
						} else {
							Window.knock.play();
							Foxy.stage = 1;
							foxyTime = false;
						}
					}
				}
				if (Window.needToMove) {
					if (Window.cameraPosition == 0 && timer == 2000) {
						isReversed = false;
						timer = 0;
					}
					if (Window.cameraPosition == limit && timer == 2000) {
						isReversed = true;
						timer = 0;
					}
					if (isReversed == false && Window.cameraPosition < limit) {
						Window.cameraPosition++;
						timer = 0;
					}
					if (isReversed == true && Window.cameraPosition > 0) {
						Window.cameraPosition--;
						timer = 0;
					}
					if (Window.cameraPosition == 0 && timer != 2000) {
						timer += 10;
					}
					if (Window.cameraPosition == limit && timer != 2000) {
						timer += 10;
					}
				}
				setAnimatronic();
				if (move == true && canMove == true) {
					if (mouseX < 400 && !(Window.officeView + 5 > 0)) {
						Window.officeView = Window.officeView + 5;
					} else if (mouseX > 880 && (Window.officeView - 5 > -300)) {
						Window.officeView = Window.officeView - 5;
					}
					move = false;
				}

				if (move == false) {
					if (movementRepeater < 1) {
						movementRepeater++;
					}
					if (movementRepeater == 1) {
						move = true;
						movementRepeater = 0;
					}
				}
				if (monitorTransition == true) {
					if (monitorTimer < 20) {
						monitorTimer++;
					}
					if (monitorTimer == 20) {
						monitorTransition = false;

					}
				}
				chickaInitialize.Chicka();
				foxyInitialize.Foxy();
				if(Office.monitorUp == true && Window.cameraLocation.equals("West Hall A")) {
				if (FoxyTimer < 4) {
					FoxyTimer++;
				}
				if (FoxyTimer == 4) {
					switch (Window.Fox) {
					case 1:
						Window.Fox = 2;
						FoxyTimer = 0;
						break;
					case 2:
						Window.Fox = 3;
						FoxyTimer = 0;
						break;
					case 3:
						Window.Fox = 4;
						FoxyTimer = 0;
						break;
					case 4:
						Window.Fox = 5;
						FoxyTimer = 0;
						break;
					case 5:
						Window.Fox = 6;
						FoxyTimer = 0;
						break;
					case 6:
						Window.Fox = 7;
						FoxyTimer = 0;
						break;
					case 7:
						Window.Fox = 8;
						FoxyTimer = 0;
						break;
					case 8:
						Window.Fox = 9;
						FoxyTimer = 0;
						break;
					case 9:
						Window.Fox = 10;
						FoxyTimer = 0;
						break;
					case 10:
						Window.Fox = 11;
						FoxyTimer = 0;
						break;
					case 11:
						Window.Fox = 12;
						FoxyTimer = 0;
						break;
					case 12:
						Window.Fox = 13;
						FoxyTimer = 0;
						break;
					case 13:
						Window.Fox = 14;
						FoxyTimer = 0;
						break;
					case 14:
						Window.Fox = 15;
						FoxyTimer = 0;
						break;
					case 15:
						Window.Fox = 16;
						FoxyTimer = 0;
						break;
					case 16:
						Window.Fox = 17;
						FoxyTimer = 0;
						break;
					case 17:
						Window.Fox = 18;
						FoxyTimer = 0;
						break;
					case 18:
						Window.Fox = 19;
						FoxyTimer = 0;
						break;
					case 19:
						Window.Fox = 20;
						FoxyTimer = 0;
						break;
					case 20:
						Window.Fox = 21;
						FoxyTimer = 0;
						break;
					case 21:
						Window.Fox = 22;
						FoxyTimer = 0;
						break;
					case 22:
						Window.Fox = 23;
						FoxyTimer = 0;
						break;
					case 23:
						Window.Fox = 24;
						FoxyTimer = 0;
						break;
					case 24:
						Window.Fox = 25;
						FoxyTimer = 0;
						break;
					case 25:
						Window.Fox = 26;
						FoxyTimer = 0;
						break;
					case 26:
						Window.Fox = 27;
						FoxyTimer = 0;
						break;
					case 27:
						Window.Fox = 28;
						FoxyTimer = 0;
						break;
					case 28:
						Window.Fox = 29;
						FoxyTimer = 0;
						break;
					case 29:
						Window.Fox = 30;
						FoxyTimer = 0;
						break;
					case 30:
						Window.Fox = 31;
						FoxyTimer = 0;
						break;
					case 31:
						Office.monitorUp = false;
						Main.foxyTime = true;
						Window.Fox = 0;
						FoxyTimer = 0;
						break;
					}
				}
				}
				bonnieInitialize.Bonnie();
				freddyInitialize.Freddy();
				NoPower();
				if (StaticTimer < 6) {
					StaticTimer++;
				}
				if (StaticTimer == 6) {
					switch (Window.Static) {
					case 1:
						Window.Static = 2;
						StaticTimer = 0;
						break;
					case 2:
						Window.Static = 3;
						StaticTimer = 0;
						break;
					case 3:
						Window.Static = 4;
						StaticTimer = 0;
						break;
					case 4:
						Window.Static = 5;
						StaticTimer = 0;
						break;
					case 5:
						Window.Static = 6;
						StaticTimer = 0;
						break;
					case 6:
						Window.Static = 7;
						StaticTimer = 0;
						break;
					case 7:
						Window.Static = 8;
						StaticTimer = 0;
						break;
					case 8:
						Window.Static = 1;
						StaticTimer = 0;
						break;
					}
				}
				if (Window.startClicked == true) {
					if (newsTimer < 500) {
						newsTimer++;
					}
					if (newsTimer == 500) {
						newsTimer = 0;
						Window.startGame = true;
						Window.startClicked = false;
						Window.blip.play();
					}

				}
				if (Window.startGame == true) {
					if (powerTick < 100) {
						powerTick++;
					}
					if (powerTick == 100) {
						Office.descreasepower();
						powerTick = 0;
					}
				}
			} catch (Exception a) {
				a.printStackTrace();
			}
		}
	}

	private void setAnimatronic() {
		if (Window.startGame == true) {
			if (BonnieTick < 1000) {
				BonnieTick++;
			}
			if (BonnieTick == 1000) {
				Bonnie.tick();
				BonnieTick = 0;

			}
			if (ChickaTick < 1300) {
				ChickaTick++;
			}
			if (ChickaTick == 1300) {
				Chicka.tick();
				ChickaTick = 0;

			}
			if (FreddyTick < 1700) {
				FreddyTick++;
			}
			if (FreddyTick == 1700) {
				Freddy.tick();
				FreddyTick = 0;

			}
			if (FoxyTick < 1900) {
				FoxyTick++;
			}
			if (FoxyTick == 1900) {
				Foxy.tick();
				FoxyTick = 0;

			}
		}
	}

	private void NoPower() {
		if (Office.powerRemaining == 0) {
			if (powerOutTimer < 4) {
				powerOutTimer++;
			}
			if (powerOutTimer == 4) {
				switch (Window.powerOut) {
				case 1:
					Window.powerOut = 2;
					powerOutTimer = 0;
					break;
				case 2:
					Window.powerOut = 3;
					powerOutTimer = 0;
					break;
				case 3:
					Window.powerOut = 4;
					powerOutTimer = 0;
					break;
				case 4:
					Window.powerOut = 5;
					powerOutTimer = 0;
					break;
				case 5:
					Window.powerOut = 6;
					powerOutTimer = 0;
					break;
				case 6:
					Window.powerOut = 7;
					powerOutTimer = 0;
					break;
				case 7:
					Window.powerOut = 8;
					powerOutTimer = 0;
					break;
				case 8:
					Window.powerOut = 9;
					powerOutTimer = 0;
					break;
				case 9:
					Window.powerOut = 10;
					powerOutTimer = 0;
					break;
				case 10:
					Window.powerOut = 11;
					powerOutTimer = 0;
					break;
				case 11:
					Window.powerOut = 12;
					powerOutTimer = 0;
					break;
				case 12:
					Window.powerOut = 13;
					powerOutTimer = 0;
					break;
				case 13:
					Window.powerOut = 14;
					powerOutTimer = 0;
					break;
				case 14:
					Window.powerOut = 15;
					powerOutTimer = 0;
					break;
				case 15:
					Window.powerOut = 16;
					powerOutTimer = 0;
					break;
				case 16:
					Window.powerOut = 17;
					powerOutTimer = 0;
					break;
				case 17:
					Window.powerOut = 18;
					powerOutTimer = 0;
					break;
				case 18:
					Window.powerOut = 19;
					powerOutTimer = 0;
					break;
				case 19:
					Window.powerOut = 20;
					powerOutTimer = 0;
					break;
				case 20:
					Office.powerRemaining = -1;
					Window.powerOut = 0;
					powerOutTimer = 0;
					break;
				}
			}
		}
	}

	private void Bonnie() {
		bonnieInitialize.Bonnie();
	}

	private void Freddy() {
		freddyInitialize.Freddy();
	}

	private void Foxy() {
		foxyInitialize.Foxy();
	}

	private void Chicka() {
		chickaInitialize.Chicka();
	}

	public Main() {
		Window window = new Window();
		window.addMouseListener(this);
		window.addMouseMotionListener(this);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		initializeGame.mouseClicked(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		monitorTransition(e);
	}

	private void monitorTransition(MouseEvent e) {
		if (Window.startGame == true && Office.monitorUp == false
				&& monitorTransition == false && Freddy.playerdeath == false && Bonnie.playerdeath == false && Chicka.playerdeath == false && Foxy.playerdeath == false) {
			if (Window.officeView >= -300 && Window.officeView <= 0
					&& (e.getX() < 400 || e.getX() > 880)) {
				canMove = true;
			} else {
				canMove = false;
			}
			if (e.getX() > 360 && e.getY() > 660 && e.getX() < 860 && Freddy.playerdeath == false && Bonnie.playerdeath == false && Chicka.playerdeath == false && Foxy.playerdeath == false) {
				Office.monitorUp = true;
				Window.blip.play();
				monitorTransition = true;
				monitorTimer = 0;
			}
		}

		if (Window.startGame == true && Office.monitorUp == true
				&& monitorTransition == false) {
			if (e.getX() > 360 && e.getY() > 660 && e.getX() < 860) {
				Office.monitorUp = false;
				Window.blip.play();
				monitorTransition = true;
				monitorTimer = 0;
			}
		}
		mouseX = e.getX();
		mouseY = e.getY();
	}
}
