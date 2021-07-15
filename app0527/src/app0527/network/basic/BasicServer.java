package app0527.network.basic;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//GUI없이 커맨드 모드에서 네트워크 서버를 구축해보자.
//네트워크 프로그램을 시도하기 전에 먼저 IT 분야에서 보편적으로 사용되는 개념인 소켓.
//소켓 : 일반적인 응용프로그래밍 언어가 네트워크의 상세한 하부 지식 없이도 네트워크를 제어할 수 있도록, 추상화 시켜놓은 api를 지칭.
//			거의 모든 응용 프로그램마다 소켓을 지원한다
public class BasicServer {
	ServerSocket server; //소켓 서버 구축을 위한 서버 객체(접속을 받아들이는 소켓)
	
	//네트워크 프로그램 시 항상 염두해두어야 할 점은 네트워크 프로그램의 원리가 전화의 원리와 상당히 흡사하다는 점.
	//두 당사자(클라이언트 - 서버) 간의 대화에 앞서서 먼저 두 당사자 간, 접속이 선행되어야 한다.
	//이 때 사용되는 객체가 ServerSoket. 즉, 대화용 소켓이 아니다.
	
	public BasicServer() {
		try {
			server = new ServerSocket(7777);//7777port로 접속자를 기다린다.
			System.out.println("서버 객체 생성");
			
			//접속자 감지
			Socket socket = server.accept();
			System.out.println("접속자 발견");
			//접속자 접속 기다리다, 접속 발생할 경우 대화 주고받는 기능
			
			InputStream is = socket.getInputStream();
			int data = -1;
			while(true) {
				//read()메서드는 실행부로  하여금, 데이터가 들어올  때 까지 대기상태에 빠지게 한다.
				data = is.read();
				//소켓과 연결된 입력 스트림으로부터, 클라이언트의 메시지 중 1byte를 읽어들임.
				//즉, 우리가 연결한 대상이 네트워크일 뿐이며, 실제적인 프로그램은 스트림 제어이다.
				System.out.println((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new BasicServer();
	}
}
