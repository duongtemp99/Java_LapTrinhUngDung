package Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class baitap4 extends JFrame {
	public baitap4 (String title) {
		setTitle(title);
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel panel =new JPanel();
		//panel.setLayout(new BorderLayout());
		
		JPanel pnBorder =new JPanel();
		pnBorder.setLayout(new BorderLayout());
		JPanel pnNorth =new JPanel();
		pnNorth.setBackground(Color.RED);
			pnBorder.add(pnNorth,BorderLayout.NORTH);
		JPanel pnSouth =new JPanel();
		pnSouth.setBackground(Color.RED);
			pnBorder.add(pnSouth,BorderLayout.SOUTH);
		JPanel pnWest =new JPanel();
		pnWest.setBackground(Color.BLUE);
			pnBorder.add(pnWest,BorderLayout.WEST);
		JPanel pnEast =new JPanel();
		pnEast.setBackground(Color.BLUE);
			pnBorder.add(pnEast,BorderLayout.EAST);
		JPanel pnCenter =new JPanel();
		pnCenter.setBackground(Color.YELLOW);
			pnBorder.add(pnCenter,BorderLayout.CENTER);
			
		pnBorder.add(pnCenter,BorderLayout.CENTER);
			getContentPane().add(pnBorder);
			pnSouth.setPreferredSize(new Dimension(0,50));
			pnNorth.setPreferredSize(new Dimension(0,50));
			pnWest.setPreferredSize(new Dimension(50,0));
			pnEast.setPreferredSize(new Dimension(50,0));
			
		Container con=getContentPane(); 
			con.add(pnBorder);
		
	}
	public static void main(String[] args) {
		new baitap4("BorderLayout");
	}
}


