package animal.birds;

//������ �ֻ��� ��ü ����
public class Bird{
	String name="±±��";
	boolean hasWing=true;
	String color;

	public Bird(String color){
		this.color = color;
	}

	public void fly(){
		System.out.println(name+"�� ����ٴմϴ�.");	
	}

}