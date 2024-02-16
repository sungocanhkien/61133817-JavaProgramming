package LT_HuongDoiTuong;

public class HoaDonCaPhe {
	private String tenLoaiCaPhe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	public HoaDonCaPhe(String ten, double gia, double kl)
	{
		this.tenLoaiCaPhe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kl;
	}
	
	public double tinhTongTien()
	{
		return this.giaTien1Kg * this.khoiLuong;
	}
	
	public boolean kiemTraKhoiLuongLonHon(double kl)
	{
//		if(this.khoiLuong > kl)
//		{
//			return true;
//		}else {
//			return false;
//		}
		return this.khoiLuong > kl;
	}
}
