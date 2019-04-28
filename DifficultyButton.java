import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class DifficultyButton extends JRadioButton {
	
	private GameOptions _options;
	private int _num;
	
	
	public DifficultyButton(String text, GameOptions options, int num) {
		super(text);
		setAlignmentX(CENTER_ALIGNMENT);
		_options = options;
		
		this.addActionListener(new ClickListener());
	}
	
	private class ClickListener implements ActionListener {
		
		
		public void actionPerformed(ActionEvent e) {
			_options.setDifficulty(_num);
		}
	}

}
