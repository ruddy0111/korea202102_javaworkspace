/*문자열 처리 시 중요한 기능인 Stirng 클래스*/

package api;

class StringTest{
	public static void main(String[] args){
		//Car c = new car();//에러사항
		//String s = "apple"; //String도 import한 적이 없으므로 에러 사항이나, 이미 기본적으로 import 되어 있다. 
		//java.lang 패키지.
		String s = new String("apple");//오버로딩된  여러 생성자 중 하다. api참조하여 여러 기능 참조 가능.
		//문자열의 길이를 알 수 있는 api 문서
		System.out.println("문자열의 길이는"+s.length());

		//대문자로 변환하는 메서드
		System.out.println(s.toUpperCase());
		
		//대문자로 변환하는 메서드
		System.out.println("마지막 p의 index는?"+s.lastIndexOf("p"));

		//원하는 번째에 있는 문자 1개를 추출하는 api문서 링크
		System.out.println("charAt의 결과"+s.charAt(4));

	}

}