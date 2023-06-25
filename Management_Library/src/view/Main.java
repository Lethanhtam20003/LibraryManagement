package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import controller.QLSachController;
import model.QLSach;

public class Main extends JFrame {

//	private JFrame frame;
	private JMenuBar menuBar;

	private JMenu trangChuMenu;
	private JMenu qLSMenu;
	private JMenu qLKHMenu;
	private JMenu qLMTMenu;
	private JMenu qLTKMenu;

	private JMenuItem MenuItem;

	public Main() {
		menuBar = new JMenuBar();
		trangChuMenu = new JMenu("Trang chủ");
		MenuItem = new JMenuItem("Exit");

		menuBar = new JMenuBar();
		qLSMenu = new JMenu("Quản lý sách");

		menuBar = new JMenuBar();
		qLKHMenu = new JMenu("Quản lý khách hàng");

		menuBar = new JMenuBar();
		qLMTMenu = new JMenu("Quản lý mượn trả");

		menuBar = new JMenuBar();
		qLTKMenu = new JMenu("Quản lý thống kê");

		menuBar = new JMenuBar();
		qLTKMenu = new JMenu("Giới thiệu");

		menuBar.add(trangChuMenu);
		trangChuMenu.add(MenuItem);
		menuBar.add(qLSMenu);
		menuBar.add(qLKHMenu);
		menuBar.add(qLMTMenu);
		menuBar.add(qLTKMenu);

		setJMenuBar(menuBar);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				QLSach model = new QLSach();
				QuanLySach view = new QuanLySach();
				QLSachController controller = new QLSachController(model, view);

				// Gọi phương thức để hiển thị danh sách sách trong View
				controller.getSach();
			}
		});
	}
}
