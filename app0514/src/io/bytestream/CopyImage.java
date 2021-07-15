package io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


class CopyImage{
	FileInputStream fis;
	FileOutputStream fos;

	public CopyImage(){
		try{
			fis = new FileInputStream("D:/korea202102_javaworkspace/app0514/res/jelly.jpg");
			fos = new FileOutputStream("D:/korea202102_javaworkspace/app0514/res/jelly_copy.jpg");
			
			//입력 스트림으로는 데이터의 1byte씩 읽어들이고, 출력 스트림으로는 데이터 1byte씩 출력해보자(복사)
			int data = -1;
			while(true) {
				data = fis.read();//1byte input
				if(data==-1)break;//데이터의 끝에 도달하면 if문 탈출(if문은 아래 한 줄까지 적용되므로 {}생략 가능)
				fos.write(data); //1byte output
			}
			System.out.println("복사 완료.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("파일을 읽을 수 없습니다.");
		}finally {
			//스트림은 닫아야 한다.
			if(fis !=null) {
				try {
					fis.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			if(fos !=null) {
				try {
					fos.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args)	{

		new CopyImage();
	}
}
