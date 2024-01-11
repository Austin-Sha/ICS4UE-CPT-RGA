import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.JSlider.*;
import java.util.*;

public class tictactoe implements ActionListener{
	// Properties
	JFrame mainFrame = new JFrame("Tic Tac Toe!");
	
	// Panels
	themepanel mainPanel = new themepanel();
	themepanel setupPanel = new themepanel();
	themepanel quicksetupPanel = new themepanel();
	themepanel themesPanel = new themepanel();
	JPanel helpPanel = new JPanel();
	abtPanel aboutPanel = new abtPanel();
	
	// Labels
	JLabel test = new JLabel("test");

	// Buttons
	JButton standardButton = new JButton("Standard");
	JButton quickButton = new JButton("Quick Play");
	JButton themeButton = new JButton("Themes");
	JButton helpButton = new JButton("Help");
	JButton aboutButton = new JButton("About");
	JButton backButton = new JButton("Back");
	JButton backButton2 = new JButton("Back");
	JButton backButton3 = new JButton("Back");
	JButton backButton4 = new JButton("Back");
	JButton backButton5 = new JButton("Back");
	
	// Themes JButton
	JButton LightButton = new JButton("Light Mode");
	JButton DarkButton = new JButton("Dark Mode");
	JButton ChristmasButton = new JButton("Christmas");
	JButton HalloweenButton = new JButton("Halloween");
	JButton NeonButton = new JButton("Neon");
	JButton StarTrekButton = new JButton("Star Trek");
	
	// Chat
	// RYAN STUFF
	JTextField nameField = new JTextField();
	//String strName = nameField.getText();

	JButton hostButton = new JButton("Host");
	JButton joinButton = new JButton("Join");
	JTextField sendField = new JTextField();
	JTextField ipField = new JTextField();
	
	JTextArea chatArea = new JTextArea();
	JTextField portField = new JTextField();
	
	JScrollPane thescroll = new JScrollPane(chatArea);
	
	SuperSocketMaster ssm = null;
	//
	
