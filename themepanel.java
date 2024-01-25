import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.JSlider.*;
import java.util.*;

public class themepanel extends JPanel{
	// Properties
	BufferedImage lightboard = null;
	BufferedImage lighto = null;
	BufferedImage lightx = null;
	BufferedImage lightbg = null;
	
	BufferedImage darkboard = null;
	BufferedImage darko = null;
	BufferedImage darkx = null;
	BufferedImage darkbg = null;
	
	BufferedImage christmasboard = null;
	BufferedImage christmaso = null;
	BufferedImage christmasx = null;
	BufferedImage christmasbg = null;
	
	BufferedImage halloweenboard = null;
	BufferedImage halloweenbg = null;
	BufferedImage halloweenx = null;
	BufferedImage halloweeno = null;
	
	BufferedImage neonboard = null;
	BufferedImage neonbg = null;
	BufferedImage neonx = null;
	BufferedImage neono = null;
	
	BufferedImage startrekboard = null;
	BufferedImage startrekbg = null;
	BufferedImage startrekx = null;
	BufferedImage startreko = null;

	
	public boolean blnlight = true;
	public boolean blndark = false;
	public boolean blnchristmas = false;
	public boolean blnhalloween = false;
	public boolean blnneon = false;
	public boolean blnStartrek = false;
	
	public boolean blnlighttheme = false;
	public boolean blndarktheme = false;
	public boolean blnchristmastheme = false;
	public boolean blnhalloweentheme = false;
	public boolean blnneontheme = false;
	public boolean blnStartrektheme = false;
	
	
	// first digit is the player: 0 - player 1(you), 1 - Player 2(other player)
	// second and their digit represents the x and y of the board in index format
	public boolean bln000 = false;
	public boolean bln100 = false;
	public boolean bln001 = false;
	public boolean bln101 = false;
	public boolean bln002 = false;
	public boolean bln102 = false;
	public boolean bln010 = false;
	public boolean bln110 = false;
	public boolean bln011 = false;
	public boolean bln111 = false;
	public boolean bln012 = false;
	public boolean bln112 = false;
	public boolean bln020 = false;
	public boolean bln120 = false;
	public boolean bln021 = false;
	public boolean bln121 = false;
	public boolean bln022 = false;
	public boolean bln122 = false;
	
