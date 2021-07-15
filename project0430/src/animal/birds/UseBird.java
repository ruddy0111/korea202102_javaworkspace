package animal.birds;

/*상속에서 놓치지 말 것!
1) 코드의 재사용
2) 객체간 형변환*/
class UseBird{
	public static void main(String[] args){
	int x = 7;//4byte큰 자료형
	byte b = 3; //1byte 작은 자료형
	//x = b;//가능
	b = (byte)x; //개발자가 손실을 감안해서라도 강제 형변환 명시 시 인정.() = 캐스트

	//객체 자료형의 형 변환의 예
	Bird bird = new Bird("red");
	Duck d = new Duck("white");
	bird = d;
	bird.fly();
	//d.canSwim();\
	Duck duck = (Duck)bird;//객체 간의 형 변환도 가능하다. 이 때, 자식 자료형으로의 형 변환을 가리켜 downCasting이라 한다.
	duck.canSwim();
	
	}


}