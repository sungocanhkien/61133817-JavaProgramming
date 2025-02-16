import java.util.Scanner;

public class ChuVi_DienTich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		//Nhập chiều dài và chiều rộng hình chữ nhật
		System.out.print("Nhập chiều dài: ");
		double dai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng: ");
		double rong = scanner.nextDouble();
		
		//Tính chu vi, diện tích cạnh nhỏ 
		double chuvi = (dai + rong)*2;
		double dientich = dai * rong;
		double canhnho = Math.min(dai, rong);
		
		//Xuất kết quả ra màn hình 
		System.out.printf("Chu vi: %f\n", chuvi);
		System.out.printf("Diện tích: %f\n", dientich);
		System.out.printf("Cạnh nhỏ: %f\n", canhnho);
		
		//Đóng scanner
		scanner.close();
		
	}

}
