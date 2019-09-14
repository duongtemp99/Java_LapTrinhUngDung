package pkg.Lab1;
	import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, Delta,canBat;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập a");
		a = sc.nextInt();
		System.out.print("Nhập b");
		b = sc.nextInt();
		System.out.print("Nhập c");
		c = sc.nextInt();
		Delta = Math.pow(b,2)-4*a*c;
		canBat =Math.sqrt(Delta);
		System.out.print("Delta là :  "+Delta);
		System.out.println("Căn Bật 2 Delta là :"+canBat);
		
		
	}

}
