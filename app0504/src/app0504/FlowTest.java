package app0504;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/* 프레임은 윈도우이기 때문에 다른 컴포넌트들을 올려놓을 수 있다.
이 때, 어떤 방식으로 올려놓을지에 대해서는 배치관리자라 불리는 클래스로 지원.
[배치관리자]
1. ★FlowLayout : 수평 또는 수직으로 컴포넌트 배치, 윈도우 크기에 따라 내부 컴포넌트들이 흘러다님(유동적)
2. ★BorderLayout : 
3. ★GridLayout
4. GridBagLayout
5. CardLayout		 
		  */
public class FlowTest {
	public static void main(String[] args) {
		Frame frame = new Frame();
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);//프레임에 플로우 레이아웃 적용
		
		for(int i=1; i<20;i++) {
			Button bt = new Button(i+"th Button");
			frame.add(bt);//프레임에 버튼 부착
		}
		frame.setSize(300, 200);//프레임 Size
		frame.setVisible(true);//프레임 Visible
	}
}
