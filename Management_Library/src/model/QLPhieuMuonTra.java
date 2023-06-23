package model;

import java.util.List;

public class QLPhieuMuonTra implements QuanLyThuVien {
	List<PhieuMuon>listPhieuMuon;
	QLSach qlSach;
	

	public QLPhieuMuonTra(List<PhieuMuon> listPhieuMuon, QLSach qlSach) {
		super();
//		listPhieuMuon=new ArrayList<>();
		this.listPhieuMuon = listPhieuMuon;
		this.qlSach = qlSach;
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
		for(Sach s: qlSach.listSach) {
			
			if(obj.sach.getiD().equals(s.getiD())) {
				s.setSoLuongChoMuon(s.getSoLuongChoMuon()+1);
			}
		}
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
	public int getSoLuong() {
		// TODO Auto-generated method stub
		return 0;
	}
}
