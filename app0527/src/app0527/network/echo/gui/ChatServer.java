package app0527.network.echo.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServer extends JFrame implements ActionListener{
	JPanel p_north;
	JTextField t_port;
	JButton bt;
	JTextArea area;
	JScrollPane scroll;
	
	ServerSocket server; //접속을 감지하는 소켓 
	Thread thread; //접속자 감지를 처리하기 위한 쓰레드, 없을 시 메인쓰레드가 대기상태에 빠진다..
	
	public ChatServer() {
		//생성 
		p_north = new JPanel();
		t_port = new JTextField(10);
		bt = new JButton("서버가동");
		area = new JTextArea();
		scroll  =new JScrollPane(area);
		
		//add
		p_north.add(t_port);
		p_north.add(bt);
		add(p_north, BorderLayout.NORTH);
		add(scroll);
		
		//event
		bt.addActionListener(this);
		
		//view
		setVisible(true);
		setBounds(500, 100, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//서버가동 
	public void startServer() {
		int port = Integer.parseInt(t_port.getText());
		
		BufferedReader buffr = null;//버퍼 처리된  문자  기반 입력 스트림
		BufferedWriter buffw = null;//버퍼 처리된  문자  기반 출력 스트림
		
		try {
			server = new ServerSocket(port);
			area.append("서버 생성\n접속자 기다리는 중...\n");
			
			//접속자 감지 후, 대화용 스레드 반환
			Socket socket = server.accept(); //이 코드에의해 접속자가 발견될때까지 실행부는 무한대기
			
			
			InetAddress addr =  socket.getInetAddress();
			String ip = addr.getHostAddress();
			area.append(ip+"님 접속자 감지\n");
			
			buffr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			buffw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			//클라이언트의  메시지 받기
			String data = null;
			while(true) {
				data = buffr.readLine();//한 줄 받기
				
				area.append(data+"\n");
				
				buffw.write(data+"\n");
				buffw.flush();//버퍼 기반 출력 스트림에서 버퍼를 비워야 안전.
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(buffw!=null) {
				try {
					buffr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		thread = new Thread() {
			
			//개발자는 쓰레드로 처리하고픈 로직을 run에 작성한다!!
			public void run() {
				startServer();
			}
		};
		thread.start();
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}

}