import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.JSlider.*;
import java.util.*;

public class themepanel extends JPanel {
	// Properties
	
	/**
	 * Variable for board in light theme
	 */
	BufferedImage lightboard = null;
	/**
	 * Variable for o image in light theme
	 */
	BufferedImage lighto = null;
	/**
	 * Variable for x image in light theme
	 */
	BufferedImage lightx = null;
	/**
	 * Variable for background image in light theme
	 */
	BufferedImage lightbg = null;
	
	/**
	 * Variable for board image in dark theme
	 */
	BufferedImage darkboard = null;
	/**
	 * Variable for o image in dark theme
	 */
	BufferedImage darko = null;
	/**
	 * Variable for x image in dark theme
	 */
	BufferedImage darkx = null;
	/**
	 * Variable for background image in dark theme
	 */
	BufferedImage darkbg = null;

	/**
	 * Variable for board image in christmas theme
	 */
	BufferedImage christmasboard = null;
	/**
	 * Variable for o image in christmas theme
	 */
	BufferedImage christmaso = null;
	/**
	 * Variable for x image in christmas theme
	 */
	BufferedImage christmasx = null;
	/**
	 * Variable for background image in christmas theme
	 */
	BufferedImage christmasbg = null;


	/**
	 * Variable for board image in halloween theme
	 */
	BufferedImage halloweenboard = null;
	/**
	 * Variable for background image in halloween theme
	 */
	BufferedImage halloweenbg = null;
	/**
	 * Variable for x image in halloween theme
	 */
	BufferedImage halloweenx = null;
	/**
	 * Variable for o image in halloween theme
	 */
	BufferedImage halloweeno = null;

	/**
	 * Variable for board image in neon theme
	 */
	BufferedImage neonboard = null;
	/**
	 * Variable for background image in neon theme
	 */
	BufferedImage neonbg = null;
	/**
	 * Variable for x image in neon theme
	 */
	BufferedImage neonx = null;
	/**
	 * Variable for o image in neon theme
	 */
	BufferedImage neono = null;

	/**
	 * Variable for board image in star trek theme
	 */
	BufferedImage startrekboard = null;
	/**
	 * Variable for background image in star trek theme
	 */
	BufferedImage startrekbg = null;
	/**
	 * Variable for x image in star trek theme
	 */
	BufferedImage startrekx = null;
	/**
	 * Variable for o image in star trek theme
	 */
	BufferedImage startreko = null;
	/**
	 * Variable for title in main panel
	 */
	BufferedImage imgtitle = null;
	
	/**
	 * Variable for title image x position
	 */
	public static int intTitleX = 0;

	/**
	 * Only draws Light theme board and background when true
	 */
	public boolean blnlight = true;
	/**
	 * Only draws Dark theme board and background when true
	 */
	public boolean blndark = false;
	/**
	 * Only draws Christmas theme board and background when true
	 */
	public boolean blnchristmas = false;
	/**
	 * Only draws Halloween theme board and background when true
	 */
	public boolean blnhalloween = false;
	/**
	 * Only draws Neon theme board and background when true
	 */
	public boolean blnneon = false;
	/**
	 * Only draws Star Trek theme board and background when true
	 */
	public boolean blnStartrek = false;
	
	/**
	 * Light theme activates when this boolean is true
	 */
	public boolean blnlighttheme = false;
	/**
	 * Dark theme activates when this boolean is true
	 */
	public boolean blndarktheme = false;
	/**
	 * Christmas theme activates when this boolean is true
	 */
	public boolean blnchristmastheme = false;
	/**
	 * Halloween theme activates when this boolean is true
	 */
	public boolean blnhalloweentheme = false;
	/**
	 * Neon theme activates when this boolean is true
	 */
	public boolean blnneontheme = false;
	/**
	 * Star trek theme activates when this boolean is true
	 */
	public boolean blnStartrektheme = false;
	
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln000 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln100 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln001 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln101 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln002 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln102 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln010 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln110 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln011 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln111 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln012 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln112 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln020 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln120 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln021 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln121 = false;
	/**
	 * Variable for player 1 (you) piece position on board
	 */
	public boolean bln022 = false;
	/**
	 * Variable for player 2 (opponent) piece position on board
	 */
	public boolean bln122 = false;


