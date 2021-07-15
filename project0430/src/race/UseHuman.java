package race;

class UseHuman{

	public static void main(String[] args){
		Black b = new Black();
		//b.age = 7; 존재하지 않는 변수라서 컴파일 에러.
		b.IQ = 110; 
		//부모클래스에서 상속 받았기 때문에 가능.
		b.speak();
		b.drive();
	}

}
/*상속 관계에서 주의 점 :
부모의 코드가 자식 클래스에 붙여넣기가 되는게 아니라, 서로 다른 인스턴스 영역을 가진 상태에서
자식의 인스턴스가 부모의 인스턴스 영역을 자기 것 처럼 접근 가능한 것.
-> 부모와 자식은 자신만의 변수를 가질 수 있고, 변수명이 동일할 수 있다.
*/