/*실행 중인 자바 프로그램으로 메모장 파일의 내용을 읽어오자 = 입력
자바의 java.io패키지에 io관련 클래스 지원.*/
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadMemo{
	FileInputStream fis;//입력 스트림 중 파일을 대상으로 한 입력 스트림


	public ReadMemo(){
	//try에서 예상했던 우려가 발생한 경우, catch문으로 진입힌다.
		try{
			fis = new FileInputStream("D:\\korea202102_javaworkspace\\app0514\\res\\memo.txt");
			System.out.println("파일에 대한 스트림 생성 성공");
			int data = fis.read();//1byte 읽어들임
			System.out.println("당신이 읽어들인 데이터는"+(char)data);

		}catch(FileNotFoundException e){
			System.out.println("해당 파일을 찾을 수 없습니다.");
		}catch(IOException e){
			System.out.println("파일 읽기 실패");
		}
	}
	public static void main(String[] args)	{
		new ReadMemo();
	}
}
