package ex8.game;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame{

	@Override
	public void setSize(int width,int height) {
		// TODO Auto-generated method stub
		super.setSize(width,height);
	}
		@Override
		public void paint(Graphics g) {
		g.drawLine(20, 20, 200, 200);
		}
	}

