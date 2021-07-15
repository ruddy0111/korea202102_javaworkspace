package app0513.album;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PhotoMain extends JFrame{
	JPanel p_north; //북쪽의 썸네일을 붙일 패널 
	XCanvas can; //큰 이미지를 그릴 켄버스
	String dir="D:\\korea202102_javaworkspace\\app0513\\res\\images\\";
	String[] pathArray= {"aa.jpg", "ab.jpg", "ac.jpg", "ad.jpg", "ae.jpg", "af.jpg", "ag.jpg", "ah.jpg", "ai.jpg", "aj.jpg"};
	ThumbPanel[] thumbArray=new ThumbPanel[pathArray.length];
	
	public PhotoMain() {
		//생성 
		p_north = new JPanel();
		can = new XCanvas();
		
		//썸네일 생성
		for(int i=0;i<pathArray.length;i++) {
			thumbArray[i] = new ThumbPanel(dir+pathArray[i], can);
		}
		
		//스타일 & 레이아웃
		p_north.setBackground(Color.YELLOW);
		p_north.setPreferredSize(new Dimension(600,60));
		can.setBackground(Color.CYAN);
		
		//조립 
		for(int i=0;i<thumbArray.length;i++) {
			p_north.add(thumbArray[i]);
		}
		add(p_north, BorderLayout.NORTH);
		add(can);
		
		//리스너 연결
		
		//보이기
		can.createImage(dir+pathArray[0]);
		
		setBounds(500, 100, 600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PhotoMain(); 
	}

}