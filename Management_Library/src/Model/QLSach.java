package Model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class QLSach {
	private Map<Sach, Integer> dsSach;

	public QLSach() {
		this.dsSach = new HashMap<Sach, Integer>();
	}

	public Map<Sach, Integer> getListBook() {
		return dsSach;
	}

	public void setListBook(Map<Sach, Integer> listBook) {
		this.dsSach = listBook;
	}

	public Sach timSach(String tenSach) {
		Sach sach = null;
		for (Sach s : dsSach.keySet()) {
			if (s.getTenSach().equals(tenSach)) {
				sach = s;
			}
		}
		return sach;
	}

	public void themSach(String idSach, String tenSach, TacGia tacGia, String theLoai, NhaXuatBan nhaXuatBan,
			Date namXuatBan) {
		Sach s = new Sach(idSach, tenSach, tacGia, theLoai, nhaXuatBan, namXuatBan);
		if (s != null) {
			dsSach.put(s, 0);
		}
	}

	public boolean xoaSach(String tenSach) {
		Sach s = timSach(tenSach);
		if (dsSach.containsKey(s)) {
			dsSach.remove(s);
			return true;
		}
		return false;

	}
}
