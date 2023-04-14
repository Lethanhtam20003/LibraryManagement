package View;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import Controler.controler_menu;

public class view_menu extends JMenuBar {
	private JMenu m;
	private controler_menu menu_ac;
	public view_menu() {
		m = new JMenu("Trang Chủ");
		this.add(m);
		
		m = new JMenu("Tìm kiếm sách");
		this.add(m);
		
		m = new JMenu("Quản lí sách");
		this.add(m);
		
		m = new JMenu("Mượn trả sách");
		this.add(m);
		
		m = new JMenu("Quản lý đọc giả");
		this.add(m);
		
		m = new JMenu("Nhập sách");
		this.add(m);
		
		
	}
	
	
}
