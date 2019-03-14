import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.image.*;
import java.io.*;

public class Window extends JFrame { //A ton of variable declarations

	public static boolean needToMove = true;
	public static boolean needStatic = false;
	public static Dimension screenSize = Toolkit.getDefaultToolkit()
			.getScreenSize();
	public static double Width = screenSize.getWidth();
	public static double Height = screenSize.getHeight();
	public static int cameraPosition;
	public static int Static = 1;
	public static boolean startGame = false;
	public static boolean startClicked = false;
	public static String cameraLocation = "Show Stage";
	public static boolean ifloading = true;
	public static int officeView = -100;
	private Image Image;
	public static int Fox = 1;
	public static int bonnie = 1;
	public static int foxdie = 1;
	public static int freddie = 1;
	public static int chicka = 1;
	public static int powerOut = 1;
	public static boolean mainmenumusicplaying = false;
	public static boolean gamemusicplaying = false;
	public static boolean screamplay = false;
	private Graphics Graphic;
	static String blip = "./bin/blip.wav";
	static String knock = "./bin/FoxyKnock.wav";
	static String run = "./bin/FoxyRun.wav";
	static String scream = "./bin/XSCREAM.wav";
	static String ambiance1 = "./bin/Ambiance1.wav";
	static String ambiance2 = "./bin/Ambiance2.wav";
	//static String ambiance3 = "Ambiance3.wav";
	static String light;
	static String door = "./bin/Door.wav";
	static String main1 = "./bin/MainMenu1.wav";
	static String main2 = "./bin/MainMenu2.wav";
	BufferedImage stage;
	static AudioInputStream audioIn;
	//BufferedImage currentView;
	BufferedImage bonnie1, bonnie2, bonnie3, bonnie4, bonnie5, bonnie6,
			bonnie7, bonnie8, bonnie9, bonnie10, bonnie11, chicka1, chicka2,
			chicka3, chicka4, chicka5, chicka6, chicka7, chicka8, chicka9,
			chicka10, chicka11, chicka12, chicka13, chicka14, chicka15,
			chicka16, foxy1, foxy2, foxy3, foxy4, foxy5, foxy6, foxy7, foxy8,
			foxy9, foxy10, foxy11, foxy12, foxy13, foxy14, foxy15, foxy16,
			foxy17, foxy18, foxy19, freddy1, freddy2, freddy3, freddy4,
			freddy5, freddy6, freddy7, freddy8, freddy9, freddy10, freddy11,
			freddy12, freddy13, freddy14, freddy15, freddy16, freddy17,
			freddy18, freddy19, freddy20, freddy21, freddy22, freddy23,
			freddy24, freddy25, freddy26, freddy27, freddy28, freddy29,
			powerout1, powerout2, powerout3, powerout4, powerout5, powerout6,
			powerout7, powerout8, powerout9, powerout10, powerout11,
			powerout12, powerout13, powerout14, powerout15, powerout16,
			powerout17, powerout18, powerout19, powerout20, powerout21,
			foxrun1, foxrun2, foxrun3, foxrun4, foxrun5, foxrun6, foxrun7,
			foxrun8, foxrun9, foxrun10, foxrun11, foxrun12, foxrun13, foxrun14,
			foxrun15, foxrun16, foxrun17, foxrun18, foxrun19, foxrun20,
			foxrun21, foxrun22, foxrun23, foxrun24, foxrun25, foxrun26,
			foxrun27, foxrun28, foxrun29, foxrun30, foxrun31, static1, static2,
			static3, static4, static5, static6, static7, static8, mainMenu,
			mainMenu2, mainMenu3, mainMenu4, stageNoBonnie, stageNoChicka,
			stageNoBonnieChicka, stageFreddyStare, stageNone, diningNone,
			diningBonnieFar, diningBonnieClose, diningChickaFar,
			diningChickaClose, diningFreddy, eastHallAChickaFar,
			eastHallAChickaClose, eastHallAFreddy, eastHallANone,
			eastHallBNone, eastHallBChicka, eastHallBFreddy, backstageNone,
			backstageFar, backstageClose, piratecoveStage0, piratecoveStage1,
			piratecoveStage2, piratecoveStage3, restroomsNone,
			restroomsChickaClose, restroomsChickaFar, restroomsFreddy,
			westHallANone, westHallABonnie, westHallBNone, westHallBBonnie,
			supplyclosetNone, supplyclosetBonnie, fiveNightsLogo, newGameLogo,
			arrows, office, officeLeftLight, officeRightLight, officeBonnie,
			officeChicka, officePowerOut, officePowerOutFreddy, name,
			cameraBar, loading, newspaper, leftNone, leftLight, leftDoor,
			leftBoth, rightNone, rightLight, rightDoor, rightBoth,
			cameraMinimap, A1, B1, C1, A2, B2, Three, A4, B4, Five, Six, blank,
			supplycloset, showstage, piratecove, backstage, diningarea,
			westhall, ehallcorner, whallcorner, restrooms, easthall, use1,
			use2, use3, use4, use5, use, powerleft, percentsign, leftdoor1,
			leftdoor2, leftdoor3, leftdoor4, leftdoor5, leftdoor6, leftdoor7,
			leftdoor8, leftdoor9, leftdoor10, leftdoor11, leftdoor12,
			leftdoor13, rightdoor1, rightdoor2, rightdoor3, rightdoor4,
			rightdoor5, rightdoor6, rightdoor7, rightdoor8, rightdoor9,
			rightdoor10, rightdoor11, rightdoor12, rightdoor13, onehundred,
			ninety, eighty, seventy, sixty, fifty, forty, thirty, twenty, ten,
			zero, lose, win, offline;

