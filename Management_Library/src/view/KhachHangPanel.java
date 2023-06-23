package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import controller.Controller;
import controller.QuanLyDocGia_controller;
import model.QLKhachHang;
import model.ThuVien;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;

public class KhachHangPanel extends JPanel implements View {
	private ThuVien model = new QLKhachHang();
	Controller ac = new QuanLyDocGia_controller(this, model);
	private JTextField tfMaDocGia;
	private JTextField tfSoDienThoai;
	private JTextField tf_TenDocGia;
	private JTextField tfEmail;
	private JTable tbSachMuon;
	private JTable tbDocGia;
	private JLabel lbShow_ChucNangDangThucHien;
	private DefaultTableModel tbModelKhachHang;

	/**
	 * Create the panel.
	 */
	public KhachHangPanel() {
		setLayout(new BorderLayout(0, 0));

		JPanel container = new JPanel();
		container.setBackground(SystemColor.window);
		add(container, BorderLayout.CENTER);
		container.setLayout(new GridLayout(0, 1, 0, 20));

		JPanel pnTren = new JPanel();
		pnTren.setBackground(SystemColor.window);
		pnTren.setLayout(new GridLayout(0, 2, 20, 40));
//          
		JPanel pnTren_Trai = createPanelTren_trai();
//
		JPanel pnTren_Phai = createPanelTren_phai();
		// pnTren_Phai.setLayout(new GridLayout(0, 1, 0, 0));

		// add pn
		pnTren.add(pnTren_Trai);
		pnTren.add(pnTren_Phai);

		JPanel pnDuoi = createPanelDuoi();

		// add pn
		container.add(pnTren);
		container.add(pnDuoi);

	}

	private JPanel createPanelTren_trai() {
		// TODO Auto-generated method stub
		JPanel pnTren_Trai = new JPanel();
		pnTren_Trai.setBackground(SystemColor.textHighlightText);
		pnTren_Trai.setLayout(new BorderLayout(20, 20));

		JPanel pnTren_Trai_ShowChucNang = new JPanel();
		pnTren_Trai_ShowChucNang.setBackground(SystemColor.window);
		pnTren_Trai.add(pnTren_Trai_ShowChucNang, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Chức Năng Đang Thực Hiện: ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		pnTren_Trai_ShowChucNang.add(lblNewLabel);

		lbShow_ChucNangDangThucHien = new JLabel("");
		lbShow_ChucNangDangThucHien.setBackground(Color.LIGHT_GRAY);
		// change
		lbShow_ChucNangDangThucHien.setPreferredSize(new Dimension(100, 22));
		lbShow_ChucNangDangThucHien.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		lbShow_ChucNangDangThucHien.setForeground(Color.BLACK);
		lbShow_ChucNangDangThucHien.setLabelFor(lbShow_ChucNangDangThucHien);
		lbShow_ChucNangDangThucHien.setFont(new Font("Arial", Font.PLAIN, 18));
		pnTren_Trai_ShowChucNang.add(lbShow_ChucNangDangThucHien);

		JPanel pnTren_Trai_input = new JPanel();
		pnTren_Trai_input.setBackground(SystemColor.window);
		pnTren_Trai.add(pnTren_Trai_input, BorderLayout.CENTER);
		pnTren_Trai_input.setLayout(new GridLayout(0, 2, 20, 20));

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		pnTren_Trai_input.add(panel_7);
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

		tfMaDocGia = new JTextField();
		tfMaDocGia.setForeground(Color.BLACK);
		tfMaDocGia.setFont(new Font("Arial", Font.PLAIN, 14));
		tfMaDocGia.setHorizontalAlignment(SwingConstants.LEFT);
		tfMaDocGia.setColumns(18);
		tfMaDocGia.setBackground(Color.WHITE);
		panel_1.add(tfMaDocGia);

		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		pnTren_Trai_input.add(panel_7_1);
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

		tfSoDienThoai = new JTextField();
		tfSoDienThoai.setEditable(false);
		tfSoDienThoai.setHorizontalAlignment(SwingConstants.LEFT);
		tfSoDienThoai.setForeground(Color.BLACK);
		tfSoDienThoai.setFont(new Font("Arial", Font.PLAIN, 14));

		tfSoDienThoai.setColumns(18);
		tfSoDienThoai.setBackground(Color.LIGHT_GRAY);
		panel_1_1.add(tfSoDienThoai);

		JPanel panel_7_2 = new JPanel();
		panel_7_2.setBackground(Color.WHITE);
		pnTren_Trai_input.add(panel_7_2);
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

		tf_TenDocGia = new JTextField();
		tf_TenDocGia.setEditable(false);
		tf_TenDocGia.setHorizontalAlignment(SwingConstants.LEFT);
		tf_TenDocGia.setForeground(Color.BLACK);
		tf_TenDocGia.setFont(new Font("Arial", Font.PLAIN, 14));

		tf_TenDocGia.setColumns(18);
		tf_TenDocGia.setBackground(Color.LIGHT_GRAY);
		panel_1_2.add(tf_TenDocGia);

		JPanel panel_7_3 = new JPanel();
		panel_7_3.setBackground(Color.WHITE);
		pnTren_Trai_input.add(panel_7_3);
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

		tfEmail = new JTextField();
		tfEmail.setEditable(false);
		tfEmail.setHorizontalAlignment(SwingConstants.LEFT);
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 14));

		tfEmail.setColumns(18);
		tfEmail.setBackground(Color.LIGHT_GRAY);
		panel_1_3.add(tfEmail);

		JPanel pnTren_trai_chuaButton = new JPanel();
		pnTren_trai_chuaButton.setBackground(Color.WHITE);
		pnTren_Trai.add(pnTren_trai_chuaButton, BorderLayout.SOUTH);

