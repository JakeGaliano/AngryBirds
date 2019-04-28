import javax.swing.JFrame;

public class MyApp extends JFrame{
	
	public MyApp() {
		super("Final Project");
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// panel to hold the application		
		AppPanel appPanel = new AppPanel();		
		
		this.add(appPanel);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyApp();
	}

}
