package app0510.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class GugudanEvent implements ActionListener{
	JTextField t_input;
	
	public GugudanEvent(JTextField t_input) {
		System.out.println("이벤트 클래스 생성 시 넘겨받은 "+t_input);
	}
	
	public void actionPerfomed(ActionEvent e) {
		//나 아닌 다른 클래스에 존재하는 TextField 값에 무엇이 들어있는지 알아맞추기
		JTextField t_input = 
		printDan();
	}
	
	public void printDan() {
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(변수*i));
		}
	}
}
