package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


import model.Observable;
import model.Observer;

public class KhachHangPanel extends JPanel implements  Observer {
	ActionListener ac;

	private JTextField tfMaDocGia;
	private JTextField tfSoDienThoai;
	private JTextField tfEmail;
	private JLabel lbShow_ChucNangDangThucHien;
	private JButton btTim;
	private JButton btThem;
	private JButton btCapNhat;
	private JButton btXoa;
	private JButton btXem;
	private JTextField tfTenDocGia;
	private JButton btXemDSDocGia;
	private ShowDSKH_Panel pnDuoi;
	private JLabel lbShow_ChuThich;

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

	public JTextField getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(JTextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	public JLabel getLbShow_ChucNangDangThucHien() {
		return lbShow_ChucNangDangThucHien;
	}

	public void setLbShow_ChucNangDangThucHien(JLabel lbShow_ChucNangDangThucHien) {
		this.lbShow_ChucNangDangThucHien = lbShow_ChucNangDangThucHien;
	}

	public JButton getBtTim() {
		return btTim;
	}

	public void setBtTim(JButton btTim) {
		this.btTim = btTim;
	}

	public JButton getBtThem() {
		return btThem;
	}

	public void setBtThem(JButton btThem) {
		this.btThem = btThem;
	}

	public JButton getBtCapNhat() {
		return btCapNhat;
	}

	public void setBtCapNhat(JButton btCapNhat) {
		this.btCapNhat = btCapNhat;
	}

	public JButton getBtXoa() {
		return btXoa;
	}

	public void setBtXoa(JButton btXoa) {
		this.btXoa = btXoa;
	}

	public JButton getBtXem() {
		return btXem;
	}

	public void setBtXem(JButton btXem) {
		this.btXem = btXem;
	}

	public JButton getBtHienThiDS() {
		return btXemDSDocGia;
	}

	public void setBtHienThiDS(JButton btHienThiDS) {
		this.btXemDSDocGia = btHienThiDS;
	}

	public JTextField getTfTenDocGia() {
		return tfTenDocGia;
	}

	public void setTfTenDocGia(JTextField tfTenDocGia) {
		this.tfTenDocGia = tfTenDocGia;
	}

	public ShowDSKH_Panel getPnDuoi() {
		return pnDuoi;
	}

	public void setPnDuoi(ShowDSKH_Panel pnDuoi) {
		this.pnDuoi = pnDuoi;
	}


	public JButton getBtXemDSDocGia() {
		return btXemDSDocGia;
	}

	public void setBtXemDSDocGia(JButton btXemDSDocGia) {
		this.btXemDSDocGia = btXemDSDocGia;
	}

	public JLabel getLbShow_ChuThich() {
		return lbShow_ChuThich;
	}

	public void setLbShow_ChuThich(JLabel lbShow_ChuThich) {
		this.lbShow_ChuThich = lbShow_ChuThich;
	}

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
		pnTren.setLayout(new GridLayout(0, 1, 20, 40));
//          
		JPanel pnTren_Trai = createPanelTren_trai();

		// add pn
		pnTren.add(pnTren_Trai);

		pnDuoi = new ShowDSKH_Panel();
		pnDuoi.setLayout(new GridLayout());
		// add pn
		container.add(pnTren);
		container.add(pnDuoi);

		init();
	}

	// init khởi tạo cách giá trị bắt đầu
	public void init() {
		// TODO Auto-generated method stub
		this.lbShow_ChucNangDangThucHien.setText("Tìm");
		tfSoDienThoai.setEditable(false);
		tfEmail.setEditable(false);

		//
		tfMaDocGia.setText("");
		tfTenDocGia.setText("");
		tfSoDienThoai.setText("");
		tfEmail.setText("");
		lbShow_ChuThich.setText("nhập id hoặc nhập tên độc giả");

	}

