package app0602.cal.basic;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);//디자인 시에는 1플러스
//		System.out.println(cal.get(Calendar.DATE));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//오늘 사귀면 100일 뒤에는?
//		Calendar cal2 = Calendar.getInstance();
//		cal2.set(Calendar.DATE, cal2.get(Calendar.DATE)+100);
//		int mm = cal2.get(Calendar.MONTH);
//		int dd = cal2.get(Calendar.DATE);
//		System.out.println((mm+1)+"월"+dd+"일");
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(1945,8-1,15);//과거 시간으로 캘린더 객체를 조작
		int yy = cal3.get(Calendar.YEAR);
		int mm = cal3.get(Calendar.MONTH);
		int dd = cal3.get(Calendar.DATE);
		int day = cal3.get(Calendar.DAY_OF_WEEK);
		String[] title = {"SUN","MON","THU","WED","THUR", "FRI", "SAT"};
		System.out.println(yy+"년"+(mm+1)+"월"+dd+"일"+title[day-1]+"요일");
	}
}
