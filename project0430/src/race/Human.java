package race;

class Human{

	int IQ = 90;
	boolean hasName = true;
	
	public Human(int IQ){
		this.IQ=IQ;
		System.out.println("�޸��� �ʱ�ȭ");
	}
	//������ �����ε�
	public Human(){
	}
	public void speak(){
		System.out.println("���� ���ִ�.");
	}
	public void drive(){
		System.out.println("������ ���ִ�.");
	}
}
