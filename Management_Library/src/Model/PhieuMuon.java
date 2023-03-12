package Model;

import java.util.Date;
import java.util.List;

public class PhieuMuon {
	private String idPhieuMuon;
	private String tenNhanVien;
	private KhachHang khachHang;
	private List<Sach> dsMuonSach;
	private Date ngayMuon;
	private Date ngayTra;
	public PhieuMuon(String idPhieuMuon, String tenNhanVien, KhachHang khachHang, List<Sach> dsMuonSach, Date ngayMuon,
			Date ngayTra) {
		super();
		this.idPhieuMuon = idPhieuMuon;
		this.tenNhanVien = tenNhanVien;
		this.khachHang = khachHang;
		this.dsMuonSach = dsMuonSach;
		this.ngayMuon = ngayMuon;
		this.ngayTra = ngayTra;
	}
	public String getIdPhieuMuon() {
		return idPhieuMuon;
	}
	public void setIdPhieuMuon(String idPhieuMuon) {
		this.idPhieuMuon = idPhieuMuon;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public List<Sach> getDsMuonSach() {
		return dsMuonSach;
	}
	public void setDsMuonSach(List<Sach> dsMuonSach) {
		this.dsMuonSach = dsMuonSach;
	}
	public Date getNgayMuon() {
		return ngayMuon;
	}
	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}
	public Date getNgayTra() {
		return ngayTra;
	}
	public void setNgayTra(Date ngayTra) {
		this.ngayTra = ngayTra;
	}
	
}
