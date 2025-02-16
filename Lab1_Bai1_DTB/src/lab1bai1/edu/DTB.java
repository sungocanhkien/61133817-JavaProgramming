/**
 * 
 */
package lab1bai1.edu;

import java.util.Scanner;

/**
 * 
 */
public class DTB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		//Nhập họ và tên
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		
		//Nhập điểm trung bình
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		
		//Xuất kết quả ra màn hình
		System.out.printf("%s %f điểm\n", hoTen, diemTB);
		
		//Đóng Scanner
		scanner.close();
	}

}
