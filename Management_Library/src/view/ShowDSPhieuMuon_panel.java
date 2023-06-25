package view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import model.Observable;
import model.Observer;

public class ShowDSPhieuMuon_panel extends JPanel implements Observer {

	private DefaultTableModel tbModelPhieuNhap;
	private JTable tbSachMuon;

	public ShowDSPhieuMuon_panel() {
		// TODO Auto-generated constructor stub
		JPanel pnTren_Phai = new JPanel();
		pnTren_Phai.setLayout(new GridLayout(0, 1, 0, 0));

		String[] tenCot = { "Mã Phiếu Nhập", "Tên Phiếu Nhập", "Ngày Thành Lập" };
		Object[][] giaTriHang = {};

		tbModelPhieuNhap = new DefaultTableModel(giaTriHang, tenCot) {
			boolean[] columnEditables = new boolean[] { false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		};
		tbSachMuon = new JTable();
		tbSachMuon.setModel(tbModelPhieuNhap);
		// không cho thay đổi thứ tự cột trong jtable
		tbSachMuon.getTableHeader().setReorderingAllowed(false);
		tbSachMuon.setColumnSelectionAllowed(true);
		tbSachMuon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tbSachMuon.setFont(new Font("Arial", Font.PLAIN, 15));

		JScrollPane scrollPane = new JScrollPane(tbSachMuon);

		pnTren_Phai.add(scrollPane);
		this.add(pnTren_Phai);
	}

	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub

	}
}
