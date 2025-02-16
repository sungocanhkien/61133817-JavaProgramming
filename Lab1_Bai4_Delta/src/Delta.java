import java.util.Scanner;

public class Delta {

	public static void main(String[] args) {
		//Khai báo Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Nhập các hệ số của phương trình
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		//Tính delta
		double delta = Math.pow(b,2)-4*a*c;
		
		//Tính căn delta
		double sqrtDelta = Math.sqrt(delta);
		
		

	}

}
