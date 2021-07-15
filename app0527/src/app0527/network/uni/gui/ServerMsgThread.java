package app0527.network.uni.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JTextArea;

//에코서버는 접속자바다 소켓 유지 할 수 없기에, 아래 클래스 정의하여, 인스턴스 변수로 보관.
//이 소켓 통하여 클라이언트와 메시지 송수신 독립적으로 실행할 수 있도록 스레드로 구현.
public class ServerMsgThread extends Thread{
	Socket socket;
	BufferedReader buffr;
	BufferedWriter buffw;
	JTextArea area;
	
	public ServerMsgThread(Socket socket, JTextArea area) {
		this.socket=socket;
		this.area=area;
		
		try {
			buffr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			buffw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	//듣고
	public void listen() {
		String msg = null;
		try {
			msg = buffr.readLine();
			send(msg);
			area.append(msg+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//말하고
	public void send(String msg) {
		try {
			buffw.write(msg+"\n");
			buffw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void run() {
		while(true) {
			listen();
		}
	}	
	
}
