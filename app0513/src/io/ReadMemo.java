
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadMemo{
	FileInputStream fis;//�Է� ��Ʈ�� �� ������ ������� �� �Է� ��Ʈ��


	public ReadMemo(){
	//try���� �����ߴ� ����� �߻��� ���, catch������ ��������.
		try{
			fis = new FileInputStream("D:\\korea202102_javaworkspace\\app0514\\res\\memo.txt");
			System.out.println("���Ͽ� ���� ��Ʈ�� ���� ����");
			int data = fis.read();//1byte �о����
			System.out.println("����� �о���� �����ʹ�"+(char)data);

		}catch(FileNotFoundException e){
			System.out.println("�ش� ������ ã�� �� �����ϴ�.");
		}catch(IOException e){
			System.out.println("���� �б� ����");
		}
	}
	public static void main(String[] args)	{
		new ReadMemo();
	}
}
