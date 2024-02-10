package TH_lab1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập hệ số a: ");
		double a = sc.nextDouble();
		
		System.out.println("Nhập hệ số b: ");
		double b = sc.nextDouble();
		
		System.out.println("Nhập hệ số c: ");
		double c = sc.nextDouble();
		
		double delTa = Math.pow(b, 2)-4*a*c;
		
		System.out.println("Giá trị của Delta là: "+ delTa);
	}
}
