package app0512.graphic;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImageTest extends JFrame{

	Image img  = null;//이미지는 추상클래스이므로 직접 new할 수 없다.
								//일반적으로 ㄹ추상클래스는 개발자가 상속받아 완성한 후 자식 객체를 생성할 때 사용할 수 있다.
								//언제나 그런 것은 아니고, sun사에서 제공하는 다른 방법을 이용할 수 있다.
								//ex)메서드 호출에 의해 인스턴스 얻기 
	
	Toolkit kit;//툴킷 이용하여 OS경로로 접근한 이미지의 인스턴스 얻을 수 있음.
	public ImageTest() {
		kit = Toolkit.getDefaultToolkit();//인스턴스 얻는 메서드
		img = kit.getImage("D:\\korea202102_javaworkspace\\app0512\\res\\images\\mt.jpg");
		
		setBounds(500,100,700,650);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g) {
		g.drawImage(img, 0,0,this);
	}
	public static void main(String[] args) {
		new ImageTest();
	}
	
}
