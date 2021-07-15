package jtable.vector;
//현실의 하나의 게시판을 DB 분야에서는 Table로 정의하고, OOP에서는 class로 정의한다.
//이 때, OOP개발자는 컬럼만 봐도 OOP의 클래스로 변환할 줄 알아야 한다.
//프로젝트 진행 시, db에 존재하는 table이 197개라면
//적어도 이에 대응하는 VO클래스의 갯수 역시 197개.
public class Notice {
	private int notice_id;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private int hit;
	public int getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(int notice_id) {
		this.notice_id = notice_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
}
