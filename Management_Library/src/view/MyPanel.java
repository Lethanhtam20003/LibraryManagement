package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

import controller.QLPhieuMuonController;
import controller.QLSachController;
import controller.QuanLyKhachHang_controller;
import model.QLKhachHang;
import model.QLPhieuMuonTra;
import model.QLSach;

public class MyPanel extends JPanel {
	JPanel quanLySach, mainGui, thongKe;
	CardLayout cardLayout;
	QLSachController controller;

	public MyPanel() {
		cardLayout = new CardLayout();
		mainGui = new JPanel(cardLayout);
		setLayout(new BorderLayout());

		quanLySach = new QuanLySach();
		controller = new QLSachController(new QLSach(), (QuanLySach) quanLySach);
		thongKe = new ThongKe();

		mainGui.add(quanLySach, "Quản lý sách");
		mainGui.add("Quản lý thống kê", thongKe);

		// le tam
		QLKhachHang QLkh = new QLKhachHang();
		KhachHangPanel kh = new KhachHangPanel();
		QuanLyKhachHang_controller ac = new QuanLyKhachHang_controller(kh, QLkh);
		mainGui.add(kh, "Quản lý khách hàng");

		// phieu muon tra
		QLPhieuMuonTra qlpmn = new QLPhieuMuonTra();
		ViewQLPhieuMuon viewpmt = new ViewQLPhieuMuon();
		QLPhieuMuonController acpmt = new QLPhieuMuonController(qlpmn,viewpmt);
		mainGui.add(viewpmt,"Quản lý mượn trả");
		
		add(mainGui, BorderLayout.CENTER);
		controller.getSach();
	}

	public void change(String actionCommand) {
		cardLayout.show(mainGui, actionCommand);

		if (actionCommand.equals("Quản lý sách")) {
			controller.getSach();
		}
	}
}
