import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.JSlider.*;
import java.util.*;

public class abtPanel extends JPanel {
	// Properties
	/**
	 * Variable for About Panel image
	 */
	BufferedImage about = null;

	// Methods
	/**
	 * Draws aboutpanel Image
	 */
	public void paintComponent(Graphics g) {
		g.drawImage(about, 0, 0, null);
	}

	// Constructor
	/**
	 * Draws About Panel Image
	 */
	public abtPanel() {
		try {
			about = ImageIO.read(new File("abt.png"));
		} catch (IOException e) {
			System.out.println("Unable to load image");
		}
	}

}
