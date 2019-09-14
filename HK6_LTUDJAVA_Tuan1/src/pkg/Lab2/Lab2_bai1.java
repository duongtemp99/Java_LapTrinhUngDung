package pkg.Lab2;
	import java.util.Scanner;
public class Lab2_bai1 {

	public static void Bai1() {
		// TODO Auto-generated method stub
		double a ,b , c, x , x1, x2 = 0;
		double	 Delta=0 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a");
		a = sc.nextDouble();
		System.out.print("Nhap b");
		b = sc.nextDouble();
		System.out.print("Nhap c");
		c = sc.nextDouble();
		if (a==0) {
			x = -b/a;
		}
		else {
			Delta = Math.pow(b,2)-4*a*c	;
			}
		if (Delta > 0) {
			x1 = ((-b + Math.sqrt(Delta)) / (2*a));
			x2 = ((-b - Math.sqrt(Delta)) / (2*a));
			System.out.println("Phương Trình có 2 nghiệm là x1= "+x1+ " x2= " +x2);
		}
		else if (Delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương Trình có nghiệm kép là x1"+x1);
		}
		else  {
			System.out.println("Phương Trình Vô Nghiệm");
		}
	}
}


