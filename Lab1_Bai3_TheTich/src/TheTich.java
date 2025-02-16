import java.util.Scanner;

public class TheTich {

	public static void main(String[] args) {
		//Khai báo Scanner
		Scanner scanner = new Scanner(System.in);
		//Nhập vào cạnh của lập phương
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = scanner.nextDouble();
		//Tính thể tỉnh khối lập phương
		double theTich = Math.pow(canh, 3);
		
		//Xuất kết quả
		System.out.println("Thể tích khối lập phương là: " + theTich);
		//Đóng Scanner
		scanner.close();
	}

}
