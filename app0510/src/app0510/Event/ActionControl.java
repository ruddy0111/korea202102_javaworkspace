package app0510.Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*JVM이 OS로부터 이벤트 정보를 넘겨받아, 해당 이벤트에 알맞는 객체의 인스턴스를 생성하면 JVM은 해당 이벤트 정보에 알맞는 객체의
 * 인스턴스를 올린다. 따라서 JVM이 넘겨준 이벤트 정보를 수신하여 원하는 이벤트 처리를 시도해보자. */
public class ActionControl implements ActionListener{

	//개발자가 구현해야 할 추상 메서드. 이 메서드의 매개변수로는 JVM이 생성한 이벤트 객체가 전달된다. 따라서, 이벤트 객체를 이용하여 각종 정보 추출 후 작업 수행

	//아래 메서드는 개발자가 완성해야 한다. 이벤트 발생 시 어떤 구현을 할지는 개발자가 결정 짓는다. 
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
	}

}

