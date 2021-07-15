package app0513.collection;

import java.util.ArrayList;

import javax.swing.JButton;

public class ListApp {
	public static void main(String[] args) {
		//리스트는 배열과 모양이 같다. 단지 다루려는 대상이 다를 뿐이다.
		ArrayList<String> list  = new ArrayList<String>();//제너릭(Generic)타입으로 명시 된 컬렉션 프레임웍 캑체는 해당 객체만을 받아들인다. 컴파일 타임에 잡아낸다.
		
		list.add("apple");
		list.add("apple");
		list.add("apple");
		list.add("apple");
		list.add("apple");
		int length = list.size();
		System.out.println("리스트 데이터 수"+length);
		list.set(1, "사과");
		System.out.println("바뀐 결과는"+list.get(1));
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//jdk 1.5부터 개선된 for loop지원. 다른 언어에서의 for ~ each문과 비슷.
		for(String item : list) {//우측 항의 집합 수 만큼 반복
			String s = (String)item;
			System.out.println(s);
		}
	}
}
