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
	public boolean blnlightbg = true;
	public boolean blndark = false;
	public boolean blndarkbg = false;
	public boolean blnchristmas = false;
	public boolean blnchristmasbg = false;
	public boolean blnhalloween = false;
	public boolean blnhalloweenbg = false;
	public boolean blnneon = false;
	public boolean blnneonbg = false;
	public boolean blnStartrek = false;
	public boolean blnStartrekbg = false;
	
	// Methods
	public void paintComponent(Graphics g){
		if(blnlight == true && blnlightbg == true){
			g.drawImage(lightbg,30,30,null);
			g.drawImage(lightboard, 0,0, null);
			g.drawImage(lightx,200,200,null);
			g.drawImage(lighto,0,0,null);
		}else if(blnlight == false && blnlightbg == true){
			g.drawImage(lightbg,0,0, null);
		}else if(blndark == true){
			g.drawImage(darkbg,0,0,null);
			g.drawImage(darkboard,0,0,null);
			g.drawImage(darko,0,200,null);
			g.drawImage(darkx,200,200,null);
		}else if(blndark == false && blndarkbg == true){
			g.drawImage(darkbg,0,0, null);
		}else if(blnchristmas == true && blnchristmasbg == true){
			g.drawImage(christmasbg,0,0, null);
			g.drawImage(christmasboard,0,0, null);
			g.drawImage(christmaso,0,400, null);
			g.drawImage(christmasx,200,200, null);
		}else if(blnchristmas == false && blnchristmasbg == true){
			g.drawImage(christmasbg,0,0, null);
		}else if(blnhalloween == true && blnchristmasbg == true){
			g.drawImage(halloweenbg,0,0, null);
			g.drawImage(halloweenboard,0,0, null);
			g.drawImage(halloweeno,0,0, null);
			g.drawImage(halloweenx,0,0, null);
		}else if(blnhalloween == false && blnhalloweenbg == true){
			g.drawImage(halloweenbg,0,0, null);
		}else if(blnneon == true && blnneonbg == true){
			g.drawImage(neonbg,0,0, null);
			g.drawImage(neonboard,0,0, null);
			g.drawImage(neono,0,400, null);
			g.drawImage(neonx,200,200, null);
		}else if(blnneon == false && blnneonbg == true){
			g.drawImage(neonbg,0,0, null);
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
			
			
		}catch(IOException e){
			System.out.println("Unable to load image");
		}
	}
	
	
	
}	