	public Window() {//Imports everything and creates the window
		super("Five Nights at Freddy's");
		setSize((int) width(Width), (int) height(Height));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		try {//Imports all images for the game
			offline = ImageIO.read(Window.class.getResource("offline.jpg"));
			loading = ImageIO.read(Window.class.getResource("jump.jpg"));
			lose = ImageIO.read(Window.class.getResource("Lose.png"));
			win = ImageIO.read(Window.class.getResource("StandardWin.png"));
			zero = ImageIO.read(Window.class.getResource("zero.png"));
			ten = ImageIO.read(Window.class.getResource("ten.png"));
			twenty = ImageIO.read(Window.class.getResource("twenty.png"));
			thirty = ImageIO.read(Window.class.getResource("thirty.png"));
			forty = ImageIO.read(Window.class.getResource("forty.png"));
			fifty = ImageIO.read(Window.class.getResource("fifty.png"));
			sixty = ImageIO.read(Window.class.getResource("sixty.png"));
			seventy = ImageIO.read(Window.class.getResource("seventy.png"));
			eighty = ImageIO.read(Window.class.getResource("eighty.png"));
			ninety = ImageIO.read(Window.class.getResource("ninety.png"));
			onehundred = ImageIO.read(Window.class
					.getResource("onehundred.png"));
			supplycloset = ImageIO.read(Window.class.getResource("50.png"));
			showstage = ImageIO.read(Window.class.getResource("54.png"));
			piratecove = ImageIO.read(Window.class.getResource("70.png"));
			backstage = ImageIO.read(Window.class.getResource("71.png"));
			diningarea = ImageIO.read(Window.class.getResource("72.png"));
			westhall = ImageIO.read(Window.class.getResource("74.png"));
			ehallcorner = ImageIO.read(Window.class.getResource("75.png"));
			whallcorner = ImageIO.read(Window.class.getResource("76.png"));
			restrooms = ImageIO.read(Window.class.getResource("77.png"));
			easthall = ImageIO.read(Window.class.getResource("79.png"));
			blank = ImageIO.read(Window.class.getResource("blank.png"));
			leftdoor1 = ImageIO.read(Window.class.getResource("89.png"));
			leftdoor2 = ImageIO.read(Window.class.getResource("91.png"));
			leftdoor3 = ImageIO.read(Window.class.getResource("92.png"));
			leftdoor4 = ImageIO.read(Window.class.getResource("93.png"));
			leftdoor5 = ImageIO.read(Window.class.getResource("94.png"));
			leftdoor6 = ImageIO.read(Window.class.getResource("95.png"));
			leftdoor7 = ImageIO.read(Window.class.getResource("96.png"));
			leftdoor8 = ImageIO.read(Window.class.getResource("97.png"));
			leftdoor9 = ImageIO.read(Window.class.getResource("98.png"));
			leftdoor10 = ImageIO.read(Window.class.getResource("99.png"));
			leftdoor11 = ImageIO.read(Window.class.getResource("100.png"));
			leftdoor12 = ImageIO.read(Window.class.getResource("101.png"));
			leftdoor13 = ImageIO.read(Window.class.getResource("102.png"));
			rightdoor1 = ImageIO.read(Window.class.getResource("106.png"));
			rightdoor2 = ImageIO.read(Window.class.getResource("107.png"));
			rightdoor3 = ImageIO.read(Window.class.getResource("108.png"));
			rightdoor4 = ImageIO.read(Window.class.getResource("109.png"));
			rightdoor5 = ImageIO.read(Window.class.getResource("110.png"));
			rightdoor6 = ImageIO.read(Window.class.getResource("111.png"));
			rightdoor7 = ImageIO.read(Window.class.getResource("112.png"));
			rightdoor8 = ImageIO.read(Window.class.getResource("113.png"));
			rightdoor9 = ImageIO.read(Window.class.getResource("114.png"));
			rightdoor10 = ImageIO.read(Window.class.getResource("115.png"));
			rightdoor11 = ImageIO.read(Window.class.getResource("116.png"));
			rightdoor12 = ImageIO.read(Window.class.getResource("117.png"));
			rightdoor13 = ImageIO.read(Window.class.getResource("118.png"));
			A1 = ImageIO.read(Window.class.getResource("170.png"));
			B1 = ImageIO.read(Window.class.getResource("171.png"));
			C1 = ImageIO.read(Window.class.getResource("177.png"));
			A2 = ImageIO.read(Window.class.getResource("172.png"));
			B2 = ImageIO.read(Window.class.getResource("165.png"));
			Three = ImageIO.read(Window.class.getResource("168.png"));
			A4 = ImageIO.read(Window.class.getResource("169.png"));
			B4 = ImageIO.read(Window.class.getResource("173.png"));
			Five = ImageIO.read(Window.class.getResource("174.png"));
			Six = ImageIO.read(Window.class.getResource("175.png"));
			fiveNightsLogo = ImageIO.read(Window.class.getResource("444.png"));
			newGameLogo = ImageIO.read(Window.class.getResource("448.png"));
			arrows = ImageIO.read(Window.class.getResource("450.png"));
			mainMenu = ImageIO.read(Window.class.getResource("431.png"));
			name = ImageIO.read(Window.class.getResource("433.png"));
			mainMenu2 = ImageIO.read(Window.class.getResource("440.png"));
			mainMenu3 = ImageIO.read(Window.class.getResource("441.png"));
			mainMenu4 = ImageIO.read(Window.class.getResource("539.png"));
			newspaper = ImageIO.read(Window.class.getResource("539.png"));
			office = ImageIO.read(Window.class.getResource("39.png"));
			cameraMinimap = ImageIO.read(Window.class.getResource("145.png"));
			leftNone = ImageIO.read(Window.class.getResource("122.png"));
			leftLight = ImageIO.read(Window.class.getResource("125.png"));
			leftDoor = ImageIO.read(Window.class.getResource("124.png"));
			leftBoth = ImageIO.read(Window.class.getResource("130.png"));
			rightNone = ImageIO.read(Window.class.getResource("134.png"));
			rightDoor = ImageIO.read(Window.class.getResource("135.png"));
			rightLight = ImageIO.read(Window.class.getResource("131.png"));
			rightBoth = ImageIO.read(Window.class.getResource("47.png"));
			officeLeftLight = ImageIO.read(Window.class.getResource("58.png"));
			officeRightLight = ImageIO
					.read(Window.class.getResource("127.png"));
			officeBonnie = ImageIO.read(Window.class.getResource("225.png"));
			officeChicka = ImageIO.read(Window.class.getResource("227.png"));
			officePowerOut = ImageIO.read(Window.class.getResource("304.png"));
			officePowerOutFreddy = ImageIO.read(Window.class
					.getResource("305.png"));
			stage = ImageIO.read(Window.class.getResource("19.png"));
			stageNoBonnie = ImageIO.read(Window.class.getResource("68.png"));
			stageNoChicka = ImageIO.read(Window.class.getResource("223.png"));
			stageNoBonnieChicka = ImageIO.read(Window.class
					.getResource("224.png"));
			stageFreddyStare = ImageIO
					.read(Window.class.getResource("355.png"));
			stageNone = ImageIO.read(Window.class.getResource("484.png"));
			diningNone = ImageIO.read(Window.class.getResource("48.png"));
			diningBonnieFar = ImageIO.read(Window.class.getResource("90.png"));
			diningBonnieClose = ImageIO.read(Window.class
					.getResource("120.png"));
			diningChickaFar = ImageIO.read(Window.class.getResource("215.png"));
			diningChickaClose = ImageIO.read(Window.class
					.getResource("222.png"));
			diningFreddy = ImageIO.read(Window.class.getResource("492.png"));
			eastHallANone = ImageIO.read(Window.class.getResource("67.png"));
			eastHallAChickaFar = ImageIO.read(Window.class
					.getResource("221.png"));
			eastHallAChickaClose = ImageIO.read(Window.class
					.getResource("226.png"));
			eastHallAFreddy = ImageIO.read(Window.class.getResource("487.png"));
			eastHallBNone = ImageIO.read(Window.class.getResource("49.png"));
			eastHallBChicka = ImageIO.read(Window.class.getResource("220.png"));
			eastHallBFreddy = ImageIO.read(Window.class.getResource("486.png"));
			backstageNone = ImageIO.read(Window.class.getResource("83.png"));
			backstageFar = ImageIO.read(Window.class.getResource("205.png"));
			backstageClose = ImageIO.read(Window.class.getResource("555.png"));
			piratecoveStage0 = ImageIO.read(Window.class.getResource("66.png"));
			piratecoveStage1 = ImageIO
					.read(Window.class.getResource("211.png"));
			piratecoveStage2 = ImageIO
					.read(Window.class.getResource("338.png"));
			piratecoveStage3 = ImageIO
					.read(Window.class.getResource("553.png"));
			restroomsNone = ImageIO.read(Window.class.getResource("41.png"));
			restroomsChickaFar = ImageIO.read(Window.class
					.getResource("217.png"));
			restroomsChickaClose = ImageIO.read(Window.class
					.getResource("219.png"));
			restroomsFreddy = ImageIO.read(Window.class.getResource("494.png"));
			westHallANone = ImageIO.read(Window.class.getResource("44.png"));
			westHallABonnie = ImageIO.read(Window.class.getResource("206.png"));
			westHallBNone = ImageIO.read(Window.class.getResource("0.png"));
			westHallBBonnie = ImageIO.read(Window.class.getResource("188.png"));
			supplyclosetNone = ImageIO.read(Window.class.getResource("62.png"));
			supplyclosetBonnie = ImageIO.read(Window.class.getResource("190.png"));
			static1 = ImageIO.read(Window.class.getResource("12.png"));
			static2 = ImageIO.read(Window.class.getResource("13.png"));
			static3 = ImageIO.read(Window.class.getResource("14.png"));
			static4 = ImageIO.read(Window.class.getResource("15.png"));
			static5 = ImageIO.read(Window.class.getResource("16.png"));
			static6 = ImageIO.read(Window.class.getResource("17.png"));
			static7 = ImageIO.read(Window.class.getResource("18.png"));
			static8 = ImageIO.read(Window.class.getResource("20.png"));
			use1 = ImageIO.read(Window.class.getResource("212.png"));
			use2 = ImageIO.read(Window.class.getResource("213.png"));
			use3 = ImageIO.read(Window.class.getResource("214.png"));
			use4 = ImageIO.read(Window.class.getResource("456.png"));
			use5 = ImageIO.read(Window.class.getResource("455.png"));
			use = ImageIO.read(Window.class.getResource("189.png"));
			powerleft = ImageIO.read(Window.class.getResource("207.png"));
			percentsign = ImageIO.read(Window.class.getResource("208.png"));
			cameraBar = ImageIO.read(Window.class.getResource("420.png"));
			foxrun1 = ImageIO.read(Window.class.getResource("244.png"));
			foxrun2 = ImageIO.read(Window.class.getResource("245.png"));
			foxrun3 = ImageIO.read(Window.class.getResource("246.png"));
			foxrun4 = ImageIO.read(Window.class.getResource("247.png"));
			foxrun5 = ImageIO.read(Window.class.getResource("248.png"));
			foxrun6 = ImageIO.read(Window.class.getResource("250.png"));
			foxrun7 = ImageIO.read(Window.class.getResource("280.png"));
			foxrun8 = ImageIO.read(Window.class.getResource("282.png"));
			foxrun9 = ImageIO.read(Window.class.getResource("283.png"));
			foxrun10 = ImageIO.read(Window.class.getResource("284.png"));
			foxrun11 = ImageIO.read(Window.class.getResource("285.png"));
			foxrun12 = ImageIO.read(Window.class.getResource("286.png"));
			foxrun13 = ImageIO.read(Window.class.getResource("287.png"));
			foxrun14 = ImageIO.read(Window.class.getResource("288.png"));
			foxrun15 = ImageIO.read(Window.class.getResource("289.png"));
			foxrun16 = ImageIO.read(Window.class.getResource("290.png"));
			foxrun17 = ImageIO.read(Window.class.getResource("292.png"));
			foxrun18 = ImageIO.read(Window.class.getResource("302.png"));
			foxrun19 = ImageIO.read(Window.class.getResource("306.png"));
			foxrun20 = ImageIO.read(Window.class.getResource("327.png"));
			foxrun21 = ImageIO.read(Window.class.getResource("329.png"));
			foxrun22 = ImageIO.read(Window.class.getResource("330.png"));
			foxrun23 = ImageIO.read(Window.class.getResource("331.png"));
			foxrun24 = ImageIO.read(Window.class.getResource("332.png"));
			foxrun25 = ImageIO.read(Window.class.getResource("333.png"));
			foxrun26 = ImageIO.read(Window.class.getResource("334.png"));
			foxrun27 = ImageIO.read(Window.class.getResource("335.png"));
			foxrun28 = ImageIO.read(Window.class.getResource("336.png"));
			foxrun29 = ImageIO.read(Window.class.getResource("337.png"));
			foxrun30 = ImageIO.read(Window.class.getResource("339-241.png"));
			foxrun31 = ImageIO.read(Window.class.getResource("340.png"));
			powerout1 = ImageIO.read(Window.class.getResource("326.png"));
			powerout2 = ImageIO.read(Window.class.getResource("307.png"));
			powerout3 = ImageIO.read(Window.class.getResource("348.png"));
			powerout4 = ImageIO.read(Window.class.getResource("308.png"));
			powerout5 = ImageIO.read(Window.class.getResource("309.png"));
			powerout5 = ImageIO.read(Window.class.getResource("310.png"));
			powerout6 = ImageIO.read(Window.class.getResource("311.png"));
			powerout7 = ImageIO.read(Window.class.getResource("312.png"));
			powerout8 = ImageIO.read(Window.class.getResource("313.png"));
			powerout9 = ImageIO.read(Window.class.getResource("314.png"));
			powerout10 = ImageIO.read(Window.class.getResource("315.png"));
			powerout11 = ImageIO.read(Window.class.getResource("316.png"));
			powerout12 = ImageIO.read(Window.class.getResource("317.png"));
			powerout13 = ImageIO.read(Window.class.getResource("318.png"));
			powerout14 = ImageIO.read(Window.class.getResource("319.png"));
			powerout15 = ImageIO.read(Window.class.getResource("320.png"));
			powerout16 = ImageIO.read(Window.class.getResource("321.png"));
			powerout17 = ImageIO.read(Window.class.getResource("322.png"));
			powerout18 = ImageIO.read(Window.class.getResource("323.png"));
			powerout19 = ImageIO.read(Window.class.getResource("324.png"));
			powerout20 = ImageIO.read(Window.class.getResource("325.png"));
			bonnie1 = ImageIO.read(Window.class.getResource("291.png"));
			bonnie2 = ImageIO.read(Window.class.getResource("293.png"));
			bonnie3 = ImageIO.read(Window.class.getResource("294.png"));
			bonnie4 = ImageIO.read(Window.class.getResource("295.png"));
			bonnie5 = ImageIO.read(Window.class.getResource("296.png"));
			bonnie6 = ImageIO.read(Window.class.getResource("297.png"));
			bonnie7 = ImageIO.read(Window.class.getResource("298.png"));
			bonnie8 = ImageIO.read(Window.class.getResource("299.png"));
			bonnie9 = ImageIO.read(Window.class.getResource("300.png"));
			bonnie10 = ImageIO.read(Window.class.getResource("301.png"));
			bonnie11 = ImageIO.read(Window.class.getResource("303.png"));
			chicka1 = ImageIO.read(Window.class.getResource("65.png"));
			chicka2 = ImageIO.read(Window.class.getResource("69.png"));
			chicka3 = ImageIO.read(Window.class.getResource("216.png"));
			chicka4 = ImageIO.read(Window.class.getResource("228.png"));
			chicka5 = ImageIO.read(Window.class.getResource("229.png"));
			chicka6 = ImageIO.read(Window.class.getResource("230.png"));
			chicka7 = ImageIO.read(Window.class.getResource("231.png"));
			chicka8 = ImageIO.read(Window.class.getResource("232.png"));
			chicka9 = ImageIO.read(Window.class.getResource("233.png"));
			chicka10 = ImageIO.read(Window.class.getResource("234.png"));
			chicka11 = ImageIO.read(Window.class.getResource("235.png"));
			chicka12 = ImageIO.read(Window.class.getResource("236.png"));
			chicka13 = ImageIO.read(Window.class.getResource("237.png"));
			chicka14 = ImageIO.read(Window.class.getResource("239.png"));
			chicka15 = ImageIO.read(Window.class.getResource("279.png"));
			chicka16 = ImageIO.read(Window.class.getResource("281.png"));
			foxy1 = ImageIO.read(Window.class.getResource("242.png"));
			foxy2 = ImageIO.read(Window.class.getResource("243.png"));
			foxy3 = ImageIO.read(Window.class.getResource("396.png"));
			foxy4 = ImageIO.read(Window.class.getResource("397.png"));
			foxy5 = ImageIO.read(Window.class.getResource("398.png"));
			foxy6 = ImageIO.read(Window.class.getResource("399.png"));
			foxy7 = ImageIO.read(Window.class.getResource("400.png"));
			foxy8 = ImageIO.read(Window.class.getResource("401.png"));
			foxy9 = ImageIO.read(Window.class.getResource("402.png"));
			foxy10 = ImageIO.read(Window.class.getResource("403.png"));
			foxy11 = ImageIO.read(Window.class.getResource("404.png"));
			foxy12 = ImageIO.read(Window.class.getResource("405.png"));
			foxy13 = ImageIO.read(Window.class.getResource("406.png"));
			foxy14 = ImageIO.read(Window.class.getResource("407.png"));
			foxy15 = ImageIO.read(Window.class.getResource("408.png"));
			foxy16 = ImageIO.read(Window.class.getResource("409.png"));
			foxy17 = ImageIO.read(Window.class.getResource("410.png"));
			foxy18 = ImageIO.read(Window.class.getResource("411.png"));
			foxy19 = ImageIO.read(Window.class.getResource("412.png"));
			freddy1 = ImageIO.read(Window.class.getResource("489.png"));
			freddy2 = ImageIO.read(Window.class.getResource("490.png"));
			freddy3 = ImageIO.read(Window.class.getResource("491.png"));
			freddy4 = ImageIO.read(Window.class.getResource("493.png"));
			freddy5 = ImageIO.read(Window.class.getResource("495.png"));
			freddy6 = ImageIO.read(Window.class.getResource("496.png"));
			freddy7 = ImageIO.read(Window.class.getResource("497.png"));
			freddy8 = ImageIO.read(Window.class.getResource("498.png"));
			freddy9 = ImageIO.read(Window.class.getResource("499.png"));
			freddy10 = ImageIO.read(Window.class.getResource("500.png"));
			freddy11 = ImageIO.read(Window.class.getResource("501.png"));
			freddy12 = ImageIO.read(Window.class.getResource("502.png"));
			freddy13 = ImageIO.read(Window.class.getResource("503.png"));
			freddy14 = ImageIO.read(Window.class.getResource("504.png"));
			freddy15 = ImageIO.read(Window.class.getResource("505.png"));
			freddy16 = ImageIO.read(Window.class.getResource("506.png"));
			freddy17 = ImageIO.read(Window.class.getResource("507.png"));
			freddy18 = ImageIO.read(Window.class.getResource("508.png"));
			freddy19 = ImageIO.read(Window.class.getResource("509.png"));
			freddy20 = ImageIO.read(Window.class.getResource("510.png"));
			freddy21 = ImageIO.read(Window.class.getResource("511.png"));
			freddy22 = ImageIO.read(Window.class.getResource("512.png"));
			freddy23 = ImageIO.read(Window.class.getResource("513.png"));
			freddy24 = ImageIO.read(Window.class.getResource("514.png"));
			freddy25 = ImageIO.read(Window.class.getResource("515.png"));
			freddy26 = ImageIO.read(Window.class.getResource("516.png"));
			freddy27 = ImageIO.read(Window.class.getResource("517.png"));
			freddy28 = ImageIO.read(Window.class.getResource("518.png"));
			

		} catch (IOException a) {
			a.printStackTrace();
		}

		ifloading = false;

	}

