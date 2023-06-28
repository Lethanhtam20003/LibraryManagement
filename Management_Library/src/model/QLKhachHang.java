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
			if (khachHang.getiD().equalsIgnoreCase(id)) {
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
			String srtfind = khachHang.getTen().trim().substring(khachHang.getTen().trim().lastIndexOf(" ") + 1);
			if (srtfind.equalsIgnoreCase(ten)) {

				result.add(khachHang);
			}
		}
		return result;
	}

	@Override
	public void them(Object object) {
		// TODO Auto-generated method stub
		sapXep();
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
		System.out.println(chuoi);
		String id = chuoi.substring(0, chuoi.indexOf("name:"));
		String name = chuoi.substring(chuoi.indexOf("name:") + 5, chuoi.indexOf("sdt:"));
		String soDienThoai = chuoi.substring(chuoi.indexOf("sdt:") + 4, chuoi.indexOf("email:"));
		String diaChi = chuoi.substring(chuoi.indexOf("email:") + 6);
		if (name.equals("")) {
			return;
		}
		xoa(id);
		KhachHang kh = new KhachHang(id, name, soDienThoai, diaChi);
		them(kh);

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Số điện thoại: " + soDienThoai);

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

	public void loadData(List<KhachHang> listKH) {
		// TODO Auto-generated method stub
		this.listKhachHang = listKH;
		sapXep();
	}

}
