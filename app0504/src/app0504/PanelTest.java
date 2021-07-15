package app0504;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelTest {
	public static void main(String[] args) {
		//그래픽 api 중 Panel 을 학습한다.
		Frame frame = new Frame("Panel Test");

		// BorderLayout 이라는 객체의 레퍼런스가 사용할 필요 없는 경우
		//즉, 1회성일 때 변수는 필요 없을 수도 있다.
		frame.setLayout(new BorderLayout());
		Button bt = new Button("I'm button");
		frame.add(bt); //개발자가 Border의 5가지 방향 중 선택하지 않을 경우 CENTER
		
		Panel p = new Panel();//컴포넌트 중, 무언가를 올려놓을 수 있는 패널 의미
		//panel : container의 자식이므로 배치관리자 및 다른 컴포넌트 포함 가능.
		//-> Button을 Panel에 부착.4
		p.setBackground(Color.RED);
		frame.add(p);//윈도우에 panel부착(이 때 패널은 디폴트 값 FlowLayout)
		p.add(bt);//panel에 bt부착(플로우는 컴포넌트 본연의 크기 유지된다.)
		
		
		frame.setSize(300,250);
		frame.setVisible(true);
	}
}
