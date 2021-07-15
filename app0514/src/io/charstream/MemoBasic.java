package io.charstream;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class MemoBasic extends JFrame implements ActionListener{
	
	JButton bt;
	JTextArea area;
	JScrollPane scroll;
	JFileChooser chooser;
	
	public MemoBasic() {
		
		bt = new JButton("Load");
		area = new JTextArea();
		scroll = new JScrollPane(area);
		
		
		add(bt, BorderLayout.NORTH);
		add(scroll);
				
		bt.addActionListener(this);
		
		setBounds(500,100,500,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public void openFile() {
		
		if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();
			System.out.println(file.getAbsolutePath());
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		openFile();
	}
	public static void main(String[] args) {
		new MemoBasic();
	}

}
