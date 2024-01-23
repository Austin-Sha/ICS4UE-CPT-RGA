import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;
import javax.swing.JSlider.*;
import java.util.*;

public class tictactoe implements ActionListener, MouseListener {
	// Properties
	JFrame mainFrame = new JFrame("Tic Tac Toe!");

	// GAMEPLAY
	int[][] game = new int[3][3];
	int intPlayerYou;
	int intPlayer2;
	boolean blnstandard;
	boolean blnturn;
	int intMoves = 0;

	// Panels
	themepanel mainPanel = new themepanel();
	themepanel standardPanel = new themepanel();
	themepanel quickPanel = new themepanel();
	themepanel themesPanel = new themepanel();
	JPanel helpPanel = new JPanel();
	abtPanel aboutPanel = new abtPanel();

	// Labels
	JLabel test = new JLabel("test");

	JLabel nameLabel = new JLabel("Name: ");
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

	// New
	JButton confirm1 = new JButton("Confirm Name");
	JButton confirm2 = new JButton("Confirm Name");
	// Themes JButton
	JButton LightButton = new JButton("Light Mode");
	JButton DarkButton = new JButton("Dark Mode");
	JButton ChristmasButton = new JButton("Christmas");
	JButton HalloweenButton = new JButton("Halloween");
	JButton NeonButton = new JButton("Neon");
	JButton StarTrekButton = new JButton("Star Trek");

	// Chat setup
	JTextField nameField = new JTextField();

	JButton hostButton = new JButton("Host");
	JButton joinButton = new JButton("Join");
	JTextField sendField = new JTextField();
	JTextField ipField = new JTextField();

	JTextArea chatArea = new JTextArea();
	JTextField portField = new JTextField();

	JScrollPane thescroll = new JScrollPane(chatArea);

	SuperSocketMaster ssm = null;

	// Header
	int intWins = 0;
	int intLosses = 0;
	int intTies = 0;

