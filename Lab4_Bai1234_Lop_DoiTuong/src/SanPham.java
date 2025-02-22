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
		
	}
	
	
	
}
