/*�ڵ����� �����غ���*/
class Car{
	String name="����";
	int price = 9000;
	String color = "silver";
	
	public void setPrice(int price){
		this.price = price;
	}
	public static void main(String[] args){
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = c2;

		c1.setPrice(8000);//ù��° �ڵ����� ���� ����
		System.out.println(c1.price);//ù��° �ڵ����� ���� Ȯ��
		System.out.println(c2.price);//�ι�° �ڵ����� ���� Ȯ��
		//-> ��� : �޸𸮿� �ö� �ν��Ͻ����� �� ������ ��ü���̴�.

		c3.setPrice(7000);//c2�� ����Ű�� �־��� �ڵ����� ������ ��ġ�� ���� ����Ŵ(��, 2��° �ڵ���)
		System.out.println(c2.price);//�ι�° �ڵ����� ���� Ȯ��
		//-> ��� : c3�� c2�� ����Ű�� �����Ƿ�, c3�� ���� ���� �� c2�� ������ �����ȴ�.
	}
}