	// Methods
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == standardButton){
			mainFrame.setContentPane(setupPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == backButton){
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == quickButton){
			mainFrame.setContentPane(quicksetupPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == backButton2){
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == themeButton){
			mainFrame.setContentPane(themesPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == backButton3){
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == helpButton){
			mainFrame.setContentPane(helpPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == backButton4){
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == aboutButton){
			mainFrame.setContentPane(aboutPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == backButton5){
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
		}else if(event.getSource() == LightButton){
			mainPanel.repaint();
			
			themesPanel.repaint();
			
			mainPanel.blnlight = false;
			mainPanel.blnlightbg = true;
			mainPanel.blndark = false;
			mainPanel.blndarkbg = false;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmasbg = false;
			mainPanel.blnhalloween = false;
			mainPanel.blnhalloweenbg = false;
			mainPanel.blnneon = false;
			mainPanel.blnneonbg = false;
			mainPanel.blnStartrek = false;
			mainPanel.blnStartrekbg = false;
			
			setupPanel.blnlight = false;
			setupPanel.blnlightbg = true;
			setupPanel.blndark = false;
			setupPanel.blndarkbg = false;
			setupPanel.blnchristmas = false;
			setupPanel.blnchristmasbg = false;
			setupPanel.blnhalloween = false;
			setupPanel.blnhalloweenbg = false;
			setupPanel.blnneon = false;
			setupPanel.blnneonbg = false;
			setupPanel.blnStartrek = false;
			setupPanel.blnStartrekbg = false;
			
			themesPanel.blnlight = true;
			themesPanel.blnlightbg = true;
			themesPanel.blndark = false;
			themesPanel.blndarkbg = false;
			themesPanel.blnchristmas = false;
			themesPanel.blnchristmasbg = false;
			themesPanel.blnhalloween = false;
			themesPanel.blnhalloweenbg = false;
			themesPanel.blnneon = false;
			themesPanel.blnneonbg = false;
			themesPanel.blnStartrek = false;
			themesPanel.blnStartrekbg = false;
		}else if(event.getSource() == DarkButton){
			themesPanel.repaint();
			mainPanel.repaint();
			
			mainPanel.blnlight = false;
			mainPanel.blnlightbg = false;
			mainPanel.blndark = false;
			mainPanel.blndarkbg = true;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmasbg = false;
			mainPanel.blnhalloween = false;
			mainPanel.blnhalloweenbg = false;
			mainPanel.blnneon = false;
			mainPanel.blnneonbg = false;
			mainPanel.blnStartrek = false;
			mainPanel.blnStartrekbg = false;
			themesPanel.blnlight = false;
			themesPanel.blnlightbg = false;
			themesPanel.blndark = true;
		}else if(event.getSource() == ChristmasButton){
			themesPanel.repaint();
			mainPanel.repaint();
			
			mainPanel.blnlight = false;
			mainPanel.blndark = false;
			mainPanel.blndarkbg = false;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmasbg = true;
			
			themesPanel.blnlight = false;
			themesPanel.blnlightbg = false;
			themesPanel.blndark = false;
			themesPanel.blndarkbg = false;
			themesPanel.blnchristmas = true;
			themesPanel.blnchristmasbg = true;
			themesPanel.blnhalloween = false;
			themesPanel.blnhalloweenbg = false;
			themesPanel.blnneon = false;
			themesPanel.blnneonbg = false;
			themesPanel.blnStartrek = false;
			themesPanel.blnStartrekbg = false;
			
		}
		
		if(event.getSource() == sendField){
			System.out.println("Send: "+sendField.getText());
			ssm.sendText(nameField.getText() + ":" + sendField.getText());
			chatArea.append("You: " + sendField.getText() + "\n");
			sendField.setText("");			
		}else if(event.getSource() == hostButton){
			System.out.println("Start socket in server mode");
			hostButton.setEnabled(false);
			joinButton.setEnabled(false);
			ssm = new SuperSocketMaster(Integer.parseInt(portField.getText()), this);
			ssm.connect();
			ipField.setText(ssm.getMyAddress());
			
			System.out.println(nameField.getText());
		}else if(event.getSource() == joinButton){
			System.out.println("Start socket in client mode");
			hostButton.setEnabled(false);
			joinButton.setEnabled(false);
			ssm = new SuperSocketMaster(ipField.getText(),Integer.parseInt(portField.getText()), this);
			ssm.connect();
		}else if(event.getSource() == ssm){
			
			String[] strChat = ssm.readText().split(":");
			
			try{
				chatArea.append(strChat[0] + ": "+ strChat[1] + "\n");
			}catch(IndexOutOfBoundsException e){
				System.out.println("uwu :3      "+strChat[0]);
			}
		}
		
		
		
	}
	
	// Constructor
	tictactoe(){
		
		setupPanel.setLayout(null);
		setupPanel.setPreferredSize(new Dimension(1280,720));
		backButton.setSize(100,50);
		backButton.setLocation(600,600);
		setupPanel.add(backButton);
		backButton.addActionListener(this);
		
		quicksetupPanel.setLayout(null);
		quicksetupPanel.setPreferredSize(new Dimension(1280,720));
		backButton2.setSize(100,50);
		backButton2.setLocation(600,600);
		quicksetupPanel.add(backButton2);
		backButton2.addActionListener(this);
		
		themesPanel.setLayout(null);
		themesPanel.setPreferredSize(new Dimension(1280,720));
		LightButton.setSize(300,75);
		LightButton.setLocation(850,75);
		DarkButton.setSize(300,75);
		DarkButton.setLocation(850,150);
		ChristmasButton.setSize(300,75);
		ChristmasButton.setLocation(850,225);
		HalloweenButton.setSize(300,75);
		HalloweenButton.setLocation(850,300);
		NeonButton.setSize(300,75);
		NeonButton.setLocation(850,375);
		StarTrekButton.setSize(300,75);
		StarTrekButton.setLocation(850,450);
		
		backButton3.setSize(100,50);
		backButton3.setLocation(600,600);
		
		
		themesPanel.add(backButton3);
		themesPanel.add(LightButton);
		themesPanel.add(DarkButton);
		themesPanel.add(ChristmasButton);
		themesPanel.add(HalloweenButton);
		themesPanel.add(NeonButton);
		themesPanel.add(StarTrekButton);
		backButton3.addActionListener(this);
		LightButton.addActionListener(this);
		DarkButton.addActionListener(this);
		ChristmasButton.addActionListener(this);
		HalloweenButton.addActionListener(this);
		NeonButton.addActionListener(this);
		StarTrekButton.addActionListener(this);
		
		helpPanel.setLayout(null);
		helpPanel.setPreferredSize(new Dimension(1280,720));
		backButton4.setSize(100,50);
		backButton4.setLocation(600,600);
		helpPanel.add(backButton4);
		backButton4.addActionListener(this);
		
		aboutPanel.setLayout(null);
		aboutPanel.setPreferredSize(new Dimension(1280,720));
		backButton5.setSize(100,50);
		backButton5.setLocation(590,610);
		aboutPanel.add(backButton5);
		backButton5.addActionListener(this);
		
		mainPanel.setLayout(null);
		mainPanel.setPreferredSize(new Dimension(1280,720));
		standardButton.setSize(300,75);
		standardButton.setLocation(850,175);
		quickButton.setSize(300,75);
		quickButton.setLocation(850,250);
		themeButton.setSize(300,75);
		themeButton.setLocation(850,325);
		helpButton.setSize(300,75);
		helpButton.setLocation(850,400);
		aboutButton.setSize(300,75);
		aboutButton.setLocation(850,475);
		standardButton.addActionListener(this);
		quickButton.addActionListener(this);
		themeButton.addActionListener(this);
		helpButton.addActionListener(this);
		aboutButton.addActionListener(this);
		mainPanel.add(standardButton);
		mainPanel.add(quickButton);
		mainPanel.add(themeButton);
		mainPanel.add(helpButton);
		mainPanel.add(aboutButton);
		
		nameField.setSize(200,50);
		nameField.setLocation(950,80);
		
		thescroll.setSize(400,400);
		thescroll.setLocation(850,50);
		
		sendField.setSize(400,50);
		sendField.setLocation(850,450);
		sendField.addActionListener(this);
		
		ipField.setSize(200,50);
		ipField.setLocation(850,500);
	
		portField.setSize(200,50);
		portField.setLocation(1050,500);
		
		hostButton.setSize(200,50);
		hostButton.setLocation(850,550);
		hostButton.addActionListener(this);

		joinButton.setSize(200,50);
		joinButton.setLocation(1050,550);
		joinButton.addActionListener(this);

		mainPanel.add(nameField);
		setupPanel.add(thescroll);
		setupPanel.add(sendField);
		setupPanel.add(ipField);
		setupPanel.add(portField);
		setupPanel.add(hostButton);
		setupPanel.add(joinButton);
		
		mainFrame.setContentPane(mainPanel);
		mainFrame.pack();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	}

	// Main Method
	public static void main(String[] args){
		new tictactoe();
	}


}
