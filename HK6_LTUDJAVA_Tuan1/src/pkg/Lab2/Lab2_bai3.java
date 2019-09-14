package pkg.Lab2;
	import java.util.Scanner;
public class Lab2_bai3 {

	public static void Bai3() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a ,b, x = 0;
		System.out.print("Nhập a");
		a = sc.nextInt();
		System.out.print("Nhập b");
		b = sc.nextInt();
		if(a ==0) {
			if(b==0) {
				System.out.println("Vô Số Nghiệm");
			}
			else  {
				System.out.println("Vô Nghiệm");
			}
		}
		else {
			x = -b/a;
		}
		System.out.println("x =" +x);
	}

}
