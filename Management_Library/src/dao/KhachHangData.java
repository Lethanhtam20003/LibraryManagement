package dao;

import java.util.ArrayList;
import java.util.List;

import model.KhachHang;

public class KhachHangData {
public static List<KhachHang> listKH = new ArrayList<KhachHang>();
	
	static {
		KhachHang kh1 = new KhachHang("KH101", "tri lo", "0345551000", "tan binh");
		KhachHang kh2 = new KhachHang("KH102", "chua mom", "0320001000", "chau dua");
		KhachHang kh3 = new KhachHang("KH103", "duc tri", "0340001000", "ba ria");
		KhachHang kh4 = new KhachHang("KH104", "duc 2 tri", "0340001000", "ba ria");
		
		listKH.add(kh2);
		listKH.add(kh1);
		listKH.add(kh3);
		listKH.add(kh4);
		
	};
}
