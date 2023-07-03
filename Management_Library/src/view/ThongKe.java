package view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import model.PhieuMuon;
import model.Sach;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ThongKe extends JPanel {
	private DefaultTableModel model;
	public ArrayList<Object> values;
	JLabel lblNewLabel_2;

	/**
	 * Create the panel.
	 */
	public ThongKe() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THỐNG KÊ DOANH THU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(331, 47, 218, 33);
		panel.add(lblNewLabel);
		
		model = new DefaultTableModel();
		model.addColumn("STT");
		model.addColumn("ID");
		model.addColumn("Ngày cho mượn");
		model.addColumn("Giá");
		model.setRowCount(0);


		// tao bang
		JTable bookTable = new JTable() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; // Không cho phép chỉnh sửa trực tiếp trên bảng
			}
		};
		// Bắt sự kiện click chuột trên JTable
		bookTable.addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) { // Kiểm tra số lần click chuột
					int row = bookTable.getSelectedRow(); // Lấy số thứ tự hàng được click
					values = new ArrayList<>();
					// Lặp qua các cột và lấy giá trị của mỗi cột
					for (int column = 1; column < bookTable.getColumnCount(); column++) {
						Object value = bookTable.getValueAt(row, column);
						values.add(value);
					}
									}
			}

		});
		JScrollPane scrollPane = new JScrollPane(bookTable);
		scrollPane.setBounds(26, 112, 846, 391);
		panel.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		bookTable.setModel(model);
		
		JLabel lblNewLabel_1 = new JLabel("Tổng doanh thu: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(26, 523, 111, 24);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(139, 525, 489, 20);
		panel.add(lblNewLabel_2);


	}
	public void displayDSPhieu(List<PhieuMuon> list) {
		int stt = 0;
		double total=0;
		model.setRowCount(0);
		for (PhieuMuon s : list) {
			stt++;

			model.addRow(new Object[] { stt, s.getId(), s.getNgayMuon(), s.getTienMuonSach()

			});
			total += s.getTienMuonSach();
			calTotal(total);

		}
	}
	public void calTotal(double total) {
		Locale vietnameseLocale = new Locale("vi", "VN");
        NumberFormat vietnameseCurrencyFormat = NumberFormat.getCurrencyInstance(vietnameseLocale);
        String vietnameseFormattedAmount = vietnameseCurrencyFormat.format(total);
        lblNewLabel_2.setText(vietnameseFormattedAmount);
	}
}
