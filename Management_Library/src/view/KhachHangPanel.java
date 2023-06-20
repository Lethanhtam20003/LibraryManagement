package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.DropMode;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class KhachHangPanel extends JPanel {
	private JTable table;
	private JTable table_1;
	private JTextField tfInput_MaDocGia;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public KhachHangPanel() {
		setLayout(new BorderLayout(0, 0));

		JPanel container = new JPanel();
		container.setBackground(SystemColor.window);
		add(container, BorderLayout.CENTER);
		container.setLayout(new GridLayout(0, 1, 0, 20));

		JPanel pn_CacChucNang = new JPanel();
		pn_CacChucNang.setBackground(SystemColor.window);
		container.add(pn_CacChucNang);
		pn_CacChucNang.setLayout(new GridLayout(0, 2, 20, 40));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlightText);
		pn_CacChucNang.add(panel_2);
		panel_2.setLayout(new BorderLayout(20, 20));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.window);
		panel_2.add(panel_4, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Chức Năng Đang Thực Hiện: ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_4.add(lblNewLabel);

		JLabel lbShow_ChucNangDangThucHien = new JLabel("");
		lbShow_ChucNangDangThucHien.setBackground(SystemColor.window);
		// change
		lbShow_ChucNangDangThucHien.setPreferredSize(new Dimension(100, 22));
		lbShow_ChucNangDangThucHien.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		lbShow_ChucNangDangThucHien.setForeground(SystemColor.activeCaptionBorder);
		lbShow_ChucNangDangThucHien.setLabelFor(lbShow_ChucNangDangThucHien);
		lbShow_ChucNangDangThucHien.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_4.add(lbShow_ChucNangDangThucHien);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.window);
		panel_2.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new GridLayout(0, 2, 20, 20));

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_5.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_11 = new JPanel();
		panel_11.setAlignmentX(10.0f);
		panel_11.setBackground(new Color(255, 255, 255));
		panel_7.add(panel_11);
		panel_11.setLayout(new GridLayout(1, 1, 0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(20);
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_11.add(panel);

		JLabel lblNewLabel_2 = new JLabel("Mã Đọc Giả ");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		panel_7.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		panel_12.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		tfInput_MaDocGia = new JTextField();
		tfInput_MaDocGia.setForeground(Color.BLACK);
		tfInput_MaDocGia.setFont(new Font("Arial", Font.PLAIN, 14));
		tfInput_MaDocGia.setDropMode(DropMode.ON);
		tfInput_MaDocGia.setHorizontalAlignment(SwingConstants.LEFT);
		tfInput_MaDocGia.setColumns(18);
		tfInput_MaDocGia.setBackground(Color.WHITE);
		panel_1.add(tfInput_MaDocGia);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_5.add(panel_7_1);
		panel_7_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_11_1 = new JPanel();
		panel_11_1.setBackground(Color.WHITE);
		panel_11_1.setAlignmentX(10.0f);
		panel_7_1.add(panel_11_1);
		panel_11_1.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_8 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_8.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		flowLayout_1.setVgap(20);
		flowLayout_1.setHgap(20);
		panel_8.setBackground(SystemColor.window);
		panel_11_1.add(panel_8);
		
		JLabel lblNewLabel_2_1 = new JLabel(" Số Điện Thoại");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		panel_8.add(lblNewLabel_2_1);
		
		JPanel panel_12_1 = new JPanel();
		panel_12_1.setBackground(Color.WHITE);
		panel_7_1.add(panel_12_1);
		panel_12_1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.WHITE);
		panel_12_1.add(panel_1_1);
		panel_1_1.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setDropMode(DropMode.ON);
		textField.setColumns(18);
		textField.setBackground(Color.LIGHT_GRAY);
		panel_1_1.add(textField);
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.WHITE);
		panel_5.add(panel_7_2);
		panel_7_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_11_2 = new JPanel();
		panel_11_2.setBackground(Color.WHITE);
		panel_11_2.setAlignmentX(10.0f);
		panel_7_2.add(panel_11_2);
		panel_11_2.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_9 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_9.getLayout();
		flowLayout_2.setVgap(20);
		flowLayout_2.setHgap(20);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_9.setBackground(SystemColor.window);
		panel_11_2.add(panel_9);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tên Đọc Giả");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		panel_9.add(lblNewLabel_2_2);
		
		JPanel panel_12_2 = new JPanel();
		panel_12_2.setBackground(Color.WHITE);
		panel_7_2.add(panel_12_2);
		panel_12_2.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.WHITE);
		panel_12_2.add(panel_1_2);
		panel_1_2.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setDropMode(DropMode.ON);
		textField_1.setColumns(18);
		textField_1.setBackground(Color.LIGHT_GRAY);
		panel_1_2.add(textField_1);
		
		JPanel panel_7_3 = new JPanel();
		panel_7_3.setBackground(Color.WHITE);
		panel_5.add(panel_7_3);
		panel_7_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_11_3 = new JPanel();
		panel_11_3.setBackground(Color.WHITE);
		panel_11_3.setAlignmentX(10.0f);
		panel_7_3.add(panel_11_3);
		panel_11_3.setLayout(new GridLayout(1, 1, 0, 0));
		
		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_10.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		flowLayout_3.setVgap(20);
		flowLayout_3.setHgap(20);
		panel_10.setBackground(SystemColor.window);
		panel_11_3.add(panel_10);
		
		JLabel lblNewLabel_2_3 = new JLabel("Email");
		lblNewLabel_2_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2_3.setBackground(Color.WHITE);
		panel_10.add(lblNewLabel_2_3);
		
		JPanel panel_12_3 = new JPanel();
		panel_12_3.setBackground(Color.WHITE);
		panel_7_3.add(panel_12_3);
		panel_12_3.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 0));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.WHITE);
		panel_12_3.add(panel_1_3);
		panel_1_3.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setDropMode(DropMode.ON);
		textField_2.setColumns(18);
		textField_2.setBackground(Color.LIGHT_GRAY);
		panel_1_3.add(textField_2);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_2.add(panel_6, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("Tìm ");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_6.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		panel_6.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		panel_6.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("New button");
		panel_6.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("New button");
		panel_6.add(btnNewButton_4);

		JPanel panel_3 = new JPanel();
		pn_CacChucNang.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		table = new JTable();
		panel_3.add(table);

		JPanel pnShow_tableKhachHang = new JPanel();
		container.add(pnShow_tableKhachHang);

		table_1 = new JTable();
		table_1.setBorder(new LineBorder(SystemColor.menuText, 2));

		
		table_1.setFont(new Font("Arial", Font.PLAIN, 12));
		pnShow_tableKhachHang.add(table_1);

	}
}
