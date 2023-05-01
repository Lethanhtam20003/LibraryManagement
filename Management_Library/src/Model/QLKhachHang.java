package Model;

import java.util.ArrayList;
import java.util.List;

public class QLKhachHang {
	private List<KhachHang> dsKhachHang;

	public QLKhachHang() {
		dsKhachHang = new ArrayList<>();
	}

	public List<KhachHang> getDsKhachHang() {
		return dsKhachHang;
	}

	public void setDsKhachHang(List<KhachHang> dsKhachHang) {
		this.dsKhachHang = dsKhachHang;
	}

	public KhachHang findKhachHang(String idKhachHang) {
		KhachHang result = null;
		for (KhachHang khachHang : dsKhachHang) {
			if (khachHang.getDiaChi().equals(idKhachHang)) {
				result = khachHang;
			}
		}
		return result;
	}

	public boolean addKhachHang(String id, String name, String address, String phoneNumber) {
		KhachHang kh = new KhachHang(id, name, address, phoneNumber);
		if (!checkContainId(kh.getIdKhachHang())) {
			dsKhachHang.add(kh);
			return true;
		}
		return false;
	}

	private boolean checkContainId(String idKhachHang) {
		// TODO Auto-generated method stub
		for (KhachHang khachHang : dsKhachHang) {
			if (khachHang.getDiaChi().equals(idKhachHang)) {
				return true;
			}
		}
		return false;
	}

}
