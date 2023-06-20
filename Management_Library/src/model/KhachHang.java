package model;

public class KhachHang {
	private String iD;
	private String ten;
	private String soDT;
	private String diaChi;

	public KhachHang(String iD, String ten, String soDT, String diaChi) {
		super();
		this.iD = iD;
		this.ten = ten;
		this.soDT = soDT;
		this.diaChi = diaChi;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "KhachHang [iD=" + iD + ", ten=" + ten + ", soDT=" + soDT + ", diaChi=" + diaChi + "]";
	}
	
}
