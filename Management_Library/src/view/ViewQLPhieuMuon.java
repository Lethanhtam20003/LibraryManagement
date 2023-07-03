package view;

import model.QLPhieuMuonTra;
import model.Observable;
import model.Observer;
import model.PhieuMuon;
import controller.QLPhieuMuonController;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ViewQLPhieuMuon extends JPanel implements Observer {
	public JPanel contentPane;
	public JTextField txtID, txtKH,txtSach, txtNgayMuon, txtNgayTra, txtTinhTrang;
	public JButton btnTimPhieu, btnThemPhieu, btnXoaPhieu, btnCapNhat, btnThuPhieu;
	public DefaultTableModel model;
	public ActionListener actionListener;
	public ArrayList<Object> values;
	public JTable table;
	
	public ViewQLPhieuMuon() {
    	setSize(900, 700);
    	setVisible(true);
        setLayout(new BorderLayout());
        contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		add(contentPane);
		contentPane.setLayout(null);
		JLabel lbl_tieuDe = new JLabel("QUẢN LÝ MƯỢN TRẢ");
		lbl_tieuDe.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lbl_tieuDe.setBounds(364, 10, 142, 39);
		contentPane.add(lbl_tieuDe);

		model = new DefaultTableModel();
		model.addColumn("Mã phiếu");
		model.addColumn("Mã khách hàng");
		model.addColumn("Thông tin sách");
		model.addColumn("Tiền mượn sách");
		model.addColumn("Ngày mượn");
		model.addColumn("Ngày dự kiến trả");
		model.addColumn("Tình trạng");
//		model.setRowCount(0);
		
		table = new JTable() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; // Không cho phép chỉnh sửa trực tiếp trên bảng
			}
		};
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 1) { // Kiểm tra số lần click chuột
					int row = table.getSelectedRow(); // Lấy số thứ tự hàng được click
					values = new ArrayList<>();
					// Lặp qua các cột và lấy giá trị của mỗi cột
					for (int column = 0; column < table.getColumnCount(); column++) {
						Object value = table.getValueAt(row, column);
						values.add(value);
					}
					setValuesToInputs(values);
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(18, 290, 846, 197);
		contentPane.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		table.setModel(model);
	
		JPanel panel = new JPanel();
		panel.setBounds(18, 50, 846, 206);
		contentPane.add(panel);
		panel.setLayout(null);
				
		JLabel lblId = new JLabel("Mã phiếu:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblId.setBounds(117, 30, 100, 13);
		panel.add(lblId);

		txtID = new JTextField();
		txtID.setBounds(222, 27, 191, 22);
		panel.add(txtID);
		txtID.setColumns(10);

		JLabel lblKh = new JLabel("Mã khách hàng:");
		lblKh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblKh.setBounds(117, 58, 100, 22);
		panel.add(lblKh);

		txtKH = new JTextField();
		txtKH.setBounds(222, 60, 191, 22);
		panel.add(txtKH);
		txtKH.setColumns(10);

		JLabel lblSach = new JLabel("Tên sách mượn:");
		lblSach.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSach.setBounds(117, 90, 100, 22);
		panel.add(lblSach);

		txtSach = new JTextField();
		txtSach.setColumns(10);
		txtSach.setBounds(222, 92, 191, 22);
		panel.add(txtSach);

		JLabel lblNgayMuon = new JLabel("Ngày mượn:");
		lblNgayMuon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNgayMuon.setBounds(459, 30, 100, 13);
		panel.add(lblNgayMuon);

		txtNgayMuon = new JTextField();
		txtNgayMuon.setColumns(10);
		txtNgayMuon.setBounds(570, 27, 191, 22);
		panel.add(txtNgayMuon);
				
		JLabel lblNgayTra = new JLabel("Ngày dự kiến trả:");
		lblNgayTra.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNgayTra.setBounds(459, 61, 100, 16);
		panel.add(lblNgayTra);

		txtNgayTra = new JTextField();
		txtNgayTra.setColumns(10);
		txtNgayTra.setBounds(570, 60, 191, 22);
		panel.add(txtNgayTra);
		
		JLabel lblTinhTrang = new JLabel("Tình trạng:");
		lblTinhTrang.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTinhTrang.setBounds(459, 90, 100, 16);
		panel.add(lblTinhTrang);

		txtTinhTrang = new JTextField();
		txtTinhTrang.setColumns(10);
		txtTinhTrang.setBounds(570, 92, 191, 22);
		panel.add(txtTinhTrang);
		
		btnTimPhieu = new JButton("Tìm phiếu");
		btnTimPhieu.setBounds(165, 163, 117, 29);
		panel.add(btnTimPhieu);

		btnThemPhieu = new JButton("Thêm phiếu");
		btnThemPhieu.setBounds(287, 163, 109, 29);
		panel.add(btnThemPhieu);
				
		btnXoaPhieu = new JButton("Xóa phiếu");
		btnXoaPhieu.setBounds(401, 163, 109, 29);
		panel.add(btnXoaPhieu);
				
		btnCapNhat = new JButton("Cập nhật phiếu");
		btnCapNhat.setBounds(515, 163, 130, 29);
		panel.add(btnCapNhat);
		
		btnThuPhieu = new JButton("Thu phiếu");
		btnThuPhieu.setBounds(650, 163, 109, 29);
		panel.add(btnThuPhieu);
		
    }
				
    private void setValuesToInputs(ArrayList<Object> values) {
		txtID.setText(values.get(0).toString());
		txtKH.setText(values.get(1).toString());
		txtSach.setText(values.get(2).toString());
		txtNgayMuon.setText(values.get(4).toString());
		txtNgayTra.setText(values.get(5).toString());
		txtTinhTrang.setText(values.get(6).toString());
    }
    public void displayPhieu(List<PhieuMuon> list) {
    		model.setRowCount(0);
    		for(PhieuMuon p : list) {
    			model.addRow(new Object[] {p.getId(), p.getMaKhachHang(), String.join(", ", p.getTenSachMuon()), p.getTienMuonSach(), p.getNgayMuon(), p.getNgayDuKienTra(), p.getTinhTrang(),});
    		}
//    		table.setModel(model);
    }
    
	@Override
	public void update(Observable observable) {
		if (observable instanceof QLPhieuMuonTra) {
	        QLPhieuMuonTra qlPhieuMuonTra = (QLPhieuMuonTra) observable;
	        List<PhieuMuon> list = qlPhieuMuonTra.getListPhieuMuon();
	        displayPhieu(list);
	    }
	}
}