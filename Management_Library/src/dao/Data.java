package dao;

import java.util.ArrayList;
import java.util.List;

import model.Sach;

public class Data {
	public static List<Sach> listSach = new ArrayList<Sach>();
	
	static {
		listSach.add(new Sach("a1", "doraemon", "truyen tranh", "kim dong", "giao duc viet nam", 10, 0, 10000.0));	
		listSach.add(new Sach("a2", "onepice", "truyen tranh", "abc", "xyz", 20, 0, 13000.0));
		listSach.add(new Sach("a3", "dac nhan tam", "sach tham khao", "tac gia", "xyz", 15, 0, 20000.0));
		
	};
}
