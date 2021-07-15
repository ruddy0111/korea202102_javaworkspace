package app0512.graphic;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//캔버스에 채워진 원 하나를 기르고 나서, 버튼에 의해 이 원이 x축으로 이동하는 효과 부여
public class MoveTest extends JFrame implements ActionListener{
	JPanel p_north;
	MyButton bt;
	Canvas can;
	int x=100;//원의 x좌표
	
//	public void paint(Graphics g) {
//		//g.drawOval(100,200, 100, 100);
//		
//		g.setColor(Color.RED);
//		g.fillOval(300, 200, 50, 100);
//	}
	public MoveTest() {
		//생성
		p_north = new JPanel();
		bt = new MyButton("Move");
		can = new MyCanvas(this);
		
		//스타일 및 레이아웃
		can.setBackground(Color.GRAY);
		
		//조립
		p_north.add(bt);
		add(p_north, BorderLayout.NORTH);
		add(can);
		
		bt.addActionListener(this);
		
		//보여주기
		setBounds(500,100,700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void tick() {
		x=x+10;
		System.out.println(x);
	}
	public void render() {
		can.repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		tick();
		render();
		
	}
	public static void main(String[] args) {
		new MoveTest();
	}
	
}
