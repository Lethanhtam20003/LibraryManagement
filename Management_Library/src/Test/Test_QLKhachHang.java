package Test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import junit.framework.TestCase;
import model.KhachHang;
import model.QLKhachHang;
import view.KhachHangPanel;

public class Test_QLKhachHang extends TestCase {

	QLKhachHang qlkh = new QLKhachHang();
	KhachHang kh1 = new KhachHang("KH101", "tri lo", "0345551000", "tan binh");
	KhachHang kh2 = new KhachHang("KH102", "chua mom", "0320001000", "chau dua");
	KhachHang kh3 = new KhachHang("KH103", "duc tri", "0340001000", "ba ria");

	public void setDataForTest() {
		qlkh.them(kh3);
		qlkh.them(kh1);
		qlkh.them(kh2);
	}

	public void testConstructor() {
		QLKhachHang qlkh = new QLKhachHang();

		KhachHang kh1 = new KhachHang("KH101", "tri lo", "0345551000", "tan binh");
		KhachHang kh2 = new KhachHang("KH102", "chua mom", "0320001000", "chau dua");
		KhachHang kh3 = new KhachHang("KH103", "duc tri", "0340001000", "ba ria");

	}

	public void testtimKiemTheoID() {
		setDataForTest();

		assertEquals(kh1 == qlkh.timKiemTheoID("01"), true);
		qlkh.xoa(kh1.getiD());
		assertEquals(kh1 == qlkh.timKiemTheoID("01"), false);
	}

	public void testTimKiemTheoTen() {
		setDataForTest();
		List<KhachHang> list = new ArrayList<>();
		list.add(kh1);

		assertEquals(list.equals(qlkh.timKiemTheoTen("tri lo")), true);
		list.add(kh2);
		assertEquals(list.equals(qlkh.timKiemTheoTen("tri lo")), false);
	}

	public void testThem() {
		qlkh.them(kh2);
		qlkh.them(kh1);
		qlkh.them(kh3);
	}

	public void testCreateIDRandom() {
		assertEquals(("KH111"), "KH112");
		System.out.println();
	}

	public void testxoa() {
		qlkh.xoa(kh1.getiD());
		System.out.println(qlkh.getListKhachHang());
	}

	public void testCapNhat() {

	}

	public void testGetSoLuong() {
		setDataForTest();

		assertEquals(qlkh.getTongSoLuong(), 3);
	}

}
