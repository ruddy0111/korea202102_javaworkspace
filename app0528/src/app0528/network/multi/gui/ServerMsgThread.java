package app0528.network.multi.gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ServerMsgThread extends Thread{
	
	Socket socket;
	BufferedReader buffr;
	BufferedWriter buffw;
	ChatServer chatServer; //JTextArea, Vector 등 여러가지 서버측의 자원을 접근할 것이기에...통째로 서버를 보유하자!
	boolean flag = true;//현재 스레드를 동작 제어 논리값. 즉, false로 두는 순간 이 스레드는 dead가 된다.
	
	public ServerMsgThread(Socket socket, ChatServer chatServer) {
		this.socket=socket;
		this.chatServer=chatServer;
		
		try {
			buffr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			buffw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//듣고
	public void listen() {
		String msg=null;
		try {
			msg=buffr.readLine(); //클라이언트가 보낸 메시지 듣기!!!
			for(int i=0;i<chatServer.clientList.size();i++) {
				ServerMsgThread msgThread = chatServer.clientList.get(i);
				msgThread.send(msg); //다시 클라이언트에게 보내기!! 
			}
			chatServer.area.append(msg+"\n");//서버의 로그에 남기기
		} catch (IOException e) {
			e.printStackTrace();
			flag = false;
			chatServer.clientList.remove(this);
			chatServer.area.append("클라이언트가 대화를 종료 하였습니다. 현재 접속자"+chatServer.clientList.size()+"명\n");
			flag = false;
		}
	}
	
	//말하기
	public void send(String msg) {
		//버퍼처리된 스트림에서의 문자열의 끝을 표시할때는 역슬래시n (줄바꿈) 이용해야 한다
		try {
			buffw.write(msg+"\n"); //즉  \n만날때 출력행위가 발생!!
			buffw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void run() {
		while(flag) {
			listen();
		}
	}
}
