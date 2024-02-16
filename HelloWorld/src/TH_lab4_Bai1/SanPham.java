package TH_lab4_Bai1;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public double getThueNhapKhau()
	{
		return 0.1 * donGia;
	}
	
	public void xuat()
	{
		System.out.println("Tên sản phẩm: " + tenSp);
		System.out.println("Giá: " + donGia);
		System.out.println("Giảm giá: "+ giamGia);
		System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau());
	}
	
	public void nhap()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sản phẩm: ");
		tenSp = sc.nextLine();
		System.out.println("Nhập giá sản phẩm: ");
		donGia = sc.nextDouble();
		System.out.println("Nhập giảm giá: ");
		giamGia = sc.nextDouble();
	}
}
