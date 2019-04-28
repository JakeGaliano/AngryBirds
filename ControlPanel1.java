import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ControlPanel1 extends JPanel {
	
	private GameOptions _options;
	
	public ControlPanel1(GameOptions options) {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		// Add components to p1
		this.add(new Label("Choose Your Avatar"));
	
		// Add battle, king, hurt pig avatar options
		this.add(new AvatarButton(options, 1));
		this.add(new AvatarButton(options, 2));
		this.add(new AvatarButton(options, 3));
		
	}
}
