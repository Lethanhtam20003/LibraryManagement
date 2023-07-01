package dao;

import java.util.ArrayList;
import java.util.List;

import model.KhachHang;

public class DataKhachHang {
	public static List<KhachHang> listKH = new ArrayList<KhachHang>();

	static {
		KhachHang kh1 = new KhachHang("KH101", "Nguyễn Đức Trí", "0345551000", "Tân Bình, tp HCM");
		KhachHang kh2 = new KhachHang("KH102", "Phạm Xuân Bắc", "0320001000", "Quận 8, tp HCM");
		KhachHang kh3 = new KhachHang("KH103", "Lượng Tấn Tài", "0340001000", "Quận 1, tp HCM");
		KhachHang kh4 = new KhachHang("KH104", "Nguyễn Đức tài", "0340001000", "Quận 7, tp HCM");
		KhachHang kh5 = new KhachHang("KH105", "Lý Văn Dương", "0997725555", "Quận 7, tp HCM");
		KhachHang kh6 = new KhachHang("KH106", "Nguyễn Văn Trí", "0345551000", "Tân Bình, tp HCM");
		KhachHang kh7 = new KhachHang("KH107", "Phạm Bắc Bắc", "0320001000", "Quận 8, tp HCM");
		KhachHang kh8 = new KhachHang("KH108", "Lượng Tấn Tạ", "0340001000", "Quận 1, tp HCM");
		KhachHang kh9 = new KhachHang("KH109", "Nguyễn Lân", "0340001000", "Quận 7, tp HCM");
		KhachHang kh10 = new KhachHang("KH110", "Lý Văn", "0997725555", "Quận 7, tp HCM");

		listKH.add(kh2);
		listKH.add(kh1);
		listKH.add(kh3);
		listKH.add(kh4);
		listKH.add(kh5);
		listKH.add(kh6);
		listKH.add(kh7);
		listKH.add(kh8);
		listKH.add(kh9);
		listKH.add(kh10);

	};
}
