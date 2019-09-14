package pkg.Lab2;
	import java.util.Scanner;
public class Lab2_bai2 {

	public static void Bai2() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		double soDien,Tien = 0 ;
		System.out.print("Nhập số điện: ");
		soDien = sc.nextDouble();
		if (soDien < 50 ) {
			Tien = soDien*1000 ;
		}
		else {
			Tien = 50*1000 +(soDien - 50 )*1200 ;
		}
		System.out.println("Số tiền điên là : "+Tien);
	}

}
