package util;

class UseObject{
	public static void main(String[] args){
		ObjectTest ot = new ObjectTest();
		String str = "monkey";

		//ot.test();//존재하지 않는 메서드 호출
		boolean result = ot.equals(str);
		System.out.println(result);

		//위의 코드에서 equals() 메서드는 ObjectTest 클래스 내에 직접 정의한 적없다.
		//그러나 에러가 나지 않는 것은 시스템에 의해 이미 정의되어 있음을 증명한다.
	
	}

}
