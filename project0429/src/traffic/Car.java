package traffic;
	//메서드명은 같지만, 매개변수의 자료형과 갯수를 다르게 하면 중복정의로 간주하지 않는다.
	//overroading = 메서드 중첩
	//즉, 개발자가 비슷한 로직으로 메서드를 정의할 경우, 큰 차이가 없음에도 불구하고 메서드명을 다르게 줘야하는 불편 해소.

class Car{
	public void run(){
		System.out.println("자동차가 달린다.");
	}
	public void run(int vel){
		System.out.println("자동차가 조금 달린다.");
	}
	public void run(boolean flag){
		System.out.println("....");
	}
}