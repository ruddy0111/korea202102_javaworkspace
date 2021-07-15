package app0528.json.test;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonBasic {
	public static void main(String[] args) {
		//아래의 문자열을 Json 객체화 시키려면 문자열을 대상으로 해석해야 한다.
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		sb.append("\name\":\"scott\",");
		sb.append("\"age\":36");
		sb.append("}");
		
		JSONParser jsonParser = new JSONParser();
		try {
			JSONObject obj=(JSONObject)jsonParser.parse(sb.toString());
			//파싱이 완료된 이후부터는 단순 문자열이 아닌, JSON 객체가 된다.
			System.out.println(obj.get("name"));
			System.out.println(obj.get("age"));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
