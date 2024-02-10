package TH_lab1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();
        
        System.out.print("Nhập điểm trung bình: ");
        double diem = sc.nextDouble();
        
        System.out.println(hoTen + " " + diem + " điểm");
	}
}
