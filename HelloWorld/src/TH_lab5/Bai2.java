package TH_lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		ArrayList<String> danhsach = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int luaChon;
		
		do {
			System.out.println("+--MENU--+");
			System.out.println("Lựa chọn từ 1 -> 6");
			System.out.println("1. Nhập danh sách sinh viên.");
			System.out.println("2. Xuất danh sách vừa nhập.");
			System.out.println("3. Xuất danh sách ngẫu nhiên.");
			System.out.println("4. Sắp xếp giảm dần và xuất danh sách.");
			System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím.");
			System.out.println("6. Kết thúc chương trình.");
			
		}while(luaChon != 6);
	}
}
