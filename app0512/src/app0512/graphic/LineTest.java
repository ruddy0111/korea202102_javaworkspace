/*
 잡바의 모든 컴포넌트는 스스로  그림의 주체(화가)이자 그림의 대상(도화지)가 된다.
 * */

package app0512.graphic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class LineTest extends JFrame{
	//자바의 모든 컴포넌트는 부모 GUI 객체로부터 paint 메서드를 물려받아 자기 자신에게 알맞는 그림을 그린 것.
	//튿히, paint메서드는 붓만으로 그림을 그릴 수 없기 때문에 팔레트 역할하는 그래픽 객체가  인수로 넘어온다.
	//시스템(컴포넌트)에 의한 그림이 아닌, 개발자가 주도하여 그림을 그리려면 paint메서드를 오버라이드(재정의)하면 된다.
	public  void paint(Graphics g) {
		//System.out.println("paint 메서드 호출");
		g.drawLine(100,50,250,380);//선그리기
		g.drawOval(100, 200, 100, 100);
		g.drawRect(10, 250, 80, 80);
		g.fillOval(30,300, 90, 90);
		
		//색상처리
		g.setColor(Color.RED);
		g.fillRect(300, 200, 50, 100);
		
		//텍스트도 그려보자
		g.setFont(new Font("Verdana", Font.BOLD|Font.ITALIC, 50));
		g.drawString("Apple", 20, 400);
		
	}
	public LineTest() {
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new LineTest();
	}
}
