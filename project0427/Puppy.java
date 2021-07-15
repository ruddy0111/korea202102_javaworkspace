/*강아지 정의*/

class Puppy{
	int age = 5;
	boolean hasGuard;//멤버 변수를 개발자가 초기화 하지 않으면, 이 클래스로부터 메모리에 올라가는 인스턴스 변수값에 디폴트값이 적용.(컴파일러에 의해)
								//이 때, 논리값은 false, 정수 0으로 초기화된다. 이 원칙은 멤버 변수에만 적용된다. 즉, 객체의 손성에 대해서만 적용.
	
	public void setAge(){
	age=3;
	//아래의 k는 자동화, 초기화 되지 않는다. 멤버 변수가 아니기 때문이다.
	int k;
	System.out.println(k)
	}
	public static void main(String[] args){
	//강아지 나이 3세 변경 후, 출력
	//age = 3;
	//System.out.println(age);
	Puppy p = new Puppy();//강아지 1마리의 인스턴스를 생성
	//즉, 위의 과제를 수행하려면 생물학적으로 강아지가 태어나야 가능하다.
	p.setAge();//나이변경 메서드 호출
	System.out.println(p.age);

	Puppy p = new puppy;//
	}
}