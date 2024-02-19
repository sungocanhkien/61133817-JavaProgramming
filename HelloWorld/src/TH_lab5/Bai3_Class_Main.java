package TH_lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
			
			switch (luaChon) {
			case 1: {
				System.out.println("Nhập số lượng sản phẩm: ");
				int n = sc.nextInt();
				sc.nextLine();
				for(int i = 0; i<n; i++)
				{
					System.out.println("Nhập tên sản phẩm thứ " + (i + 1) + ": ");
					String ten = sc.nextLine();
					System.out.println("Nhập giá của sản phẩm thứ " + (i + 1) + ":");
					double gia = sc.nextDouble();
					sc.nextLine();
					danhSachSanPham.add(new Bai3_Class_SanPham(ten, gia));
				}
				break;
			}
			case 2: {
				Comparator<Bai3_Class_SanPham> comp = new Comparator<Bai3_Class_SanPham>() {
					
					@Override
					public int compare(Bai3_Class_SanPham o1, Bai3_Class_SanPham o2) {
						return 0;
					}
				};
				Collections.sort(danhSachSanPham, comp);
				System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
				for (Bai3_Class_SanPham sp : danhSachSanPham) {
					System.out.println("Tên: " + sp.ten + ", Giá: " + sp.gia);
				}
				break;
			}
			case 3: {
				
			}
			case 4: {
				
			}
			case 0: {
				
			}
			default:
				
			}
		}while(luaChon != 5);
	}
}
