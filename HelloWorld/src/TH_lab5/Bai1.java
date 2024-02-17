package TH_lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("Nhập danh sách số thực (Nhập 'N' để kết thúc chương trình);");
		while(true)
		{
			Double x = sc.nextDouble();
			list.add(x);
			System.out.println("Nhập thêm (Y/N)? ");
			if (sc.next().contentEquals("N"))
			{
				break;
			}
		}
		
		System.out.println("Danh sách số thực vừa nhập: ");
		for (Double num : list) {
			System.out.println(num);
		}
		
		double sum = 0;
		for (Double num : list) {
			sum += num;
		}
		
		System.out.println("Tổng của danh sách số thực: " + sum);
		sc.close();
	}
}
