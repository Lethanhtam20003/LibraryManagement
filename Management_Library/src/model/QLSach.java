package model;

import java.util.ArrayList;
import java.util.List;

import dao.Data;

public class QLSach extends Observable implements QuanLyThuVien  {

	List<Sach> listSach;

	public QLSach() {
		super();
		this.listSach = Data.listSach;
	}

	public List<Sach> getListSach() {
		return listSach;
	}

	public void setListSach(List<Sach> listSach) {
		this.listSach = listSach;
	}

	@Override
	public List<Object> timKiemTheoID(String id) {
		List<Object> ketQua = new ArrayList<>();
		for (Object sach : listSach) {
			if (((Sach) sach).getiD().equals(id)) {
				ketQua.add(sach);
			}
		}
		return ketQua;
	}

	@Override
	public List<Object> timKiemTheoTen(String ten) {
		List<Object> ketQua = new ArrayList<>();
		for (Object sach : listSach) {
			if (((Sach) sach).getTen().equalsIgnoreCase(ten)) {
				ketQua.add(sach);
			}
		}
		return ketQua;
	}

	@Override
	public void them(Object object) {
		Sach sach = (Sach) object;
		boolean sachDaCo = false;
		for (Sach s : listSach) {
			if (s.getiD().equals(sach.getiD())) {
				// Cập nhật số lượng sách
				s.setSoLuongNhapKho(s.getSoLuongNhapKho() + sach.getSoLuongNhapKho());
				sachDaCo = true;
				break;
			}
		}

		if (!sachDaCo) {
			// Thêm sách mới vào danh sách
			listSach.add(sach);
		}
	}

	@Override
	public void xoa(String id) {
		List<Sach> res = new ArrayList<>();
		for (Sach s : listSach) {
			if (s.getiD().equals(id)) {
				res.add(s);
			}
		}
		listSach.removeAll(res);

	}

	@Override
	public void capNhat(String id) {

	}

	@Override
	public int getTongSoLuong() {
		int tongSoLuong = 0;
		for (Sach sach : listSach) {
			tongSoLuong += sach.getSoLuongNhapKho();
		}
		return tongSoLuong;
	}

	public int getSoLuongChoMuon() {
		int soLuongChoMuon = 0;
		for (Sach sach : listSach) {
			soLuongChoMuon += sach.getSoLuongChoMuon();
		}
		return soLuongChoMuon;
	}

	public int getSoLuongConLai() {
		int soLuongConLai = 0;
		for (Sach sach : listSach) {
			soLuongConLai += sach.getSoLuongNhapKho() - sach.getSoLuongChoMuon();
		}
		return soLuongConLai;
	}

	// cap nhat
	public void capNhat(String id, String nhaXuatBan, String tenTacGia, int soLuongNhapKho, int soLuongChoMuon,
			double giaSach) {
		for (Sach sach : listSach) {
			if (sach.getiD().equals(id)) {
				sach.setTacGia(tenTacGia);
				sach.setNhaXuatBan(nhaXuatBan);
				sach.setSoLuongNhapKho(soLuongNhapKho);
				sach.setSoLuongChoMuon(soLuongChoMuon);
				sach.setGiaSach(giaSach);
				break;
			}
		}

	}

	@Override
	public int getSoLuong(String id) {
		for (Sach s : listSach) {
			if (s.getiD().equals(id)) {
				return s.getSoLuongNhapKho();
			}
		}
		return getSoLuong(id);
	}

}
