package app0602.stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferTest {
	
	
	public static void main(String[] args) {
		while(true) {
	        try{
	        	InputStream is = System.in;
	            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
	            String data = null;
	        }catch( e){
	        	e.printStackTrace();
	        }
		}
	}
}
