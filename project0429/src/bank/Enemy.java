package bank;

class Enemy{
	public static void main(String[] args){
	//������ �ǵ��� ������ �ܰ� ����
	Account acc = new Account();
	System.out.println("���� �� �ܰ��" + acc.balance);		

	acc.balance = -100000000;
	System.out.println(acc.master+"�� �ܰ��" + acc.balance);		


	}

}