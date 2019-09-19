package Tuan1;
	import java.util.Scanner;
public class Lab1_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho va Ten");
		String hoTen = sc.nextLine();
		System.out.print("Diem TB");
		float diemTB =Float.parseFloat(sc.nextLine());
		System.out.printf("ho ten, điểm : "+hoTen  +","  + diemTB);
	}

}
