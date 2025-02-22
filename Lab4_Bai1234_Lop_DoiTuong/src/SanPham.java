import java.util.Scanner;

public class SanPham {
	//Khai báo các thuộc tính private
	private String tensp;
	private double donGia;
	private double giamGia;
	
	//Hàm tạo 3 tham số 
	public SanPham(String tensp, double donGia, double giamGia) {
		super();
		this.tensp = tensp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
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
	//Phương thức xuất thông tin sản phẩm
	public void xuat() {
		System.out.println("\n Thông tin sản phẩm:");
		System.out.println("Tên sản phẩm: " + tensp);
		System.out.println("Đơn giá: " + donGia);
		System.out.println("Giảm giá: " + giamGia);
		System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	}
	
	
}
