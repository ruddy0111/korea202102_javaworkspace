package app0511.chat.copy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientA extends JFrame implements ActionListener, KeyListener{

		JButton bt_open;
		JTextArea area;
		JScrollPane scroll;
		JTextField t_input;
		JButton bt;
		ChatClientB chatClientB;
		ChatClientC chatClientC;
		
		public ChatClientA() {
			bt_open = new JButton("열기");
			area = new JTextArea();
			scroll = new JScrollPane(area);
			t_input = new JTextField(20);
			bt = new JButton("전송");
			
			//레이아웃
			this.setLayout(new FlowLayout());
			scroll.setPreferredSize(new Dimension(280, 270));
			area.setBackground(new Color(250,255,0));
			
			//조립
			add(bt_open);
			add(scroll);
			add(t_input);
			add(bt);
			
			//이벤트 리스너와 연결
			bt.addActionListener(this);
			bt_open.addActionListener(this);
			
			//텍스트 필드와 리스너 연결
			t_input.addKeyListener(this);
			
			//보여주기
			setBounds(300,100,300,400);//x,y,width, height
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
		}
		@Override
		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			if(key == KeyEvent.VK_ENTER) {
				showText();
			}
		}
		@Override
		public void actionPerformed(ActionEvent e) { 
			//열기버튼
			if(e.getSource()==bt_open) {
				//System.out.println("열기");
				chatClientB = new ChatClientB();
				chatClientC = new ChatClientC();
				//cb.setArea2(area);
				
				//B창을 위한 설정 (A,C정보를 넘겨야 한다)
				chatClientB.setChatClientA(this);
				chatClientB.setChatClientC(chatClientC);
				
				//C창을 위한 설정(A, B를 넘겨야 한다.)
				chatClientC.setChatClientA(this);
				chatClientC.setChatClientB(chatClientB);
				
				
			}else if(e.getSource()==bt) {
				//System.out.println("전송");
				showText();
			}
			//전송버튼
		}
		public void showText() {
			//1) TextField 값 가져오기
			String msg = t_input.getText();
			//2) TextArea에 누적
			area.append(msg+"\n");
			//3) 입력값 초기화
			t_input.setText("");
			
			//친구인 상대방 채팅창의 area.append(msg+"\n");
			chatClientB.area.append(msg+"\n");
			chatClientC.area.append(msg+"\n");
		}
		
		public static void main(String[] args) {
			new ChatClientA();
		}
}
