/*���ڿ� ó�� �� �߿��� ����� Stirng Ŭ����*/

package api;

class StringTest{
	public static void main(String[] args){
		//Car c = new car();//��������
		//String s = "apple"; //String�� import�� ���� �����Ƿ� ���� �����̳�, �̹� �⺻������ import �Ǿ� �ִ�. 
		//java.lang ��Ű��.
		String s = new String("apple");//�����ε���  ���� ������ �� �ϴ�. api�����Ͽ� ���� ��� ���� ����.
		//���ڿ��� ���̸� �� �� �ִ� api ����
		System.out.println("���ڿ��� ���̴�"+s.length());

		//�빮�ڷ� ��ȯ�ϴ� �޼���
		System.out.println(s.toUpperCase());
		
		//�빮�ڷ� ��ȯ�ϴ� �޼���
		System.out.println("������ p�� index��?"+s.lastIndexOf("p"));

		//���ϴ� ��°�� �ִ� ���� 1���� �����ϴ� api���� ��ũ
		System.out.println("charAt�� ���"+s.charAt(4));

	}

}