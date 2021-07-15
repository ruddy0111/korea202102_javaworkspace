package test_2;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

class TabbedPane extends JFrame {
    JTabbedPane tabbedPane;
    JPanel menu;
    JPanel menu_bubble_tea;//버블티 메뉴 화면 선택
	JPanel menu_coffee;//커피 메뉴 화면 선택
	JPanel menu_bakery;//베이커리 메뉴 화면 선택
    
    public TabbedPane() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tabbedPane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.WRAP_TAB_LAYOUT);
        menu = new JPanel();
        menu.setBounds(0,100,400,250);
        menu.setBackground(Color.YELLOW);
        // Adding JPanels to JTabbedPane
        tabbedPane.addTab("Bubble Tea", menu_bubble_tea);
        tabbedPane.addTab("Coffee", menu_coffee);
        tabbedPane.addTab("Bekary", menu_bakery);
        add(menu);
        getContentPane().add(tabbedPane);
    }
    public static void main(String args[]) throws Exception {
        TabbedPane frame = new TabbedPane();
        frame.setSize(800,1000);
        frame.setVisible(true);
    }
}
