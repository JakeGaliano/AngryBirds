import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class ControlPanel2 extends JPanel {

	private GameOptions _options;
	private Label _scoreLabel;
	
	public ControlPanel2(GameOptions options) {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		// Add start/pause button
		this.add(new StartPauseButton(options));
		
		// Add components to p2
		_scoreLabel = new Label("Score: 0");
		this.add(_scoreLabel);
		
		// Add Quit Button
		this.add(new QuitButton());
	}
	
	// updates score text
	public void updateScoreLabel() {
		_scoreLabel.updateScore();
	}
}
