package app0601.xml.data.table;

import java.util.Vector;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MountainHandler extends DefaultHandler{
	Vector<Mountain> mtList;//산 VO여러개 담게 될 컬렉션
	boolean isItems;
	boolean isItem;
	boolean isMntiadd;
	boolean isMntidetail;
	boolean isMntihigh;
	boolean isMntilistno;
	boolean isMntiname;
	
	Mountain mountain;//VO준비

	//시작태그 만나기
	public void startElement(String uri, String localName, String tag, Attributes attributes) throws SAXException {
		if(tag.equals("items")) {
			isItems	= true;
			mtList = new Vector<Mountain>();
		}else if(tag.equals("item")) {
			isItem = true;
			mountain = new Mountain();
		}else if(tag.equals("mntiadd")) {
			isMntiadd = true;
		}else if(tag.equals("mntidetail")) {
			isMntidetail = true;
		}else if(tag.equals("mntihigh")) {
			isMntihigh = true;
		}else if(tag.equals("mntilistno")) {
			isMntilistno = true;
		}else if(tag.equals("mntiname")) {
			isMntiname = true;
		}
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch, start, length);
		if(isMntiadd){
			mountain.setMntiadd(data);
		}else if(isMntidetail) {
			mountain.setMntidetail(data);
		}else if(isMntihigh) {
			mountain.setMntihigh(data);
		}else if(isMntilistno) {
			mountain.setMntilistno(Integer.parseInt(data));
		}else if(isMntiname) {
			mountain.setMntiname(data);
		}
	
	}
	
	public void endElement(String uri, String localName, String tag) throws SAXException {
		if(tag.equals("mntiadd")) {
			isMntiadd = false;
		}else if(tag.equals("mntidetail")) {
			isMntidetail = false;
		}else if(tag.equals("mntihigh")) {
			isMntihigh = false;
		}else if(tag.equals("mntilistno")) {
			isMntilistno = false;
		}else if(tag.equals("mntiname")) {
			isMntiname = false;
		}else if(tag.equals("item")) {
			isItem = false;
			//리스트에 VO추가
			mtList.add(mountain);
		}else if(tag.equals("items")) {
			isItems	= false;
		}
	}

	public void endDocument() throws SAXException {
		for(Mountain  obj : mtList) {
			System.out.println(obj.getMntiadd()+","+obj.getMntidetail()+","+obj.getMntihigh()+","+obj.getMntilistno()+","+obj.getMntiname());
		}
	}
}
