import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AvatarButton extends JButton {
	
	private ImageIcon _avatarIcon;
	private GameOptions _options;

	public AvatarButton(GameOptions options, int buttonNum) {
		super();
		setAlignmentX(CENTER_ALIGNMENT);
		_options = options;
		
		// sets avatar to corresponding button
		switch(buttonNum) {
			// Battle Pig
			case 1:
				_avatarIcon = options.getBattlePigIcon();
				break;
			// King Pig
			case 2:
				_avatarIcon = options.getKingPigIcon();
				break;
			// Hurt Pig
			case 3:
				_avatarIcon = options.getHurtPigIcon();
				break;
		}
		
		// sets button's icon
		this.setIcon(_avatarIcon);
		
		// add click listener
		this.addActionListener(new ClickListener());
		
	}
	
	private class ClickListener implements ActionListener {

		// when JButton is clicked, sets avatar choice and repaints GameBoard Panel
		@Override
		public void actionPerformed(ActionEvent e) {
			_options.setAvatarChoice(_avatarIcon);
			_options.repaintBoard();
		}
		
	}
	
	

}
