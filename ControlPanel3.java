import java.awt.TextArea;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class ControlPanel3 extends JPanel {
	
	private GameOptions _options;
	
	public ControlPanel3(GameOptions options) {
		super();
		
		_options = options;
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Add components to p3
		this.add(new Label("Choose Your Difficulty"));
		
		// Add Difficult Radio Buttons
		DifficultyButton easyButton = new DifficultyButton("Easy", options, 1);
		DifficultyButton mediumButton = new DifficultyButton("Medium", options, 2);
		DifficultyButton hardButton = new DifficultyButton("Hard", options, 3);
		this.add(easyButton);
		this.add(mediumButton);
		this.add(hardButton);
		
		//Add Text Area for number of desired enemies
		this.add(new Label("Enter your amount of desired enemies"));
		TextArea _enemySelection = new TextArea();
		_enemySelection.setEditable(true);
		this.add(_enemySelection);
		
		// Button Group for Radio Buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(easyButton);
		buttonGroup.add(mediumButton);
		buttonGroup.add(hardButton);
	}

}
