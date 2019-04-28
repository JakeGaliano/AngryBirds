import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class AppPanel extends JPanel {
	
	// instance variables for icons to pass into both panels
	
	public AppPanel() {
		super();
		this.setBackground(Color.black);
		this.setLayout(new BorderLayout());	
		
		// instantiate class to hold game icons
		GameOptions options = new GameOptions(this.getWidth(), this.getHeight(), this.getX(), this.getY());
		
		// Create Game Board and Control Panels and pass GameOptions
		GameBoard gameBoard = new GameBoard(options);		
		ControlPanel controlPanel = new ControlPanel(options);
		
		// let options know about gameBoard and controlPanel
		options.setPanels(gameBoard, controlPanel);
		
		// Add panels to AppPanel
		this.add(controlPanel, BorderLayout.SOUTH);
		this.add(gameBoard, BorderLayout.CENTER);
		
	}
}