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
			
			switch (choice) {
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
				System.out.println("Chương trình kết thúc ");
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
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập hệ số a: ");
		double a = sc.nextDouble();
		
		System.out.println("Nhập hệ số b: ");
		double b = sc.nextDouble();
		
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm.");
			}else {
				System.out.println("Phương trình vô nghiệm.");
			}
		}else {
			double x = -b/a;
			System.err.println("Nghiệm của phương trình là: "+ x);
		}
	}
	public static void giaiPTB2()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập hệ số a: ");
		double a = sc.nextDouble();
		
		System.out.println("Nhập hệ số b: ");
		double b = sc.nextDouble();
		
		System.out.println("Nhập hệ số c: ");
		double c = sc.nextDouble();
		
		if(a==0) {
			if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -c / b;
                System.out.println("Phương trình có nghiệm duy nhất x = " + x);
            }
		}else {
			double delTa = Math.pow(b, 2) - 4*a*c;
			if(a < 0)
			{
				System.out.println("Phương trình vô nghiệm.");
			}else if(delTa == 0) {
				double x = -b/(2*a);
				System.out.println("Phương trình có nghiệm kép: "+ x);
			}else {
				double x1 = (-b+Math.sqrt(delTa))/(2*a);
				double x2 = (-b+Math.sqrt(delTa))/(2*a);
				System.out.println("Phương trình có 2 nghiệm phân biệt: ");
				System.out.println("Nghiệm 1: "+ x1);
				System.out.println("Nghiệm 2: "+ x2);
			}
		}
	}
	public static void tinhTienDien()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập vào số điện của tháng: ");
		int soDien = sc.nextInt();
		int tien;
		
		if(soDien <= 50)
		{
			tien = soDien*1000;
		}else
		{
			tien = 50*1000+(soDien-50)*1200;
		}
		System.out.println("Tiền điện phải trả là: "+ tien + " " + "đồng");
	}
}
