/*현실의 사물을 표현하기 위함이 아닌, 실행부 두기 위한 Dummy Class*/
class UseDuck{
	public static void main(String[] args){
		//하드디스크에 컴파일 되어 있는 기계 오리를 메모리에 살아 숨쉬게 해보자 -> 실행해서 메모리 로드
		//오리의 자료형은 우리가 만든 Duck!
		int x = 7;
		Duck d1 = new Duck();
		
		System.out.println("d1이 담고 있는 오리 인스턴스의 주소값은"+d1);
	}
}