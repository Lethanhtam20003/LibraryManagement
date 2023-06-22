package model;

public class Sach {
	private String iD;
	private String ten;
	private String theLoai;
	private String tacGia;
	private String nhaXuatBan;
	private int soLuongNhapKho;
	private int soLuongChoMuon;
	private double gia;

	public Sach(String iD, String ten, String theLoai, String tacGia, String nhaXuatBan, int soLuongNhapKho,
			int soLuongChoMuon, double gia) {
		super();
		this.iD = iD;
		this.ten = ten;
		this.theLoai = theLoai;
		this.tacGia = tacGia;
		this.nhaXuatBan = nhaXuatBan;
		this.soLuongNhapKho = soLuongNhapKho;
		this.soLuongChoMuon = soLuongChoMuon;
		this.gia = gia;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
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

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoLuongNhapKho() {
		return soLuongNhapKho;
	}

	public void setSoLuongNhapKho(int soLuongNhapKho) {
		this.soLuongNhapKho = soLuongNhapKho;
	}

	public int getSoLuongChoMuon() {
		return soLuongChoMuon;
	}

	public void setSoLuongChoMuon(int soLuongChoMuon) {
		this.soLuongChoMuon = soLuongChoMuon;
	}

	@Override
	public String toString() {
		return "[Sach iD=" + iD + "] " + ", ten=" + ten + ", theLoai=" + theLoai + ", tacGia=" + tacGia
				+ ", nhaXuatBan=" + nhaXuatBan + ", soLuongNhapKho=" + soLuongNhapKho + ", soLuongChoMuon="
				+ soLuongChoMuon + "]" + "\n";
	}
}
