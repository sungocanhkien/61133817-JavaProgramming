package CacPhepToan;

import java.util.Scanner;

public class TinhToan {
	public static void main(String[] args) {
		//Khai báo biến
		int a, b;
		
		//Nhập dữ liệu
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào a: ");
		a = sc.nextInt();
		System.out.println("Nhập vào b: ");
		b = sc.nextInt();
		
		int tong = a + b;
		System.out.println("Tổng a và b là: "+a+" + "+b+" = "+tong);
	}
}
