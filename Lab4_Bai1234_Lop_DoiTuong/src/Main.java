
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo 2 đối tượng sản phẩm
		SanPham sp1 = new SanPham("Nokia", 9000000, 1000000);
		SanPham sp2 = new SanPham("SamSung", 9500000, 1500000);
		
		
		//Xuất thông tin từng sản phẩm
		System.out.println("\n Thông tin sản phẩm 1:");
		sp1.xuat();
		System.out.println("\n Thông tin sản phẩm 2:");
		sp2.xuat();
		
		
	}

}
