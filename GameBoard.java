import java.awt.Color;

import javax.swing.JPanel;

public class GameBoard extends JPanel {
	
	// access to GameOptions
	private GameOptions _options;
	
	public GameBoard(GameOptions options) {
		super();
		_options = options;
		
		this.setBackground(Color.gray);
		this.setSize(1000,1000);		
	}
}
