/*객체지향은 모든 코드가 반드시 특정 클래스 안에 존재해야 한다.*/
class Test{
	/*java.exe 라는 실행프로그램은 실행대상인 클래스에게 main ()메서드 정의를 요구한다. 즉 실행 시 main을 찾는다.
	만일, main이 없으면 에러 ㅏㄹ생한다.*/
	public static void main(String[] args){
	//var x=3; js는 실행할 때 마다 판단.
	//int y=5; 컴파일 타임에 결정
	for(int i=1;i<=9;i++){
	System.out.println("2*"+i+"="+(2*i));
	}
	
	}

}