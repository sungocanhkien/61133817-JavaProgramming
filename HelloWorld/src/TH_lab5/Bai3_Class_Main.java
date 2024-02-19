package TH_lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3_Class_Main {
	public static void main(String[] args) {
		List<Bai3_Class_SanPham> danhSachSanPham = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int luaChon;
		
		do{
			System.out.println("--MENU--");
			System.out.println("1. Nhập danh sách sản phẩm từ bàn phím.");
			System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình.");
			System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím.");
			System.out.println("4. Xuất giá trung bình của các sản phẩm.");
			luaChon = sc.nextInt();
			
			switch (key) {
			case value: {
				
				yield type;
			}
			default:
				w IllegalArgumentException("Unexpected value: " + key);
			}
		}while(luaChon != 5);
	}
}
