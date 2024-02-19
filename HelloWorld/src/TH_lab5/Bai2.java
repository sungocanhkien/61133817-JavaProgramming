package TH_lab5;

import java.util.ArrayList;
import java.util.Collections;
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
			luaChon = sc.nextInt();
			
			switch(luaChon) {
			case 1: {
				System.out.println("Nhập họ tên: ");
				sc.nextLine();
				String hoTen = sc.nextLine();
				danhsach.add(hoTen);
				break;
			}
			
			case 2: {
				System.out.println("Danh sách vừa nhập:");
				sc.nextLine();
				for (String ten: danhsach)
				{
					System.out.println(ten);
				}
				break;
			}
			case 3: {
				System.out.println("Danh sách ngẫu nhiên: ");
				Collections.shuffle(danhsach);
				for(String ten: danhsach)
				{
					System.out.println(ten);
				}
				break;
			}
			case 4: {
				System.out.println("Sắp xếp giảm dần và xuất danh sách:");
				Collections.sort(danhsach);
				Collections.reverse(danhsach);
				for(String ten: danhsach)
				{
					System.out.println(ten);
				}
				break;
			}
			case 5: {
				System.out.println("Nhập tên cần xóa:");
				sc.nextLine();
				String tenCanXoa = sc.nextLine();
				for(String ten: danhsach)
				{
					if(ten.equals(tenCanXoa))
					{
						danhsach.remove(ten);
						break;
					}
				}
				break;
			}
			case 6: {
				System.out.println("Kết thúc chương trình.");
				break;
			}
			default:
				System.out.println("Lựa chọn không hợp lệ.");
				break;
			}
			
		}while(luaChon != 6);
	}
}
