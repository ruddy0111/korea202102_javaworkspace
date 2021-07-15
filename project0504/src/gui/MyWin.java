/*GUI 프로그래밍은 무조건 윈도우가 있어야 한다.
따라서 자바 언어에서 GUI관련된 패키지는 awt/swing에서 지원.
javaFX(안드로이드와 유사)*/

package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;

public class MyWin{
	//자바에서 윈도우는 실제적으로 Frame이라는 클래스가 담당.
	public static void main(String[] args){
	
		Frame frame;//객체의 인스턴스 없다. 따라서 frame에는 초기화 되어 있지 않다.
		/*Frame이라는 클래스는 사용을 위해 제공 받은 것.
		[제공받은 객체 사용 Tip]
			1) 해당 클래스가 무엇인지, 용도, 목적 판단.

			2) 사용을 위해 메모리에 올리기
				(메모리에 올리려면, 이 객체가 일반인지, 추상인지, 인터페이스인지 조사.
				 - 일반클래스 : new
				 - 추상 클래스 : 자식으로 완성 후, 자식을 new
				 - 인터페이스 : 자식으로 완성 후, 자식을 new
			
			3)	객체의 유형이 결정되었다면
				 - 일반 클래스 : new 다음에 와야 하는 생성자 조사
	
		*/
		frame = new Frame();

		/*Layout Default값으로 적용.*/
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow); 

		//버튼
		Button bt = new Button("i'm Button");

		//체크박스
		Checkbox ch1 = new Checkbox("바나나");
		Checkbox ch2 = new Checkbox("딸기");
		Checkbox ch3 = new Checkbox("사과");
		Checkbox ch4 = new Checkbox("포도");
		Checkbox ch5 = new Checkbox("배");

		//텍스트 박스
		TextField t = new TextField(20);

		//html의 select 박스는 java 에서는 Choice 라고 한다
		Choice choice=new Choice(); //naver.gooogle.daum
		  choice.add("Choose Your Email");
		  choice.add("naver.com");
		  choice.add("gmail.com");
		  choice.add("daum.net");
				
		frame.add(bt);//frame에 버튼 부착
		frame.add(t);//frame에 텍스트박스 부착
		frame.add(ch1);//frame에 체크박스 부착
		frame.add(ch2);//frame에 체크박스 부착
		frame.add(ch3);//frame에 체크박스 부착
		frame.add(ch4);//frame에 체크박스 부착
		frame.add(ch5);//frame에 체크박스 부착
		frame.add(choice);//frame에 choice 부착


		//api document에서 찾아보자
		frame.setVisible(true);

		//크기 명시
		frame.setSize(300, 400);
	}

}