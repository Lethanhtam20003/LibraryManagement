package model;

import java.util.List;

public class QLKhachHang implements ThuThu  {
	List<KhachHang> listKhachHang;

	public QLKhachHang(List<KhachHang> listKhachHang) {
		super();
		this.listKhachHang = listKhachHang;
	}

	public List<KhachHang> getListKhachHang() {
		return listKhachHang;
	}

	public void setListKhachHang(List<KhachHang> listKhachHang) {
		this.listKhachHang = listKhachHang;
	}

	@Override
	public List<Object> timKiemTheoID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> timKiemTheoTen(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void them(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void xoa(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void capNhat(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTongSoLuong() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSoLuong(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
