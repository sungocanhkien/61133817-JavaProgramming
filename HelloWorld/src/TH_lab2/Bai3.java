package TH_lab2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào số điện của tháng: ");
		int soDien = sc.nextInt();
		int tien;
		
		if(soDien <= 50)
		{
			tien = soDien*1000;
		}else
		{
			tien = 50*1000+(soDien-50)*1200;
		}
		System.out.println("Tiền điện phải trả là: "+ tien + "đồng");
	}
}
