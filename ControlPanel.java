import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	
	
	private GameOptions _options;
	// columns for ControlPanel layout
	private ControlPanel1 _p1;
	private ControlPanel2 _p2;
	private ControlPanel3 _p3;
	
	public ControlPanel(GameOptions options) {
		super(new GridLayout(1,3));
		this.setBackground(Color.white);
		_options = options;
		
		// First Column, Choose Avatar
		_p1 = new ControlPanel1(options);			
		
		// Second Column, Game Controls and Score
		_p2 = new ControlPanel2(options);		
		
		// Third Column, Choose Difficulty
		_p3 = new ControlPanel3(options);
		
		
		// add all columns to the Control Panel
		this.add(_p1);
		this.add(_p2);
		this.add(_p3);
	}
	
	
	// public method for GameOptions to update Score when called by GameBoard
	public void updateScoreLabel() {
		_p2.updateScoreLabel();
	}

} 
