package gamestates;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import main.Game;

public class Menu extends State {

	public Menu(Game game) {
		super(game);
	}

	public void update() {
		// TODO Auto-generated method stub

	}

	public void render(Graphics g) {
		g.setColor(Color.black);
		g.drawString("MENU", Game.GAME_WIDTH / 2, 200);
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			Gamestate.state = Gamestate.PLAYING;

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
