package jtable.vector;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

//현실의 하나의 게시판을 DB 분야에서는 Table로 정의하고, OOP에서는 class로 정의한다.
//이 때, OOP개발자는 컬럼만 봐도 OOP의 클래스로 변환할 줄 알아야 한다.
//프로젝트 진행 시, db에 존재하는 table이 197개라면
//적어도 이에 대응하는 VO클래스의 갯수 역시 197개.
public class MemberModel extends AbstractTableModel{
	 Vector<Member> data=new Vector<Member>();//기존의 데이터를 처리했던 이차원 배열을 대신한 컬렉션 객체
	 Vector<String> column=new Vector<String>();//기존의 컬럼명을 처리했던 일차원 배열을 대신할 컬렉션 객체
	public int getRowCount() {
		return data.size();
	}
	public int getColumnCount() {
		return column.size();
	}
	public String getColumnName(int col) {
		return column.get(col);
	}
	public Object getValueAt(int row, int col) {
		 String value = null;
		 Member member=data.get(row);
		   if(col==0) {
			   value = Integer.toString(member.getMember_id());
		   }else if(col==1){
			   value = member.getUser_id();
		   }else if(col==2) {
			   value = member.getPassword();
		   }else if(col==3) {
			   value = member.getName();
		   }else if(col==4) {
			   value = member.getRegdate();
		   }
	      return value;
	}
	
	
	
}