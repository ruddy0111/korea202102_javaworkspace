package app0601.xml.data.table;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;


public class MountainModel extends AbstractTableModel{
	Vector<Mountain> data = new Vector<Mountain>();
	Vector<String> column = new Vector<String>();
	
	public MountainModel() {
//		column.add("위치");
//		column.add("상세정보");
//		column.add("높이");
//		column.add("등록정보");
//		column.add("이름");
		String[] title = {"소재지","상세셜명", "높이", "등록정보", "이름"};
		for(int i=0;i<title.length;i++) {
			column.add(title[i]);
		}
		
	}
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
		Mountain mountain=data.get(row);
		String value=null;
		
		if(col==0) {
			value=mountain.getMntiadd();
		}else if(col==1) {
			value=mountain.getMntidetail();
		}else if(col==2) {
			value=mountain.getMntihigh();
		}else if(col==3) {
			value=Integer.toString(mountain.getMntilistno());
		}else if(col==4) {
			value=mountain.getMntiname();
		}
		
		return value;
	}
}