package bank;

//���¸� �����غ���.
//�ڹٴ�, Ŭ���� �� ���� ����� �����ϹǷ� ���Ȼ� ������ ���� ������ �߻��� �� �ִ�.
//�̿�, �̸� �����ϱ� ���� ���������� ��� ���� ó���� �����Ѵ�.
//�ڹ��� ���� ó���� ������ ���� �� 4������ �����ȴ�.
/* 
����    ���or������Ű�� ���� ��Ű��   ��(�� ���)��
public < protected < default < private

*/
public class Account{
	private String bankName="�������";
	private String master="��Ʈ��";
	private int balance=5000;
	private String num="110-299-715169";

	//�����Ϳ� ���� ���� ������ ��������, ������ ����ڴ� ����� �� �ֵ��� ��ġ ����
	public void setBalance(int balance){//�����(���ۿ�) setter
		this.balance = balance;
	}
	public int getBalance(){//�������� ���� �뵵 getter
		return balance;
	}

	//�����ʹ� ��ȣ�ϰ�, �� �����͸� ����� �� �ִ� �޼��带 ��������� ������ �����ϹǷ�
	//�̷��� ����ȭ, ����ȭ�� �޼��� ���� ����� ������ setter, getter�� �Ѵ�.
	//setter, getter ���� ��Ģ : get����, set����(�� ���� ������ �빮��)

	//master
	public void setMaster(String master){
		this.master = master;
	}
	public String getMaster(){
		return master;
	}

	//bankName
	public void setBankName(String bankName){//�����(���ۿ�) setter
		this.bankName = bankName;
	}
	public String getBankName(){//�������� ���� �뵵 getter
		return bankName;
	}

	//num
	public void setNum(String num){//�����(���ۿ�) setter
		this.num = num;
	}
	public String getNum(String num){//�������� ���� �뵵 getter
		return num;
	}
}