package model;

import java.util.Date;
import java.util.List;

public class PhieuMuon {
	private String iD;
	private String maKhachHang;
	private List<Sach> listSachMuon;
	private Date ngayMuon;
	private Date ngayDuKienTra;
	private double giaSach;
	private String trangThai;


	public PhieuMuon(String iD, String maKhachHang, List<Sach> listSachMuon, Date ngayMuon, Date ngayDuKienTra,
			double giaSach, String trangThai) {

		super();
		this.iD = iD;
		this.maKhachHang = maKhachHang;
		this.listSachMuon = listSachMuon;
		this.ngayMuon = ngayMuon;
		this.ngayDuKienTra = ngayDuKienTra;
		this.giaSach = tinhTienMuonSach();
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


	public String getMaKhachHang() {
		return maKhachHang;
	}


	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
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


	public double getGiaSach() {
		return giaSach;
	}


	public void setGiaSach(double giaSach) {
		this.giaSach = giaSach;
	}


	public String getTrangThai() {
		return trangThai;
	}


	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}


	public String getGiaMuon() {
		return trangThai;
	}


	public double tinhTienMuonSach() {
		double result = 0;
		for(Sach sach : listSachMuon) {
			result += 1000;
		}
		return result;
	}

	@Override
	public String toString() {
		return "PhieuMuon [iD=" + iD + ", maKhachHang=" + maKhachHang + ", ngayMuon=" + ngayMuon + ", ngayDuKienTra="
				+ ngayDuKienTra + ", giaSach=" + giaSach + ", trangThai=" + trangThai + "]";
	}
	
}
