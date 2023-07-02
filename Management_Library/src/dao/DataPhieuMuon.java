package dao;

import java.util.ArrayList;
import java.util.List;

import model.PhieuMuon;

public class DataPhieuMuon {
	public static List<PhieuMuon> listPhieu = new ArrayList<>();

	static {
		List<String> listSach1 = new ArrayList<>();
		listSach1.add("Harry Potter");
		List<String> listSach2 = new ArrayList<>();
		listSach2.add("Đắc nhân tâm");
		List<String> listSach3 = new ArrayList<>();
		listSach3.add("Lập trình nâng cao");
		listSach3.add("Cấu trúc dữ liệu");
		PhieuMuon p1 = new PhieuMuon("1", "KH101", listSach1, "20/6/2023", "22/6/2023", 1000);
		PhieuMuon p2 = new PhieuMuon("2", "KH102", listSach2, "20/6/2023", "23/6/2023", 1000);
		PhieuMuon p3 = new PhieuMuon("3", "KH101", listSach3, "21/6/2023", "24/6/2023", 2000);
		listPhieu.add(p1);
		listPhieu.add(p2);
		listPhieu.add(p3);
	}
}
