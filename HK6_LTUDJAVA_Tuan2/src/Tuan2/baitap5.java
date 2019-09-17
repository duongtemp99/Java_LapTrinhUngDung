package Tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class baitap5 extends JFrame{
	public baitap5(String title) {
		setTitle(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 340);
		setLocationRelativeTo(null);
		
		//tạo ra border
		JPanel pnBorder=new JPanel();
		pnBorder.setLayout(new BorderLayout());
		// tạo ra label
		JPanel pnNorth =new JPanel();
		JLabel lblTieuDe=new JLabel("Giải phương trình bậc 2 ");
		pnNorth.add(lblTieuDe);  //Thêm vào lblTieuDe
		pnBorder.add(pnNorth,BorderLayout.NORTH); //thêm vào pnborder và chỉnh nó vào vị trí north 
		//chỉnh font chữ của tiêu đề 
		Font ft =new Font("Arial",Font.BOLD, 25); 
		lblTieuDe.setFont(ft);
		
		
		//add vào để chạy chương trình 
		Container con =getContentPane();
		con.add(pnBorder);
		
		
		
		// tạo ra giải phương trình bật 2 
		JPanel pnCenter = new JPanel();  // tạo vùng center
		pnCenter.setLayout(new BoxLayout(pnCenter	, BoxLayout.Y_AXIS)); //chỉnh kiểu center
		pnBorder.add(pnCenter,BorderLayout.CENTER);   //add vào border
		Border centerBorder =BorderFactory.createLineBorder(Color.RED);  //chỉnh màu đường kẻ 
		TitledBorder centerTitleBorder = new TitledBorder(centerBorder, "Giải phương trình bậc 2 ");  // tạo tiêu đề của center
		pnCenter.setBorder(centerTitleBorder);
		
		//tạo nút cho center
		JPanel pna =new JPanel();
		JLabel lbla=new JLabel("a :");
		final JTextField txta =new JTextField(15);
		pna.add(lbla);
		pna.add(txta);
		pnCenter.add(pna);
		
		
		JPanel pnb =new JPanel();
		JLabel lblb=new JLabel("b :");
		final JTextField txtb =new JTextField(15);
		pnb.add(lblb);
		pnb.add(txtb);
		pnCenter.add(pnb);
		
		JPanel pnc =new JPanel();
		JLabel lblc=new JLabel("c :");
		final JTextField txtc =new JTextField(15); // kích cỡ của txtc
		pnc.add(lblc);
		pnc.add(txtc);
		pnCenter.add(pnc);
		
		// chia phần kết quả ra 2 phần 
		JPanel pnq =new JPanel();
		JLabel lblq=new JLabel("Kết quả :"); 
		pnq.add(lblq);
		pnCenter.add(pnq);
		JPanel pnqs =new JPanel();
		final JTextField txtq =new JTextField(15);
		pnqs .add(txtq);
		pnCenter.add(pnqs);
		
		
		// tạo chọn tác vụ 
		JPanel pnSouth = new JPanel();  // tạo vùng south
		pnSouth.setLayout(new BoxLayout(pnSouth	, BoxLayout.X_AXIS)); //chỉnh kiểu south
		pnBorder.add(pnSouth,BorderLayout.SOUTH);   //add vào border
		Border southBorder =BorderFactory.createLineBorder(Color.PINK);  //chỉnh màu đường kẻ 
		TitledBorder southTitleBorder = new TitledBorder(southBorder, "Chọn tác vụ ");  // tạo tiêu đề của south
		pnSouth.setBorder(southTitleBorder);
		pnSouth.setPreferredSize(new Dimension(0,60));
		
		// tạo button cho pnsouth
				JButton btngiai = new JButton("Giải");
				JButton btnxoatrang = new JButton("Xóa Trắng");
				JButton btnthoat = new JButton("Thoát");
				// add nút 
				pnSouth.add(btngiai);
				pnSouth.add(Box.createVerticalStrut(20));
				pnSouth.add(btnxoatrang);
				//pnSouth.add(Box.createVerticalStrut(20));
				pnSouth.add(btnthoat);
				pnSouth.add(Box.createVerticalStrut(20));		
	}
	public static void main(String[] args) {
		new baitap5("Giải phương trình bậc 2");
	}

}
