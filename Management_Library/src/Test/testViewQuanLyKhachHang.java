package Test;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import controller.QuanLyKhachHang_controller;
import model.KhachHang;
import model.QLKhachHang;
import view.KhachHangPanel;
import view.View;

public class testViewQuanLyKhachHang {

	public static void main(String[] args) {

		JFrame main = new JFrame();
		QLKhachHang model = new QLKhachHang();

		KhachHang kh1 = new KhachHang("KH101", "tri lo", "0345551000", "tan binh");
		KhachHang kh2 = new KhachHang("KH102", "chua mom", "0320001000", "chau dua");
		KhachHang kh3 = new KhachHang("KH103", "duc tri", "0340001000", "ba ria");
		model.them(kh1);
		model.them(kh2);
		model.them(kh3);
		KhachHangPanel kh = new KhachHangPanel();
		QuanLyKhachHang_controller ac = new QuanLyKhachHang_controller(kh, model);

		main.add(kh);
		main.setSize(new Dimension(900, 900));
		main.setVisible(true);

	}

}
