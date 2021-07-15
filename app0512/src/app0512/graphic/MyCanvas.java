package app0512.graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas{
	MoveTest moveTest;//null
	
	//이 생성자를 호출하는 자는, MoveTEst의 주소값을 인수로 넘겨야 한다.
	//이렇게 하면 MyCanvas는 태어날 때부터 MoveTest의 주소값을 보유하게 된다.
	//캔버스에 그려질 그림을 개발자가 주도하여 원하는 그림을 그려보자
	
	
	
	/*Paint 메서드
	 특징 : 개발자가 paint 메서드 호출해서는 안된다.
	 이유 : 자바의 모든 컴포넌트는 스스로를 그리기 때문. 즉, 시스템이 그래픽의 랜더링 시 필요에 의호출.
	 호출시기 : 처음의 그림과 비교해서 바뀐 부분이 있을 경우 시스템이 재호출
	 동작원리 : 
	  1) 기존의 그림을 지운다(update 메서드)
	  2) 그림을 그린다(paint 메서드)
	 문제점 : 사용자가 윈도우 창의 크기를 변화시키거나 하는 그래픽 상의 변화를 통해 paint()ㅔ메서드를 호출하는 것이 아니라,
	 개발자가 원하는 시점에 프로그래밍 적으로 paint()를 호출하는 방법은?
	 
	 => sun에서는 그래픽이 화면 반영 처리는 시스템이 하기 때문에, paint()메서드 호출을 원칙적으로 막아둠.
	 따라서, 개발자는 시스템에게 paint가ㅣ 호출될 수 있도록 간접적 호출. : repaint()
	 repaint : 그래픽의 갱신 요청, update()호출 -> paint()
	 
	 * */
	public MyCanvas(MoveTest moveTest) {
		this.moveTest=moveTest;
	}
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(moveTest.x, 100,100,100);
	}
}
