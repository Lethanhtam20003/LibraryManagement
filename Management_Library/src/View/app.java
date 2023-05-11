package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class app extends JFrame {
	public static app app ;
	private JMenu menu;
	private JPanel containpane;

	public app() {
		this.setTitle("quản lý thư viện");
		this.setSize(this.getPreferredSize());

		this.init();
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocation(0, 0);
		/*  ***********pack() 
		 *  Nó cố gắng tối thiểu hóa khoảng trống giữa các thành phần bên trong 
		 *  và đảm bảo rằng tất cả các thành phần đều được hiển thị trên JFrame hoặc JDialog.
		 *  
		 *  ***cách hoạt động của pack() 
		 *  b1: Tính toán lại kích thước và vị trí của JFrame hoặc JDialog dựa trên kích thước 
		 *  và vị trí của các thành phần bên trong.
		 *  b2:Đặt lại kích thước và vị trí của JFrame hoặc JDialog theo kết quả tính toán được.
		 *  
		 *  ***thường được gọi sau khi thêm tất cả các thành phần vào JFrame hoặc JDialog 
		 *  và trước khi hiển thị nó lên màn hình. Khi bạn gọi phương thức pack(), 
		 *  nó sẽ đảm bảo rằng JFrame hoặc JDialog của bạn được hiển thị đúng kích thước 
		 *  và vị trí của nó.
		 */
		this.pack(); 
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);// làm cho jframe full màn hình

		this.setVisible(true);
	}

	private void init() {
		// TODO Auto-generated method stub
		// font 
		Font font = new Font("Arial", Font.BOLD, 30);
		this.setFont(font);
		
		// menu
		this.setJMenuBar(createMenu());

		// contaipane 
		containpane = new JPanel();
		containpane.setLayout(new BorderLayout());
		this.add(new view_QuanLyDocGia(), BorderLayout.CENTER);
		

	}

	private JMenuBar createMenu() {
		// TODO Auto-generated method stub
		return new view_menu();
	}

	public static void main(String[] args) {
		new app();

	}
}
