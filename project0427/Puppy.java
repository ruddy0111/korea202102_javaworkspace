/*������ ����*/

class Puppy{
	int age = 5;
	boolean hasGuard;//��� ������ �����ڰ� �ʱ�ȭ ���� ������, �� Ŭ�����κ��� �޸𸮿� �ö󰡴� �ν��Ͻ� �������� ����Ʈ���� ����.(�����Ϸ��� ����)
								//�� ��, ������ false, ���� 0���� �ʱ�ȭ�ȴ�. �� ��Ģ�� ��� �������� ����ȴ�. ��, ��ü�� �ռ��� ���ؼ��� ����.
	
	public void setAge(){
	age=3;
	//�Ʒ��� k�� �ڵ�ȭ, �ʱ�ȭ ���� �ʴ´�. ��� ������ �ƴϱ� �����̴�.
	int k;
	System.out.println(k)
	}
	public static void main(String[] args){
	//������ ���� 3�� ���� ��, ���
	//age = 3;
	//System.out.println(age);
	Puppy p = new Puppy();//������ 1������ �ν��Ͻ��� ����
	//��, ���� ������ �����Ϸ��� ������������ �������� �¾�� �����ϴ�.
	p.setAge();//���̺��� �޼��� ȣ��
	System.out.println(p.age);

	Puppy p = new puppy;//
	}
}