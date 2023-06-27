package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QLKhachHang extends Observable implements QuanLyThuVien {
	private List<KhachHang> listKhachHang;
	private ArrayList<Observer> observers;

	// constructor
	public QLKhachHang() {
		super();
		this.listKhachHang = new ArrayList<>();
		observers = new ArrayList<>();
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
		List<Object> result = new ArrayList<>();
		for (KhachHang khachHang : listKhachHang) {
			if (khachHang.getiD().equals(id)) {
				result.add(khachHang);
			}
		}

		return result;
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
		notifyObservers();
	}

	@Override
	public void xoa(String id) {
		// TODO Auto-generated method stub
		if (timKiemTheoID(id).size() >= 1) {
			KhachHang kh = (KhachHang) timKiemTheoID(id).get(0);

			if (kh != null) {
				this.getListKhachHang().remove(kh);
				notifyObservers();
			}
		}
	}

	@Override
	public void capNhat(String chuoi) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTongSoLuong() {
		// TODO Auto-generated method stub
		return this.getListKhachHang().size();
	}

	@Override
	public int getSoLuong(String id) {
		// TODO Auto-generated method stub
		return this.getListKhachHang().size();
	}

	public String createID(String string) {
		// TODO Auto-generated method stub
		String id = null;
		if (listKhachHang.size() >= 1) {

			int idNumbet = tachSo(listKhachHang.get(listKhachHang.size() - 1).getiD());
			idNumbet++;
			boolean idExists;

			// Tạo ID
			id = "KH" + idNumbet;

			// Kiểm tra xem ID đã tồn tại trong danh sách khách hàng chưa
			idExists = false;
			for (KhachHang khachHang : listKhachHang) {
				if (khachHang.getiD().equals(id)) {
					idExists = true;
					createID("KH" + idNumbet);
				}
			}

			return id;
		}
		return "KH101";
	}

	private int tachSo(String id) {
		// TODO Auto-generated method stub
		int result = Integer.parseInt(id.substring(id.indexOf("H") + 1, id.length()));
		return result;
	}

	// obsever
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		sapXep();
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public void sapXep() {
		Collections.sort(listKhachHang, new Comparator<KhachHang>() {

			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				// TODO Auto-generated method stub
				return o1.getiD().compareToIgnoreCase(o2.getiD());
			}

		});
	}

	public static void main(String[] args) {
		QLKhachHang qlkh = new QLKhachHang();
		KhachHang kh1 = new KhachHang("KH101", "tri lo", "0345551000", "tan binh");
		KhachHang kh2 = new KhachHang("KH102", "chua mom", "0320001000", "chau dua");
		KhachHang kh3 = new KhachHang("KH103", "duc tri", "0340001000", "ba ria");
		qlkh.them(kh1);
		qlkh.them(kh2);
		qlkh.them(kh3);
		System.out.println("ds");
		String id = (qlkh.getListKhachHang().get(qlkh.getListKhachHang().size() - 1).getiD());
		System.out.println("id=" + id);
		System.out.println(qlkh.tachSo(id));
		System.out.println(qlkh.createID(id));

		qlkh.xoa("ds");
		System.out.println("d" + qlkh.getListKhachHang());
		qlkh.xoa(kh1.getiD());
		System.out.println("d" + qlkh.getListKhachHang());
	}

}
