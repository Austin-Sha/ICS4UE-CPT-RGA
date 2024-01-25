import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.JSlider.*;
import java.util.*;

public class helppanel extends JPanel {
	// Properties
	/**
	 * Variable for Help Panel image
	 */
	BufferedImage help = null;

	// Methods
	/**
	 * Draws the Help Panel Image to helppanel
	 */
	public void paintComponent(Graphics g) {
		g.drawImage(help, 0, 0, null);
	}

	// Constructor
	/**
	 * Draws Help Panel Image
	 */
	public helppanel() {
		try {
			help = ImageIO.read(new File("helppanel.jpg"));

		} catch (IOException e) {
			System.out.println("Unable to load image");
		}
	}

}
