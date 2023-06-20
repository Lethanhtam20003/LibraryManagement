package Test;

import java.util.ArrayList;
import java.util.List;

import model.KhachHang;
import model.QLKhachHang;

public class test {
	public static void main(String[] args) {
		QLKhachHang qlkh = new QLKhachHang();
		KhachHang kh1 = new KhachHang("01", "quyen", "0345551000", "chon tran gian");
		KhachHang kh2 = new KhachHang("02", "ai", "0320001000", "ngoai dao");
		KhachHang kh3 = new KhachHang("03", "vay", "0340001000", "trong tu");
		qlkh.them(kh3);
		qlkh.them(kh1);
		qlkh.them(kh2);
		System.out.println(kh1==qlkh.timKiemTheoID("01"));
		
		List<KhachHang> list = new ArrayList<>();
		list.add(kh1);
		System.out.println(list);
		System.out.println(qlkh.timKiemTheoTen("quyen"));
		System.out.println(list.equals(qlkh.timKiemTheoTen("quyen")));
	}
}
