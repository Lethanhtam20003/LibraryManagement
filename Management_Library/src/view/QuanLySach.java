package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controller.QLSachController;
import model.QLSach;
import model.Sach;

import javax.swing.JTextField;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class QuanLySach{
	public JFrame frame;
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
	
 	
	public QuanLySach() {
		this.actionListener = new QLSachController(new QLSach(), this);
		frame = new JFrame("Quản lý sách");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setBounds(100, 100, 900, 671);
		frame.setSize(900, 600);
		frame.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 64, 886, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ SÁCH");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		lblNewLabel.setBounds(360, 15, 142, 39);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 333, 886, 301);
		contentPane.add(panel_1);
				panel_1.setLayout(null);
				
				
		
		txtTimKiem = new JTextField();
		txtTimKiem.setBounds(159, 27, 450, 29);
		panel.add(txtTimKiem);
		txtTimKiem.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(634, 26, 85, 31);
		panel.add(btnNewButton);
		
		JLabel lblTenSach = new JLabel("Tên sách:");
		lblTenSach.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTenSach.setBounds(117, 127, 61, 22);
		panel.add(lblTenSach);
		
		txtTenSach = new JTextField();
		txtTenSach.setBounds(212, 125, 191, 22);
		panel.add(txtTenSach);
		txtTenSach.setColumns(10);
		
		JLabel lblTacGia = new JLabel("Tác giả:");
		lblTacGia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTacGia.setBounds(117, 161, 52, 22);
		panel.add(lblTacGia);
		
		txtTacGia = new JTextField();
		txtTacGia.setBounds(212, 163, 191, 22);
		panel.add(txtTacGia);
		txtTacGia.setColumns(10);
		
		JLabel lblNhaXuatBan = new JLabel("Nhà xuất bản:");
		lblNhaXuatBan.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNhaXuatBan.setBounds(459, 89, 85, 13);
		panel.add(lblNhaXuatBan);
		
		txtNXB = new JTextField();
		txtNXB.setColumns(10);
		txtNXB.setBounds(554, 86, 191, 22);
		panel.add(txtNXB);
		
		JLabel lblSoLuong = new JLabel("Số lượng:");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSoLuong.setBounds(459, 130, 61, 16);
		panel.add(lblSoLuong);
		
		txtSL = new JTextField();
		txtSL.setColumns(10);
		txtSL.setBounds(554, 129, 191, 22);
		panel.add(txtSL);
		
		JLabel lblGia = new JLabel("Giá:");
		lblGia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGia.setBounds(459, 170, 45, 13);
		panel.add(lblGia);
		
		txtGia = new JTextField();
		txtGia.setColumns(10);
		txtGia.setBounds(554, 167, 191, 22);
		panel.add(txtGia);
		
		JButton btnCapNhat = new JButton("Lưu thay đổi");
		btnCapNhat.setBounds(319, 228, 117, 29);
		panel.add(btnCapNhat);
		
		JButton btnThemSach = new JButton("Thêm sách");
		btnThemSach.setBounds(446, 228, 96, 29);
		panel.add(btnThemSach);
		btnThemSach.addActionListener(actionListener);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblId.setBounds(117, 93, 45, 13);
		panel.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(212, 87, 191, 22);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblTheLoai = new JLabel("Thể loại:");
		lblTheLoai.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTheLoai.setBounds(117, 203, 61, 13);
		panel.add(lblTheLoai);
		
		txtTheLoai = new JTextField();
		txtTheLoai.setBounds(212, 199, 191, 22);
		panel.add(txtTheLoai);
		txtTheLoai.setColumns(10);
		
		//tao bang
				JTable bookTable = new JTable() {
					 @Override
			            public boolean isCellEditable(int row, int column) {
			                return false; // Không cho phép chỉnh sửa trực tiếp trên bảng
			            }
				};
				JScrollPane scrollPane = new JScrollPane(bookTable);
				scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
				

				panel_1.add(scrollPane);
//				model = new DefaultTableModel() {
//		            @Override
//		            public Class<?> getColumnClass(int columnIndex) {
//		                if (columnIndex == 9) {
//		                    return JPanel.class; // Cột "Chức năng" sẽ chứa JPanel
//		                }
//		                return super.getColumnClass(columnIndex);
//		            }
//		        };
				
				model = new DefaultTableModel();
				model.addColumn("STT");
				model.addColumn("ID");
				model.addColumn("Tên Sách");
				model.addColumn("Tác Giả");
				model.addColumn("Nhà Xuất Bản");
				model.addColumn("Số lượng nhập kho");
				model.addColumn("Số lượng cho mượn");
				model.addColumn("Số lượng còn lại");
				model.addColumn("Giá");
				model.addColumn("Chức năng");
				model.setRowCount(0);
				
				bookTable.setModel(model);
				

				scrollPane.setBounds(0, 0, 886, 234);
				
				
	}
	public void displaySach(List<Sach> list) {
		int stt = 0;
		model.setRowCount(0);
		for(Sach s : list) {
			stt++;
//			JButton xoaButton = new JButton("Xóa");
//            JButton capNhatButton = new JButton("Cập nhật");
//
//            JPanel panel_2 = new JPanel();
//            panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
//            panel_2.add(xoaButton);
//            panel_2.add(capNhatButton);
//			
			
			model.addRow(new Object[] {
				stt,
				s.getiD(),
				s.getTen(),
				s.getTacGia(),
				s.getNhaXuatBan(),
				s.getSoLuongNhapKho(),
				s.getSoLuongChoMuon(),
				s.getSoLuongNhapKho()-s.getSoLuongChoMuon(),
				s.getGiaSach(),
				
			});
		}
	}
}
