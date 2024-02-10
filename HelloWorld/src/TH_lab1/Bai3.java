package TH_lab1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập giá trị cạnh lập phương: ");
		double canh = sc.nextDouble();
		
		double theTichLapPhuong = Math.pow(canh, 3);
		
		System.out.println("Thể tích của khối lập phương là: "+ theTichLapPhuong);
	}
}