	private JPanel createPanelTren_trai() {
		// TODO Auto-generated method stub
		JPanel pnTren_Trai = new JPanel();
		pnTren_Trai.setBackground(SystemColor.textHighlightText);
		pnTren_Trai.setLayout(new BorderLayout(20, 20));

		JPanel pnTren_Trai_ShowChucNang = new JPanel();
		pnTren_Trai_ShowChucNang.setBackground(SystemColor.window);
		pnTren_Trai.add(pnTren_Trai_ShowChucNang, BorderLayout.NORTH);
		pnTren_Trai_ShowChucNang.setLayout(new GridLayout(2, 2, 10, 10));

		JLabel lblNewLabel = new JLabel("Chức Năng:  ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		pnTren_Trai_ShowChucNang.add(lblNewLabel);

		lbShow_ChucNangDangThucHien = new JLabel();
		lbShow_ChucNangDangThucHien.setBackground(Color.LIGHT_GRAY);
		// change
		lbShow_ChucNangDangThucHien.setPreferredSize(new Dimension(100, 22));
		lbShow_ChucNangDangThucHien.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		lbShow_ChucNangDangThucHien.setForeground(Color.BLACK);
		lbShow_ChucNangDangThucHien.setLabelFor(lbShow_ChucNangDangThucHien);
		lbShow_ChucNangDangThucHien.setFont(new Font("Arial", Font.PLAIN, 18));
		pnTren_Trai_ShowChucNang.add(lbShow_ChucNangDangThucHien);

		JLabel lblChThch = new JLabel("Chú Thích:   ");
		lblChThch.setHorizontalAlignment(SwingConstants.TRAILING);
		lblChThch.setFont(new Font("Arial", Font.PLAIN, 18));
		pnTren_Trai_ShowChucNang.add(lblChThch);

		lbShow_ChuThich = new JLabel();
		lbShow_ChuThich.setPreferredSize(new Dimension(100, 22));
		lbShow_ChuThich.setForeground(Color.BLACK);
		lbShow_ChuThich.setFont(new Font("Arial", Font.PLAIN, 18));
		lbShow_ChuThich.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbShow_ChuThich.setBackground(Color.LIGHT_GRAY);
		pnTren_Trai_ShowChucNang.add(lbShow_ChuThich);

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

		JLabel lblNewLabel_2 = new JLabel("Mã Độc Giả ");
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
		tfMaDocGia.setColumns(40);
		tfMaDocGia.setBackground(Color.WHITE);
		panel_1.add(tfMaDocGia);

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
		panel_9.setBackground(SystemColor.window);
		panel_11_2.add(panel_9);

		JLabel lblNewLabel_2_2 = new JLabel("Tên Độc Giả");
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

		tfTenDocGia = new JTextField();
		tfTenDocGia.setHorizontalAlignment(SwingConstants.LEFT);
		tfTenDocGia.setForeground(Color.BLACK);
		tfTenDocGia.setFont(new Font("Arial", Font.PLAIN, 14));
		tfTenDocGia.setColumns(40);
		panel_1_2.add(tfTenDocGia);

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
		tfSoDienThoai.setHorizontalAlignment(SwingConstants.LEFT);
		tfSoDienThoai.setForeground(Color.BLACK);
		tfSoDienThoai.setFont(new Font("Arial", Font.PLAIN, 14));

		tfSoDienThoai.setColumns(40);
		tfSoDienThoai.setBackground(Color.LIGHT_GRAY);
		panel_1_1.add(tfSoDienThoai);

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
		tfEmail.setHorizontalAlignment(SwingConstants.LEFT);
		tfEmail.setForeground(Color.BLACK);
		tfEmail.setFont(new Font("Arial", Font.PLAIN, 14));

		tfEmail.setColumns(40);
		tfEmail.setBackground(Color.LIGHT_GRAY);
		panel_1_3.add(tfEmail);

		JPanel pnTren_trai_chuaButton = new JPanel();
		pnTren_trai_chuaButton.setBackground(Color.WHITE);
		pnTren_Trai.add(pnTren_trai_chuaButton, BorderLayout.SOUTH);
		pnTren_trai_chuaButton.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setHgap(35);
		pnTren_trai_chuaButton.add(panel_2);

		btTim = new JButton("Tìm");
		btTim.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btTim);

		btThem = new JButton("Thêm");
		btThem.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btThem);

		btCapNhat = new JButton("Cập nhật");
		btCapNhat.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btCapNhat);

		btXoa = new JButton("Xóa");
		btXoa.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btXoa);

		btXem = new JButton("Xem Phiếu Mượn");
		btXem.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btXem);

		btXemDSDocGia = new JButton("Xem Ds Độc Giả");

		btXemDSDocGia.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btXemDSDocGia);

		return pnTren_Trai;
	}

	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub
	}


}

//	private JPanel createPanelTren_phai() {
//		// TODO Auto-generated method stub
//		JPanel pnTren_Phai = new JPanel();
//		pnTren_Phai.setLayout(new GridLayout(0, 1, 0, 0));
//
//		String[] tenCot = { "Mã Phiếu Nhập", "Tên Phiếu Nhập", "Ngày Thành Lập" };
//		Object[][] giaTriHang = {};
//
//		tbModelPhieuNhap = new DefaultTableModel(giaTriHang, tenCot) {
//			boolean[] columnEditables = new boolean[] { false, false, false, false };
//
//			public boolean isCellEditable(int row, int column) {
//				return columnEditables[column];
//			}
//		};
//		tbSachMuon = new JTable();
//		tbSachMuon.setModel(tbModelPhieuNhap);
//		// không cho thay đổi thứ tự cột trong jtable
//		tbSachMuon.getTableHeader().setReorderingAllowed(false);
//		tbSachMuon.setColumnSelectionAllowed(true);
//		tbSachMuon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		tbSachMuon.setFont(new Font("Arial", Font.PLAIN, 15));
//
//		JScrollPane scrollPane = new JScrollPane(tbSachMuon);
//
//		pnTren_Phai.add(scrollPane);
//		return pnTren_Phai;
//	}

//	private JPanel createPanelDuoi() {
//		// TODO Auto-generated method stub
//		JPanel pnDuoi = new JPanel();
//		pnDuoi.setLayout(new GridLayout(1, 1, 10, 10));
//
//		String[] tenCot = { "Mã Đọc Giả", "Tên Đọc Giả", "Số Điện Thoại", "Địa Chỉ Email" };
//		Object[][] giaTriHang = {};
//
//		tbModelKhachHang = new DefaultTableModel(giaTriHang, tenCot) {
//			boolean[] columnEditables = new boolean[] { false, false, false, false };
//
//			public boolean isCellEditable(int row, int column) {
//				return columnEditables[column];
//			}
//		};
//
//		tbDocGia = new JTable();
//		// không cho thay đổi thứ tự cột trong jtable
//		tbDocGia.getTableHeader().setReorderingAllowed(false);
//		tbDocGia.setModel(tbModelKhachHang);
//
//		tbDocGia.setFont(new Font("Arial", Font.PLAIN, 13));
//		JScrollPane scrollPane = new JScrollPane((tbDocGia));
//		pnDuoi.add(scrollPane);
//
//		return pnDuoi;
//	}