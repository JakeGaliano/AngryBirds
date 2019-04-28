/**
 * GameOptions Instantiates all Images and provides getters/setters for all Game Options in Control Panel
 */

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GameOptions extends JPanel{
	
	//instance variables
	private double _panelWidth, _panelHeight;
	
	//arrayList for the enemies
	private ArrayList<ImageIcon> _enemies;

	// icons for avatars and enemy
	private ImageIcon _enemyIcon;
	private ImageIcon _battlePigIcon;
	private ImageIcon _kingPigIcon;
	private ImageIcon _hurtPigIcon;

	// user's avatar choice
	private ImageIcon _chosenAvatar;
	private ControlPanel _controlPanel;
	private GameBoard _gameBoard;
	private int _difficulty;

	public GameOptions(double panelWidth, double panelHeight, int x, int y) {

		// instantiate icons and coordinates
		_enemyIcon = new ImageIcon("redBirdEnemy.png");
		_battlePigIcon = new ImageIcon("battlePigAvatar.png");
		_kingPigIcon = new ImageIcon("kingPigAvatar.png");
		_hurtPigIcon = new ImageIcon("hurtPigAvatar.png");
		_panelWidth = panelWidth;
		_panelHeight = panelHeight;

		// default avatar
		setAvatarChoice(_kingPigIcon);

		//arraylist of enemies
		_enemies = new ArrayList<ImageIcon>();

	}
	
	public void paintComponent(java.awt.Graphics aBrush)
    {
        super.paintComponent(aBrush);
        
        //attempting to create the arraylist using panel width and height as coordinates
        for(ImageIcon bird: _enemies) {
        	//aBrush.drawImage(bird.getImage(),(int) _panelWidth * Math.random(), (int) _panelHeight * Math.random(), this);
        }
        
    }

	// associates gameBoard and controlPanel from AppPanel
	public void setPanels(GameBoard board, ControlPanel panel) {
		_gameBoard = board;
		_controlPanel = panel;
	}

	// getters to return icons
	public ImageIcon getEnemyIcon() { return _enemyIcon; }
	public ImageIcon getBattlePigIcon() { return _battlePigIcon; }
	public ImageIcon getKingPigIcon() { return _kingPigIcon; }
	public ImageIcon getHurtPigIcon() { return _hurtPigIcon; }

	// setter and getter for user's avatar choice
	public void setAvatarChoice(ImageIcon avatar) { _chosenAvatar = avatar; }
	public ImageIcon getAvatarChoice() { return _chosenAvatar; }

	// setter and getter for game difficulty	
	public void setDifficulty(int num) { _difficulty = num; }	
	public int getDifficulty() { return _difficulty; }

	// repaints GameBoard panel when buttons clicked in control panel
	public void repaintBoard() {
		_gameBoard.repaint();
	}

	// calls updateScore in ControlPanel to change the score label's text
	public void updateScore() {
		_controlPanel.updateScoreLabel();
	}



}