		JButton btTim = new JButton("Tìm");
		btTim.addActionListener((ActionListener) ac);
		btTim.setFont(new Font("Arial", Font.PLAIN, 15));
		pnTren_trai_chuaButton.add(btTim);

		JButton btThem = new JButton("Thêm");
		btThem.addActionListener((ActionListener) ac);
		btThem.setFont(new Font("Arial", Font.PLAIN, 15));

		pnTren_trai_chuaButton.add(btThem);

		JButton btCapNhat = new JButton("Cập nhật");
		btCapNhat.addActionListener((ActionListener) ac);
		btCapNhat.setFont(new Font("Arial", Font.PLAIN, 15));
		pnTren_trai_chuaButton.add(btCapNhat);

		JButton btXoa = new JButton("Xóa");
		btXoa.addActionListener((ActionListener) ac);
		btXoa.setFont(new Font("Arial", Font.PLAIN, 15));
		pnTren_trai_chuaButton.add(btXoa);

		JButton btXem = new JButton("Xem Phiếu Mượn");
		btXem.addActionListener((ActionListener) ac);
		btXem.setFont(new Font("Arial", Font.PLAIN, 15));
		pnTren_trai_chuaButton.add(btXem);

		return pnTren_Trai;
	}

	private JPanel createPanelTren_phai() {
		// TODO Auto-generated method stub
		JPanel pnTren_Phai = new JPanel();
		pnTren_Phai.setLayout(new GridLayout(0, 1, 0, 0));

		tbSachMuon = new JTable();
		tbSachMuon.setColumnSelectionAllowed(true);
		tbSachMuon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbSachMuon.setBorder(new LineBorder(new Color(0, 0, 0)));
		tbSachMuon.setFont(new Font("Arial", Font.PLAIN, 15));
		tbSachMuon.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"M\u00E3 S\u00E1ch", "T\u00EAn S\u00E1ch", "S\u1ED1 l\u01B0\u1EE3ng"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tbSachMuon.getColumnModel().getColumn(0).setResizable(false);
		tbSachMuon.getColumnModel().getColumn(1).setResizable(false);
		tbSachMuon.getColumnModel().getColumn(2).setResizable(false);

		JScrollPane scrollPane = new JScrollPane(tbSachMuon);
		pnTren_Phai.add(scrollPane);

		return pnTren_Phai;
	}

	private JPanel createPanelDuoi() {
		// TODO Auto-generated method stub
		JPanel pnDuoi = new JPanel();
		pnDuoi.setLayout(new GridLayout(0, 1, 0, 0));

		String[] tenCot = {"Mã Đọc Giả","","",""};
		Object[][] giaTriHang = {{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
			{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, };
		tbDocGia = new JTable(giaTriHang,tenCot);
		tbDocGia.setBorder(new LineBorder(new Color(0, 0, 0)));

		tbDocGia.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3 \u0110\u1ECDc Gi\u1EA3", "", "", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tbDocGia.getColumnModel().getColumn(0).setResizable(false);
		tbDocGia.getColumnModel().getColumn(1).setResizable(false);
		tbDocGia.getColumnModel().getColumn(2).setResizable(false);
		tbDocGia.getColumnModel().getColumn(3).setResizable(false);

//				
//				new DefaultTableModel(
//						new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
//								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
//								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
//								{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
//								{ null, null, null, null }, { null, null, null, null }, },
//						new String[] { "M\u00E3 \u0110\u1ECDc Gi\u1EA3", "T\u00EAn \u0110\u1ECDc Gi\u00E3",
//								"\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i" }));
				tbDocGia.setFont(new Font("Arial", Font.PLAIN, 13));
		JScrollPane scrollPane = new JScrollPane((tbDocGia));
		pnDuoi.add(scrollPane);

		return pnDuoi;
	}

	// getter and setter
	public JTextField getTfMaDocGia() {
		return tfMaDocGia;
	}

	public void setTfMaDocGia(JTextField tfMaDocGia) {
		this.tfMaDocGia = tfMaDocGia;
	}

	public JTextField getTfSoDienThoai() {
		return tfSoDienThoai;
	}

	public void setTfSoDienThoai(JTextField tfSoDienThoai) {
		this.tfSoDienThoai = tfSoDienThoai;
	}

	public JTextField getTf_TenDocGia() {
		return tf_TenDocGia;
	}

	public void setTf_TenDocGia(JTextField tf_TenDocGia) {
		this.tf_TenDocGia = tf_TenDocGia;
	}

	public JTextField getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	public JTable getTbSachMuon() {
		return tbSachMuon;
	}

	public void setTbSachMuon(JTable tbSachMuon) {
		this.tbSachMuon = tbSachMuon;
	}

	public JTable getTbDocGia() {
		return tbDocGia;
	}

	public void setTbDocGia(JTable tbDocGia) {
		this.tbDocGia = tbDocGia;
	}

	public JLabel getLbShow_ChucNangDangThucHien() {
		return lbShow_ChucNangDangThucHien;
	}

	public void setLbShow_ChucNangDangThucHien(JLabel lbShow_ChucNangDangThucHien) {
		this.lbShow_ChucNangDangThucHien = lbShow_ChucNangDangThucHien;
	}

	public DefaultTableModel getTbModelKhachHang() {
		return tbModelKhachHang;
	}

	public void setTbModelKhachHang(DefaultTableModel tbModelKhachHang) {
		this.tbModelKhachHang = tbModelKhachHang;
	}

	public ThuVien getModel() {
		return model;
	}

	public void setModel(ThuVien model) {
		this.model = model;
	}

	public Controller getAc() {
		return ac;
	}

	public void setAc(Controller ac) {
		this.ac = ac;
	}

}
