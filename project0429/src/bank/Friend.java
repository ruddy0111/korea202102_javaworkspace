package bank;

class Friend{
	public static void main(String[] args){
		Account acc = new Account();
		System.out.println("���� �� �ܰ��" + acc.getBalance());		
		//acc.balance = acc.balance+8000;
		//������ ���� ���� ������ ���� ����, �޼��� ȣ��� �����͸� ��������.
		acc.setBalance(15000000);
		
		System.out.println("���� �� �ܰ��" + acc.getBalance());

		//���� Friend Ŭ������ Account�� ���� ��Ű��. ���� �ٸ� �� ���� ����.
		System.out.println("�����"+acc.bankName);
		System.out.println("������"+acc.master);
		System.out.println("���¹�ȣ"+acc.num);
	}


}

