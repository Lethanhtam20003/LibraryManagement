package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TrangChu {
	private JFrame frame;

	private JMenuBar menuBar;

	private JMenu trangChuMenu;
	private JMenu qLSMenu;
	private JMenu qLKHMenu;
	private JMenu qLMTMenu;
	private JMenu qLTKMenu;

	 private JMenuItem MenuItem;

	private JPanel contentPanel;
	private JTextField textField;

	public TrangChu() {
		frame = new JFrame("Quản lý thư viện");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

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

		frame.setJMenuBar(menuBar);

		contentPanel = new JPanel();
		frame.getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel timKiemJlable = new JLabel("tìm kiếm");
		timKiemJlable.setBounds(149, 108, 55, 17);
		timKiemJlable.setFont(new Font("Arial", Font.HANGING_BASELINE, 14));
		contentPanel.add(timKiemJlable);

		JLabel titleLabel = new JLabel("Quản lý thư viện");
		titleLabel.setBounds(268, 5, 310, 46);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 39));
		contentPanel.add(titleLabel);
		
		textField = new JTextField();
		textField.setBounds(227, 108, 388, 19);
		contentPanel.add(textField);
		textField.setColumns(10);
		//tao bang
		JTable bookTable = new JTable();
		JScrollPane scrollPane = new JScrollPane(bookTable);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 

		contentPanel.add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Title");
		model.addColumn("Author");
		model.addRow(new Object[] { 1, "Book 1", "Author 1" });
		model.addRow(new Object[] { 2, "Book 2", "Author 2" });
		model.addRow(new Object[] { 3, "Book 3", "Author 3" });
		model.addRow(new Object[] { 1, "Book 1", "Author 1" });
		model.addRow(new Object[] { 2, "Book 2", "Author 2" });
		model.addRow(new Object[] { 3, "Book 3", "Author 3" });
		model.addRow(new Object[] { 1, "Book 1", "Author 1" });
		model.addRow(new Object[] { 2, "Book 2", "Author 2" });
		model.addRow(new Object[] { 3, "Book 3", "Author 3" });
		model.addRow(new Object[] { 1, "Book 1", "Author 1" });
		model.addRow(new Object[] { 2, "Book 2", "Author 2" });
		model.addRow(new Object[] { 3, "Book 3", "Author 3" });
		model.addRow(new Object[] { 1, "Book 1", "Author 1" });
		model.addRow(new Object[] { 2, "Book 2", "Author 2" });
		model.addRow(new Object[] { 3, "Book 3", "Author 3" });
		bookTable.setModel(model);
		scrollPane.setBounds(0, 300, 800, 200);
		frame.setVisible(true);
	}
}
