package animal.birds;
/*아래 코드의 상속관계가 같은 종류가 될 수 있다는 근거
1) 자바에서는 기본 자료형들의 유형은 크게 3가지로 분류.
	문자, 숫자, 논리값.
	특히 숫자*byte, short, int, long, float, double)와 char들 간에는
	서로 같은 정류의 자료형으로 보고 형변환이 가능하다.
2) 자바의 자료형은 총 4가지로서, 객체 가료형이다.

=> 2)와 같이, 객체 자료형도 자료형이라면, 기본 자료형들간에 적용되었던 객체간 형변환이 객체자료형에도 적용되어야 한다.
	cause, 객체 자료형도 자료형이므로.

=> 사용자가 만든 자료형인 클래스 간에도 같은 종류의 자료형이 있을 수 있는가?
	O. 상속(extend)를 이용하여 부모 자식간의 관계를 같은 종류의 자료형으로 볼 수 있다.

*/
public class Duck extends Bird{

	String name = "오리 꽥꽥";
	String color;

	public Duck(String color){
		super(color);
	}

	public void canSwim(){
		System.out.println("어푸어푸");

	
	}

}