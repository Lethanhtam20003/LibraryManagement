package Model;

public class KhachHang {
	private String idKhachHang;
	private String tenKhachHang;
	private String diaChi;
	private String SDT_KhachHang;
	private int soSachDangMuon;

	public KhachHang(String idKhachHang, String tenKhachHang, String diaChi, String sDT_KhachHang) {
		super();
		this.idKhachHang = idKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.diaChi = diaChi; 
		SDT_KhachHang = sDT_KhachHang;
		this.soSachDangMuon = 0;
	}

	public String getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(String idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSDT_KhachHang() {
		return SDT_KhachHang;
	}

	public void setSDT_KhachHang(String sDT_KhachHang) {
		SDT_KhachHang = sDT_KhachHang;
	}

	public int getSoSachDangMuon() {
		return soSachDangMuon;
	}

	public void setSoSachDangMuon(int soSachDangMuon) {
		this.soSachDangMuon = soSachDangMuon;
	}
	
	

}
