package traffic;
	//�޼������ ������, �Ű������� �ڷ����� ������ �ٸ��� �ϸ� �ߺ����Ƿ� �������� �ʴ´�.
	//overroading = �޼��� ��ø
	//��, �����ڰ� ����� �������� �޼��带 ������ ���, ū ���̰� �������� �ұ��ϰ� �޼������ �ٸ��� ����ϴ� ���� �ؼ�.

class Car{
	public void run(){
		System.out.println("�ڵ����� �޸���.");
	}
	public void run(int vel){
		System.out.println("�ڵ����� ���� �޸���.");
	}
	public void run(boolean flag){
		System.out.println("....");
	}
}