	JLabel headerLabel = new JLabel("Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);

	Font theFont = null;

	// Methods
	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {
		if (blnstandard == true) {
			if (blnturn == true) {
				standardPanel.repaint();
				if (e.getX() > 0 && e.getX() < 200 && e.getY() > 0 && e.getY() < 200) {
					ssm.sendText("#:0:0:send");
					standardPanel.bln000 = true;
				} else if (e.getX() > 0 && e.getX() < 200 && e.getY() > 200 && e.getY() < 400) {
					ssm.sendText("#:1:0:send");
					standardPanel.bln001 = true;
				} else if (e.getX() > 0 && e.getX() < 200 && e.getY() > 400 && e.getY() < 600) {
					ssm.sendText("#:2:0:send");
					standardPanel.bln002 = true;
				} else if (e.getX() > 200 && e.getX() < 400 && e.getY() > 0 && e.getY() < 200) {
					ssm.sendText("#:0:1:send");
					standardPanel.bln010 = true;
				} else if (e.getX() > 400 && e.getX() < 600 && e.getY() > 0 && e.getY() < 200) {
					ssm.sendText("#:0:2:send");
					standardPanel.bln020 = true;
				} else if (e.getX() > 200 && e.getX() < 400 && e.getY() > 200 && e.getY() < 400) {
					ssm.sendText("#:1:1:send");
					standardPanel.bln011 = true;
				} else if (e.getX() > 400 && e.getX() < 600 && e.getY() > 200 && e.getY() < 400) {
					ssm.sendText("#:1:2:send");
					standardPanel.bln021 = true;
				} else if (e.getX() > 200 && e.getX() < 400 && e.getY() > 400 && e.getY() < 600) {
					ssm.sendText("#:2:1:send");
					standardPanel.bln012 = true;
				} else if (e.getX() > 400 && e.getX() < 600 && e.getY() > 400 && e.getY() < 600) {
					ssm.sendText("#:2:2:send");
					standardPanel.bln022 = true;
				} else {
				}

			} else if (e.getX() > 0 && e.getX() < 600 && e.getY() > 0 && e.getY() < 600) {
				chatArea.append("System: Not Your Turn \n");
			}

		} else {
			if (e.getX() > 0 && e.getX() < 200 && e.getY() > 0 && e.getY() < 200) {
				ssm.sendText("#:0:0:send");
			} else if (e.getX() > 0 && e.getX() < 200 && e.getY() > 200 && e.getY() < 400) {
				ssm.sendText("#:1:0:send");
			} else if (e.getX() > 0 && e.getX() < 200 && e.getY() > 400 && e.getY() < 600) {
				ssm.sendText("#:2:0:send");
			} else if (e.getX() > 200 && e.getX() < 400 && e.getY() > 0 && e.getY() < 200) {
				ssm.sendText("#:0:1:send");
			} else if (e.getX() > 400 && e.getX() < 600 && e.getY() > 0 && e.getY() < 200) {
				ssm.sendText("#:0:2:send");
			} else if (e.getX() > 200 && e.getX() < 400 && e.getY() > 200 && e.getY() < 400) {
				ssm.sendText("#:1:1:send");
			} else if (e.getX() > 400 && e.getX() < 600 && e.getY() > 200 && e.getY() < 400) {
				ssm.sendText("#:1:2:send");
			} else if (e.getX() > 200 && e.getX() < 400 && e.getY() > 400 && e.getY() < 600) {
				ssm.sendText("#:2:1:send");
			} else if (e.getX() > 400 && e.getX() < 600 && e.getY() > 400 && e.getY() < 600) {
				ssm.sendText("#:2:2:send");
			} else {
			}
		}

	}

	public void actionPerformed(ActionEvent event) {
		// Button for entering and exiting panels
		if (event.getSource() == standardButton) {
			// New
			// Delete panel switch code
			blnstandard = true;

			standardButton.setVisible(false);
			quickButton.setVisible(false);
			themeButton.setVisible(false);
			helpButton.setVisible(false);
			aboutButton.setVisible(false);
			nameField.setVisible(true);
			confirm1.setVisible(true);
			
		} else if (event.getSource() == backButton) {

			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
			standardButton.setVisible(true);
			quickButton.setVisible(true);
			themeButton.setVisible(true);
			helpButton.setVisible(true);
			aboutButton.setVisible(true);
			nameField.setVisible(false);
			confirm1.setVisible(false);

		} else if (event.getSource() == quickButton) {
			// New
			// Delete panel switch code
			blnstandard = true;
			standardButton.setVisible(false);
			quickButton.setVisible(false);
			themeButton.setVisible(false);
			helpButton.setVisible(false);
			aboutButton.setVisible(false);
			nameField.setVisible(true);
			confirm2.setVisible(true);
			// End
		} else if (event.getSource() == backButton2) {
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
			standardButton.setVisible(true);
			quickButton.setVisible(true);
			themeButton.setVisible(true);
			helpButton.setVisible(true);
			aboutButton.setVisible(true);
			nameField.setVisible(false);
			confirm1.setVisible(false);
		} else if (event.getSource() == confirm1) {
			mainFrame.setContentPane(standardPanel);
			mainFrame.pack();
			mainFrame.repaint();
<<<<<<< HEAD
			
			
		} else if (event.getSource() == confirm2) { 
=======
		} else if (event.getSource() == confirm2) {
>>>>>>> b52357fbd72f80d6ae8de806c44ff7acc2fe8b27
			mainFrame.setContentPane(quickPanel);
			mainFrame.pack();
			mainFrame.repaint();
			// End
		} else if (event.getSource() == themeButton) {
			mainFrame.setContentPane(themesPanel);
			mainFrame.pack();
			mainFrame.repaint();
		} else if (event.getSource() == backButton3) {
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
		} else if (event.getSource() == helpButton) {
			mainFrame.setContentPane(helpPanel);
			mainFrame.pack();
			mainFrame.repaint();
		} else if (event.getSource() == backButton4) {
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();
		} else if (event.getSource() == aboutButton) {
			mainFrame.setContentPane(aboutPanel);
			mainFrame.pack();
			mainFrame.repaint();
		} else if (event.getSource() == backButton5) {
			mainFrame.setContentPane(mainPanel);
			mainFrame.pack();
			mainFrame.repaint();

			// End of panel buttons
		} else if (event.getSource() == LightButton) { //NEW****
			// Theme buttons

			mainPanel.repaint();
			standardPanel.repaint();
			themesPanel.repaint();

			mainPanel.blnlight = true;
			mainPanel.blnlighttheme = false;
			mainPanel.blndark = false;
			mainPanel.blndarktheme = false;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmastheme = false;
			mainPanel.blnhalloween = false;
			mainPanel.blnhalloweentheme = false;
			mainPanel.blnneon = false;
			mainPanel.blnneontheme = false;
			mainPanel.blnStartrek = false;
			mainPanel.blnStartrektheme = false;

			standardPanel.blnlight = true;
			standardPanel.blnlighttheme = false;
			standardPanel.blndark = false;
			standardPanel.blndarktheme = false;
			standardPanel.blnchristmas = false;
			standardPanel.blnchristmastheme = false;
			standardPanel.blnhalloween = false;
			standardPanel.blnhalloweentheme = false;
			standardPanel.blnneon = false;
			standardPanel.blnneontheme = false;
			standardPanel.blnStartrek = false;
			standardPanel.blnStartrektheme = false;

			quickPanel.blnlight = true;
			quickPanel.blnlighttheme = false;
			quickPanel.blndark = false;
			quickPanel.blndarktheme = false;
			quickPanel.blnchristmas = false;
			quickPanel.blnchristmastheme = false;
			quickPanel.blnhalloween = false;
			quickPanel.blnhalloweentheme = false;
			quickPanel.blnneon = false;
			quickPanel.blnneontheme = false;
			quickPanel.blnStartrek = false;
			quickPanel.blnStartrektheme = false;

			themesPanel.blnlight = false;
			themesPanel.blnlighttheme = true;
			themesPanel.blndark = false;
			themesPanel.blndarktheme = false;
			themesPanel.blnchristmas = false;
			themesPanel.blnchristmastheme = false;
			themesPanel.blnhalloween = false;
			themesPanel.blnhalloweentheme = false;
			themesPanel.blnneon = false;
			themesPanel.blnneontheme = false;
			themesPanel.blnStartrek = false;
			themesPanel.blnStartrektheme = false;
		} else if (event.getSource() == DarkButton) {
			mainPanel.repaint();
			standardPanel.repaint();
			themesPanel.repaint();

			mainPanel.blnlight = false;
			mainPanel.blnlighttheme = false;
			mainPanel.blndark = false;
			mainPanel.blndarktheme = true;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmastheme = false;
			mainPanel.blnhalloween = false;
			mainPanel.blnhalloweentheme = false;
			mainPanel.blnneon = false;
			mainPanel.blnneontheme = false;
			mainPanel.blnStartrek = false;
			mainPanel.blnStartrektheme = false;

			standardPanel.blnlight = false;
			standardPanel.blnlighttheme = false;
			standardPanel.blndark = false;
			standardPanel.blndarktheme = true;
			standardPanel.blnchristmas = false;
			standardPanel.blnchristmastheme = false;
			standardPanel.blnhalloween = false;
			standardPanel.blnhalloweentheme = false;
			standardPanel.blnneon = false;
			standardPanel.blnneontheme = false;
			standardPanel.blnStartrek = false;
			standardPanel.blnStartrektheme = false;

			quickPanel.blnlight = false;
			quickPanel.blnlighttheme = false;
			quickPanel.blndark = false;
			quickPanel.blndarktheme = true;
			quickPanel.blnchristmas = false;
			quickPanel.blnchristmastheme = false;
			quickPanel.blnhalloween = false;
			quickPanel.blnhalloweentheme = false;
			quickPanel.blnneon = false;
			quickPanel.blnneontheme = false;
			quickPanel.blnStartrek = false;
			quickPanel.blnStartrektheme = false;

			themesPanel.blnlight = false;
			themesPanel.blnlighttheme = false;
			themesPanel.blndark = false;
			themesPanel.blndarktheme = true;
			themesPanel.blnchristmas = false;
			themesPanel.blnchristmastheme = false;
			themesPanel.blnhalloween = false;
			themesPanel.blnhalloweentheme = false;
			themesPanel.blnneon = false;
			themesPanel.blnneontheme = false;
			themesPanel.blnStartrek = false;
			themesPanel.blnStartrektheme = false;
		} else if (event.getSource() == ChristmasButton) {
			mainPanel.repaint();
			standardPanel.repaint();
			themesPanel.repaint();

			mainPanel.blnlight = false;
			mainPanel.blnlighttheme = false;
			mainPanel.blndark = false;
			mainPanel.blndarktheme = false;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmastheme = true;
			mainPanel.blnhalloween = false;
			mainPanel.blnhalloweentheme = false;
			mainPanel.blnneon = false;
			mainPanel.blnneontheme = false;
			mainPanel.blnStartrek = false;
			mainPanel.blnStartrektheme = false;

			standardPanel.blnlight = false;
			standardPanel.blnlighttheme = true;
			standardPanel.blndark = false;
			standardPanel.blndarktheme = false;
			standardPanel.blnchristmas = false;
			standardPanel.blnchristmastheme = true;
			standardPanel.blnhalloween = false;
			standardPanel.blnhalloweentheme = false;
			standardPanel.blnneon = false;
			standardPanel.blnneontheme = false;
			standardPanel.blnStartrek = false;
			standardPanel.blnStartrektheme = false;

			quickPanel.blnlight = false;
			quickPanel.blnlighttheme = false;
			quickPanel.blndark = false;
			quickPanel.blndarktheme = false;
			quickPanel.blnchristmas = false;
			quickPanel.blnchristmastheme = true;
			quickPanel.blnhalloween = false;
			quickPanel.blnhalloweentheme = false;
			quickPanel.blnneon = false;
			quickPanel.blnneontheme = false;
			quickPanel.blnStartrek = false;
			quickPanel.blnStartrektheme = false;

			themesPanel.blnlight = false;
			themesPanel.blnlighttheme = false;
			themesPanel.blndark = false;
			themesPanel.blndarktheme = false;
			themesPanel.blnchristmas = false;
			themesPanel.blnchristmastheme = true;
			themesPanel.blnhalloween = false;
			themesPanel.blnhalloweentheme = false;
			themesPanel.blnneon = false;
			themesPanel.blnneontheme = false;
			themesPanel.blnStartrek = false;
			themesPanel.blnStartrektheme = false;

		} else if (event.getSource() == HalloweenButton) {
			mainPanel.repaint();
			standardPanel.repaint();
			themesPanel.repaint();

			mainPanel.blnlight = false;
			mainPanel.blnlighttheme = false;
			mainPanel.blndark = false;
			mainPanel.blndarktheme = false;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmastheme = false;
			mainPanel.blnhalloween = false;
			mainPanel.blnhalloweentheme = true;
			mainPanel.blnneon = false;
			mainPanel.blnneontheme = false;
			mainPanel.blnStartrek = false;
			mainPanel.blnStartrektheme = false;

			standardPanel.blnlight = false;
			standardPanel.blnlighttheme = false;
			standardPanel.blndark = false;
			standardPanel.blndarktheme = false;
			standardPanel.blnchristmas = false;
			standardPanel.blnchristmastheme = false;
			standardPanel.blnhalloween = false;
			standardPanel.blnhalloweentheme = true;
			standardPanel.blnneon = false;
			standardPanel.blnneontheme = false;
			standardPanel.blnStartrek = false;
			standardPanel.blnStartrektheme = false;

			quickPanel.blnlight = false;
			quickPanel.blnlighttheme = false;
			quickPanel.blndark = false;
			quickPanel.blndarktheme = false;
			quickPanel.blnchristmas = false;
			quickPanel.blnchristmastheme = false;
			quickPanel.blnhalloween = false;
			quickPanel.blnhalloweentheme = true;
			quickPanel.blnneon = false;
			quickPanel.blnneontheme = false;
			quickPanel.blnStartrek = false;
			quickPanel.blnStartrektheme = false;

			themesPanel.blnlight = false;
			themesPanel.blnlighttheme = false;
			themesPanel.blndark = false;
			themesPanel.blndarktheme = false;
			themesPanel.blnchristmas = false;
			themesPanel.blnchristmastheme = false;
			themesPanel.blnhalloween = false;
			themesPanel.blnhalloweentheme = true;
			themesPanel.blnneon = false;
			themesPanel.blnneontheme = false;
			themesPanel.blnStartrek = false;
			themesPanel.blnStartrektheme = false;
		} else if (event.getSource() == NeonButton) {
			mainPanel.repaint();
			standardPanel.repaint();
			themesPanel.repaint();

			mainPanel.blnlight = false;
			mainPanel.blnlighttheme = false;
			mainPanel.blndark = false;
			mainPanel.blndarktheme = false;
			mainPanel.blnchristmas = false;
			mainPanel.blnchristmastheme = false;
			mainPanel.blnhalloween = false;
			mainPanel.blnhalloweentheme = false;
			mainPanel.blnneon = false;
			mainPanel.blnneontheme = true;
			mainPanel.blnStartrek = false;
			mainPanel.blnStartrektheme = false;

			standardPanel.blnlight = false;
			standardPanel.blnlighttheme = false;
			standardPanel.blndark = false;
			standardPanel.blndarktheme = false;
			standardPanel.blnchristmas = false;
			standardPanel.blnchristmastheme = false;
			standardPanel.blnhalloween = false;
			standardPanel.blnhalloweentheme = false;
			standardPanel.blnneon = false;
			standardPanel.blnneontheme = true;
			standardPanel.blnStartrek = false;
			standardPanel.blnStartrektheme = false;

			quickPanel.blnlight = false;
			quickPanel.blnlighttheme = false;
			quickPanel.blndark = false;
			quickPanel.blndarktheme = false;
			quickPanel.blnchristmas = false;
			quickPanel.blnchristmastheme = false;
			quickPanel.blnhalloween = false;
			quickPanel.blnhalloweentheme = false;
			quickPanel.blnneon = false;
			quickPanel.blnneontheme = true;
			quickPanel.blnStartrek = false;
			quickPanel.blnStartrektheme = false;

			themesPanel.blnlight = false;
			themesPanel.blnlighttheme = false;
			themesPanel.blndark = false;
			themesPanel.blndarktheme = false;
			themesPanel.blnchristmas = false;
			themesPanel.blnchristmastheme = false;
			themesPanel.blnhalloween = false;
			themesPanel.blnhalloweentheme = false;
			themesPanel.blnneon = false;
			themesPanel.blnneontheme = true;
			themesPanel.blnStartrek = false;
			themesPanel.blnStartrektheme = false;

			// End of themes
		}
		// Networking setup
		if (event.getSource() == sendField) {
			System.out.println("Send: " + sendField.getText());
			ssm.sendText(nameField.getText() + ":" + sendField.getText());
			chatArea.append("You: " + sendField.getText() + "\n");
			sendField.setText("");
		} else if (event.getSource() == hostButton) {
			System.out.println("Start socket in server mode");
			intPlayerYou = 1;
			intPlayer2 = 2;
			hostButton.setEnabled(false);
			joinButton.setEnabled(false);
			blnturn = true;
			ssm = new SuperSocketMaster(Integer.parseInt(portField.getText()), this);
			ssm.connect();
			ipField.setText(ssm.getMyAddress());

			System.out.println(nameField.getText());
		} else if (event.getSource() == joinButton) {
			System.out.println("Start socket in client mode");
			intPlayerYou = 2;
			intPlayer2 = 1;
			hostButton.setEnabled(false);
			joinButton.setEnabled(false);
			blnturn = false;
			ssm = new SuperSocketMaster(ipField.getText(), Integer.parseInt(portField.getText()), this);
			ssm.connect();
		} else if (event.getSource() == ssm) {

			String[] strChat = ssm.readText().split(":");
			if (strChat[0].equals("#")) {
				try {
					if (strChat[1].equals("game")) {
						chatArea.append("System:Loss\n");
						intLosses++;
						intMoves = 0;
						headerLabel.setText("Wins: "+intWins+" | Losses: "+intLosses+" | Ties: "+intTies);
						for (int i = 0; i < 3; i++) {
							for (int t = 0; t < 3; t++) {
								game[i][t] = 0;
							}
						}
					} else if (game[Integer.parseInt(strChat[1])][Integer.parseInt(strChat[2])] == 0) {
						if (strChat[3].equals("send")) {
							standardPanel.repaint();
							game[Integer.parseInt(strChat[1])][Integer.parseInt(strChat[2])] = intPlayer2;
							ssm.sendText(strChat[0] + ":" + strChat[1] + ":" + strChat[2] + ":" + "recieved");
							blnturn = true;
							intMoves++;
							// strchat 2 is x
							// strchat 1 is y
							
							if(Integer.parseInt(strChat[2]) > 0 && Integer.parseInt(strChat[2]) < 200 && Integer.parseInt(strChat[1]) > 0 && Integer.parseInt(strChat[1]) < 200){
								standardPanel.bln100 = true;
							}else if(Integer.parseInt(strChat[2]) > 0 && Integer.parseInt(strChat[2]) < 200 && Integer.parseInt(strChat[1]) > 200 && Integer.parseInt(strChat[1]) < 400){
								standardPanel.bln101 = true;
							}else if(Integer.parseInt(strChat[2]) > 0 && Integer.parseInt(strChat[2]) < 200 && Integer.parseInt(strChat[1]) > 400 && Integer.parseInt(strChat[1]) < 600){
								standardPanel.bln102 = true;
							}else if(Integer.parseInt(strChat[2]) > 200 && Integer.parseInt(strChat[2]) < 400 && Integer.parseInt(strChat[1]) > 0 && Integer.parseInt(strChat[1]) < 200){
								standardPanel.bln110 = true;
							}else if(Integer.parseInt(strChat[2]) > 200 && Integer.parseInt(strChat[2]) < 400 && Integer.parseInt(strChat[1]) > 200 && Integer.parseInt(strChat[1]) < 400){
								standardPanel.bln111 = true;
							}else if(Integer.parseInt(strChat[2]) > 200 && Integer.parseInt(strChat[2]) < 400 && Integer.parseInt(strChat[1]) > 400 && Integer.parseInt(strChat[1]) < 600){
								standardPanel.bln112 = true;
							}else if(Integer.parseInt(strChat[2]) > 400 && Integer.parseInt(strChat[2]) < 600 && Integer.parseInt(strChat[1]) > 0 && Integer.parseInt(strChat[1]) < 200){
								standardPanel.bln120 = true;
							}else if(Integer.parseInt(strChat[2]) > 400 && Integer.parseInt(strChat[2]) < 600 && Integer.parseInt(strChat[1]) > 200 && Integer.parseInt(strChat[1]) < 400){
								standardPanel.bln121 = true;
							}else if(Integer.parseInt(strChat[2]) > 400 && Integer.parseInt(strChat[2]) < 600 && Integer.parseInt(strChat[1]) > 400 && Integer.parseInt(strChat[1]) < 600){
								standardPanel.bln122 = true;
							}
							
							
							
							
							chatArea.append("System:Your Turn \n");
							for (int i = 0; i < 3; i++) {
								for (int t = 0; t < 3; t++) {
									chatArea.append(game[i][t] + ",");
								}
								chatArea.append("\n");
							}
						} else if (strChat[3].equals("recieved")) {
							game[Integer.parseInt(strChat[1])][Integer.parseInt(strChat[2])] = intPlayerYou;
							blnturn = false;
							intMoves++;
							if (intMoves >= 9) {
								chatArea.append("System:Tie\n");
								ssm.sendText("System:Tie");
								intMoves = 0;
								intTies++;
								headerLabel.setText("Wins: "+intWins+" | Losses: "+intLosses+" | Ties: "+intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							}
							if (game[0][0] == intPlayerYou && game[1][0] == intPlayerYou
									&& game[2][0] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText("Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							} else if (game[0][0] == intPlayerYou && game[0][1] == intPlayerYou
									&& game[0][2] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText("Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							} else if (game[1][0] == intPlayerYou && game[1][1] == intPlayerYou
									&& game[1][2] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText(
										"Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							} else if (game[2][0] == intPlayerYou && game[2][1] == intPlayerYou
									&& game[2][2] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText(
										"Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								headerLabel.setText(
										"Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							} else if (game[0][1] == intPlayerYou && game[1][1] == intPlayerYou
									&& game[2][1] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText(
										"Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);

								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							} else if (game[0][2] == intPlayerYou && game[1][2] == intPlayerYou
									&& game[2][2] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText(
										"Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							} else if (game[0][0] == intPlayerYou && game[1][1] == intPlayerYou
									&& game[2][2] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText(
										"Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							} else if (game[2][0] == intPlayerYou && game[1][1] == intPlayerYou
									&& game[0][2] == intPlayerYou) {
								ssm.sendText("#:game");
								chatArea.append("System:Win\n");
								intWins++;
								intMoves = 0;
								headerLabel.setText(
										"Wins: " + intWins + " | Losses: " + intLosses + " | Ties: " + intTies);
								for (int i = 0; i < 3; i++) {
									for (int t = 0; t < 3; t++) {
										game[i][t] = 0;
									}
								}
							}

						}
					} else {
						ssm.sendText("System:Spot Taken");
					}
				} catch (IndexOutOfBoundsException e) {
					System.out.println("uwu :3 ur code cwashed" + strChat[0]);
				}
			} else {
				try {
					chatArea.append(strChat[0] + ": " + strChat[1] + "\n");
				} catch (IndexOutOfBoundsException e) {
					System.out.println("uwu :3 ur code cwashed" + strChat[0]);
				}

			}
		}
	}

	// Constructor
	tictactoe() {
		standardPanel.setLayout(null);
		standardPanel.setPreferredSize(new Dimension(1280, 720));
		backButton.setSize(100, 50);
		backButton.setLocation(600, 600);
		standardPanel.add(backButton);
		standardPanel.addMouseListener(this);
		backButton.addActionListener(this);

		quickPanel.setLayout(null);
		quickPanel.setPreferredSize(new Dimension(1280, 720));
		backButton2.setSize(100, 50);
		backButton2.setLocation(600, 600);
		quickPanel.add(backButton2);
		backButton2.addActionListener(this);

		themesPanel.setLayout(null);
		themesPanel.setPreferredSize(new Dimension(1280, 720));
		LightButton.setSize(300, 75);
		LightButton.setLocation(850, 75);
		DarkButton.setSize(300, 75);
		DarkButton.setLocation(850, 150);
		ChristmasButton.setSize(300, 75);
		ChristmasButton.setLocation(850, 225);
		HalloweenButton.setSize(300, 75);
		HalloweenButton.setLocation(850, 300);
		NeonButton.setSize(300, 75);
		NeonButton.setLocation(850, 375);
		StarTrekButton.setSize(300, 75);
		StarTrekButton.setLocation(850, 450);

		backButton3.setSize(100, 50);
		backButton3.setLocation(600, 600);

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
		helpPanel.setPreferredSize(new Dimension(1280, 720));
		backButton4.setSize(100, 50);
		backButton4.setLocation(600, 600);
		helpPanel.add(backButton4);
		backButton4.addActionListener(this);

		aboutPanel.setLayout(null);
		aboutPanel.setPreferredSize(new Dimension(1280, 720));
		backButton5.setSize(100, 50);
		backButton5.setLocation(590, 610);
		aboutPanel.add(backButton5);
		backButton5.addActionListener(this);

		mainPanel.setLayout(null);
		mainPanel.setPreferredSize(new Dimension(1280, 720));
		standardButton.setSize(300, 75);
		standardButton.setLocation(850, 175);
		quickButton.setSize(300, 75);
		quickButton.setLocation(850, 250);
		themeButton.setSize(300, 75);
		themeButton.setLocation(850, 325);
		helpButton.setSize(300, 75);
		helpButton.setLocation(850, 400);
		aboutButton.setSize(300, 75);
		aboutButton.setLocation(850, 475);
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

		nameLabel.setSize(100, 50);
		nameLabel.setLocation(900, 250);
		mainPanel.add(nameLabel);

		headerLabel.setSize(2000, 50);
		headerLabel.setLocation(922, 0);
		headerLabel.setForeground(Color.red);
		standardPanel.add(headerLabel);

		theFont = new Font("arial", Font.BOLD, 20);
		headerLabel.setFont(theFont);

		nameLabel.setSize(100, 50);
		nameLabel.setLocation(900, 250);
		mainPanel.add(nameLabel);

		confirm1.setSize(250, 50);
		confirm1.setLocation(950, 300);
		mainPanel.add(confirm1);
		confirm1.setVisible(false);
		confirm1.addActionListener(this);

		confirm2.setSize(250, 50);
		confirm2.setLocation(950, 300);
		mainPanel.add(confirm2);
		confirm2.setVisible(false);
		confirm2.addActionListener(this);

		nameField.setSize(250, 50);
		nameField.setLocation(950, 250);
		nameField.setVisible(false);

		thescroll.setSize(400, 400);
		thescroll.setLocation(850, 50);

		sendField.setSize(400, 50);
		sendField.setLocation(850, 450);
		sendField.addActionListener(this);

		ipField.setSize(200, 50);
		ipField.setLocation(850, 500);

		portField.setSize(200, 50);
		portField.setLocation(1050, 500);

		hostButton.setSize(200, 50);
		hostButton.setLocation(850, 550);
		hostButton.addActionListener(this);

		joinButton.setSize(200, 50);
		joinButton.setLocation(1050, 550);
		joinButton.addActionListener(this);

		mainPanel.add(nameField);
		standardPanel.add(thescroll);
		standardPanel.add(sendField);
		standardPanel.add(ipField);
		standardPanel.add(portField);
		standardPanel.add(hostButton);
		standardPanel.add(joinButton);

		mainFrame.setContentPane(mainPanel);
		mainFrame.pack();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	}

	// Main Method
	public static void main(String[] args) {
		new tictactoe();
	}

}
