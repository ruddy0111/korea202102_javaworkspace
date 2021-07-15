package use;
//이 클래스에서 사용하고픈 외부 존재 클래스 가져오기. 따라서 bin에서 가져오기
import monster.PocketMon;

class UseMon{

	public static void main(String[] args){
		//포켓몬 인스턴스 1개 생성하여 메서드 호출
		PocketMon mon = new PocketMon();
	}
}