package model;

import java.util.List;

public class QLPhieuMuonTra implements ThuThu {
	List<PhieuMuon>listPhieuMuon;

	public QLPhieuMuon(List<PhieuMuon> listPhieuMuon) {
		super();
		this.listPhieuMuon = listPhieuMuon;
	}

	public List<PhieuMuon> getListPhieuMuon() {
		return listPhieuMuon;
	}

	public void setListPhieuMuon(List<PhieuMuon> listPhieuMuon) {
		this.listPhieuMuon = listPhieuMuon;
	}
	public void xoaPhieu(String id) {
		PhieuMuon phieuMuon = timPhieu(id);
		if(phieuMuon !=null) {
			listPhieuMuon.remove(phieuMuon);
		}	
	}
	public void capNhatPhieu(String idPhieu, List<Sach> listSachMuonMoi, Date ngayMuonMoi, Date ngayDuKienTraMoi) {
		PhieuMuon phieuMuon = timPhieu(idPhieu);
		if(phieuMuon != null) {
			if(phieuMuon.getTrangThai().equals("Da Tra")) {
				phieuMuon.setListSachMuon(listSachMuonMoi);
				phieuMuon.setNgayMuon(ngayMuonMoi);
				phieuMuon.setNgayDuKienTra(ngayDuKienTraMoi);
			}
		}
	}
}
