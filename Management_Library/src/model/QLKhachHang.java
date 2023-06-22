package model;

import java.util.ArrayList;
import java.util.List;

public class QLKhachHang implements ThuVien {
	private List<KhachHang> listKhachHang;

	// constructor
	public QLKhachHang() {
		super();
		this.listKhachHang = new ArrayList<>();
	}

	public List<KhachHang> getListKhachHang() {
		return listKhachHang;
	}

	public void setListKhachHang(List<KhachHang> listKhachHang) {
		this.listKhachHang = listKhachHang;
	}

	@Override
	public Object timKiemTheoID(String id) {
		// TODO Auto-generated method stub
		for (KhachHang khachHang : listKhachHang) {
			if (khachHang.getiD().equals(id)) {
				return khachHang;
			}
		}

		return null;
	}

	@Override
	public List<Object> timKiemTheoTen(String ten) {
		// TODO Auto-generated method stub
		List<Object> result = new ArrayList<>();
		for (KhachHang khachHang : listKhachHang) {
			if (khachHang.getTen().equals(ten)) {
				result.add(khachHang);
			}
		}
		return result;
	}

	@Override
	public void them(Object object) {
		// TODO Auto-generated method stub
		KhachHang kh = (KhachHang) object;
		this.getListKhachHang().add(kh);
	}

	@Override
	public void xoa(String id) {
		// TODO Auto-generated method stub
		KhachHang kh = (KhachHang) timKiemTheoID(id);
		if (kh != null)
			this.getListKhachHang().remove(kh);
	}

	@Override
	public void capNhat(String chuoi) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getSoLuong() {
		// TODO Auto-generated method stub
		return this.getListKhachHang().size();
	}

}
