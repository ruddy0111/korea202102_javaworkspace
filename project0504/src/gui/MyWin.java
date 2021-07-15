/*GUI ���α׷����� ������ �����찡 �־�� �Ѵ�.
���� �ڹ� ���� GUI���õ� ��Ű���� awt/swing���� ����.
javaFX(�ȵ���̵�� ����)*/

package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Choice;

public class MyWin{
	//�ڹٿ��� ������� ���������� Frame�̶�� Ŭ������ ���.
	public static void main(String[] args){
	
		Frame frame;//��ü�� �ν��Ͻ� ����. ���� frame���� �ʱ�ȭ �Ǿ� ���� �ʴ�.
		/*Frame�̶�� Ŭ������ ����� ���� ���� ���� ��.
		[�������� ��ü ��� Tip]
			1) �ش� Ŭ������ ��������, �뵵, ���� �Ǵ�.

			2) ����� ���� �޸𸮿� �ø���
				(�޸𸮿� �ø�����, �� ��ü�� �Ϲ�����, �߻�����, �������̽����� ����.
				 - �Ϲ�Ŭ���� : new
				 - �߻� Ŭ���� : �ڽ����� �ϼ� ��, �ڽ��� new
				 - �������̽� : �ڽ����� �ϼ� ��, �ڽ��� new
			
			3)	��ü�� ������ �����Ǿ��ٸ�
				 - �Ϲ� Ŭ���� : new ������ �;� �ϴ� ������ ����
	
		*/
		frame = new Frame();

		/*Layout Default������ ����.*/
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow); 

		//��ư
		Button bt = new Button("i'm Button");

		//üũ�ڽ�
		Checkbox ch1 = new Checkbox("�ٳ���");
		Checkbox ch2 = new Checkbox("����");
		Checkbox ch3 = new Checkbox("���");
		Checkbox ch4 = new Checkbox("����");
		Checkbox ch5 = new Checkbox("��");

		//�ؽ�Ʈ �ڽ�
		TextField t = new TextField(20);

		//html�� select �ڽ��� java ������ Choice ��� �Ѵ�
		Choice choice=new Choice(); //naver.gooogle.daum
		  choice.add("Choose Your Email");
		  choice.add("naver.com");
		  choice.add("gmail.com");
		  choice.add("daum.net");
				
		frame.add(bt);//frame�� ��ư ����
		frame.add(t);//frame�� �ؽ�Ʈ�ڽ� ����
		frame.add(ch1);//frame�� üũ�ڽ� ����
		frame.add(ch2);//frame�� üũ�ڽ� ����
		frame.add(ch3);//frame�� üũ�ڽ� ����
		frame.add(ch4);//frame�� üũ�ڽ� ����
		frame.add(ch5);//frame�� üũ�ڽ� ����
		frame.add(choice);//frame�� choice ����


		//api document���� ã�ƺ���
		frame.setVisible(true);

		//ũ�� ���
		frame.setSize(300, 400);
	}

}