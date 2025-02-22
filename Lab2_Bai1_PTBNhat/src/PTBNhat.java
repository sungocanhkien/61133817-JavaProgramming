import java.util.Scanner;

public class PTBNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Khởi tạo đối tượng Scanner
		Scanner scanner = new Scanner(System.in);
		//Nhập hệ số a
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		//Nhập hệ số b
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		//Kiểm tra các trường hợp của phương trình
		if(a == 0) {
			if(b == 0) {
				//Trường hợp a = 0 và b = 0, PT vô số nghiệm
				System.out.println("PT vô số nghiệm!");
			} else {
				//Trường hợp a = 0 và b != 0, vô nghiệm
				System.out.printf("PT vô nghiệm!");
			}
		}else {
			//Trường hợp a != 0, có một nghiệm duy nhất
			double x = -b/a;
			System.out.printf("PT có nghiệm x = %.f\n", x);
		}
		//Đóng scanner
		scanner.close();
	}

}
