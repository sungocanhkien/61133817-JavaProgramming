package vidu_baitap_HuongDoiTuong;

public class CT {

	public static void main(String[] args) {
		SanPham sp1 = new SanPham(0, null, null, null);
		SanPham sp2 = new SanPham(13, "Áo thun", "Quần áo", null);
		sp1.setMaSP(12);
		sp1.setTenSP("Dây Tây");
		sp1.setLoaiSP("Trái Cây");
		sp1.setAnhSP(null);
		
		//In ra màn hình thông tin 2 sp
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP2 là " + sp2.getMaSP();
	    	   thongtinSP2 += "Tên SP2 là " + sp2.getTenSP();
	    System.out.println(thongtinSP1);
	    System.out.println(thongtinSP2);
	    

	}

}
