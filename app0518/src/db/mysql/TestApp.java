package db.mysql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;//접송 송공 후, 해당 DB에 대한 접속 정보를 가진 객체
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class TestApp{
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3306/javase";//정해진 문자열 형식
		String user = "root";
		String pass = "1234";
		Connection con=null;//접속 성공후 접속 정보를 가진 객체
		PreparedStatement pstmt=null;//쿼리문 수행 객체
		ResultSet rs = null;//select 수행 후 그 결과 표집합을 담는 객체
		/*
		1.사용하려는 DB에 맞는 드라이버 로드(클래스 로드)
		    Class.forName("원하는 클래스명")
		2.DB접속 
		3.쿼리문 수행
		4.DB관련 객체 해제
		*/
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공");

			con = DriverManager.getConnection(url,user, pass);
			if(con!=null){
				System.out.println("접속 성공");
				//쿼리 실행이 아닌, 쿼리를 실행할 스 있는 객체를 생성
				pstmt = con.prepareStatement("select * from member");
				rs = pstmt.executeQuery();//select 문인 경우 반환 객체 존재.
				while(rs.next()){//rs.next()반환값이 true인 동안 반복 수행.rs.next() = 한 칸씩 전진
				// 컬럼의 이름으로 가져오기
				/*
					int member_id = rs.getInt("member_id");//인수로는 컬럼명
					String user_id = rs.getString("user_id");
					String password = rs.getString("password");
					String name = rs.getString("name");
					String regdate = rs.getString("regdate");
				*/
				//컬럼의 인덱스로 가져오기`
					int member_id = rs.getInt(1);
					String user_id = rs.getString(2);
					String password = rs.getString(3);
					String name = rs.getString(4);
					String regdate = rs.getString(5);

					System.out.println(member_id+"\t"+user_id+"\t"+password+"\t"+name+"\t"+regdate);
				}
				//ResultSet
			}else{
				System.out.println("접속 실패");
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace(); //개발자가 원인을 분석하기 위한 출력
			System.out.println("드라이버 로드 실패");//유저를 위한 친절한 메시지
		}catch(SQLException e){
			//DriverManager.getConnextion()으로 접속 시도하다가 에러가 나도 SQLException이고,
			//쿼리문 수행 시 에러가 나도 SQLException이다.
			//즉, Sun에서는 내용을 세분화 시키지 않았다. SQLException
			e.printStackTrace();
		}finally{
			if(rs!=null){
				try{
					rs.close();
				}catch(SQLException e){
				e.printStackTrace();
				}
			}
			if(pstmt!=null){
				try{
					pstmt.close();
				}catch(SQLException e){
				e.printStackTrace();
				}
			}
			if(con!=null){
				try{
					con.close();
				}catch(SQLException e){
				e.printStackTrace();
				}
			}
			
		}

	}
}