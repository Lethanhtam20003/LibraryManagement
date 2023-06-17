package model;

import java.util.Date;

public class PhieuMuon {
	private String iD;
	private String ten;
	KhachHang khachHang;
	Sach sach;
	Date ngayMuon;
	Date ngayDuKienTra;
	private String trangThai;

	public PhieuMuon(String iD, String ten, KhachHang khachHang, Sach sach, Date ngayMuon, Date ngayDuKienTra,
			String trangThai) {
		super();
		this.iD = iD;
		this.ten = ten;
		this.khachHang = khachHang;
		this.sach = sach;
		this.ngayMuon = ngayMuon;
		this.ngayDuKienTra = ngayDuKienTra;
		this.trangThai = trangThai;
	}

	public PhieuMuon() {
		super();
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

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Sach getSach() {
		return sach;
	}

	public void setSach(Sach sach) {
		this.sach = sach;
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

	@Override
	public String toString() {
		return "--PhieuMuon: iD=" + iD + ", ten=" + ten + ", khachHang=" + khachHang + ", sach=" + sach + ", ngayMuon="
				+ ngayMuon + ", ngayDuKienTra=" + ngayDuKienTra + ", trangThai=" + trangThai;
	}

}
