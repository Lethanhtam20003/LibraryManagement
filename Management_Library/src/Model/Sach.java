package Model;

import java.util.Date;

public class Sach {
	private String idSach;
	private String tenSach;
	private TacGia tacGia;
	private String theLoai;
	private NhaXuatBan nhaXuatBan;
	private Date namXuatBan;
	public Sach(String idSach, String tenSach, TacGia tacGia, String theLoai, NhaXuatBan nhaXuatBan, Date namXuatBan) {
		super();
		this.idSach = idSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.theLoai = theLoai;
		this.nhaXuatBan = nhaXuatBan;
		this.namXuatBan = namXuatBan;
	}
	public String getIdSach() {
		return idSach;
	}
	public void setIdSach(String idSach) {
		this.idSach = idSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public NhaXuatBan getNhaXuatBan() {
		return nhaXuatBan;
	}
	public void setNhaXuatBan(NhaXuatBan nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}
	public Date getNamXuatBan() {
		return namXuatBan;
	}
	public void setNamXuatBan(Date namXuatBan) {
		this.namXuatBan = namXuatBan;
	}
	
}
