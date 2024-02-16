package TH_lab4;

public class Main_Bai2 {
	public static void main(String[] args) {
		SanPham_Bai1 sp1 = new SanPham_Bai1();
		SanPham_Bai1 sp2 = new SanPham_Bai1();
		
		System.out.println("Nhập thông tin sản phẩm 1: ");
		sp1.nhap();
		System.out.println("Nhập thông tin sản phẩm 2: ");
		sp2.nhap();
		
		System.out.println("Thông tin sản phẩm 1: ");
		sp1.xuat();
		System.out.println("Thông tin sản phẩm 2: ");
		sp2.xuat();
		
	}
}
