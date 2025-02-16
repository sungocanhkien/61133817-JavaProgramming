import java.util.ArrayList;
public class QuanLy_Oto {

	public static void main(String[] args) {
		//Khởi tạo danh sách để lưu trữ 
		ArrayList<DoiTuong_Oto> DS_Oto = new ArrayList<>();
		
		//Thêm các đối tượng ô tô vào danh sách
		DS_Oto.add(new DoiTuong_Oto(0, "Toyota", "Cam", 2022));
		DS_Oto.add(new DoiTuong_Oto(1, "Honda", "Đỏ", 2023));
		DS_Oto.add(new DoiTuong_Oto(2, "Ford", "Xanh", 2024));
		
		//Duyệt danh sách và hiển thị thông tin từng ô tô
		for (DoiTuong_Oto oto: DS_Oto) {
			System.out.println(oto.toString());
		}

	}

}
