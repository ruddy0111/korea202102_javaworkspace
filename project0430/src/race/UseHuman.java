package race;

class UseHuman{

	public static void main(String[] args){
		Black b = new Black();
		//b.age = 7; �������� �ʴ� ������ ������ ����.
		b.IQ = 110; 
		//�θ�Ŭ�������� ��� �޾ұ� ������ ����.
		b.speak();
		b.drive();
	}

}
/*��� ���迡�� ���� �� :
�θ��� �ڵ尡 �ڽ� Ŭ������ �ٿ��ֱⰡ �Ǵ°� �ƴ϶�, ���� �ٸ� �ν��Ͻ� ������ ���� ���¿���
�ڽ��� �ν��Ͻ��� �θ��� �ν��Ͻ� ������ �ڱ� �� ó�� ���� ������ ��.
-> �θ�� �ڽ��� �ڽŸ��� ������ ���� �� �ְ�, �������� ������ �� �ִ�.
*/