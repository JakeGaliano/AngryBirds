import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartPauseButton extends JButton {
	
	private GameOptions _options;
	
	public StartPauseButton(GameOptions options) {
		super("Start");
		_options = options;
		
		this.addActionListener(new ClickListener(this));
	}
	
	private class ClickListener implements ActionListener {
		
		private JButton _button;
		
		public ClickListener(JButton button) {
			_button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(_button.getText() == "Start") {
				_button.setText("Pause");
				// add method to GameOptions to pause game
			} else {
				_button.setText("Start");
				// add method to GameOptions to start game
			}
		}
		
	}

}
