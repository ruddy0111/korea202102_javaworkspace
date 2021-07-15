package app0602.stream;

import java.io.IOException;
import java.io.InputStream;

public class StreamStudy {

	
	public static void main(String[] args) {
		InputStream is = System.in;
		
		int data = -1;
		
		try {
			data = is.read();
			System.out.println((char)data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
