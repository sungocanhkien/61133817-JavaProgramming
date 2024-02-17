package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhsach;
	
	

	public DanhSachSinhVien() {
		this.danhsach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
		this.danhsach = danhsach;
	}
	
	public void themSinhVien(SinhVien sv)
	{
		this.danhsach.add(sv);
	}
	
	public void inDanhSachSinhVien()
	{
		for (SinhVien sinhVien : danhsach) {
			System.out.println(sinhVien);
		}
	}
	
	public boolean kiemTraDanhSachRong() {
		return this.danhsach.isEmpty();
	}
	
	public int laySoLuongSinhVien() {
		return this.danhsach.size();
	}
	
	public void lamRongDanhSach() {
		this.danhsach.removeAll(danhsach);
	}
}