	// Methods
	public void paintComponent(Graphics g){
		if(blnlighttheme == true){
			g.drawImage(lightbg,0,0,null);
			g.drawImage(lightboard, 0,0, null);
			g.drawImage(lightx,200,200,null);
			g.drawImage(lighto,0,0,null);
		}else if(blnlight == true){
			g.drawImage(lightbg,0,0, null);
			g.drawImage(lightboard, 0,0, null);
		}else if(blndarktheme == true){
			g.drawImage(darkbg,0,0,null);
			g.drawImage(darkboard,0,0,null);
			g.drawImage(darko,0,200,null);
			g.drawImage(darkx,200,200,null);
		}else if(blndark == true){
			g.drawImage(darkbg,0,0, null);
			g.drawImage(darkboard,0,0, null);
		}else if(blnchristmastheme == true){
			g.drawImage(christmasbg,0,0, null);
			g.drawImage(christmasboard,0,0, null);
			g.drawImage(christmaso,0,400, null);
			g.drawImage(christmasx,200,200, null);
		}else if(blnchristmas == true){
			g.drawImage(christmasbg,0,0, null);
			g.drawImage(christmasboard,0,0, null);
		}else if(blnhalloweentheme == true){
			g.drawImage(halloweenbg,0,0, null);
			g.drawImage(halloweenboard,0,0, null);
			g.drawImage(halloweeno,200,400, null);
			g.drawImage(halloweenx,200,200, null);
		}else if(blnhalloween == true){
			g.drawImage(halloweenbg,0,0, null);
			g.drawImage(halloweenboard,0,0, null);
		}else if(blnStartrek == true){
			g.drawImage(startrekbg,0,0, null);
			g.drawImage(startrekboard,0, 0, null);
		}else if(blnStartrektheme == true){
			g.drawImage(startrekbg,0,0, null);
			g.drawImage(startrekboard,0,0, null);
			g.drawImage(startreko,400,400, null);
			g.drawImage(startrekx,200,200, null);
		}else if(blnneontheme == true){
			g.drawImage(neonbg,0,0, null);
			g.drawImage(neonboard,0,0, null);
			g.drawImage(neono,400,400, null);
			g.drawImage(neonx,200,200, null);
		}else if(blnneon = true){
			g.drawImage(neonbg,0,0, null);
			g.drawImage(neonboard,0,0, null);
		}
		if(blnlight == true && bln000 == true){
			g.drawImage(lighto,0,0, null);
			}if(blnlight == true && bln001 == true){
			g.drawImage(lighto,0,200, null);
			}if(blnlight == true && bln002 == true){
			g.drawImage(lighto,0,400, null);
			}if(blnlight == true && bln010 == true){
			g.drawImage(lighto,200,0, null);
			}if(blnlight == true && bln011 == true){
			g.drawImage(lighto,200,200, null);
			}if(blnlight == true && bln012 == true){
			g.drawImage(lighto,200,400, null);
			}if(blnlight == true && bln020 == true){
			g.drawImage(lighto,400,0, null);
			}if(blnlight == true && bln021 == true){
			g.drawImage(lighto,400,200, null);
			}if(blnlight == true && bln022 == true){
			g.drawImage(lighto,400,400, null);
			}if(blnlight == true && bln100 == true){
			g.drawImage(lightx,0,0, null);
			}if(blnlight == true && bln101 == true){
			g.drawImage(lightx,0,200, null);
			}if(blnlight == true && bln102 == true){
			g.drawImage(lightx,0,400, null);
			}if(blnlight == true && bln110 == true){
			g.drawImage(lightx,200,0, null);
			}if(blnlight == true && bln111 == true){
			g.drawImage(lightx,200,200, null);
			}if(blnlight == true && bln112 == true){
			g.drawImage(lightx,200,400, null);
			}if(blnlight == true && bln120 == true){
			g.drawImage(lightx,400,000, null);
			}if(blnlight == true && bln121 == true){
			g.drawImage(lightx,400,200, null);
			}if(blnlight == true && bln122 == true){
			g.drawImage(lightx,400,400, null);
			}
			
			if(blndark == true && bln000 == true){
			g.drawImage(darko,0,0, null);
			}if(blndark == true && bln001 == true){
			g.drawImage(darko,0,200, null);
			}if(blndark == true && bln002 == true){
			g.drawImage(darko,0,400, null);
			}if(blndark == true && bln010 == true){
			g.drawImage(darko,200,0, null);
			}if(blndark == true && bln011 == true){
			g.drawImage(darko,200,200, null);
			}if(blndark == true && bln012 == true){
			g.drawImage(darko,200,400, null);
			}if(blndark == true && bln020 == true){
			g.drawImage(darko,400,0, null);
			}if(blndark == true && bln021 == true){
			g.drawImage(darko,400,200, null);
			}if(blndark == true && bln022 == true){
			g.drawImage(darko,400,400, null);
			}if(blndark == true && bln100 == true){
			g.drawImage(darkx,0,0, null);
			}if(blndark == true && bln101 == true){
			g.drawImage(darkx,0,200, null);
			}if(blndark == true && bln102 == true){
			g.drawImage(darkx,0,400, null);
			}if(blndark == true && bln110 == true){
			g.drawImage(darkx,200,0, null);
			}if(blndark == true && bln111 == true){
			g.drawImage(darkx,200,200, null);
			}if(blndark == true && bln112 == true){
			g.drawImage(darkx,200,400, null);
			}if(blndark == true && bln120 == true){
			g.drawImage(darkx,400,0, null);
			}if(blndark == true && bln121 == true){
			g.drawImage(darkx,400,200, null);
			}if(blndark == true && bln122 == true){
			g.drawImage(darkx,400,400, null);
			}
			
			if(blnchristmas == true && bln000 == true){
			g.drawImage(christmaso,0,0, null);
			}if(blnchristmas == true && bln001 == true){
			g.drawImage(christmaso,0,200, null);
			}if(blnchristmas == true && bln002 == true){
			g.drawImage(christmaso,0,400, null);
			}if(blnchristmas == true && bln010 == true){
			g.drawImage(christmaso,200,0, null);
			}if(blnchristmas == true && bln011 == true){
			g.drawImage(christmaso,200,200, null);
			}if(blnchristmas == true && bln012 == true){
			g.drawImage(christmaso,200,400, null);
			}if(blnchristmas == true && bln020 == true){
			g.drawImage(christmaso,400,0, null);
			}if(blnchristmas == true && bln021 == true){
			g.drawImage(christmaso,400,200, null);
			}if(blnchristmas == true && bln022 == true){
			g.drawImage(christmaso,400,400, null);
			}if(blnchristmas == true && bln100 == true){
			g.drawImage(christmasx,0,0, null);
			}if(blnchristmas == true && bln101 == true){
			g.drawImage(christmasx,0,200, null);
			}if(blnchristmas == true && bln102 == true){
			g.drawImage(christmasx,0,400, null);
			}if(blnchristmas == true && bln110 == true){
			g.drawImage(christmasx,200,0, null);
			}if(blnchristmas == true && bln111 == true){
			g.drawImage(christmasx,200,200, null);
			}if(blnchristmas == true && bln112 == true){
			g.drawImage(christmasx,200,400, null);
			}if(blnchristmas == true && bln120 == true){
			g.drawImage(christmasx,400,0, null);
			}if(blnchristmas == true && bln121 == true){
			g.drawImage(christmasx,400,200, null);
			}if(blnchristmas == true && bln122 == true){
			g.drawImage(christmasx,400,400, null);
			}
			
			if(blnhalloween == true && bln000 == true){
			g.drawImage(halloweeno,0,0, null);
			}if(blnhalloween == true && bln001 == true){
			g.drawImage(halloweeno,0,200, null);
			}if(blnhalloween == true && bln002 == true){
			g.drawImage(halloweeno,0,400, null);
			}if(blnhalloween == true && bln010 == true){
			g.drawImage(halloweeno,200,0, null);
			}if(blnhalloween == true && bln011 == true){
			g.drawImage(halloweeno,200,200, null);
			}if(blnhalloween == true && bln012 == true){
			g.drawImage(halloweeno,200,400, null);
			}if(blnhalloween == true && bln020 == true){
			g.drawImage(halloweeno,400,0, null);
			}if(blnhalloween == true && bln021 == true){
			g.drawImage(halloweeno,400,200, null);
			}if(blnhalloween == true && bln022 == true){
			g.drawImage(halloweeno,400,400, null);
			}if(blnhalloween == true && bln100 == true){
			g.drawImage(halloweenx,0,0, null);
			}if(blnhalloween == true && bln101 == true){
			g.drawImage(halloweenx,0,200, null);
			}if(blnhalloween == true && bln102 == true){
			g.drawImage(halloweenx,0,400, null);
			}if(blnhalloween == true && bln110 == true){
			g.drawImage(halloweenx,200,0, null);
			}if(blnhalloween == true && bln111 == true){
			g.drawImage(halloweenx,200,200, null);
			}if(blnhalloween == true && bln112 == true){
			g.drawImage(halloweenx,200,400, null);
			}if(blnhalloween == true && bln120 == true){
			g.drawImage(halloweenx,400,0, null);
			}if(blnhalloween == true && bln121 == true){
			g.drawImage(halloweenx,400,200, null);
			}if(blnhalloween == true && bln122 == true){
			g.drawImage(halloweenx,400,400, null);
			}
			
			if(blnneon == true && bln000 == true){
			g.drawImage(neono,0,0, null);
			}if(blnneon == true && bln001 == true){
			g.drawImage(neono,0,200, null);
			}if(blnneon == true && bln002 == true){
			g.drawImage(neono,0,400, null);
			}if(blnneon == true && bln010 == true){
			g.drawImage(neono,200,0, null);
			}if(blnneon == true && bln011 == true){
			g.drawImage(neono,200,200, null);
			}if(blnneon == true && bln012 == true){
			g.drawImage(neono,200,400, null);
			}if(blnneon == true && bln020 == true){
			g.drawImage(neono,400,0, null);
			}if(blnneon == true && bln021 == true){
			g.drawImage(neono,400,200, null);
			}if(blnneon == true && bln022 == true){
			g.drawImage(neono,400,400, null);
			}if(blnneon == true && bln100 == true){
			g.drawImage(neonx,0,0, null);
			}if(blnneon == true && bln101 == true){
			g.drawImage(neonx,0,200, null);
			}if(blnneon == true && bln102 == true){
			g.drawImage(neonx,0,400, null);
			}if(blnneon == true && bln110 == true){
			g.drawImage(neonx,200,0, null);
			}if(blnneon == true && bln111 == true){
			g.drawImage(neonx,200,200, null);
			}if(blnneon == true && bln112 == true){
			g.drawImage(neonx,200,400, null);
			}if(blnneon == true && bln120 == true){
			g.drawImage(neonx,400,0, null);
			}if(blnneon == true && bln121 == true){
			g.drawImage(neonx,400,200, null);
			}if(blnneon == true && bln122 == true){
			g.drawImage(neonx,400,400, null);
			}
			
			if(blnStartrek == true && bln000 == true){
			g.drawImage(startreko,0,0, null);
			}if(blnStartrek == true && bln001 == true){
			g.drawImage(startreko,0,200, null);
			}if(blnStartrek == true && bln002 == true){
			g.drawImage(startreko,0,400, null);
			}if(blnStartrek == true && bln010 == true){
			g.drawImage(startreko,200,0, null);
			}if(blnStartrek == true && bln011 == true){
			g.drawImage(startreko,200,200, null);
			}if(blnStartrek == true && bln012 == true){
			g.drawImage(startreko,200,400, null);
			}if(blnStartrek == true && bln020 == true){
			g.drawImage(startreko,400,0, null);
			}if(blnStartrek == true && bln021 == true){
			g.drawImage(startreko,400,200, null);
			}if(blnStartrek == true && bln022 == true){
			g.drawImage(startreko,400,400, null);
			}if(blnStartrek == true && bln100 == true){
			g.drawImage(startrekx,0,0, null);
			}if(blnStartrek == true && bln101 == true){
			g.drawImage(startrekx,0,200, null);
			}if(blnStartrek == true && bln102 == true){
			g.drawImage(startrekx,0,400, null);
			}if(blnStartrek == true && bln110 == true){
			g.drawImage(startrekx,200,0, null);
			}if(blnStartrek == true && bln111 == true){
			g.drawImage(startrekx,200,200, null);
			}if(blnStartrek == true && bln112 == true){
			g.drawImage(startrekx,200,400, null);
			}if(blnStartrek == true && bln120 == true){
			g.drawImage(startrekx,400,0, null);
			}if(blnStartrek == true && bln121 == true){
			g.drawImage(startrekx,400,200, null);
			}if(blnStartrek == true && bln122 == true){
			g.drawImage(startrekx,400,400, null);
			}
			if(blnStartrek == true && bln000 == true){ 
				g.drawImage(startreko,0,0, null);
			}if(blnStartrek == true && bln001 == true){
				g.drawImage(startreko,0,200, null);
			}if(blnStartrek == true && bln002 == true){
				g.drawImage(startreko,0,400, null);
			}if(blnStartrek == true && bln010 == true){
				g.drawImage(startreko,200,0, null);
			}if(blnStartrek == true && bln011 == true){
				g.drawImage(startreko,200,200, null);
			}if(blnStartrek == true && bln012 == true){
				g.drawImage(startreko,200,400, null);
			}if(blnStartrek == true && bln020 == true){
				g.drawImage(startreko,400,0, null);
			}if(blnStartrek == true && bln021 == true){
				g.drawImage(startreko,400,200, null);
			}if(blnStartrek == true && bln022 == true){
				g.drawImage(startreko,400,400, null);
			}if(blnStartrek == true && bln100 == true){ 
				g.drawImage(startrekx,0,0, null);
			}if(blnStartrek == true && bln101 == true){
				g.drawImage(startrekx,0,200, null);
			}if(blnStartrek == true && bln102 == true){
				g.drawImage(startrekx,0,400, null);
			}if(blnStartrek == true && bln110 == true){
				g.drawImage(startrekx,200,0, null);
			}if(blnStartrek == true && bln111 == true){
				g.drawImage(startrekx,200,200, null);
			}if(blnStartrek == true && bln112 == true){
				g.drawImage(startrekx,200,400, null);
			}if(blnStartrek == true && bln120 == true){
				g.drawImage(startrekx,400,0, null);
			}if(blnStartrek == true && bln121 == true){
				g.drawImage(startrekx,400,200, null);
			}if(blnStartrek == true && bln122 == true){
				g.drawImage(startrekx,400,400, null);
			}
			
		
		
		
		
	}

	
	
	
	
	// Constructor
	public themepanel(){
		try{
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
			
		}catch(IOException e){
			System.out.println("Unable to load image");
		}
	}
	
	
	
}	
