package Ham;

import java.util.Scanner;

public class HinhTron {
	public static void main(String[] args) {
		double r, dienTich, chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập bán kính r: ");
		r = sc.nextDouble();
		
		// Tính chu vi
		chuVi = 2*Math.PI*r;
		System.out.println("Chu vi = " + chuVi);
		System.out.println("Chu vi = " + Math.round(chuVi));
		
		// Tính diện tích
		dienTich = Math.PI*Math.pow(r, 2);
		System.out.println("Diện tích = " + dienTich);
	}
}
