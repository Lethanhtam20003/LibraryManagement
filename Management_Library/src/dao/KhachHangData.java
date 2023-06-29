package dao;

import java.util.ArrayList;
import java.util.List;

import model.KhachHang;

public class KhachHangData {
	public static List<KhachHang> listKH = new ArrayList<KhachHang>();

	static {
		KhachHang kh1 = new KhachHang("KH101", "Nguyễn Đức Trí", "0345551000", "Tân Bình, tp HCM");
		KhachHang kh2 = new KhachHang("KH102", "Phạm Xuân Bắc", "0320001000", "Quận 8, tp HCM");
		KhachHang kh3 = new KhachHang("KH103", "Lượng Tấn Tài", "0340001000", "Quận 1, tp HCM");
		KhachHang kh4 = new KhachHang("KH104", "Nguyễn Đức tài", "0340001000", "Quận 7, tp HCM");

		listKH.add(kh2);
		listKH.add(kh1);
		listKH.add(kh3);
		listKH.add(kh4);

	};
}
