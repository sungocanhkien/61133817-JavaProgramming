package Get_Set_trong_HuongDoiTuong;

public class Main_Get_Set {
	public static void main(String[] args) {
		BT_mau_MyDate md = new BT_mau_MyDate(16, 2, 2024);
		
		System.out.println("Day: " + md.getDay());
		
		md.setDay(35);
		System.out.println("Day: " + md.getDay());
		md.setDay(30);
		System.out.println("Day: " + md.getDay());
		
		System.out.println("Month: " + md.getMonth());
		md.setMonth(13);
		System.out.println("Month: " + md.getMonth());
		md.setMonth(5);
		System.out.println("Month: " + md.getMonth());
	}
}
