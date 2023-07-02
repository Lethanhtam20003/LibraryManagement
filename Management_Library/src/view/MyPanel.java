package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JPanel;

import controller.QLPhieuMuonController;
import controller.QLSachController;
import controller.QuanLyKhachHang_controller;
import controller.ThongKeController;
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

		QLPhieuMuonTra qlpmn = new QLPhieuMuonTra();
		ViewQLPhieuMuon viewpmt = new ViewQLPhieuMuon();
		QLPhieuMuonController acpmt = new QLPhieuMuonController(qlpmn, viewpmt);

		mainGui.add(quanLySach, "Quản lý sách");
		
		ThongKeController thongKeController = new ThongKeController((ThongKe) thongKe, new QLPhieuMuonTra());
		mainGui.add("Quản lý thống kê", thongKe);
		thongKeController.getPhieuMuon();

		// le tam
		QLKhachHang QLkh = new QLKhachHang();
		KhachHangPanel kh = new KhachHangPanel();
		QuanLyKhachHang_controller ac = new QuanLyKhachHang_controller(kh, QLkh, qlpmn);
		mainGui.add(kh, "Quản lý khách hàng");

		// phieu muon tra

		mainGui.add(viewpmt, "Quản lý mượn trả");

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
