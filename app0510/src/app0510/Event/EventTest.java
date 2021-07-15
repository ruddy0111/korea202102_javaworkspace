package app0510.Event;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventTest extends JFrame{
	JTextField t_input;
	JButton bt;
	
	public EventTest() {
		t_input = new JTextField(20);
		bt = new JButton("push me");
		
		//FlowLayout전환
		this.setLayout(new FlowLayout());
		
		//조립
		add(t_input);
		add(bt);
		
		//컴포넌트 & 리스너와 연결
		//ActionControl is a ActionListener 이다.
		//이벤트 구현 방법 : 미완성 객체를 구현한 후, 해당 컴포넌트와 연결한다.
		bt.addActionListener(new ActionControl());

		//텍스트 필드 & 키리스너와 연결
		t_input.addKeyListener(new KeyControl());
		
		//프레임 본체 & 마우스 리스너 연결
		this.addMouseListener(new MouseControl());
		
		//프레임 본체 & 윈도우 리스너 연결
		this.addWindowListener(new WindowControl());
		
		//보여주기
		this.setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new EventTest();
	}
	
}
