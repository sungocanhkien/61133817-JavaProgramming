package Get_Set_trong_HuongDoiTuong;

public class BT_mau_MyDate {
	private int day;
	private int month;
	private int year;
	
	public BT_mau_MyDate(int day, int month, int year) {
		if(day >= 1 && day <= 31)
		{
			this.day = day;
		}else {
			this.day = 1;
		}
		if(month >= 1 && month <= 12) {
			this.month = month;
		}else {
			month = 1;
		}
		if(year >= 0) {
			this.year = year;
		}else {
			year = 1;
		}
	}
	
	public int getDay() {
		return this.day;
	}
	
}
