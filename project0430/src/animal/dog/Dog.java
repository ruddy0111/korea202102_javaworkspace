package animal.dog;

//°­¾ÆÁö ÃÖ»óÀ§ °´Ã¼ Á¤ÀÇ
public class Dog{
	String name="¸Ø¹«";
	boolean tail=true;
	String color;

	public Dog(String color){
		this.color = color;
	}

	public void Bow(){
		System.out.println(name+"°¡ Å¯Å¯´ð´Ï´Ù.");	
	}

}