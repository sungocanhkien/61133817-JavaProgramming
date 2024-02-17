package TH_lab4;

import java.util.Scanner;

public class SanPham_Bai1 {
	private String tenSp;
	private double donGia;
	private double giamGia;
	
	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	private double getThueNhapKhau()
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

	public SanPham_Bai1(String tenSp, double donGia, double giamGia) 
	{	
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham_Bai1(String tenSp, double donGia) {
		this(tenSp , donGia, 0);
		
	}
	
}
	
