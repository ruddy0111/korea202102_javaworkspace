
package app0510.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class LoginForm {

	public static void main(String[] args) {
		Frame frame = new Frame("LoginForm ver.001");//지역변수는 초기화 하는 습관을 갖자.
		
		//조립(Frame의 BoderLayout의 각 방위에서 컴포넌트들이 공존할 수 없으므로 Panel이용.)
		
		Panel  p_center = new Panel();
		
		GridLayout grid = new GridLayout(2,2);
		p_center.setLayout(grid);
		
		//Label  : Center
		//TextField : Center(방위 미 명시 : DEFUALT CENTER)
		
		Label la_id = new Label("ID");
		TextField t_id = new TextField();
		Label la_pass = new Label("PW");
		TextField t_pass = new TextField();
		Panel p_south = new Panel();
		Button bt_login  =  new Button("Login");
		Button bt_pass  =  new Button("Join");
		

		p_center.add(la_id);
		p_center.add(t_id);		
		p_center.add(la_pass);
		p_center.add(t_pass);
		p_south.add(bt_login);
		p_south.add(bt_pass);
		
		
		frame.add(p_center);
		frame.add(p_south, BorderLayout.SOUTH);
		
		frame.setVisible(true);
		frame.setSize(300, 125);
	}
}
