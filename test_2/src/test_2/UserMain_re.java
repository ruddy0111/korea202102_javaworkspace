package test_2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class UserMain_re extends JFrame{
	JMenuBar menu_bar;//메뉴바
	JMenu menu_bubble_tea;//버블티 메뉴 화면 선택
	JMenu menu_coffee;//커피 메뉴 화면 선택
	JMenu menu_bakery;//베이커리 메뉴 화면 선택
	
	JPanel menu_list;//메뉴이미지&가격 메뉴판
	JScrollPane menu_scroll;//메뉴이미지&가격 메뉴판 스크롤
	JPanel listImgArray_bubbletea;
	JLabel listNemaArray_bubbletea;
	JPanel listImgArray_coffee;
	JLabel listNemaArray_coffee;
	JPanel listImgArray_bakery;
	JLabel listNemaArray_bakery;
	
	JPanel menu_oderlist;//메뉴 선택 창
	JScrollPane oderlist_scroll;
	JPanel oderlist_selected;//선택 메뉴 배열에 추가되어 메뉴 선택 창에 하나씩 쌓일 것
	JButton bt_oderlist_cancel;//선택 메뉴 취소 버튼
	
	JPanel menu_request;//주문 요청
	JPanel request_total;//주문 총액
	JButton request_cancel;//주문 전체 쥐소
	JButton request_order;//주문 요청(선택 시 결제 화면 이동)
	
	public UserMain_re() {
		//생성
			//메뉴바
		menu_bar = new JMenuBar();//메뉴바
		menu_bubble_tea = new JMenu();//버블티 메뉴 화면 선택
		menu_coffee = new JMenu();//커피 메뉴 화면 선택
		menu_bakery = new JMenu();//베이커리 메뉴 화면 선택
			//메뉴판
		menu_list = new JPanel();
		menu_scroll = new JScrollPane(menu_list);
		listImgArray_bubbletea = new JPanel();
		listNemaArray_bubbletea = new JLabel();
		listImgArray_coffee = new JPanel();
		listNemaArray_coffee = new JLabel();
		listImgArray_bakery = new JPanel();
		listNemaArray_bakery = new JLabel();
			//선택 메뉴
		menu_oderlist = new JPanel();//메뉴 선택 창
		oderlist_scroll = new JScrollPane(menu_oderlist);
		oderlist_selected = new JPanel();//선택 메뉴 배열에 추가되어 메뉴 선택 창에 하나씩 쌓일 것
		bt_oderlist_cancel = new JButton("X");//선택 메뉴 취소 버튼
			//주문
		menu_request = new JPanel();//주문 요청
		request_total = new JPanel();//주문 총액
		request_cancel = new JButton("X");//주문 전체 쥐소
		request_order = new JButton("주문하기");//주문 요청(선택 시 결제 화면 이동)
		
		//결합
			//메뉴바
		menu_bar.add("Bubble Tea", menu_bubble_tea);
		menu_bar.add("Coffee", menu_coffee);
		menu_bar.add("Bekary", menu_bakery);
			//메뉴판
		//menu_list.add(menu_scroll);
		menu_list.add(listImgArray_bubbletea);
		menu_list.add(listNemaArray_bubbletea);
		menu_list.add(listImgArray_coffee);
		menu_list.add(listNemaArray_coffee);
		menu_list.add(listImgArray_bakery);
		menu_list.add(listNemaArray_bakery);
		add(menu_list);
			//선택 메뉴
		//menu_oderlist.add(oderlist_scroll);
		menu_oderlist.add(oderlist_selected);
		menu_oderlist.add(bt_oderlist_cancel);
		add(menu_oderlist);
			//주문
		menu_request.add(request_total);
		menu_request.add(request_cancel);
		menu_request.add(request_order);
		add(menu_request);
		//스타일
		menu_list.setBackground(Color.CYAN);
		menu_oderlist.setBackground(Color.RED);
		menu_request.setBackground(Color.GRAY);
		
		//보이기
		setTitle("유저 화면");
		setBounds(0, 100, 800, 1000); //x,y,w,h
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	


	public static void main(String[] args) {
		new UserMain_re();
	}
}
