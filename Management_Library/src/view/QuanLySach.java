package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.border.Border;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.QLSachController;
import model.Observable;
import model.Observer;
import model.QLSach;
import model.Sach;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.BorderFactory;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class QuanLySach extends JPanel implements Observer {

	public JPanel contentPane;
	public JTextField txtTimKiem;
	public JTextField txtTenSach;
	public JTextField txtTacGia;
	public JTextField txtNXB;
	public JTextField txtSL;
	public JTextField txtGia;
	public DefaultTableModel model;
	public JTextField txtId;
	public JTextField txtTheLoai;
	ActionListener actionListener;
	public ArrayList<Object> values;

	public QuanLySach() {
		this.actionListener = new QLSachController(new QLSach(), this);
//		setTitle("Quản lý sách");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 619);
		setVisible(true);
		setLayout(new BorderLayout(0, 0));

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contentPane);
		contentPane.setLayout(null);

		// tieu de
		JLabel lbl_tieuDe = new JLabel("QUẢN LÝ SÁCH");
		lbl_tieuDe.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lbl_tieuDe.setBounds(364, 10, 142, 39);
		contentPane.add(lbl_tieuDe);

		Border bdTimKiem = BorderFactory.createLineBorder(Color.GRAY);
		Border bdMid = BorderFactory.createLineBorder(Color.GRAY);
		Border bdBot = BorderFactory.createLineBorder(Color.GRAY);

		model = new DefaultTableModel();
		model.addColumn("STT");
		model.addColumn("ID");
		model.addColumn("Tên Sách");
		model.addColumn("Thể loại");
		model.addColumn("Tác Giả");
		model.addColumn("Nhà Xuất Bản");
		model.addColumn("Số lượng nhập kho");
		model.addColumn("Số lượng cho mượn");
		model.addColumn("Số lượng còn lại");
		model.addColumn("Giá");
		model.setRowCount(0);

		// tim kiem
		JPanel panel_timKiem = new JPanel();
		panel_timKiem.setBounds(18, 51, 846, 68);
		contentPane.add(panel_timKiem);
		panel_timKiem.setLayout(null);
		panel_timKiem.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Tìm kiếm",
				TitledBorder.LEFT, TitledBorder.TOP, null, UIManager.getColor("Button.darkShadow")));

		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(160, 23, 450, 29);
		panel_timKiem.add(txtTimKiem);
		txtTimKiem.setColumns(10);

		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		btnNewButton.setBounds(620, 23, 85, 31);
		panel_timKiem.add(btnNewButton);

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
					setValuesToInputs(values);
				}
			}
		});
		JScrollPane scrollPane = new JScrollPane(bookTable);
		scrollPane.setBounds(18, 345, 846, 197);
		contentPane.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		bookTable.setModel(model);

		// danh sach
		JPanel panel_1 = new JPanel();
		scrollPane.setRowHeaderView(panel_1);
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Danh sách", TitledBorder.LEFT,
				TitledBorder.TOP, null, UIManager.getColor("Button.darkShadow")));
		panel_1.setLayout(null);

		// thao tac
		JPanel panel = new JPanel();
		panel.setBounds(18, 129, 846, 206);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128)), "Thao tác", TitledBorder.LEFT,
				TitledBorder.TOP, null, UIManager.getColor("Button.darkShadow")));

		JLabel lblTenSach = new JLabel("Tên sách:");
		lblTenSach.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTenSach.setBounds(117, 58, 61, 22);
		panel.add(lblTenSach);

		txtTenSach = new JTextField();
		txtTenSach.setBounds(212, 60, 191, 22);
		panel.add(txtTenSach);
		txtTenSach.setColumns(10);

		JLabel lblTacGia = new JLabel("Tác giả:");
		lblTacGia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTacGia.setBounds(117, 90, 52, 22);
		panel.add(lblTacGia);

		txtTacGia = new JTextField();
		txtTacGia.setBounds(212, 92, 191, 22);
		panel.add(txtTacGia);
		txtTacGia.setColumns(10);

		JLabel lblNhaXuatBan = new JLabel("Nhà xuất bản:");
		lblNhaXuatBan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhaXuatBan.setBounds(459, 30, 85, 13);
		panel.add(lblNhaXuatBan);

		txtNXB = new JTextField();
		txtNXB.setColumns(10);
		txtNXB.setBounds(554, 27, 191, 22);
		panel.add(txtNXB);

		JLabel lblSoLuong = new JLabel("Số lượng:");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSoLuong.setBounds(459, 61, 61, 16);
		panel.add(lblSoLuong);

		txtSL = new JTextField();
		txtSL.setColumns(10);
		txtSL.setBounds(554, 60, 191, 22);
		panel.add(txtSL);

		JLabel lblGia = new JLabel("Giá:");
		lblGia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGia.setBounds(459, 95, 45, 13);
		panel.add(lblGia);

		txtGia = new JTextField();
		txtGia.setColumns(10);
		txtGia.setBounds(554, 92, 191, 22);
		panel.add(txtGia);

		JButton btnCapNhat = new JButton("Lưu thay đổi");
		btnCapNhat.addActionListener(actionListener);
		btnCapNhat.setBounds(381, 163, 117, 29);
		panel.add(btnCapNhat);

		JButton btnThemSach = new JButton("Thêm sách");
		btnThemSach.setBounds(260, 163, 109, 29);
		panel.add(btnThemSach);
		btnThemSach.addActionListener(actionListener);

		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblId.setBounds(117, 30, 45, 13);
		panel.add(lblId);

		txtId = new JTextField();
		txtId.setBounds(212, 27, 191, 22);
		panel.add(txtId);
		txtId.setColumns(10);

		JLabel lblTheLoai = new JLabel("Thể loại:");
		lblTheLoai.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTheLoai.setBounds(117, 127, 61, 13);
		panel.add(lblTheLoai);

		txtTheLoai = new JTextField();
		txtTheLoai.setBounds(212, 124, 191, 22);
		panel.add(txtTheLoai);
		txtTheLoai.setColumns(10);

		JButton btnXa = new JButton("Xóa");
		btnXa.addActionListener(actionListener);

		btnXa.setBounds(508, 163, 109, 29);
		panel.add(btnXa);

	}

	public void displaySach(List<Sach> list) {
		int stt = 0;
		model.setRowCount(0);
		for (Sach s : list) {
			stt++;

			model.addRow(new Object[] { stt, s.getiD(), s.getTen(), s.getTheLoai(), s.getTacGia(), s.getNhaXuatBan(),
					s.getSoLuongNhapKho(), s.getSoLuongChoMuon(), s.getSoLuongNhapKho() - s.getSoLuongChoMuon(),
					s.getGiaSach(),

			});

		}
	}

	private void setValuesToInputs(ArrayList<Object> values) {
		txtId.setText(values.get(0).toString());
		txtTenSach.setText(values.get(1).toString());
		txtTacGia.setText(values.get(3).toString());
		txtTheLoai.setText(values.get(2).toString());
		txtNXB.setText(values.get(4).toString());
		txtSL.setText(values.get(5).toString());
		txtGia.setText(values.get(8).toString());
		// Các ô input khác tương tự
	}

//	public void setMenuBar(JMenuBar menuBar) {
//	   setJMenuBar(menuBar);
//	}
	@Override
	public void update(Observable observable) {
		if (observable instanceof QLSach) {
			displaySach(((QLSach) observable).getListSach());
			System.out.println();
		}

	}

}
