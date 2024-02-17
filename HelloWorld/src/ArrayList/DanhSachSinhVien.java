package ArrayList;

import java.util.ArrayList;

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
	
}
