//Account 와는 다른 패키지에서 접근 제한을 실습해본다

package use;
import bank.Account;

class Hacker{
	public static void main(String[] args){
	//은행 계좌를 메모리에 올려놓고 장난쳐보기
	Account acc = new Account();
	//아래 코드는 패키지와 상관 없이 balance변수가 private라서 접근 불가.
	// System.out.println("현재"+acc.master+"보유 잔고"+acc.balance);
	//은행명, 계좌주, 계좌번호 접근 가능?
	System.out.println("은행명"+acc.bankName);
	System.out.println("계좌주"+acc.master);
	System.out.println("계좌번호"+acc.num);
	}
}