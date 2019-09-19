package Tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class baitap2 extends JFrame {
	public baitap2 (String title) {
		setTitle(title);
		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // để đóng mở chương trình được
		FlowLayout layout = new FlowLayout(FlowLayout.RIGHT ,10,20); // kích cỡ của khung
		JPanel panel = new JPanel(layout); // tạo side đây cũng đc , tạo panel
		panel.setLayout(new FlowLayout()); // tạo kiểu Flowlayout
		panel.setBackground(Color.PINK);   // tạo màu 
		// add chương trình vào container
		Container con=getContentPane();
		con.add(panel);
		//thành phần
		JButton btn1 = new JButton("FlowLayout");
		JButton btn2 = new JButton("Add các control");
		JButton btn3 = new JButton("Trên 1 dòng");
		JButton btn4 = new JButton("Hết chỗ chứa");
		JButton btn5 = new JButton("Thì xuống dòng");
		//add các nút vào panel
		panel.add(btn1);panel.add(btn2);
		panel.add(btn3);panel.add(btn4);
		panel.add(btn5);
	}
	public static void main (String[] args) {
		new baitap2("DemoFlowLayout");
	
		
	}

}
