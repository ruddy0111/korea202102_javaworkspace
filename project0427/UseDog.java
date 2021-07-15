/*이 클래스는 현실의 사물을 표현하기 위함이 아닌, 단지 메인을 두기 위한, 실행용 클래스일 뿐이다.*/
class UseDog{
	public static void main(String[] args){
		//강아지 2마리를 메모리에서 뛰어놀게 해보자
		//뛰어놀게 하려면 메모리에 올려야 하고, 메모리에 올리려면 실행해야 한다.
		//또한 거푸집에 불과했던 강아지의 인스턴스를 생성해야 한다.
		String name = new Dog().getName();
		System.out.println(name);
		//사용자 정의 자료형
		Dog d2 = new Dog();
		System.out.println("강아지 변경전 나이는"+d2.getAge());
		d2.age = 3;
		System.out.println("강아지 변경된 나이는"+d2.getAge());
		//강아지 이름을 뽀미로 변경 후 출력 
		d2.name = "BOM";
		System.out.println("강아지 이름 바꿔!"+d2.getName());
	}
}