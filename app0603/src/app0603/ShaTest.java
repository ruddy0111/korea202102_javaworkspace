package app0603;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaTest {
	public static void main(String[] args) {
		String password = "hyojuunzzang";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(password.getBytes("UTF-8"));
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<hash.length;i++) {
				String hex = Integer.toHexString(0xff&hash[i]);
				System.out.println(hex);
				if(hex.length()==1) {
					sb.append("0");
				}
				sb.append(hex);
				System.out.println(hex);
			}
			System.out.println(sb);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("알고리즘이 존재하지 않습니다.");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
