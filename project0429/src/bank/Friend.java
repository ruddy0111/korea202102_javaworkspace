package bank;

class Friend{
	public static void main(String[] args){
		Account acc = new Account();
		System.out.println("조작 전 잔고는" + acc.getBalance());		
		//acc.balance = acc.balance+8000;
		//변수에 대한 직접 접근을 하지 말고, 메서드 호출로 데이터를 변경하자.
		acc.setBalance(15000000);
		
		System.out.println("조작 전 잔고는" + acc.getBalance());

		//현재 Friend 클래스는 Account와 같은 패키지. 따라서 다른 곳 접근 가능.
		System.out.println("은행명"+acc.bankName);
		System.out.println("계좌주"+acc.master);
		System.out.println("계좌번호"+acc.num);
	}


}

