package app0511.chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//ChatClientA에 대한 이벤트 처리 클래스 정의
public class ClientAEvent implements ActionListener, KeyListener{
	private JTextField t_input;
	private JTextArea area;
	private JButton bt, bt_open;
	
	public void actionPerformed(ActionEvent e) {
		//이 메서드의 인수로 전달되는 e 변수에는 사용자가 일으킨 Action관련된 모든 정보가 들어있다.
		//ex) who, where, when,,,
		//System.out.println("사용자에 의해 생성된 이벤트 정보는"+e);
		JButton btn = (JButton)e.getSource();
		//System.out.println(btn);
		
		if(btn==bt) {
			System.out.println("전송");
			showText();
		}else if(btn==bt_open) {
			System.out.println("오픈");
		}
		//String msg = t_input.getText();
		//System.out.println(msg);
	}
	//setter 정의
	public void setT_input(JTextField t_input) {
		this.t_input = t_input;
	}
	//setter 정의
	public void setArea(JTextArea area) {
		this.area = area;
	}
	//setter 정의
	public void setBt(JButton bt) {
		this.bt = bt;
	}
	public void setBt_open(JButton bt_open) {
		this.bt_open = bt_open;
	}
	
	//채팅장에 반영하기
	public void showText() {
		//1) JTextField 값
		String msg = t_input.getText();
		//2) JTextArea 값누적
		area.append(msg+"\n");
		//3) 입력값 초기화
		t_input.setText("");
	}
	
	@Override
	public void keyTyped(KeyEvent e) {

	}
	@Override
	public void keyPressed(KeyEvent e) {

	}
	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		//System.out.println(key);
		if(key==KeyEvent.VK_ENTER) {//상수 이용하여 직관성 확보
			showText();
		}
	}
}