	public void paint(Graphics g) { //I don't know why this is here as it appears it's not used at all
		Image = createImage(getWidth(), getHeight());
		Graphic = Image.getGraphics();
		try {
			paintComponent(Graphic);
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
		g.drawImage(Image, 0, 0, this);
	}

	public static void playSound(String fileName) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		File f = new File(fileName);
		audioIn = AudioSystem.getAudioInputStream((f.toURI().toURL()));
		Clip clip = AudioSystem.getClip();
		clip.open(audioIn);
		clip.start();
	}

	public void paintComponent(Graphics g) throws UnsupportedAudioFileException, IOException, LineUnavailableException {//Handles everything on the screen.
		g.fillRect(0, 0, getWidth(), getHeight());
		if (ifloading == true) {//Loading image is displayed while game loads
			g.drawImage(loading, 370, 200, this);
		} else {
			if (startGame == false) {//Main menu screen is displayed
				if(mainmenumusicplaying == false) {//Plays the menu music
					playSound(main1);
					playSound(ambiance1);
					mainmenumusicplaying = true;
				}
				needToMove = false;
				int random;
				random = (int) (Math.random() * 20);
				if (random > 18) {//Makes the spooky image that displays on the menu change between different images of Freddy
					random = (int) (Math.random() * 2);
					switch (random) {
					case 1:
						g.drawImage(mainMenu2, 0, 0, this);
						break;
					case 2:
						g.drawImage(mainMenu3, 0, 0, this);
						break;
					}
				} else {
					g.drawImage(mainMenu, 0, 0, this);
				}
				g.drawImage(fiveNightsLogo, 100, 50, this);
				g.drawImage(newGameLogo, 100, 400, this);
				g.drawImage(arrows, 30, 405, this);
				g.drawImage(name, 1050, 700, this);
				if (startClicked == true) {
					g.drawImage(newspaper, 0, 0, this);
				}
			} else {//Main game display
				mainmenumusicplaying = false;
				if(gamemusicplaying == false) {
					playSound(ambiance1);
					playSound(ambiance2);
					gamemusicplaying = true;
				}
				if (Office.monitorUp == true) {//Displays camera view
					if (cameraLocation.equals("Show Stage")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() != 0
								&& Freddy.isInRoom() != 0) {
							g.drawImage(stageNone, cameraPosition - 200, 0,
									this);
						}
						if (Bonnie.isInRoom() == 0 && Chicka.isInRoom() == 0
								&& Freddy.isInRoom() == 0) {
							g.drawImage(stage, cameraPosition - 200, 0, this);
						}
						if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() == 0
								&& Freddy.isInRoom() == 0) {
							g.drawImage(stageNoBonnie, cameraPosition - 200, 0,
									this);
						}
						if (Bonnie.isInRoom() == 0 && Chicka.isInRoom() != 0
								&& Freddy.isInRoom() == 0) {
							g.drawImage(stageNoChicka, cameraPosition - 200, 0,
									this);
						}
						if (Bonnie.isInRoom() != 0 && Chicka.isInRoom() != 0
								&& Freddy.isInRoom() == 0) {
							g.drawImage(stageNoBonnieChicka,
									cameraPosition - 200, 0, this);
						}
						g.drawImage(
								makeColorTransparent(showstage, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("Dining Area")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
								&& Freddy.isInRoom() != 1
								&& Bonnie.isInRoom() != 2
								&& Chicka.isInRoom() != 2) {
							g.drawImage(diningNone, cameraPosition - 200, 0,
									this);
						}
						else if (Bonnie.isInRoom() == 1 && Chicka.isInRoom() != 1
								&& Freddy.isInRoom() != 1
								&& Bonnie.isInRoom() != 2
								&& Chicka.isInRoom() != 2) {
							g.drawImage(diningBonnieFar, cameraPosition - 200,
									0, this);
						}
						else if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
								&& Freddy.isInRoom() != 1
								&& Bonnie.isInRoom() != 1
								&& Chicka.isInRoom() == 2) {
							g.drawImage(diningChickaClose,
									cameraPosition - 200, 0, this);
						}
						else if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() == 1
								&& Freddy.isInRoom() != 1
								&& Bonnie.isInRoom() != 2
								&& Chicka.isInRoom() != 2) {
							g.drawImage(diningChickaFar, cameraPosition - 200,
									0, this);
						}
						else if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
								&& Freddy.isInRoom() != 1
								&& Bonnie.isInRoom() == 2
								&& Chicka.isInRoom() != 2) {
							g.drawImage(diningChickaClose,
									cameraPosition - 200, 0, this);
						}
						else if (Bonnie.isInRoom() != 1 && Chicka.isInRoom() != 1
								&& Freddy.isInRoom() == 1
								&& Bonnie.isInRoom() != 2
								&& Chicka.isInRoom() != 2) {
							g.drawImage(diningFreddy, cameraPosition - 200, 0,
									this);
						}
						else {
							g.drawImage(offline, cameraPosition - 200, 0, this);
						}
						g.drawImage(
								makeColorTransparent(diningarea, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("East Hall A")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Chicka.isInRoom() == 5 && Freddy.isInRoom() != 3
								&& Chicka.isInRoom() != 6) {
							g.drawImage(eastHallAChickaFar,
									cameraPosition - 200, 0, this);
						}
						else if (Chicka.isInRoom() != 5 && Freddy.isInRoom() != 3
								&& Chicka.isInRoom() == 6) {
							g.drawImage(eastHallAChickaClose,
									cameraPosition - 200, 0, this);
						}
						else if (Chicka.isInRoom() != 5 && Freddy.isInRoom() == 3
								&& Chicka.isInRoom() != 6) {
							g.drawImage(eastHallAFreddy, cameraPosition - 200,
									0, this);
						}
						else if (Chicka.isInRoom() != 5 && Freddy.isInRoom() != 3
								&& Chicka.isInRoom() != 6) {
							g.drawImage(eastHallANone, cameraPosition - 200, 0,
									this);
						}
						else {
							g.drawImage(offline, cameraPosition - 200, 0, this);
						}
						g.drawImage(
								makeColorTransparent(easthall, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("East Hall B")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Chicka.isInRoom() != 7 && Freddy.isInRoom() != 4) {
							g.drawImage(eastHallBNone, cameraPosition - 200, 0,
									this);
						}
						else if (Chicka.isInRoom() == 7 && Freddy.isInRoom() != 4) {
							g.drawImage(eastHallBChicka, cameraPosition - 200,
									0, this);
						}
						else if (Chicka.isInRoom() != 7 && Freddy.isInRoom() == 4) {
							g.drawImage(eastHallBFreddy, cameraPosition - 200,
									0, this);
						}
						else {
							g.drawImage(offline, cameraPosition - 200, 0, this);
						}
						g.drawImage(
								makeColorTransparent(ehallcorner, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("Backstage")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Bonnie.isInRoom() != 3 && Bonnie.isInRoom() != 4) {
							g.drawImage(backstageNone, cameraPosition - 200, 0,
									this);
						}
						else if (Bonnie.isInRoom() == 3 && Bonnie.isInRoom() != 4) {
							g.drawImage(backstageFar, cameraPosition - 200, 0,
									this);
						}
						else if (Bonnie.isInRoom() != 3 && Bonnie.isInRoom() == 4) {
							g.drawImage(backstageClose, cameraPosition - 200,
									0, this);
						}
						else {
							g.drawImage(offline, cameraPosition - 200, 0, this);
						}
						g.drawImage(
								makeColorTransparent(backstage, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("Pirate Cove")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Foxy.getStage() == 0) {
							g.drawImage(piratecoveStage0, -100, 0, this);
						} else if (Foxy.getStage() == 1) {
							g.drawImage(piratecoveStage1, -100, 0, this);
						} else if (Foxy.getStage() == 2) {
							g.drawImage(piratecoveStage2, -100, 0, this);
						} else if (Foxy.getStage() == 3) {
							g.drawImage(piratecoveStage3, -100, 0, this);
						}
						g.drawImage(
								makeColorTransparent(piratecove, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("Restrooms")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Chicka.isInRoom() == 3 && Freddy.isInRoom() != 2
								&& Chicka.isInRoom() != 4) {
							g.drawImage(restroomsChickaFar,
									cameraPosition - 200, 0, this);
						}
						else if (Chicka.isInRoom() != 3 && Freddy.isInRoom() != 2
								&& Chicka.isInRoom() == 4) {
							g.drawImage(restroomsChickaClose,
									cameraPosition - 200, 0, this);
						}
						else if (Chicka.isInRoom() != 3 && Freddy.isInRoom() == 2
								&& Chicka.isInRoom() != 4) {
							g.drawImage(restroomsFreddy, cameraPosition - 200,
									0, this);
						}
						else if (Chicka.isInRoom() != 3 && Freddy.isInRoom() != 2
								&& Chicka.isInRoom() != 4) {
							g.drawImage(restroomsNone, cameraPosition - 200, 0,
									this);
						}
						else {
							g.drawImage(offline, cameraPosition - 200, 0, this);
						}
						g.drawImage(
								makeColorTransparent(restrooms, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("West Hall A")
							&& Foxy.getStage() != 3) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Bonnie.isInRoom() != 5) {
							g.drawImage(westHallANone, cameraPosition - 200, 0,
									this);
						}
						else {
							g.drawImage(westHallABonnie, cameraPosition - 200,
									0, this);
						}
						g.drawImage(
								makeColorTransparent(westhall, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("West Hall B")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Bonnie.isInRoom() != 7) {
							g.drawImage(westHallBNone, cameraPosition - 200, 0,
									this);
						}
						else {
							g.drawImage(westHallBBonnie, cameraPosition - 200,
									0, this);
						}
						g.drawImage(
								makeColorTransparent(whallcorner, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("Supply Closet")) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed
						needToMove = true;

						if (Bonnie.isInRoom() != 6) {
							g.drawImage(supplyclosetNone, -100, 0, this);
						}
						else {
							g.drawImage(supplyclosetBonnie, -100, 0, this);
						}
						g.drawImage(
								makeColorTransparent(supplycloset, Color.black),
								800, 290, this);
					}
					if (cameraLocation.equals("West Hall A")
							&& Foxy.getStage() == 3) {//The format of all of these is the same. Depending on the location viewed, and the characters in the room, a specific image is displayed

						if (Foxy.getStage() == 3) {//This part is special as this hall can also feature Foxy running down it. This handles that animation
							needToMove = false;
							if (Fox == 1) {
								g.drawImage(foxrun1, 0, 0, this);
								playSound(run);
							}
							if (Fox == 2)
								g.drawImage(foxrun2, 0, 0, this);
							if (Fox == 3)
								g.drawImage(foxrun3, 0, 0, this);
							if (Fox == 4)
								g.drawImage(foxrun4, 0, 0, this);
							if (Fox == 5)
								g.drawImage(foxrun5, 0, 0, this);
							if (Fox == 6)
								g.drawImage(foxrun6, 0, 0, this);
							if (Fox == 7)
								g.drawImage(foxrun7, 0, 0, this);
							if (Fox == 8)
								g.drawImage(foxrun8, 0, 0, this);
							if (Fox == 9)
								g.drawImage(foxrun9, 0, 0, this);
							if (Fox == 10)
								g.drawImage(foxrun10, 0, 0, this);
							if (Fox == 11)
								g.drawImage(foxrun11, 0, 0, this);
							if (Fox == 12)
								g.drawImage(foxrun12, 0, 0, this);
							if (Fox == 13)
								g.drawImage(foxrun13, 0, 0, this);
							if (Fox == 14)
								g.drawImage(foxrun14, 0, 0, this);
							if (Fox == 15)
								g.drawImage(foxrun15, 0, 0, this);
							if (Fox == 16)
								g.drawImage(foxrun16, 0, 0, this);
							if (Fox == 17)
								g.drawImage(foxrun17, 0, 0, this);
							if (Fox == 18)
								g.drawImage(foxrun18, 0, 0, this);
							if (Fox == 19)
								g.drawImage(foxrun19, 0, 0, this);
							if (Fox == 20)
								g.drawImage(foxrun20, 0, 0, this);
							if (Fox == 21)
								g.drawImage(foxrun21, 0, 0, this);
							if (Fox == 22)
								g.drawImage(foxrun22, 0, 0, this);
							if (Fox == 23)
								g.drawImage(foxrun23, 0, 0, this);
							if (Fox == 24)
								g.drawImage(foxrun24, 0, 0, this);
							if (Fox == 25)
								g.drawImage(foxrun25, 0, 0, this);
							if (Fox == 26)
								g.drawImage(foxrun26, 0, 0, this);
							if (Fox == 27)
								g.drawImage(foxrun27, 0, 0, this);
							if (Fox == 28)
								g.drawImage(foxrun28, 0, 0, this);
							if (Fox == 29)
								g.drawImage(foxrun29, 0, 0, this);
							if (Fox == 30)
								g.drawImage(foxrun30, 0, 0, this);
							if (Fox == 31)
								g.drawImage(foxrun31, 0, 0, this);
							
						}
						g.drawImage(
								makeColorTransparent(westhall, Color.black),
								800, 290, this);
					}
					g.drawImage(
							makeColorTransparent(cameraMinimap, Color.black),
							825, 325, this);
					g.drawImage(blank, 923, 343, this);
					g.drawImage(blank, 904, 399, this);
					g.drawImage(blank, 877, 481, this);
					g.drawImage(blank, 926, 596, this);
					g.drawImage(blank, 926, 631, this);
					g.drawImage(blank, 850, 578, this);
					g.drawImage(blank, 1034, 596, this);
					g.drawImage(blank, 1034, 631, this);
					g.drawImage(blank, 796, 431, this);
					g.drawImage(blank, 1146, 436, this);
					//I made a little script to make the png's properly transparent
					g.drawImage(makeColorTransparent(A1, Color.black), 927,
							347, this);
					g.drawImage(makeColorTransparent(B1, Color.black), 908,
							403, this);
					g.drawImage(makeColorTransparent(C1, Color.black), 881,
							485, this);
					g.drawImage(makeColorTransparent(A2, Color.black), 930,
							600, this);
					g.drawImage(makeColorTransparent(B2, Color.black), 930,
							635, this);
					g.drawImage(makeColorTransparent(Three, Color.black), 855,
							582, this);
					g.drawImage(makeColorTransparent(A4, Color.black), 1038,
							600, this);
					g.drawImage(makeColorTransparent(B4, Color.black), 1038,
							635, this);
					g.drawImage(makeColorTransparent(Five, Color.black), 800,
							435, this);
					g.drawImage(makeColorTransparent(Six, Color.black), 1150,
							440, this);
				} else {//All death animations and inside the office view
					if (Bonnie.playerdeath == true && Office.monitorUp == false) {//Bonnie's death animation
						needToMove = false;
						if (bonnie == 1) {
							playSound(scream);
							g.drawImage(bonnie1, 0, 0, this);
						}
						if (bonnie == 2)
							g.drawImage(bonnie2, 0, 0, this);
						if (bonnie == 3)
							g.drawImage(bonnie3, 0, 0, this);
						if (bonnie == 4)
							g.drawImage(bonnie4, 0, 0, this);
						if (bonnie == 5)
							g.drawImage(bonnie5, 0, 0, this);
						if (bonnie == 6)
							g.drawImage(bonnie6, 0, 0, this);
						if (bonnie == 7)
							g.drawImage(bonnie7, 0, 0, this);
						if (bonnie == 8)
							g.drawImage(bonnie8, 0, 0, this);
						if (bonnie == 9)
							g.drawImage(bonnie9, 0, 0, this);
						if (bonnie == 10)
							g.drawImage(bonnie10, 0, 0, this);
						if (bonnie == 11) {
							g.drawImage(bonnie11, 0, 0, this);
						}

						
						
					} else if (Chicka.playerdeath == true && Office.monitorUp == false) {//Chicka's death animation
						needToMove = false;
						if (chicka == 1) {
							g.drawImage(chicka1, 0, 0, this);
							playSound(scream);
						}
						if (chicka == 2)
							g.drawImage(chicka2, 0, 0, this);
						if (chicka == 3)
							g.drawImage(chicka3, 0, 0, this);
						if (chicka == 4)
							g.drawImage(chicka4, 0, 0, this);
						if (chicka == 5)
							g.drawImage(chicka5, 0, 0, this);
						if (chicka == 6)
							g.drawImage(chicka6, 0, 0, this);
						if (chicka == 7)
							g.drawImage(chicka7, 0, 0, this);
						if (chicka == 8)
							g.drawImage(chicka8, 0, 0, this);
						if (chicka == 9)
							g.drawImage(chicka9, 0, 0, this);
						if (chicka == 10)
							g.drawImage(chicka10, 0, 0, this);
						if (chicka == 11)
							g.drawImage(chicka11, 0, 0, this);
						if (chicka == 12)
							g.drawImage(chicka12, 0, 0, this);
						if (chicka == 13)
							g.drawImage(chicka13, 0, 0, this);
						if (chicka == 14)
							g.drawImage(chicka14, 0, 0, this);
						if (chicka == 15)
							g.drawImage(chicka15, 0, 0, this);
						if (chicka == 16) {
							g.drawImage(chicka16, 0, 0, this);
					}

					} else if (Freddy.playerdeath == true && Office.monitorUp == false) {//Freddy's death animation
						needToMove = false;
						if (freddie == 1) {
							g.drawImage(freddy1, 0, 0, this);
							playSound(scream);
						}
						if (freddie == 2)
							g.drawImage(freddy2, 0, 0, this);
						if (freddie == 3)
							g.drawImage(freddy3, 0, 0, this);
						if (freddie == 4)
							g.drawImage(freddy4, 0, 0, this);
						if (freddie == 5)
							g.drawImage(freddy5, 0, 0, this);
						if (freddie == 6)
							g.drawImage(freddy6, 0, 0, this);
						if (freddie == 7)
							g.drawImage(freddy7, 0, 0, this);
						if (freddie == 8)
							g.drawImage(freddy8, 0, 0, this);
						if (freddie == 9)
							g.drawImage(freddy9, 0, 0, this);
						if (freddie == 10)
							g.drawImage(freddy10, 0, 0, this);
						if (freddie == 11)
							g.drawImage(freddy11, 0, 0, this);
						if (freddie == 12)
							g.drawImage(freddy12, 0, 0, this);
						if (freddie == 13)
							g.drawImage(freddy13, 0, 0, this);
						if (freddie == 14)
							g.drawImage(freddy14, 0, 0, this);
						if (freddie == 15)
							g.drawImage(freddy15, 0, 0, this);
						if (freddie == 16)
							g.drawImage(freddy16, 0, 0, this);
						if (freddie == 17)
							g.drawImage(freddy17, 0, 0, this);
						if (freddie == 18)
							g.drawImage(freddy18, 0, 0, this);
						if (freddie == 19)
							g.drawImage(freddy19, 0, 0, this);
						if (freddie == 20)
							g.drawImage(freddy20, 0, 0, this);
						if (freddie == 21)
							g.drawImage(freddy21, 0, 0, this);
						if (freddie == 22)
							g.drawImage(freddy22, 0, 0, this);
						if (freddie == 23)
							g.drawImage(freddy23, 0, 0, this);
						if (freddie == 24)
							g.drawImage(freddy24, 0, 0, this);
						if (freddie == 25)
							g.drawImage(freddy25, 0, 0, this);
						if (freddie == 26)
							g.drawImage(freddy26, 0, 0, this);
						if (freddie == 27)
							g.drawImage(freddy27, 0, 0, this);
						if (freddie == 28) {
							g.drawImage(freddy28, 0, 0, this);
						}

					} else if (Foxy.playerdeath == true
							&& Office.door1open == true) {//Foxy's death animation
						needToMove = false;
						if (foxdie == 1) {
							playSound(scream);
							g.drawImage(foxy1, 0, 0, this);
						}
						if (foxdie == 2)
							g.drawImage(foxy2, 0, 0, this);
						if (foxdie == 3)
							g.drawImage(foxy3, 0, 0, this);
						if (foxdie == 4)
							g.drawImage(foxy4, 0, 0, this);
						if (foxdie == 5)
							g.drawImage(foxy5, 0, 0, this);
						if (foxdie == 6)
							g.drawImage(foxy6, 0, 0, this);
						if (foxdie == 7)
							g.drawImage(foxy7, 0, 0, this);
						if (foxdie == 8)
							g.drawImage(foxy8, 0, 0, this);
						if (foxdie == 9)
							g.drawImage(foxy9, 0, 0, this);
						if (foxdie == 10)
							g.drawImage(foxy10, 0, 0, this);
						if (foxdie == 11)
							g.drawImage(foxy11, 0, 0, this);
						if (foxdie == 12)
							g.drawImage(foxy12, 0, 0, this);
						if (foxdie == 13)
							g.drawImage(foxy13, 0, 0, this);
						if (foxdie == 14)
							g.drawImage(foxy14, 0, 0, this);
						if (foxdie == 15)
							g.drawImage(foxy15, 0, 0, this);
						if (foxdie == 16)
							g.drawImage(foxy16, 0, 0, this);
						if (foxdie == 17)
							g.drawImage(foxy17, 0, 0, this);
						if (foxdie == 18)
							g.drawImage(foxy18, 0, 0, this);
						if (foxdie == 19) {
							g.drawImage(foxy19, 0, 0, this);
						}
						//A lot is going on here, but this displays certain images if certain characters are right outside, or if the lights are on or not. It also moves the doors
					} else if (Office.light1on == true
							&& Bonnie.isInRoom() == 8) {
						g.drawImage(officeBonnie, officeView, 0, this);
						g.drawImage(
								makeColorTransparent(leftLight, Color.black),
								officeView, 250, this);
						g.drawImage(
								makeColorTransparent(rightNone, Color.black),
								officeView + 1490, 250, this);
					} else if (Office.light1on == true
							&& Bonnie.isInRoom() != 8) {
						g.drawImage(officeLeftLight, officeView, 0, this);
						g.drawImage(
								makeColorTransparent(leftLight, Color.black),
								officeView, 250, this);
						g.drawImage(
								makeColorTransparent(rightNone, Color.black),
								officeView + 1490, 250, this);
					} else if (Office.light2on == true
							&& Chicka.isInRoom() == 8) {
						g.drawImage(officeChicka, officeView, 0, this);
						g.drawImage(
								makeColorTransparent(leftNone, Color.black),
								officeView, 250, this);
						g.drawImage(
								makeColorTransparent(rightLight, Color.black),
								officeView + 1490, 250, this);
					} else if (Office.light2on == true
							&& Chicka.isInRoom() != 8) {
						g.drawImage(officeRightLight, officeView, 0, this);
						g.drawImage(
								makeColorTransparent(leftNone, Color.black),
								officeView, 250, this);
						g.drawImage(
								makeColorTransparent(rightLight, Color.black),
								officeView + 1490, 250, this);
					} else {
						g.drawImage(office, officeView, 0, this);
						g.drawImage(
								makeColorTransparent(leftNone, Color.black),
								officeView, 250, this);
						g.drawImage(
								makeColorTransparent(rightNone, Color.black),
								officeView + 1490, 250, this);
					}
					if (Office.door1open == false) {
						g.drawImage(makeColorTransparent(leftdoor13, Color.white), officeView + 80 , 0, this);
					}
					if (Office.door2open == false) {
						g.drawImage(makeColorTransparent(rightdoor13, Color.white), officeView + 1270, 0, this);
					}
				}
				if (needStatic == true) {//I don't remember what this is used for
					if (Static == 1)
						g.drawImage(static1,
								0, 0, this);
					if (Static == 2)
						g.drawImage(static2,
								0, 0, this);
					if (Static == 3)
						g.drawImage(static3,
								0, 0, this);
					if (Static == 4)
						g.drawImage(static4,
								0, 0, this);
					if (Static == 5)
						g.drawImage(static5,
								0, 0, this);
					if (Static == 6)
						g.drawImage(static6,
								0, 0, this);
					if (Static == 7)
						g.drawImage(static7,
								0, 0, this);
					if (Static == 8)
						g.drawImage(static8,
								0, 0, this);
				}
				if (Office.getPower() <= 0) {//Death animation if player runs out of power
					needToMove = false;
					if (powerOut == 1)
						g.drawImage(powerout1, 0, 0, this);
					if (powerOut == 2)
						g.drawImage(powerout2, 0, 0, this);
					if (powerOut == 3)
						g.drawImage(powerout3, 0, 0, this);
					if (powerOut == 4)
						g.drawImage(powerout4, 0, 0, this);
					if (powerOut == 5)
						g.drawImage(powerout5, 0, 0, this);
					if (powerOut == 6)
						g.drawImage(powerout6, 0, 0, this);
					if (powerOut == 7)
						g.drawImage(powerout7, 0, 0, this);
					if (powerOut == 8)
						g.drawImage(powerout8, 0, 0, this);
					if (powerOut == 9)
						g.drawImage(powerout9, 0, 0, this);
					if (powerOut == 10)
						g.drawImage(powerout10, 0, 0, this);
					if (powerOut == 11)
						g.drawImage(powerout11, 0, 0, this);
					if (powerOut == 12)
						g.drawImage(powerout12, 0, 0, this);
					if (powerOut == 13)
						g.drawImage(powerout13, 0, 0, this);
					if (powerOut == 14)
						g.drawImage(powerout14, 0, 0, this);
					if (powerOut == 15)
						g.drawImage(powerout15, 0, 0, this);
					if (powerOut == 16)
						g.drawImage(powerout16, 0, 0, this);
					if (powerOut == 17)
						g.drawImage(powerout17, 0, 0, this);
					if (powerOut == 18)
						g.drawImage(powerout18, 0, 0, this);
					if (powerOut == 19)
						g.drawImage(powerout19, 0, 0, this);
					if (powerOut == 20)
						g.drawImage(powerout20, 0, 0, this);
					Main.death = true;

				}
				g.drawImage(
						makeColorTransparent(
								(makeColorTransparent(cameraBar, Color.black)),
								Color.GRAY), 262, 660, this);
				if (Office.getUsage() == 0) {//Displays the amount of power currently being used

				}
				if (Office.getUsage() == 1) {
					g.drawImage(makeColorTransparent(use1, Color.black), 90,
							672, this);
				}
				if (Office.getUsage() == 2) {
					g.drawImage(makeColorTransparent(use2, Color.black), 90,
							672, this);
				}
				if (Office.getUsage() == 3) {
					g.drawImage(makeColorTransparent(use3, Color.black), 90,
							672, this);
				}
				if (Office.getUsage() == 4) {
					g.drawImage(makeColorTransparent(use4, Color.black), 90,
							672, this);
				}
				if (Office.getUsage() == 5) {
					g.drawImage(makeColorTransparent(use5, Color.black), 90,
							672, this);
				}
				//Displays different static text HUD elements
				g.drawImage(makeColorTransparent(use, Color.black), 10, 680,
						this);
				g.drawImage(makeColorTransparent(powerleft, Color.black), 10,
						650, this);
				g.drawImage(makeColorTransparent(percentsign, Color.black),
						215, 650, this);

				if (Office.powerRemaining <= 100 && Office.powerRemaining > 90) {//Displays the amount of power remaining in percent
					g.drawImage(makeColorTransparent(onehundred, Color.black),
							157, 646, this);
				}
				if (Office.powerRemaining <= 90 && Office.powerRemaining > 80) {
					g.drawImage(makeColorTransparent(ninety, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining <= 80 && Office.powerRemaining > 70) {
					g.drawImage(makeColorTransparent(eighty, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining <= 70 && Office.powerRemaining > 60) {
					g.drawImage(makeColorTransparent(seventy, Color.black),
							160, 646, this);
				}
				if (Office.powerRemaining <= 60 && Office.powerRemaining > 50) {
					g.drawImage(makeColorTransparent(sixty, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining <= 50 && Office.powerRemaining > 40) {
					g.drawImage(makeColorTransparent(fifty, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining <= 40 && Office.powerRemaining > 30) {
					g.drawImage(makeColorTransparent(forty, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining <= 30 && Office.powerRemaining > 20) {
					g.drawImage(makeColorTransparent(thirty, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining <= 20 && Office.powerRemaining > 10) {
					g.drawImage(makeColorTransparent(twenty, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining <= 10 && Office.powerRemaining > 0) {
					g.drawImage(makeColorTransparent(ten, Color.black), 160,
							646, this);
				}
				if (Office.powerRemaining == 0) {
					g.drawImage(makeColorTransparent(zero, Color.black), 160,
							646, this);
				}
				if (Main.deather == true) {//Displays lose image
					g.drawImage(lose, 0, 0, this);
				}
				if (Main.gameWin == true) {//Displays win image
					g.drawImage(win, 0, 0, this);
				}
			}
		}
		repaint();
	}

	public double height(double height) {
		if (height > 720) {
			height = 720;
		}
		return height;
	}

	public double width(double width) {
		if (width > 1280) {
			width = 1280;
		}
		return width;
	}

	public static Image makeColorTransparent(java.awt.Image image2,
			final Color color) {//Makes png's transparent
		ImageFilter filter = new RGBImageFilter() {
			public int markerRGB = color.getRGB() | 0xFF000000;

			public final int filterRGB(int x, int y, int rgb) {
				if ((rgb | 0xFF000000) == markerRGB) {
					return 0x00FFFFFF & rgb;
				} else {
					return rgb;
				}
			}
		};

		ImageProducer ip = new FilteredImageSource(image2.getSource(), filter);
		return Toolkit.getDefaultToolkit().createImage(ip);
	}

	public String soundsTest() {
		if (Bonnie.playerdeath == true && Office.monitorUp == false) {//Bonnie's death animation
			needToMove = false;
			return "scream";

		} else if (Chicka.playerdeath == true && Office.monitorUp == false) {//Chicka's death animation
			needToMove = false;
			return "scream";

		} else if (Freddy.playerdeath == true && Office.monitorUp == false) {//Freddy's death animation
			needToMove = false;
			return "scream";


		} else if (Foxy.playerdeath == true
				&& Office.door1open == true) {//Foxy's death animation
			needToMove = false;
			return "scream";
		}
		return "nothing";
	}

}
