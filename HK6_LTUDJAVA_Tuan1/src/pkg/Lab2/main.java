package pkg.Lab2;

import java.util.Scanner;

public class main {

	public static void main(String[] agrs) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu");
			System.out.println("0  Thoát");
			System.out.println("1. Giải PT bậc nhất");
			System.out.println("2. Giải PT bậc hai");
			System.out.println("3. Tính tiền điện");
			System.out.println("Mời Bạn Chọn");
			int chon = sc.nextInt();
			switch (chon) {
			case 0:
				break;
			case 1:
				Lab2_bai1.Bai1();
				break;
			case 2:
				Lab2_bai2.Bai2();
				break;
			case 3:
				Lab2_bai3.Bai3();
				break;

			default:
				break;
			}
		} while (true);

	}

}
