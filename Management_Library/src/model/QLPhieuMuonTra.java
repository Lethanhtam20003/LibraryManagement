package model;

import java.util.List;

import dao.DataPhieuMuon;

public class QLPhieuMuonTra extends Observable implements QuanLyThuVien{
	List<PhieuMuon>listPhieuMuon ;
	
	public QLPhieuMuonTra() {
		super();
		listPhieuMuon = DataPhieuMuon.listPhieu;
	}

	public List<PhieuMuon> getListPhieuMuon() {
		return listPhieuMuon;
	}

	public void setListPhieuMuon(List<PhieuMuon> listPhieuMuon) {
		this.listPhieuMuon = listPhieuMuon;
	}

	@Override
	public String toString() {
		return "QLPhieuMuonTra [listPhieuMuon=" + listPhieuMuon + "]";
	}
	
	@Override
	public List<Object> timKiemTheoID(String id) {
		return null;
	}

	@Override
	public List<Object> timKiemTheoTen(String tenSach) {
		return null;
	}
	@Override
	public void them(Object object) {

	}
	
	@Override
	public void xoa(String id) {
		for(PhieuMuon p : listPhieuMuon) {
			if(p.getId() == id) {
				listPhieuMuon.remove(p);
				break;
			}
		}
		notifyChanged();
	}
	
	public void capNhat(String id,  String maKH, double tienMuon, String ngayMuon, String ngayDuKienTra, List<String> tenSach, String tinhTrang) {
		for(PhieuMuon p : listPhieuMuon) {
			if(p.getId().equalsIgnoreCase(id)) {
				p.setMaKhachHang(maKH);
				p.setTienMuonSach(tienMuon);
				p.setNgayMuon(ngayMuon);
				p.setNgayDuKienTra(ngayDuKienTra);
				p.setTenSachMuon(tenSach);
				p.setTinhTrang(tinhTrang);
				break;
			}
		}
		notifyChanged();
	}

	public void thuPhieu(String id) {
		for(PhieuMuon p : listPhieuMuon) {
			if(p.getId().equals(id) && p.getTinhTrang().equalsIgnoreCase("Chưa trả sách")) {
				p.setTinhTrang("Đã trả sách");
			}
		}
		notifyChanged();
	}
	
	@Override
	public void capNhat(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTongSoLuong() {
		return listPhieuMuon.size();
	}

	@Override
	public int getSoLuong(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
