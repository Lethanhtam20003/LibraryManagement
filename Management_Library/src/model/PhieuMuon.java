package model;

import java.util.List;

public class PhieuMuon {
	private String id;
	private String maKhachHang;
	private List<String> tenSachMuon;
	private String ngayMuon;
	private String ngayDuKienTra;
	private double tienMuonSach;
	private String tinhTrang;

	public PhieuMuon(String id, String maKhachHang, List<String> tenSachMuon, String ngayMuon, String ngayDuKienTra,
			double tienMuonSach, String tinhTrang) {
		super();
		this.id = id;
		this.maKhachHang = maKhachHang;
		this.tenSachMuon = tenSachMuon;
		this.ngayMuon = ngayMuon;
		this.ngayDuKienTra = ngayDuKienTra;
		this.tienMuonSach = tienMuonSach;
		this.tinhTrang = tinhTrang;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public List<String> getTenSachMuon() {
		return tenSachMuon;
	}

	public void setTenSachMuon(List<String> tenSachMuon) {
		this.tenSachMuon = tenSachMuon;
	}

	public String getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(String ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public String getNgayDuKienTra() {
		return ngayDuKienTra;
	}

	public void setNgayDuKienTra(String ngayDuKienTra) {
		this.ngayDuKienTra = ngayDuKienTra;
	}

	public double getTienMuonSach() {
		return tienMuonSach;
	}

	public void setTienMuonSach(double tienMuonSach) {
		this.tienMuonSach = tienMuonSach;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	@Override
	public String toString() {
		return "PhieuMuon [id=" + id + ", maKhachHang=" + maKhachHang + ", tenSachMuon=" + tenSachMuon + ", ngayMuon="
				+ ngayMuon + ", ngayDuKienTra=" + ngayDuKienTra + ", tienMuonSach=" + tienMuonSach + ", tinhTrang="
				+ tinhTrang + "]";
	}

	public static double tinhTienMuonSach(List<String> tenSachMuon) {
		return 1000 * tenSachMuon.size();
	}
}
