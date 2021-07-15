package app0510.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class LoginForm2 extends Frame{
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_join;
	Panel p_center;
	Panel p_south;

		
	public LoginForm2() {
		//부모 생성자 이용
		super("LoginForm style2");
		//생성
		la_id = new Label("ID");
		t_id = new TextField(20);
		la_pass = new Label("Pass");
		t_pass = new TextField(20);
		bt_login = new Button("Login");
		bt_join = new Button("Join");
		p_center = new Panel();
		p_south = new Panel();
		//스타일
		la_id.setPreferredSize(new Dimension(120,35));
		t_id.setPreferredSize(new Dimension(120,35));
		la_pass.setPreferredSize(new Dimension(120,35));
		t_pass.setPreferredSize(new Dimension(120,35));
		
		//조립
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);
		p_south.add(bt_login);
		p_south.add(bt_join);
		
		this.add(p_center);
		this.add(p_south, BorderLayout.SOUTH);
		//제목 
		//this.setTitle("LoginForm2");
		
		this.setSize(350,155);
		this.setVisible(true);
	}
}
