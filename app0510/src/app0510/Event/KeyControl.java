package app0510.Event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//jvm이 KeyEvent 객체를 생성하면, 아래 리스너에게 이벤트 객체를 전달한다.
//개발자는 Keyboard와 관련된 원하는 작업을 아래 클래스에서 완성짓는다.

//아래의 KeyControl 클래스는 KeyListener의 자식이므로, 키와 관련된 모든 이벤트를 청취할 수 있다.
public class KeyControl implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("KeyTyped 호출");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed 호출");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("keyReleased 호출");
		
	}
	
	
	
}
