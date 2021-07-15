package animal.birds;

class UseDuck{
	public static void main(String[] args){
		Duck d = new Duck("yellow");
		d.canSwim();

		Bird b = new Bird();
		b=d;//가능 but d=b 안됨.
	
	//byte short int long : 숫자형은 서로 같은 종류의 자료형이다.
	//즉, 같은 종류의 자료형이기에 서로 형 변환이 가능하다.
	/*객체형도 자료형이다.*/

	}


}