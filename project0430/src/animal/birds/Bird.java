package animal.birds;

//조류의 최상위 객체 정의
public class Bird{
	String name="짹짹이";
	boolean hasWing=true;
	String color;

	public Bird(String color){
		this.color = color;
	}

	public void fly(){
		System.out.println(name+"가 날라다닙니다.");	
	}

}