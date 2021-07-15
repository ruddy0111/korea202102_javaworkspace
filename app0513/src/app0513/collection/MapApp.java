package app0513.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapApp {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("fruit1", "apple");
		map.put("fruit2", "banana");
		map.put("fruit3", "pear");
		map.put("fruit4", "pineapple");
		
		//System.out.println(map.get("fruit3"));
		
		//직접 Iterator 나 Enumeration으로 변환 할 수는 없고, set을 한 번 거쳐서 처리한다.
		//아래의 Keyset 메서드는 
		Set<String> set = map.keySet();//fruit1, fruit2, fruit3
		
		Iterator it = set.iterator();//이름을 일렬로 늘어뜨린다.
		
		while(it.hasNext()) {
			String key = it.next();//키를 얻었기 떄문에 시점에 Map에 들어있는 데이터를 검색할 수 있다.
			String value = map.get(key);//키에 연결된 value 반환.
			System.out.println(value);
		}
		
		for(int i=0;i<map.size();i++) {
			//map.get
		}
	}
}
