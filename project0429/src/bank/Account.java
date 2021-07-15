package bank;

//계좌를 정의해본다.
//자바는, 클래스 간 서로 사용이 가능하므로 보안상 뜻하지 않은 문제가 발생할 수 있다.
//이에, 이를 보완하기 위해 접근제한자 라는 보안 처리를 지원한다.
//자바의 보안 처리는 다음과 같이 총 4가지로 구성된다.
/* 
공개    상속or같은패키지 같은 패키지   나(의 멤버)만
public < protected < default < private

*/
public class Account{
	private String bankName="기업은행";
	private String master="배트맨";
	private int balance=5000;
	private String num="110-299-715169";

	//데이터에 대한 직접 접근은 막았으나, 선의의 사용자는 사용할 수 있도록 장치 마련
	public void setBalance(int balance){//변경용(조작용) setter
		this.balance = balance;
	}
	public int getBalance(){//가져오기 위한 용도 getter
		return balance;
	}

	//데이터는 보호하고, 이 데이터를 사용할 수 있는 메서드를 제공해줘야 개발이 가능하므로
	//이렇게 습관화, 관례화된 메서드 정의 기법을 가리켜 setter, getter라 한다.
	//setter, getter 정의 규칙 : get변수, set변수(각 변수 시작은 대문자)

	//master
	public void setMaster(String master){
		this.master = master;
	}
	public String getMaster(){
		return master;
	}

	//bankName
	public void setBankName(String bankName){//변경용(조작용) setter
		this.bankName = bankName;
	}
	public String getBankName(){//가져오기 위한 용도 getter
		return bankName;
	}

	//num
	public void setNum(String num){//변경용(조작용) setter
		this.num = num;
	}
	public String getNum(String num){//가져오기 위한 용도 getter
		return num;
	}
}