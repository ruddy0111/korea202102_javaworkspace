package race;

class Human{

	int IQ = 90;
	boolean hasName = true;
	
	public Human(int IQ){
		this.IQ=IQ;
		System.out.println("휴먼의 초기화");
	}
	//생성자 오버로딩
	public Human(){
	}
	public void speak(){
		System.out.println("말할 수있다.");
	}
	public void drive(){
		System.out.println("운전할 수있다.");
	}
}
