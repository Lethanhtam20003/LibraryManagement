package model;

import java.util.ArrayList;
import java.util.List;

public class QLSach implements QuanLyThuVien {
	List<Sach> listSach;

	public QLSach(List<Sach> listSach) {
		super();
		this.listSach = listSach;
	}

	public List<Sach> getListSach() {
		return listSach;
	}

	public void setListSach(List<Sach> listSach) {
		this.listSach = listSach;
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
	Sach sach = (Sach) object;
		listSach.add(sach);
	}

	@Override
	public void xoa(String id) {
		List<Sach> res = new ArrayList<>();
		for(Sach s: listSach) {
			if(s.getiD().equals(id)) {
				res.add(s);
			}
		}
		listSach.removeAll(res);
		
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
