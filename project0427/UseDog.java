/*�� Ŭ������ ������ �繰�� ǥ���ϱ� ������ �ƴ�, ���� ������ �α� ����, ����� Ŭ������ ���̴�.*/
class UseDog{
	public static void main(String[] args){
		//������ 2������ �޸𸮿��� �پ��� �غ���
		//�پ��� �Ϸ��� �޸𸮿� �÷��� �ϰ�, �޸𸮿� �ø����� �����ؾ� �Ѵ�.
		//���� ��Ǫ���� �Ұ��ߴ� �������� �ν��Ͻ��� �����ؾ� �Ѵ�.
		String name = new Dog().getName();
		System.out.println(name);
		//����� ���� �ڷ���
		Dog d2 = new Dog();
		System.out.println("������ ������ ���̴�"+d2.getAge());
		d2.age = 3;
		System.out.println("������ ����� ���̴�"+d2.getAge());
		//������ �̸��� �ǹ̷� ���� �� ��� 
		d2.name = "BOM";
		System.out.println("������ �̸� �ٲ�!"+d2.getName());
	}
}