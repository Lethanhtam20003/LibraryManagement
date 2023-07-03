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
		case "Tìm kiếm":
			List<Object> id1 = model.timKiemTheoID(view.txtTimKiem.getText());
			List<Object> ten = model.timKiemTheoTen(view.txtTimKiem.getText());
			ArrayList<Sach> listTen = convertObjectToName(ten);
			ArrayList<Sach> list = convertObjectToSach(id1);
			ArrayList<Sach> listAll = new ArrayList<Sach>();
			listAll.addAll(list);
			listAll.addAll(listTen);

			if (listAll.isEmpty()) {
				JOptionPane.showMessageDialog(view, "Không tìm thấy thông tin của sách");
			} else {
				view.displaySach(listAll);
			}
			break;
		case "Lưu thay đổi":
			String id_cn = view.txtId.getText();
			String ten_cn = view.txtTenSach.getText();
			String tentg_cn = view.txtTacGia.getText();
			String nhaxb_cn = view.txtNXB.getText();
			int soluong_cn = Integer.parseInt(view.txtSL.getText());
			String theloai_cn = view.txtTheLoai.getText();
			double gia_cn = Double.parseDouble(view.txtGia.getText());
			
			model.capNhat(id_cn, ten_cn, theloai_cn, nhaxb_cn, tentg_cn, soluong_cn, gia_cn);
			model.notifyChanged();
			view.values = null;
			JOptionPane.showMessageDialog(null, "Cập nhật sách thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
			break;

		default:
			break;
		}
	}
	private ArrayList<Sach> convertObjectToName(List<Object> timKiemTheoTen) {
		// TODO Auto-generated method stub
		ArrayList<Sach> result = new ArrayList<Sach>();
		for (Object o : timKiemTheoTen) {
			result.add((Sach) o);
		}
		return result;
	}

	private ArrayList<Sach> convertObjectToSach(List<Object> timKiemTheoID) {
		// TODO Auto-generated method stub
		ArrayList<Sach> result = new ArrayList<Sach>();
		for (Object o : timKiemTheoID) {
			result.add((Sach) o);
		}
		return result;
	}


	public void initObservers() {
		ArrayList<Observer> observerView = new ArrayList<>();

		observerView.add((Observer) this.view);
		for (Observer view : observerView) {
			model.add(view);
		}
	}

}
