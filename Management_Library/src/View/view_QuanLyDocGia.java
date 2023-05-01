package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controler.controler_quanlydocgia;

public class view_QuanLyDocGia extends JPanel {

	private JTextField tfMaDocGia;
	private JTextField tfDiaChi;
	private JTextField tfTEnDocGia;
	private JTextField tfSDT;

	private JButton bt_tim;
	private JButton bt_them;
	private JButton bt_sua;
	private JButton bt_xoa;

	public view_QuanLyDocGia() {
		// TODO Auto-generated constructor stub
		this.init();
		
		controler_quanlydocgia ac_qldg = new controler_quanlydocgia(this);
		bt_tim.addActionListener(ac_qldg);
		bt_them.addActionListener(ac_qldg);
		bt_sua.addActionListener(ac_qldg);
		bt_xoa.addActionListener(ac_qldg);
		
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setLayout(new BorderLayout());

		JPanel pn_input = createPn_input();
		JPanel pn = new JPanel();
		FlowLayout fl = new FlowLayout();
		fl.setHgap(40);
		pn.setLayout(fl);
		pn.add(pn_input);

		this.add(pn, BorderLayout.NORTH);
		JPanel pn_show = createPn_show();
		this.add(pn_show, BorderLayout.SOUTH);

	}

	private JPanel createPn_input() {
		JPanel pn_result = new JPanel();
		pn_result.setLayout(new GridLayout(1, 2));
		JPanel pn_left = new JPanel();
		pn_left.setLayout(new BoxLayout(pn_left, BoxLayout.Y_AXIS));

		JPanel pn_ip = new JPanel();
		BoxLayout b = new BoxLayout(pn_ip, BoxLayout.Y_AXIS);
		pn_ip.add(Box.createRigidArea(new Dimension(0, 40)));
		pn_ip.setLayout(b);

		GridLayout grLayout = new GridLayout(1, 2);
		grLayout.setHgap(50);

		JPanel pn1 = new JPanel();
		pn1.setLayout(grLayout);
		pn1.add(new JLabel("Mã Đọc Giả"));
		pn1.add(new JLabel("Địa Chỉ"));

		pn_ip.add(pn1);
		pn_ip.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel pn2 = new JPanel();
		pn2.setLayout(grLayout);
		tfMaDocGia = new JTextField();
		tfDiaChi = new JTextField();
		tfMaDocGia.setPreferredSize(new Dimension(300, 40));
		tfDiaChi.setPreferredSize(new Dimension(300, 40));

		pn2.add(tfMaDocGia);
		pn2.add(tfDiaChi);
		pn_ip.add(pn2);
		pn_ip.add(Box.createRigidArea(new Dimension(0, 20)));

		JPanel pn3 = new JPanel();
		pn3.setLayout(grLayout);
		pn3.add(new JLabel("Tên Đọc Giả"));
		pn3.add(new JLabel("Số điện thoại"));
		pn_ip.add(pn3);
		pn_ip.add(Box.createRigidArea(new Dimension(0, 10)));

		JPanel pn4 = new JPanel();
		pn4.setLayout(grLayout);
		tfTEnDocGia = new JTextField();
		tfSDT = new JTextField();
		tfTEnDocGia.setPreferredSize(new Dimension(300, 40));
		tfSDT.setPreferredSize(new Dimension(300, 40));
		pn4.add(tfTEnDocGia);
		pn4.add(tfSDT);
		pn_ip.add(pn4);
		pn_ip.add(Box.createRigidArea(new Dimension(0, 20)));

		JPanel pn_bt = new JPanel();
		pn_bt.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 30));
		bt_tim = new JButton("Find");
		pn_bt.add(bt_tim);

		bt_them = new JButton("Add");
		pn_bt.add(bt_them);

		bt_sua = new JButton("Fix");
		pn_bt.add(bt_sua);

		bt_xoa = new JButton("Delete");
		pn_bt.add(bt_xoa);

		pn_left.add(pn_ip);
		pn_left.add(pn_bt);

		JPanel pn_null = createPn_null();
		pn_result.add(pn_left);
		pn_result.add(pn_null);
		return pn_result;
	}

	private JPanel createPn_null() {
		JPanel pn_result = new JPanel();
		pn_result.setLayout(new BorderLayout());
		JPanel pn = new JPanel();

		pn.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));

		JLabel lb = new JLabel("số sách đang mượn");
		pn.add(lb);
		pn_result.add(pn, BorderLayout.NORTH);

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Mã Sách");
		model.addColumn("Tên Sách");
		model.addColumn("Số Lượng Sách");

		model.addRow(new Object[] { "", "", "" });
		model.addRow(new Object[] { "", "", "" });

		model.addRow(new Object[] { "", "", "" });
		model.addRow(new Object[] { "", "", "" });

		JTable tb = new JTable(model);

		tb.getColumnModel().getColumn(0).setPreferredWidth(50);
		tb.getColumnModel().getColumn(1).setPreferredWidth(100);
		tb.getColumnModel().getColumn(2).setPreferredWidth(50);

		JScrollPane scoll = new JScrollPane(tb);
		scoll.setPreferredSize(new Dimension(200, 200));
		pn_result.add(scoll, BorderLayout.CENTER);
		return pn_result;
	}

	private JPanel createPn_show() {
		JPanel pn_result = new JPanel();
		pn_result.setPreferredSize(new Dimension(200, 300));
		pn_result.setLayout(new BorderLayout());
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Mã Đọc Giả");
		model.addColumn("Tên Đọc Giả");
		model.addColumn("Số điện thoại");
		model.addColumn("Địa Chỉ");

		model.addRow(new Object[] { "1", "1", "", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "", "1", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "", "1", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "1", "", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "", "1", "1" });
		model.addRow(new Object[] { "1", "1", "", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "", "1", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "", "1", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "1", "", "" });
		model.addRow(new Object[] { "", "", "", "" });
		model.addRow(new Object[] { "", "", "1", "1" });
		JTable tb = new JTable(model);

		tb.getColumnModel().getColumn(0).setPreferredWidth(150);
		tb.getColumnModel().getColumn(1).setPreferredWidth(100);
		tb.getColumnModel().getColumn(2).setPreferredWidth(300);
		tb.getColumnModel().getColumn(3).setPreferredWidth(500);

		JScrollPane scrollPane = new JScrollPane(tb);
		pn_result.add(scrollPane, BorderLayout.CENTER);
		return pn_result;
	}

	
	public void tim_docGia() {
		// TODO Auto-generated method stub
		tfMaDocGia.setText("dang lam");
	}

	public void them_docGia() {
		// TODO Auto-generated method stub
		tfMaDocGia.setText("dang lam");
	}

	public void xoa_docGia() {
		// TODO Auto-generated method stub
		tfMaDocGia.setText("dang lam");
	}

	public void sua_docGia() {
		// TODO Auto-generated method stub
		tfMaDocGia.setText("dang lam");
	}

}
