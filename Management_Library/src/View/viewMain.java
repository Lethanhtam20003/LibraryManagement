package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class viewMain extends JFrame {
	private JMenu menu;
	private JPanel containpane;

	public viewMain() {
		this.setTitle("tv");
		this.setSize(this.getPreferredSize());

		this.init();
		
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		this.pack();
		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub

		Font font = new Font("Arial", Font.BOLD, 30);
		this.setFont(font);
		containpane = new JPanel();
		containpane.setLayout(new BorderLayout());
		this.setJMenuBar(createMenu());

		this.add(new view_QuanLyDocGia(), BorderLayout.CENTER);

	}

	private JMenuBar createMenu() {
		// TODO Auto-generated method stub
		return new view_menu();
	}

	public static void main(String[] args) {
		new viewMain();

	}
}
