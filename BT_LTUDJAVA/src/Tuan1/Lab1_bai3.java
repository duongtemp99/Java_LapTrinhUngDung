package Tuan1;
	import java.util.Scanner;
public class Lab1_bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float canh,theTichLapPhuong;
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Nhập Cạnh");
		canh = sc.nextFloat();
		theTichLapPhuong = canh * canh * canh ;
		System.out.print("Cạnh :"+canh);
		System.out.print("Thể tích lập phương :"+theTichLapPhuong);
		
		
	}

}
