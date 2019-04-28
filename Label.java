import javax.swing.JLabel;

public class Label extends JLabel{
		
	// variable for _scoreLabel to display score
	private int score = 0;
	
	public Label(String text) {
		super(text);
		setAlignmentX(CENTER_ALIGNMENT);
	}
	
	// adds one to score and updates the scoreLabel text in ControlPanel2
	public void updateScore() {
		score++;
		setText("Score: " + score);			
	}
}