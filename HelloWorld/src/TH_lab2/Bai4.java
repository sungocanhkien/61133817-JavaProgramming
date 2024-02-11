package TH_lab2;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		menu();
	}
	public static void menu()
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		while(choice != 4)
		{
			System.out.println("+------------------------------------+");
			System.out.println("1) Giải phương trình bậc nhất.");
			System.out.println("2) Giải phương trình bậc hai.");
			System.out.println("3) Tính tiền điện.");
			System.out.println("4) Kết thúc.");
			System.out.println("+------------------------------------+");
			System.out.println("Chọn chức năng: ");
			choice = sc.nextInt();
			
			switch (choice)) {
			case 1: {
				giaiPTB1();
				break;
			}
			case 2: {
				giaiPTB2();
				break;
			}
			case 3: {
				tinhTienDien();
				break;
			}
			case 4: {
				System.out.println("Kết thúc ");
				break;
			}
			default:
				System.out.println("Dữ liệu nhập không hợp lệ!");
				break;
			}
		}
	}
	public static void giaiPTB1()
	{
		
	}
	public static void giaiPTB2()
	{
		
	}
	public static void tinhTienDien()
	{
		
	}
}
