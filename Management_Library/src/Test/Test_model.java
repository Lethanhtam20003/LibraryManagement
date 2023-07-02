package Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import junit.framework.TestCase;
import model.KhachHang;
import model.PhieuMuon;
import model.QLPhieuMuonTra;
import model.QLSach;
import model.Sach;

public class Test_model extends TestCase {

	public void testConstructor() {

		Sach s1 = new Sach("a1", "doraemon", "truyen tranh", "kim dong", "giao duc viet nam", 10, 0, 10);
		Sach s2 = new Sach("a2", "onepice", "truyen tranh", "abc", "xyz", 20, 0, 15);
		Sach s3 = new Sach("a3", "dac nhan tam", "sach tham khao", "tac gia", "xyz", 5, 0, 10);

		KhachHang kh1 = new KhachHang("01", "quyen", "0345551000", "chon tran gian");
		KhachHang kh2 = new KhachHang("02", "ai", "0320001000", "ngoai dao");
		KhachHang kh3 = new KhachHang("03", "vay", "0340001000", "trong tu");

//		PhieuMuon phieu1 = new PhieuMuon("01", "tenphieu1", kh1, s3, new GregorianCalendar(2023, Calendar.JANUARY, 15).getTime(), new GregorianCalendar(2023, Calendar.JANUARY, 20).getTime(), "dang muon");
//		PhieuMuon phieu2 = new PhieuMuon("02", "tenphieu2", kh1, s3, new GregorianCalendar(2023, Calendar.JANUARY, 15).getTime(), new GregorianCalendar(2023, Calendar.JANUARY, 20).getTime(), "dang muon");

		List<PhieuMuon> list = new ArrayList<>();

	}

	public static void main(String[] args) {

		Sach s1 = new Sach("a1", "doraemon", "truyen tranh", "kim dong", "giao duc viet nam", 10, 0, 10);
		Sach s2 = new Sach("a2", "onepice", "truyen tranh", "abc", "xyz", 20, 0, 15);
		Sach s3 = new Sach("a3", "dac nhan tam", "sach tham khao", "tac gia", "xyz", 5, 0, 10);
		Sach s4 = new Sach("a3", "dac nhan tam", "sach tham khao", "tac gia", "xyz", 5, 0, 10);

		KhachHang kh1 = new KhachHang("01", "quyen", "0345551000", "chon tran gian");
		KhachHang kh2 = new KhachHang("02", "ai", "0320001000", "ngoai dao");
		KhachHang kh3 = new KhachHang("03", "vay", "0340001000", "trong tu");

//		PhieuMuon phieu1 = new PhieuMuon("01", "tenphieu1", kh1, s3,
//				new GregorianCalendar(2023, Calendar.JANUARY, 15).getTime(),
//				new GregorianCalendar(2023, Calendar.JANUARY, 20).getTime(), 5000.0, "dang muon");
//		PhieuMuon phieu2 = new PhieuMuon("02", "tenphieu2", kh1, s3,
//				new GregorianCalendar(2023, Calendar.JANUARY, 15).getTime(),
//				new GregorianCalendar(2023, Calendar.JANUARY, 20).getTime(), 5000.0, "dang muon");

		List<PhieuMuon> list = new ArrayList<>();

		List<Sach> list2 = new ArrayList<>();

		QLSach sach1 = new QLSach();
		sach1.them(s1);
		sach1.them(s2);
		sach1.them(s3);
		sach1.them(s1);

//		QLPhieuMuonTra m1 = new QLPhieuMuonTra(list, sach1);
//		m1.them(phieu1);
		sach1.xoa("a2");
//		sach1.xoa("a3");
		System.out.println(list);
		System.out.println("--------------------------------------");
		System.out.println(list2);

		System.out.println("-----------------------------------------");
		System.out.println("Tong so luong sach trong kho: " + sach1.getTongSoLuong());
		System.out.println("Tong so luong cho muon:" + sach1.getSoLuongChoMuon());
		System.out.println("Tong so luong con lai:" + sach1.getSoLuongConLai());

		System.out.println("tim kiem theo id: " + sach1.timKiemTheoID("a3"));
		System.out.println("tim kiem theo ten: " + sach1.timKiemTheoTen("onepice"));

		System.out.println("-----------------------------------------");
		sach1.capNhat("a3", "kim dong", "quyen", 20, 0, 13000.0);
		System.out.println("thong tin cua mot cuon sach trong kho da cap nhat co: " + s3);

		System.out.println("-----------------------------------------");

		System.out.println(s1.getSoLuongNhapKho());

	}
}