	// Methods
	/**
	 * paintComponent method draws all theme images; and x and o pieces to the game board
	 */
	public void paintComponent(Graphics g) {
		g.drawImage(imgtitle, 800, 500, null);

		if (blnlighttheme == true) {
			g.drawImage(lightbg, 0, 0, null);
			g.drawImage(lightboard, 0, 0, null);
			g.drawImage(lightx, 200, 200, null);
			g.drawImage(lighto, 0, 0, null);

		} else if (blnlight == true) {
			g.drawImage(lightbg, 0, 0, null);
			g.drawImage(lightboard, 0, 0, null);
		} else if (blndarktheme == true) {
			g.drawImage(darkbg, 0, 0, null);
			g.drawImage(darkboard, 0, 0, null);
			g.drawImage(darko, 0, 200, null);
			g.drawImage(darkx, 200, 200, null);
		} else if (blndark == true) {
			g.drawImage(darkbg, 0, 0, null);
			g.drawImage(darkboard, 0, 0, null);
		} else if (blnchristmastheme == true) {
			g.drawImage(christmasbg, 0, 0, null);
			g.drawImage(christmasboard, 0, 0, null);
			g.drawImage(christmaso, 0, 400, null);
			g.drawImage(christmasx, 200, 200, null);
		} else if (blnchristmas == true) {
			g.drawImage(christmasbg, 0, 0, null);
			g.drawImage(christmasboard, 0, 0, null);
		} else if (blnhalloweentheme == true) {
			g.drawImage(halloweenbg, 0, 0, null);
			g.drawImage(halloweenboard, 0, 0, null);
			g.drawImage(halloweeno, 200, 400, null);
			g.drawImage(halloweenx, 200, 200, null);
		} else if (blnhalloween == true) {
			g.drawImage(halloweenbg, 0, 0, null);
			g.drawImage(halloweenboard, 0, 0, null);
		} else if (blnStartrek == true) {
			g.drawImage(startrekbg, 0, 0, null);
			g.drawImage(startrekboard, 0, 0, null);
		} else if (blnStartrektheme == true) {
			g.drawImage(startrekbg, 0, 0, null);
			g.drawImage(startrekboard, 0, 0, null);
			g.drawImage(startreko, 400, 400, null);
			g.drawImage(startrekx, 200, 200, null);
		} else if (blnneontheme == true) {
			g.drawImage(neonbg, 0, 0, null);
			g.drawImage(neonboard, 0, 0, null);
			g.drawImage(neono, 400, 400, null);
			g.drawImage(neonx, 200, 200, null);
		} else if (blnneon = true) {
			g.drawImage(neonbg, 0, 0, null);
			g.drawImage(neonboard, 0, 0, null);
		}
		if (blnlight == true && bln000 == true) {
			g.drawImage(lighto, 0, 0, null);
		}
		if (blnlight == true && bln001 == true) {
			g.drawImage(lighto, 0, 200, null);
		}
		if (blnlight == true && bln002 == true) {
			g.drawImage(lighto, 0, 400, null);
		}
		if (blnlight == true && bln010 == true) {
			g.drawImage(lighto, 200, 0, null);
		}
		if (blnlight == true && bln011 == true) {
			g.drawImage(lighto, 200, 200, null);
		}
		if (blnlight == true && bln012 == true) {
			g.drawImage(lighto, 200, 400, null);
		}
		if (blnlight == true && bln020 == true) {
			g.drawImage(lighto, 400, 0, null);
		}
		if (blnlight == true && bln021 == true) {
			g.drawImage(lighto, 400, 200, null);
		}
		if (blnlight == true && bln022 == true) {
			g.drawImage(lighto, 400, 400, null);
		}
		if (blnlight == true && bln100 == true) {
			g.drawImage(lightx, 0, 0, null);
		}
		if (blnlight == true && bln101 == true) {
			g.drawImage(lightx, 0, 200, null);
		}
		if (blnlight == true && bln102 == true) {
			g.drawImage(lightx, 0, 400, null);
		}
		if (blnlight == true && bln110 == true) {
			g.drawImage(lightx, 200, 0, null);
		}
		if (blnlight == true && bln111 == true) {
			g.drawImage(lightx, 200, 200, null);
		}
		if (blnlight == true && bln112 == true) {
			g.drawImage(lightx, 200, 400, null);
		}
		if (blnlight == true && bln120 == true) {
			g.drawImage(lightx, 400, 000, null);
		}
		if (blnlight == true && bln121 == true) {
			g.drawImage(lightx, 400, 200, null);
		}
		if (blnlight == true && bln122 == true) {
			g.drawImage(lightx, 400, 400, null);
		}

		if (blndark == true && bln000 == true) {
			g.drawImage(darko, 0, 0, null);
		}
		if (blndark == true && bln001 == true) {
			g.drawImage(darko, 0, 200, null);
		}
		if (blndark == true && bln002 == true) {
			g.drawImage(darko, 0, 400, null);
		}
		if (blndark == true && bln010 == true) {
			g.drawImage(darko, 200, 0, null);
		}
		if (blndark == true && bln011 == true) {
			g.drawImage(darko, 200, 200, null);
		}
		if (blndark == true && bln012 == true) {
			g.drawImage(darko, 200, 400, null);
		}
		if (blndark == true && bln020 == true) {
			g.drawImage(darko, 400, 0, null);
		}
		if (blndark == true && bln021 == true) {
			g.drawImage(darko, 400, 200, null);
		}
		if (blndark == true && bln022 == true) {
			g.drawImage(darko, 400, 400, null);
		}
		if (blndark == true && bln100 == true) {
			g.drawImage(darkx, 0, 0, null);
		}
		if (blndark == true && bln101 == true) {
			g.drawImage(darkx, 0, 200, null);
		}
		if (blndark == true && bln102 == true) {
			g.drawImage(darkx, 0, 400, null);
		}
		if (blndark == true && bln110 == true) {
			g.drawImage(darkx, 200, 0, null);
		}
		if (blndark == true && bln111 == true) {
			g.drawImage(darkx, 200, 200, null);
		}
		if (blndark == true && bln112 == true) {
			g.drawImage(darkx, 200, 400, null);
		}
		if (blndark == true && bln120 == true) {
			g.drawImage(darkx, 400, 0, null);
		}
		if (blndark == true && bln121 == true) {
			g.drawImage(darkx, 400, 200, null);
		}
		if (blndark == true && bln122 == true) {
			g.drawImage(darkx, 400, 400, null);
		}

		if (blnchristmas == true && bln000 == true) {
			g.drawImage(christmaso, 0, 0, null);
		}
		if (blnchristmas == true && bln001 == true) {
			g.drawImage(christmaso, 0, 200, null);
		}
		if (blnchristmas == true && bln002 == true) {
			g.drawImage(christmaso, 0, 400, null);
		}
		if (blnchristmas == true && bln010 == true) {
			g.drawImage(christmaso, 200, 0, null);
		}
		if (blnchristmas == true && bln011 == true) {
			g.drawImage(christmaso, 200, 200, null);
		}
		if (blnchristmas == true && bln012 == true) {
			g.drawImage(christmaso, 200, 400, null);
		}
		if (blnchristmas == true && bln020 == true) {
			g.drawImage(christmaso, 400, 0, null);
		}
		if (blnchristmas == true && bln021 == true) {
			g.drawImage(christmaso, 400, 200, null);
		}
		if (blnchristmas == true && bln022 == true) {
			g.drawImage(christmaso, 400, 400, null);
		}
		if (blnchristmas == true && bln100 == true) {
			g.drawImage(christmasx, 0, 0, null);
		}
		if (blnchristmas == true && bln101 == true) {
			g.drawImage(christmasx, 0, 200, null);
		}
		if (blnchristmas == true && bln102 == true) {
			g.drawImage(christmasx, 0, 400, null);
		}
		if (blnchristmas == true && bln110 == true) {
			g.drawImage(christmasx, 200, 0, null);
		}
		if (blnchristmas == true && bln111 == true) {
			g.drawImage(christmasx, 200, 200, null);
		}
		if (blnchristmas == true && bln112 == true) {
			g.drawImage(christmasx, 200, 400, null);
		}
		if (blnchristmas == true && bln120 == true) {
			g.drawImage(christmasx, 400, 0, null);
		}
		if (blnchristmas == true && bln121 == true) {
			g.drawImage(christmasx, 400, 200, null);
		}
		if (blnchristmas == true && bln122 == true) {
			g.drawImage(christmasx, 400, 400, null);
		}

		if (blnhalloween == true && bln000 == true) {
			g.drawImage(halloweeno, 0, 0, null);
		}
		if (blnhalloween == true && bln001 == true) {
			g.drawImage(halloweeno, 0, 200, null);
		}
		if (blnhalloween == true && bln002 == true) {
			g.drawImage(halloweeno, 0, 400, null);
		}
		if (blnhalloween == true && bln010 == true) {
			g.drawImage(halloweeno, 200, 0, null);
		}
		if (blnhalloween == true && bln011 == true) {
			g.drawImage(halloweeno, 200, 200, null);
		}
		if (blnhalloween == true && bln012 == true) {
			g.drawImage(halloweeno, 200, 400, null);
		}
		if (blnhalloween == true && bln020 == true) {
			g.drawImage(halloweeno, 400, 0, null);
		}
		if (blnhalloween == true && bln021 == true) {
			g.drawImage(halloweeno, 400, 200, null);
		}
		if (blnhalloween == true && bln022 == true) {
			g.drawImage(halloweeno, 400, 400, null);
		}
		if (blnhalloween == true && bln100 == true) {
			g.drawImage(halloweenx, 0, 0, null);
		}
		if (blnhalloween == true && bln101 == true) {
			g.drawImage(halloweenx, 0, 200, null);
		}
		if (blnhalloween == true && bln102 == true) {
			g.drawImage(halloweenx, 0, 400, null);
		}
		if (blnhalloween == true && bln110 == true) {
			g.drawImage(halloweenx, 200, 0, null);
		}
		if (blnhalloween == true && bln111 == true) {
			g.drawImage(halloweenx, 200, 200, null);
		}
		if (blnhalloween == true && bln112 == true) {
			g.drawImage(halloweenx, 200, 400, null);
		}
		if (blnhalloween == true && bln120 == true) {
			g.drawImage(halloweenx, 400, 0, null);
		}
		if (blnhalloween == true && bln121 == true) {
			g.drawImage(halloweenx, 400, 200, null);
		}
		if (blnhalloween == true && bln122 == true) {
			g.drawImage(halloweenx, 400, 400, null);
		}

		if (blnneon == true && bln000 == true) {
			g.drawImage(neono, 0, 0, null);
		}
		if (blnneon == true && bln001 == true) {
			g.drawImage(neono, 0, 200, null);
		}
		if (blnneon == true && bln002 == true) {
			g.drawImage(neono, 0, 400, null);
		}
		if (blnneon == true && bln010 == true) {
			g.drawImage(neono, 200, 0, null);
		}
		if (blnneon == true && bln011 == true) {
			g.drawImage(neono, 200, 200, null);
		}
		if (blnneon == true && bln012 == true) {
			g.drawImage(neono, 200, 400, null);
		}
		if (blnneon == true && bln020 == true) {
			g.drawImage(neono, 400, 0, null);
		}
		if (blnneon == true && bln021 == true) {
			g.drawImage(neono, 400, 200, null);
		}
		if (blnneon == true && bln022 == true) {
			g.drawImage(neono, 400, 400, null);
		}
		if (blnneon == true && bln100 == true) {
			g.drawImage(neonx, 0, 0, null);
		}
		if (blnneon == true && bln101 == true) {
			g.drawImage(neonx, 0, 200, null);
		}
		if (blnneon == true && bln102 == true) {
			g.drawImage(neonx, 0, 400, null);
		}
		if (blnneon == true && bln110 == true) {
			g.drawImage(neonx, 200, 0, null);
		}
		if (blnneon == true && bln111 == true) {
			g.drawImage(neonx, 200, 200, null);
		}
		if (blnneon == true && bln112 == true) {
			g.drawImage(neonx, 200, 400, null);
		}
		if (blnneon == true && bln120 == true) {
			g.drawImage(neonx, 400, 0, null);
		}
		if (blnneon == true && bln121 == true) {
			g.drawImage(neonx, 400, 200, null);
		}
		if (blnneon == true && bln122 == true) {
			g.drawImage(neonx, 400, 400, null);
		}

		if (blnStartrek == true && bln000 == true) {
			g.drawImage(startreko, 0, 0, null);
		}
		if (blnStartrek == true && bln001 == true) {
			g.drawImage(startreko, 0, 200, null);
		}
		if (blnStartrek == true && bln002 == true) {
			g.drawImage(startreko, 0, 400, null);
		}
		if (blnStartrek == true && bln010 == true) {
			g.drawImage(startreko, 200, 0, null);
		}
		if (blnStartrek == true && bln011 == true) {
			g.drawImage(startreko, 200, 200, null);
		}
		if (blnStartrek == true && bln012 == true) {
			g.drawImage(startreko, 200, 400, null);
		}
		if (blnStartrek == true && bln020 == true) {
			g.drawImage(startreko, 400, 0, null);
		}
		if (blnStartrek == true && bln021 == true) {
			g.drawImage(startreko, 400, 200, null);
		}
		if (blnStartrek == true && bln022 == true) {
			g.drawImage(startreko, 400, 400, null);
		}
		if (blnStartrek == true && bln100 == true) {
			g.drawImage(startrekx, 0, 0, null);
		}
		if (blnStartrek == true && bln101 == true) {
			g.drawImage(startrekx, 0, 200, null);
		}
		if (blnStartrek == true && bln102 == true) {
			g.drawImage(startrekx, 0, 400, null);
		}
		if (blnStartrek == true && bln110 == true) {
			g.drawImage(startrekx, 200, 0, null);
		}
		if (blnStartrek == true && bln111 == true) {
			g.drawImage(startrekx, 200, 200, null);
		}
		if (blnStartrek == true && bln112 == true) {
			g.drawImage(startrekx, 200, 400, null);
		}
		if (blnStartrek == true && bln120 == true) {
			g.drawImage(startrekx, 400, 0, null);
		}
		if (blnStartrek == true && bln121 == true) {
			g.drawImage(startrekx, 400, 200, null);
		}
		if (blnStartrek == true && bln122 == true) {
			g.drawImage(startrekx, 400, 400, null);
		}
		if (blnStartrek == true && bln000 == true) {
			g.drawImage(startreko, 0, 0, null);
		}
		if (blnStartrek == true && bln001 == true) {
			g.drawImage(startreko, 0, 200, null);
		}
		if (blnStartrek == true && bln002 == true) {
			g.drawImage(startreko, 0, 400, null);
		}
		if (blnStartrek == true && bln010 == true) {
			g.drawImage(startreko, 200, 0, null);
		}
		if (blnStartrek == true && bln011 == true) {
			g.drawImage(startreko, 200, 200, null);
		}
		if (blnStartrek == true && bln012 == true) {
			g.drawImage(startreko, 200, 400, null);
		}
		if (blnStartrek == true && bln020 == true) {
			g.drawImage(startreko, 400, 0, null);
		}
		if (blnStartrek == true && bln021 == true) {
			g.drawImage(startreko, 400, 200, null);
		}
		if (blnStartrek == true && bln022 == true) {
			g.drawImage(startreko, 400, 400, null);
		}
		if (blnStartrek == true && bln100 == true) {
			g.drawImage(startrekx, 0, 0, null);
		}
		if (blnStartrek == true && bln101 == true) {
			g.drawImage(startrekx, 0, 200, null);
		}
		if (blnStartrek == true && bln102 == true) {
			g.drawImage(startrekx, 0, 400, null);
		}
		if (blnStartrek == true && bln110 == true) {
			g.drawImage(startrekx, 200, 0, null);
		}
		if (blnStartrek == true && bln111 == true) {
			g.drawImage(startrekx, 200, 200, null);
		}
		if (blnStartrek == true && bln112 == true) {
			g.drawImage(startrekx, 200, 400, null);
		}
		if (blnStartrek == true && bln120 == true) {
			g.drawImage(startrekx, 400, 0, null);
		}
		if (blnStartrek == true && bln121 == true) {
			g.drawImage(startrekx, 400, 200, null);
		}
		if (blnStartrek == true && bln122 == true) {
			g.drawImage(startrekx, 400, 400, null);
		}
		g.drawImage(imgtitle, intTitleX, 10, null);

	}

