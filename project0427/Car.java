/*자동차를 정의해본다*/
class Car{
	String name="밴츠";
	int price = 9000;
	String color = "silver";
	
	public void setPrice(int price){
		this.price = price;
	}
	public static void main(String[] args){
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = c2;

		c1.setPrice(8000);//첫번째 자동차의 가격 변경
		System.out.println(c1.price);//첫번째 자동차의 가격 확인
		System.out.println(c2.price);//두번째 자동차의 가격 확인
		//-> 결론 : 메모리에 올라간 인스턴스들은 각 별개의 객체들이다.

		c3.setPrice(7000);//c2가 가리키고 있었던 자동차와 동일한 위치의 차를 가리킴(즉, 2번째 자동차)
		System.out.println(c2.price);//두번째 자동차의 가격 확인
		//-> 결론 : c3가 c2를 가리키고 있으므로, c3의 가격 변경 시 c2의 가격이 변동된다.
	}
}