package Tuan2;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class baitap3 extends JFrame {
	public baitap3(String title) {
		setTitle(title);
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(); // tạo side đây cũng đc , tạo panel
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS)); // tạo kiểu Flowlayout
		//thành phần của boxlayout
		JButton btn1 = new JButton("BoxLayout");
		btn1.setBackground(Color.RED);
		Font font=new Font("Arial",Font.BOLD/ Font.ITALIC,25); // kiểu chữ của boxlayout
		btn1.setFont(font);panel.add(btn1);
		JButton btn2 = new JButton("X_AXIS");
		btn1.setBackground(Color.BLUE);
		btn1.setFont(font);panel.add(btn2);
		JButton btn3 = new JButton("Y_AXIS");
		btn1.setBackground(Color.ORANGE);
		btn1.setFont(font);panel.add(btn3);
		
		Container con=getContentPane();
		con.add(panel);
		}
	public static void main(String[] args) {
		new baitap3("BoxLayout");
	}
	

}
