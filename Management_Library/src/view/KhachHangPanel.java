package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

import model.KhachHang;
import model.Observable;
import model.Observer;
import model.PhieuMuon;
import model.QLKhachHang;

public class KhachHangPanel extends JPanel implements Observer {

	/**
	 * 
	 */
	private JTextField tfMaDocGia;
	private JTextField tfSoDienThoai;
	private JTextField tfEmail;
	private JTextField tfTenDocGia;
	private JButton btTim;
	private JButton btThem;
	private JButton btCapNhat;
	private JButton btXoa;
	private JButton btXemDSDocGia;
	private JButton btnXemPhieuMuon;
	private JPanel pnDuoi;
	private JLabel lbShow_ChucNangDangThucHien;
	private JPanel pnPhieuMuon;
	private JTable tbPhieuMuon;
	private JTable tbDocGia;
	private DefaultTableModel tbModelKhachHang;
	private DefaultTableModel tbModelPhieuMuon;

	// getter and setter

	/**
	 * Create the panel.
	 */
	public KhachHangPanel() {
		this.setSize(new Dimension(938, 736));
		setLayout(new BorderLayout(0, 0));

		JPanel container = new JPanel();
		container.setBackground(SystemColor.window);
		add(container, BorderLayout.CENTER);
		container.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel pnTren = new JPanel();
		pnTren.setBackground(SystemColor.window);
		pnTren.setLayout(new GridLayout(0, 1, 20, 40));
//          
		JPanel pnTren_Trai = createPanelTren_trai();

		// add pn
		pnTren.add(pnTren_Trai);

		pnDuoi = createPnDuoi();
		pnDuoi.setLayout(new GridLayout());
		// add pn
		container.add(pnTren);
		container.add(pnDuoi);
		pnPhieuMuon = createPnPhieuMuon();
		init();
	}

	// init khởi tạo cách giá trị bắt đầu
	public void init() {
		tfSoDienThoai.setEditable(false);
		tfEmail.setEditable(false);
		tfTenDocGia.setText("");
		tfSoDienThoai.setText("");
		tfEmail.setText("");

	}

	private JPanel createPanelTren_trai() {
		JPanel pnTren_Trai = new JPanel();
		pnTren_Trai.setBackground(SystemColor.textHighlightText);
		pnTren_Trai.setLayout(new BorderLayout(20, 0));

		JPanel pnTren_Trai_ShowChucNang = new JPanel();
		pnTren_Trai_ShowChucNang.setBackground(SystemColor.window);
		pnTren_Trai.add(pnTren_Trai_ShowChucNang, BorderLayout.NORTH);
		pnTren_Trai_ShowChucNang.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel panel_3 = new JPanel();
		pnTren_Trai_ShowChucNang.add(panel_3);

		JLabel lbTieuDe = new JLabel("Quản Lý Độc Giả");
		lbTieuDe.setHorizontalAlignment(SwingConstants.TRAILING);
		lbTieuDe.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_3.add(lbTieuDe);

		JPanel panel_3_1 = new JPanel();
		pnTren_Trai_ShowChucNang.add(panel_3_1);
		panel_3_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lbChucNang = new JLabel("Chức Năng:  ");
		lbChucNang.setHorizontalAlignment(SwingConstants.TRAILING);
		lbChucNang.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_3_1.add(lbChucNang);

		lbShow_ChucNangDangThucHien = new JLabel();
		lbShow_ChucNangDangThucHien.setText("Tìm");
		lbShow_ChucNangDangThucHien.setPreferredSize(new Dimension(100, 22));
		lbShow_ChucNangDangThucHien.setForeground(Color.BLACK);
		lbShow_ChucNangDangThucHien.setFont(new Font("Arial", Font.PLAIN, 18));
		lbShow_ChucNangDangThucHien.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbShow_ChucNangDangThucHien.setBackground(Color.LIGHT_GRAY);
		panel_3_1.add(lbShow_ChucNangDangThucHien);

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
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setHgap(10);
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

		// text field mã đọc giã
		tfMaDocGia = new JTextField();
		tfMaDocGia.setForeground(Color.BLACK);
		tfMaDocGia.setFont(new Font("Arial", Font.PLAIN, 14));
		tfMaDocGia.setHorizontalAlignment(SwingConstants.LEFT);
		tfMaDocGia.setColumns(35);
		tfMaDocGia.setPreferredSize(
				new Dimension((int) getPreferredSize().getWidth(), (int) getPreferredSize().getHeight() + 30));
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
		FlowLayout flowLayout_4 = (FlowLayout) panel_9.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		flowLayout_4.setHgap(10);
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
		tfTenDocGia.setColumns(35);
		tfTenDocGia.setPreferredSize(
				new Dimension((int) getPreferredSize().getWidth(), (int) getPreferredSize().getHeight() + 30));
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
		flowLayout_1.setHgap(10);
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
		tfSoDienThoai.setColumns(35);
		tfSoDienThoai.setPreferredSize(
				new Dimension((int) getPreferredSize().getWidth(), (int) getPreferredSize().getHeight() + 30));
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
		flowLayout_3.setHgap(10);
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
		tfEmail.setColumns(35);
		tfEmail.setPreferredSize(
				new Dimension((int) getPreferredSize().getWidth(), (int) getPreferredSize().getHeight() + 30));
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

		btXemDSDocGia = new JButton("Xem Ds Độc Giả");

		btXemDSDocGia.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btXemDSDocGia);

