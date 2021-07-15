package app0517.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBSelect {
	String driver="com.mysql.jdbc.Driver";//mysql용 드라이버 경로
	String url="jdbc:mysql://localhost:3306/javase?characterEncoding=UTF8";
	String id ="root";
	String pass="1234";
	Connection con = null;
	PreparedStatement pstmt;
	ResultSet rs;//select 문 수행 후 그 결과 집합은 표 구조이기에, 이 표 구조를 표현한 객체가 바로 ResultSet이다.
	
	public DBSelect() {
		/*1) 드라이버로드(해당 제품 DB 제어 위한 jar)
		 *2) 접속
		 *3) 원하는 쿼리 수행
		 *4) DB접속 해제
		 */
		try {
			Class.forName(driver	);
			System.out.println("	드라이버로드 성공");			
			//접속
			con = DriverManager.getConnection(url, id, pass);
			if(con==null) {
				System.out.println("실패");
			}else {
				System.out.println("성공");
				//쿼리문 수행하기
				String sql = "select * from member order by member_id desc";
				pstmt = con.prepareStatement(sql);//쿼리문 수행 객체 생성
				pstmt.executeQuery();//select 문의 경우엔 executeQuery()메서드, DML
				System.out.println("반환된 객체는"+rs);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패 :  해당 드라이버를 찾을 수 없습니다.");
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null) {
				try {
					rs.close();
				}catch(SQLException e) {
					e.printStackTrace();	
				}
				
			}
			if(pstmt!=null) {
				try {
					pstmt.close();
				}catch(SQLException e) {
					e.printStackTrace();	
				}
				
			}
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();	
				}
				
			}
		}
	
	}
	public static void main(String[] args) {
		new DBSelect();
	}
	
}
