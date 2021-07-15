package race;
//인류의 보편적 특징을 물려받은, 흑인증 ㄹ저의한다.
public class Black extends Human{
	public Black(){
		super(135);
		System.out.println("흑인 초기화");//부모의 초기화 위에 올라갈 수 없다. 선 부모-후 자식
	}
	/*
	1) useHuman에서 파도타기로 자동 생성.
	2) 부모의 생성자에 매개변수가 존재할 경우, 개발자가 적극적으로 부모의 인수있는 생성자를 직접 호출하여 생성.
	3) 2) 가 싫을 경우, 부모에게 매개변수 없는 생성자를 생성.(=오버로딩)
	=> 2)를 적극 추천
	public Black(){
		super(123);
	}
	*/
	String color = "black";
	int IQ = 110;
	
	public void run(){
		System.out.println("육상을 잘한다.");
	}

}  
