package animal.birds;

/*��ӿ��� ��ġ�� �� ��!
1) �ڵ��� ����
2) ��ü�� ����ȯ*/
class UseBird{
	public static void main(String[] args){
	int x = 7;//4byteū �ڷ���
	byte b = 3; //1byte ���� �ڷ���
	//x = b;//����
	b = (byte)x; //�����ڰ� �ս��� �����ؼ��� ���� ����ȯ ��� �� ����.() = ĳ��Ʈ

	//��ü �ڷ����� �� ��ȯ�� ��
	Bird bird = new Bird("red");
	Duck d = new Duck("white");
	bird = d;
	bird.fly();
	//d.canSwim();\
	Duck duck = (Duck)bird;//��ü ���� �� ��ȯ�� �����ϴ�. �� ��, �ڽ� �ڷ��������� �� ��ȯ�� ������ downCasting�̶� �Ѵ�.
	duck.canSwim();
	
	}


}