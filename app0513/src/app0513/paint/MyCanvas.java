package app0513.paint;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyCanvas extends Canvas implements MouseListener, MouseMotionListener{
	boolean flag  = false;
	
	
	public MyCanvas() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public void paint(Graphics g) {
		if(flag) {
			g.fillOval(100, 100, 2, 2);
		}
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseDragged");
		//간접적으로 paint메서드 호출
		flag = true;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println("mouseMoved");
		repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
