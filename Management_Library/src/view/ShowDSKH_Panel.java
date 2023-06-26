package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.KhachHang;
import model.Observable;
import model.Observer;

public class ShowDSKH_Panel extends JPanel implements Observer {

	private DefaultTableModel tbModelKhachHang;
	private JTable tbDocGia;

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

	public ShowDSKH_Panel() {
		// TODO Auto-generated constructor stub
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

		tbDocGia.setFont(new Font("Arial", Font.PLAIN, 13));
		JScrollPane scrollPane = new JScrollPane((tbDocGia));
		pnDuoi.add(scrollPane);
		this.add(pnDuoi);
	}

	public DefaultTableModel ShowDSKhachHang(List<KhachHang> dsKH) {
		DefaultTableModel result = tbModelKhachHang;

		if (dsKH != null) {
			System.out.println(dsKH.toString());
			for (KhachHang g : dsKH) {
				Object[] a = { g.getiD(), g.getTen(), g.getSoDT(), g.getDiaChi() };
				result.addRow(a);
			}
		}

		tbDocGia.setModel(result);
		return result;
	}

	public void clearTableKhachHang() {
		tbModelKhachHang.setRowCount(0);
	}

	@Override
	public void update(Observable observable) {
		// TODO Auto-generated method stub

	}

}
