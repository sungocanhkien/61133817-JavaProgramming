//Lớp ô tô
public class DoiTuong_Oto {
	int maOto;
	String tenOto;
	String mauSacOto;
	int namSanXuatOto;
	//Constructor 
	public DoiTuong_Oto(int maOto, String tenOto, String mauSacOto, int namSanXuatOto) {
		super();
		this.maOto = maOto;
		this.tenOto = tenOto;
		this.mauSacOto = mauSacOto;
		this.namSanXuatOto = namSanXuatOto;
	}
	//Getter và Setter cho maOto
	public int getMaOto() {
		return maOto;
	}
	public void setMaOto(int maOto) {
		this.maOto = maOto;
	}
	
	//Getter và Setter cho tenOto
	public String getTenOto() {
		return tenOto;
	}
	public void setTenOto(String tenOto) {
		this.tenOto = tenOto;
	}
	
	//Getter và Setter mauSacOto
	public String getMauSacOto() {
		return mauSacOto;
	}
	public void setMauSacOto(String mauSacOto) {
		this.mauSacOto = mauSacOto;
	}
	
	//Getter và Setter cho namSanXuatOto
	public int getNamSanXuatOto() {
		return namSanXuatOto;
	}
	public void setNamSanXuatOto(int namSanXuatOto) {
		this.namSanXuatOto = namSanXuatOto;
	}
	//Phương thức toString
	@Override
	public String toString() {
		return "DoiTuong_Oto ["+ '\n' +
				" Ma Oto=" + maOto + '\n' +
				" Ten Oto=" + tenOto + '\n' +
				" Mau sac Oto=" + mauSacOto + '\n' +
				" Nam San Xuat Oto="+ namSanXuatOto + "]";
	}
	
	
	
	
}
