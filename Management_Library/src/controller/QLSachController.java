package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Observer;
import model.QLSach;
import model.Sach;
import view.QuanLySach;

public class QLSachController implements ActionListener {
	private QLSach model;
	private QuanLySach view;

	public QLSachController(QLSach model, QuanLySach view) {
		this.model = model;
		this.view = view;
		initObservers();
	}

	public void getSach() {
		List<Sach> listSach = model.getListSach();
		view.displaySach(listSach);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Thêm sách":
			String id = view.txtId.getText();
			String tenSach = view.txtTenSach.getText();
			String tacGia = view.txtTacGia.getText();
			String theLoai = view.txtTheLoai.getText();
			String nxb = view.txtNXB.getText();
			// Kiểm tra các trường nhập vào là null
			if (id.isEmpty() || tenSach.isEmpty() || tacGia.isEmpty() || theLoai.isEmpty() || nxb.isEmpty()
					|| view.txtSL.getText().isEmpty() || view.txtGia.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
				return;
			}

			int sl;
			double gia;
			try {
				sl = Integer.parseInt(view.txtSL.getText());
				gia = Double.parseDouble(view.txtGia.getText());
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Số lượng hoặc giá phải là số", "Lỗi", JOptionPane.ERROR_MESSAGE);
				return;
			}
			model.them(new Sach(id, tenSach, tacGia, theLoai, nxb, sl, 0, gia));

			view.txtId.setText("");
			view.txtTenSach.setText("");
			view.txtTacGia.setText("");
			view.txtTheLoai.setText("");
			view.txtNXB.setText("");
			view.txtSL.setText("");
			view.txtGia.setText("");
			model.notifyChanged();
			JOptionPane.showMessageDialog(null, "Thêm sách thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Xóa":
			if (view.values == null) {
				JOptionPane.showMessageDialog(null, "Chưa chọn sách cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
				return;
			}
			String idXoa = (String) view.values.get(0);
			System.out.println(idXoa);
			model.xoa(idXoa);
			view.txtId.setText("");
			view.txtTenSach.setText("");
			view.txtTacGia.setText("");
			view.txtTheLoai.setText("");
			view.txtNXB.setText("");
			view.txtSL.setText("");
			view.txtGia.setText("");
			model.notifyChanged();
			view.values = null;
			JOptionPane.showMessageDialog(null, "Xóa sách thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Lưu thay đổi":

		default:
			break;
		}
	}

	public void initObservers() {
		ArrayList<Observer> observerView = new ArrayList<>();

		observerView.add((Observer) this.view);
		for (Observer view : observerView) {
			model.add(view);
		}
	}

}
