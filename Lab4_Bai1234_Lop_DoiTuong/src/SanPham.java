import java.util.Scanner;

public class SanPham {
	//Khai báo các thuộc tính private
	private String tensp;
	private double donGia;
	private double giamGia;
	
	//Phương thức nhập thông tin sản phẩm
	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên sản phẩm: ");
		tensp = scanner.nextLine();
		System.out.print("Nhập đơn giá: ");
		donGia=scanner.nextDouble();
		System.out.print("Nhập giảm giá: ");
		giamGia = scanner.nextDouble();
	}
	//Phương thức tính thuế nhập khẩu (10% đơn giá)
	public double getThueNhapKhau() {
		return donGia*0.1;
	}
	
	
}