	// Constructor
	/**
	 * Draws all themes and titles for all panels, including the pieces for tic-tac-toe board
	 */
	public themepanel() {
		try {
			lightboard = ImageIO.read(new File("lightboard.jpg"));
			lighto = ImageIO.read(new File("lighto.png"));
			lightx = ImageIO.read(new File("lightx.png"));
			lightbg = ImageIO.read(new File("lightbg.jpg"));

			darkboard = ImageIO.read(new File("Darkmodeboard.jpg"));
			darkbg = ImageIO.read(new File("Darkmodebg.jpg"));
			darko = ImageIO.read(new File("darko.png"));
			darkx = ImageIO.read(new File("darkx.png"));

			christmasboard = ImageIO.read(new File("christmasboard.jpg"));
			christmasbg = ImageIO.read(new File("Christmasbg.jpg"));
			christmaso = ImageIO.read(new File("hat.png"));
			christmasx = ImageIO.read(new File("shoe.png"));

			halloweenboard = ImageIO.read(new File("halloweenboard.jpg"));
			halloweenbg = ImageIO.read(new File("halloweenbg.jpg"));
			halloweeno = ImageIO.read(new File("halloweeno.png"));
			halloweenx = ImageIO.read(new File("halloweenx.png"));

			neonboard = ImageIO.read(new File("Neonboard.jpg"));
			neonbg = ImageIO.read(new File("Neonbg.jpg"));
			neono = ImageIO.read(new File("Neono.png"));
			neonx = ImageIO.read(new File("Neonx.png"));

			startrekboard = ImageIO.read(new File("Startrekboard.jpg"));
			startrekbg = ImageIO.read(new File("Startrekbg.jpg"));
			startreko = ImageIO.read(new File("Startreko.png"));
			startrekx = ImageIO.read(new File("Startrekx.png"));

			imgtitle = ImageIO.read(new File("animation.png"));

		} catch (IOException e) {
			System.out.println("Unable to load image");
		}
	}

}
