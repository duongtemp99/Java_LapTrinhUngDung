package Tuan2;

import java.awt.Container;

import javax.swing.JFrame;

public class baitap1 extends JFrame{
	public baitap1 (String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 300);
	}
	public static void main(String[] args) {
		new baitap1 ("Demo Widows");
	}
}
