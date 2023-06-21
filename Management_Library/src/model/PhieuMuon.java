package model;

import java.util.Date;

public class PhieuMuon {
	private String iD;
	private KhachHang khachHang;
	private List<Sach> listSachMuon;
	private Date ngayMuon;
	private Date ngayDuKienTra;
	private String trangThai;

	public PhieuMuon(String iD, KhachHang khachHang, List<Sach> listSachMuon, Date ngayMuon, Date ngayDuKienTra,
			String trangThai) {
		super();
		this.iD = iD;
		this.khachHang = khachHang;
		this.listSachMuon = listSachMuon;
		this.ngayMuon = ngayMuon;
		this.ngayDuKienTra = ngayDuKienTra;
		this.trangThai = trangThai;
	}

	public String getiD() {
		return iD;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public List<Sach> getListSachMuon() {
		return listSachMuon;
	}

	public void setListSachMuon(List<Sach> listSachMuon) {
		this.listSachMuon = listSachMuon;
	}

	public Date getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public Date getNgayDuKienTra() {
		return ngayDuKienTra;
	}

	public void setNgayDuKienTra(Date ngayDuKienTra) {
		this.ngayDuKienTra = ngayDuKienTra;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public double tinhTongGiaSachMuon() {
		double result = 0;
		for(Sach sach : listSachMuon) {
			result += sach.price;
		}
		return result;
	}
	public double tinhTienMuonSach() {
		double result = 0;
		for(Sach sach : listSachMuon) {
			result += 1000;
		}
		return result;
	}
	public double tinhTienTraLaiSauKhiTraSach() {
		return tinhTongGiaSachMuon() - tinhTienMuonSach();
	}
}
