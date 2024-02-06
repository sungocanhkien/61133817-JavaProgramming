package Nhap;

import java.util.Scanner;

public class NhapTuBanPhim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập họ và tên: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhập mã SV: ");
		long maSinhVien = sc.nextLong();
		
		System.out.println("Nhập điểm thi: ");
		float diemThi = sc.nextFloat();
		
		System.out.println("------");
		System.out.println("Họ và tên: "+ hoVaTen);
		System.out.println("MSSV: "+ maSinhVien);
		System.out.println("Điểm thi: "+ diemThi);
		
	}
}
