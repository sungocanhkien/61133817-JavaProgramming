package TH_lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào chiều dài HCN: ");
		double dai = sc.nextDouble();
		
		System.out.println("Nhập vào chiều rộng HCN: ");
		double rong = sc.nextDouble();
		
		double chuVi = (dai + rong)*2;
		double dienTich = dai*rong;
		double canhNhoNhat = Math.min(dai, rong);
		
		System.out.println("Chu vi HCN: "+ chuVi);
		System.out.println("Diện tích HCN: "+ dienTich);
		System.out.println("Cạnh nhỏ nhất của HCN: "+ canhNhoNhat);
	}
}
