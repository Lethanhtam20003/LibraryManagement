package controller;

import java.util.List;

import model.PhieuMuon;
import model.QLPhieuMuonTra;
import view.ThongKe;

public class ThongKeController {
	private ThongKe view;
	private QLPhieuMuonTra model;
	public ThongKeController(ThongKe view, QLPhieuMuonTra model) {
		this.view = view;
		this.model = model;
	}
	
	public void getPhieuMuon() {
		List<PhieuMuon> listSach = model.getListPhieuMuon();
		view.displayDSPhieu(listSach);
	}
	
}
