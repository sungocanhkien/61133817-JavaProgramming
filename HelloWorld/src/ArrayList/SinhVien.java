package ArrayList;

public class SinhVien {
	
		private String maSinhVien;
		private String hoVaten;
		private int namSinh;
		private float diemTrungBinh;
		
		public SinhVien(String maSinhVien, String hoVaten, int namSinh, float diemTrungBinh) {
			super();
			this.maSinhVien = maSinhVien;
			this.hoVaten = hoVaten;
			this.namSinh = namSinh;
			this.diemTrungBinh = diemTrungBinh;
		}
		public String getMaSinhVien() {
			return maSinhVien;
		}
		public void setMaSinhVien(String maSinhVien) {
			this.maSinhVien = maSinhVien;
		}
		public String getHoVaten() {
			return hoVaten;
		}
		public void setHoVaten(String hoVaten) {
			this.hoVaten = hoVaten;
		}
		public int getNamSinh() {
			return namSinh;
		}
		public void setNamSinh(int namSinh) {
			this.namSinh = namSinh;
		}
		public float getDiemTrungBinh() {
			return diemTrungBinh;
		}
		public void setDiemTrungBinh(float diemTrungBinh) {
			this.diemTrungBinh = diemTrungBinh;
		}
		@Override
		public String toString() {
			return "Thông tin sinh viên [Mã sinh viên = " + maSinhVien + ", Họ và tên = " + hoVaten + ", Năm sinh = " + namSinh
					+ ", Điểm trung bình = " + diemTrungBinh + "]";
		}
		
		
}
