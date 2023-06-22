package Test;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import model.KhachHang;
import model.QLKhachHang;
import view.KhachHangPanel;
import view.View;

public class testViewQuanLyKhachHang {

	public static void main(String[] args) {

		JFrame main = new JFrame();
		KhachHangPanel kh = new KhachHangPanel();
		main.add(kh);
		main.setSize(new Dimension(900, 900));
		main.setVisible(true);

		KhachHang kh1 = new KhachHang("01", "quyen", "0345551000", "chon tran gian");
		KhachHang kh2 = new KhachHang("02", "ai", "0320001000", "ngoai dao");
		KhachHang kh3 = new KhachHang("03", "vay", "0340001000", "trong tu");
		kh.getModel().them(kh3);
		kh.getModel().them(kh1);
		kh.getModel().them(kh2);

	}

}
