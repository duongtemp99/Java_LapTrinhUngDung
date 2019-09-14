package pkg.Lab1;
	import java.util.Scanner;
public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float chieuDai,chieuRong,chuVi,dienTich,canhNhoNhat;
		Scanner sc = new Scanner(System.in);
		//Nhập
			    System.out.print("Nhập Chiều Dài cạnh chữ nhật");
				chieuDai = sc.nextFloat();
				System.out.print("Nhập Chiều Rộng cạnh chữ nhật");
				chieuRong = sc.nextFloat();
				chuVi = (chieuDai + chieuRong) * 2;
				dienTich =(chieuDai * chieuRong);
				canhNhoNhat =Math.min(chieuDai, chieuRong);
		//Hiển thị 
				System.out.printf("Chiều Dài,Chiều rộng  : "+chieuDai  +"và"  + chieuRong);
				System.out.printf("Chu vi hình chữ nhật  : "+chuVi);
				System.out.printf("Diện tích hình chữ nhật  : "+dienTich);
				System.out.printf("Cạnh Nhỏ Nhất  : "+canhNhoNhat);
			}

}
