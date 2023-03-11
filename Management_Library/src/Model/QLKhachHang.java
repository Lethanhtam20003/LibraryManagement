package Model;

import java.util.ArrayList;
import java.util.List;

public class QLKhachHang {
	private List<Sach> dsKhachHang;

	public QLKhachHang() {
		dsKhachHang = new ArrayList<>();
	}

	public List<Sach> getDsKhachHang() {
		return dsKhachHang;
	}

	public void setDsKhachHang(List<Sach> dsKhachHang) {
		this.dsKhachHang = dsKhachHang;
	}
	
	
}
