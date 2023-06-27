package model;

import java.util.Date;
import java.util.List;

public class QLPhieuMuonTra implements QuanLyThuVien {


List<PhieuMuon>listPhieuMuon;

	public QLPhieuMuonTra(List<PhieuMuon> listPhieuMuon) {

		super();
		this.listPhieuMuon = listPhieuMuon;
	}

	public List<PhieuMuon> getListPhieuMuon() {
		return listPhieuMuon;
	}

	public void setListPhieuMuon(List<PhieuMuon> listPhieuMuon) {
		this.listPhieuMuon = listPhieuMuon;
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

		PhieuMuon obj = (PhieuMuon) object;
		listPhieuMuon.add(obj);
		for (Sach s : qlSach.listSach) {

			if (obj.sach.getiD().equals(s.getiD())) {
				s.setSoLuongChoMuon(s.getSoLuongChoMuon() + 1);
			}
		}
	}

	@Override
	public void xoaPhieu(String id) {
		PhieuMuon phieuMuon = timPhieu(id);
		if(phieuMuon !=null) {
			listPhieuMuon.remove(phieuMuon);
		}	
	}

	@Override
	public void capNhatPhieu(String idPhieu, List<Sach> listSachMuonMoi, Date ngayMuonMoi, Date ngayDuKienTraMoi) {
		PhieuMuon phieuMuon = timPhieu(idPhieu);
		if(phieuMuon != null) {
			if(phieuMuon.getTrangThai().equals("Da Tra Sach")) {
				phieuMuon.setListSachMuon(listSachMuonMoi);
				phieuMuon.setNgayMuon(ngayMuonMoi);
				phieuMuon.setNgayDuKienTra(ngayDuKienTraMoi);
			}
		}

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
