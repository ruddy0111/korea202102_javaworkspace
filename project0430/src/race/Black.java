package race;
//�η��� ������ Ư¡�� ��������, ������ �������Ѵ�.
public class Black extends Human{
	public Black(){
		super(135);
		System.out.println("���� �ʱ�ȭ");//�θ��� �ʱ�ȭ ���� �ö� �� ����. �� �θ�-�� �ڽ�
	}
	/*
	1) useHuman���� �ĵ�Ÿ��� �ڵ� ����.
	2) �θ��� �����ڿ� �Ű������� ������ ���, �����ڰ� ���������� �θ��� �μ��ִ� �����ڸ� ���� ȣ���Ͽ� ����.
	3) 2) �� ���� ���, �θ𿡰� �Ű����� ���� �����ڸ� ����.(=�����ε�)
	=> 2)�� ���� ��õ
	public Black(){
		super(123);
	}
	*/
	String color = "black";
	int IQ = 110;
	
	public void run(){
		System.out.println("������ ���Ѵ�.");
	}

}  
