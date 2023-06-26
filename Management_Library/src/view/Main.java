package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import controller.MainController;
import controller.QLSachController;
import model.QLSach;
import model.Sach;

public class Main extends JFrame {
	
	private static  JMenuBar menuBar;

	public JMenu trangChuMenu;
	public JMenu qLThuVien;
	


	 private JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5;
	 ActionListener action;
	public Main() {
//		this.action = new MainController(this);
		setSize(900, 619);
     	setVisible(true);
     	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	MyPanel myPanel = new MyPanel();//     	setLayout(new BorderLayout());
//     	JPanel panel = new JPanel();
//     	JLabel label = new JLabel("PHẦN MỀM QUẢN LÝ THƯ VIỆN"); 
//     	label.setFont(new Font(null, Font.BOLD, 25));
//     	label.setHorizontalAlignment(JLabel.CENTER);
//     	panel.add(label, BorderLayout.CENTER);
     	action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myPanel.change(e.getActionCommand());
				if(e.getActionCommand().equals("Thoát")) {
					System.exit(0);
				}
			}
		};
		menuBar = new JMenuBar();
		trangChuMenu = new JMenu("Thoát");
		menuItem1 = new JMenuItem("Thoát");
		menuItem1.addActionListener(action);
//        add(panel);


		menuBar = new JMenuBar();
		qLThuVien = new JMenu("Quản lý thư viện");
		menuItem2 = new JMenuItem("Quản lý sách");
		menuItem2.addActionListener(action);

		
		menuItem3 = new JMenuItem("Quản lý khách hàng");
		menuItem3.addActionListener(action);

		
		menuItem4 = new JMenuItem("Quản lý mượn trả");
		menuItem4.addActionListener(action);

		
		menuItem5 = new JMenuItem("Quản lý thống kê");
		menuItem5.addActionListener(action);

		menuBar.add(trangChuMenu);
		trangChuMenu.add(menuItem1);
		menuBar.add(qLThuVien);
		qLThuVien.add(menuItem2);
		qLThuVien.add(menuItem3);
		qLThuVien.add(menuItem4);
		qLThuVien.add(menuItem5);
		setJMenuBar(menuBar);
		getContentPane().add(myPanel);
		
	}
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
           
            	new Main();

            }
        });
    }
}
