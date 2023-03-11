package Model;

public class NhanVien {
	private String idNhanVien;
	private String tenNhanVien;
	private String SDT_NV;
	public NhanVien(String idNhanVien, String tenNhanVien, String sDT_NV) {
		super();
		this.idNhanVien = idNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.SDT_NV = sDT_NV;
	}
	public String getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(String idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public String getSDT_NV() {
		return SDT_NV;
	}
	public void setSDT_NV(String sDT_NV) {
		SDT_NV = sDT_NV;
	}
	
	

}
