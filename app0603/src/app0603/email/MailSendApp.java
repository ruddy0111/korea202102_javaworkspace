package app0603.email;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//구글 메일 서버 이용
//프로토콜 : SMTP, POP
public class MailSendApp extends JFrame{
	JTextField t_sender;
	JTextField t_receiver;
	JTextField t_title;
	JTextArea area;
	JButton bt;
	Properties props;
	
	public MailSendApp() {
		t_sender = new JTextField("ju01@gmail.com",25);
		t_receiver = new JTextField("",25);
		t_title = new JTextField(25);
		area = new JTextArea();
		bt = new JButton("SEND");
		
		setLayout(new FlowLayout());
		area.setPreferredSize(new Dimension(250,150));
		
		add(t_sender);
		add(t_receiver);
		add(t_title);
		add(area);
		add(bt);
		
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendMail();
			}
		});
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void sendMail() {
		props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", 465);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	
	//세션 객체 생성(java mail api에 Session 이라는 객체가 있다)
		Session session = Session.getDefaultInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("asasas0111@gmail.com", "비번");
			}
		});
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(t_sender.getText()));//발신자 주소
			message.addRecipient(Message.RecipientType.TO ,new InternetAddress(t_receiver.getText()) );//받는자 주소
			message.setSubject(t_title.getText());//메일 주소
			message.setContent(area.getText(), "text/html;charset=utf8");
			Transport.send(message);
			JOptionPane.showMessageDialog(this, "메시지 발송 성공");
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MailSendApp();
	}
	
}
