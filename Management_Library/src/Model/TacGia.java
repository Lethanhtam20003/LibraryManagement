package Model;

import java.util.Date;

public class TacGia {
	private String idTacGia;
	private String tenTacGia;
	private Date ngaysinh;
	private String queQuan;

	public TacGia(String idTacGia, String tenTacGia, Date ngaysinh, String queQuan) {
		super();
		this.idTacGia = idTacGia;
		this.tenTacGia = tenTacGia;
		this.ngaysinh = ngaysinh;
		this.queQuan = queQuan;
	}

	public String getIdTacGia() {
		return idTacGia;
	}

	public void setIdTacGia(String idTacGia) {
		this.idTacGia = idTacGia;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

}
