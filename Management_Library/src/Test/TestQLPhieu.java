package Test;

import javax.swing.JFrame;

import controller.QLPhieuMuonController;
import model.QLPhieuMuonTra;
import view.ViewQLPhieuMuon;

public class TestQLPhieu {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		QLPhieuMuonTra model = new QLPhieuMuonTra();
		ViewQLPhieuMuon view = new ViewQLPhieuMuon();
		QLPhieuMuonController controler = new QLPhieuMuonController(model, view);
		frame.add(view);
		frame.setSize(900, 900);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