		btnXemPhieuMuon = new JButton("Xem Phiếu Mượn");
		btnXemPhieuMuon.setFont(new Font("Arial", Font.PLAIN, 15));
		panel_2.add(btnXemPhieuMuon);

		return pnTren_Trai;
	}

	private JPanel createPnDuoi() {
		// TODO Auto-generated method stub
		JPanel pnDuoi = new JPanel();
		pnDuoi.setLayout(new GridLayout(1, 1, 10, 10));

		String[] tenCot = { "Mã Đọc Giả", "Tên Đọc Giả", "Số Điện Thoại", "Địa Chỉ Email" };
		Object[][] giaTriHang = {};

		tbModelKhachHang = new DefaultTableModel(giaTriHang, tenCot) {
			boolean[] columnEditables = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		tbDocGia = new JTable();
		// không cho thay đổi thứ tự cột trong jtable
		tbDocGia.getTableHeader().setReorderingAllowed(false);
		tbDocGia.setModel(tbModelKhachHang);
		
		tbDocGia.getColumnModel().getColumn(0).setResizable(false);
		tbDocGia.getColumnModel().getColumn(1).setResizable(false);
		tbDocGia.getColumnModel().getColumn(2).setResizable(false);
		tbDocGia.getColumnModel().getColumn(3).setResizable(false);
		
		tbDocGia.setFont(new Font("Arial", Font.PLAIN, 13));
		JScrollPane scrollPane = new JScrollPane((tbDocGia));
		pnDuoi.add(scrollPane);
		return pnDuoi;
	}

	private JPanel createPnPhieuMuon() {
		// TODO Auto-generated method stub

		JPanel pnPhieuMuon = new JPanel();
		pnPhieuMuon.setLayout(new GridLayout(0, 1, 0, 0));

		String[] tenCot = { "Mã Phiếu Mượn", "Sách Mượn", "Tiền Mượn", "Ngày Mượn", "Ngày trả" };
		Object[][] giaTriHang = {};

		tbPhieuMuon = new JTable();
		
		tbModelPhieuMuon = new DefaultTableModel(giaTriHang, tenCot) {

			boolean[] columnEditables = new boolean[] { false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		tbPhieuMuon.setModel(tbModelPhieuMuon);
		tbPhieuMuon.getTableHeader().setReorderingAllowed(false);

		JScrollPane scrollPane = new JScrollPane(tbPhieuMuon);
		
		pnPhieuMuon.add(scrollPane);

		return pnPhieuMuon;
	}

	public void ShowDSKhachHang(List<KhachHang> dsKH) {
		DefaultTableModel result = tbModelKhachHang;

		if (dsKH != null) {
			for (KhachHang g : dsKH) {
				Object[] a = { g.getiD(), g.getTen(), g.getSoDT(), g.getDiaChi() };
				result.addRow(a);
			}
		}

		tbDocGia.setModel(result);
	}

	public void ShowPhieuMuon(List<PhieuMuon> dsPM, String idKhachHang) {
		
		DefaultTableModel result = tbModelPhieuMuon;
		tbModelPhieuMuon.setRowCount(0);
		if (dsPM != null) {
			for (PhieuMuon g : dsPM) {
				System.out.println(idKhachHang +" và "+g.getMaKhachHang()+idKhachHang.equalsIgnoreCase(g.getId()));
				if (idKhachHang.equalsIgnoreCase(g.getMaKhachHang())) {
					Object[] a = { g.getId(), g.getTenSachMuon(), g.getTienMuonSach(), g.getNgayMuon(),
							g.getNgayDuKienTra() };
					result.addRow(a);
				}
			}
		}
		tbPhieuMuon.setModel(result);
	}

	public void clearTableKhachHang() {
		tbModelKhachHang.setRowCount(0);
	}

	// update observer
	@Override
	public void update(Observable observable) {
		List<KhachHang> kh = ((QLKhachHang) observable).getListKhachHang();
		clearTableKhachHang();
		this.ShowDSKhachHang(kh);
	}

	/*
	 * reset sau khi su dung
	 */
	public void reresetTim() {
		this.getTfMaDocGia().setText("");
		this.getTfTenDocGia().setText("");
		this.getTfSoDienThoai().setText("");
		this.getTfEmail().setText("");

		this.getTfMaDocGia().setEditable(true);
		this.getTfTenDocGia().setEditable(true);
		this.getTfSoDienThoai().setEditable(false);
		this.getTfEmail().setEditable(false);

		this.getTfMaDocGia().setBackground(Color.white);
		this.getTfTenDocGia().setBackground(Color.white);
		this.getTfSoDienThoai().setBackground(Color.LIGHT_GRAY);
		this.getTfEmail().setBackground(Color.LIGHT_GRAY);
	}

	public void resetThem(String id) {
		this.getTfMaDocGia().setEditable(false);
		this.getTfMaDocGia().setBackground(Color.LIGHT_GRAY);

		this.getTfTenDocGia().setEditable(true);
		this.getTfTenDocGia().setBackground(Color.white);
		this.getTfTenDocGia().setText("");

		this.getTfEmail().setEditable(true);
		this.getTfEmail().setBackground(Color.white);
		this.getTfEmail().setText("");

		this.getTfSoDienThoai().setEditable(true);
		this.getTfSoDienThoai().setBackground(Color.white);
		this.getTfSoDienThoai().setText("");

		this.getTfMaDocGia().setText(id);

	}

	public void resetCapNhat() {
		this.getTfMaDocGia().setEditable(true);
		this.getTfMaDocGia().setBackground(Color.white);
		this.getTfMaDocGia().setText("");

		this.getTfTenDocGia().setEditable(true);
		this.getTfTenDocGia().setBackground(Color.white);
		this.getTfTenDocGia().setText("");

		this.getTfEmail().setEditable(true);
		this.getTfEmail().setBackground(Color.white);
		this.getTfEmail().setText("");

		this.getTfSoDienThoai().setEditable(true);
		this.getTfSoDienThoai().setBackground(Color.white);
		this.getTfSoDienThoai().setText("");

	}

	public void resetXoa() {
		this.getTfMaDocGia().setEditable(true);
		this.getTfMaDocGia().setText("");
		this.getTfMaDocGia().setBackground(Color.white);

		this.getTfTenDocGia().setText("");
		this.getTfEmail().setText("");
		this.getTfSoDienThoai().setText("");

		this.getTfTenDocGia().setEditable(false);
		this.getTfEmail().setEditable(false);
		this.getTfSoDienThoai().setEditable(false);

		this.getTfTenDocGia().setBackground(Color.LIGHT_GRAY);
		this.getTfEmail().setBackground(Color.LIGHT_GRAY);
		this.getTfSoDienThoai().setBackground(Color.LIGHT_GRAY);

	}

	/**
	 * getter and setter
	 */
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

	public JButton getBtXemDSDocGia() {
		return btXemDSDocGia;
	}

	public void setBtXemDSDocGia(JButton btXemDSDocGia) {
		this.btXemDSDocGia = btXemDSDocGia;
	}

	public JTextField getTfTenDocGia() {
		return tfTenDocGia;
	}

	public void setTfTenDocGia(JTextField tfTenDocGia) {
		this.tfTenDocGia = tfTenDocGia;
	}

	public DefaultTableModel getTbModelKhachHang() {
		return tbModelKhachHang;
	}

	public void setTbModelKhachHang(DefaultTableModel tbModelKhachHang) {
		this.tbModelKhachHang = tbModelKhachHang;
	}

	public JTable getTbDocGia() {
		return tbDocGia;
	}

	public void setTbDocGia(JTable tbDocGia) {
		this.tbDocGia = tbDocGia;
	}

	public JPanel getPnDuoi() {
		return pnDuoi;
	}

	public void setPnDuoi(JPanel pnDuoi) {
		this.pnDuoi = pnDuoi;
	}

	public JLabel getLbShow_ChucNangDangThucHien() {
		return lbShow_ChucNangDangThucHien;
	}

	public void setLbShow_ChucNangDangThucHien(JLabel lbShow_ChucNangDangThucHien) {
		this.lbShow_ChucNangDangThucHien = lbShow_ChucNangDangThucHien;
	}

	public JTable getTbPhieuMuon() {
		return tbPhieuMuon;
	}

	public void setTbPhieuMuon(JTable tbPhieuMuon) {
		this.tbPhieuMuon = tbPhieuMuon;
	}

	public JPanel getPnPhieuMuon() {
		return pnPhieuMuon;
	}

	public void setPnPhieuMuon(JPanel pnPhieuMuon) {
		this.pnPhieuMuon = pnPhieuMuon;
	}

	public JButton getBtnXemPhieuMuon() {
		return btnXemPhieuMuon;
	}

	public void setBtnXemPhieuMuon(JButton btnXemPhieuMuon) {
		this.btnXemPhieuMuon = btnXemPhieuMuon;
	}

}
