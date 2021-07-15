package app0510.swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame{

//		bt = new JButton("Button");
		JTextArea area;
		JPanel p_south;
		JTextField t_input;
		JButton bt_send;

		public ChatClient() {
			area = new JTextArea();
			p_south = new JPanel();
			t_input = new JTextField(18);
			bt_send = new JButton("전송");
					
			
			//스타일
			area.setBackground(Color.YELLOW);
			area.setEditable(false);
			//조립
			add(area);
			p_south.add(t_input);
			p_south.add(bt_send);
			add(p_south, BorderLayout.SOUTH);
			
			//보여주기
			setSize(300,400);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);//윈도우 종료 시 프로세스 동시 종료
			
		}
		public static void main(String[] args) {
			new ChatClient();
		}

}
