package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dao.KhachHangData;
import model.KhachHang;
import model.QLKhachHang;
import view.KhachHangPanel;

public class QuanLyKhachHang_controller implements ActionListener {
	private KhachHangPanel view;
	private QLKhachHang model;
	private String showChucNang;
	private KhachHangData data;
	
	public QuanLyKhachHang_controller(KhachHangPanel viewkh, QLKhachHang qlkh) {
		this.model = qlkh;
		this.view = viewkh;
		showChucNang = "";
		run();
		initObserver();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Tìm")) {
			tim();
			resetTim();
		} else if (e.getActionCommand().equals("Thêm")) {
			them();
		} else if (e.getActionCommand().equals("Cập nhật")) {
			capNhat();
		} else if (e.getActionCommand().equals("Xóa")) {
			xoa();
		} else if (e.getActionCommand().equals("Xem Ds Độc Giả")) {
			System.out.println(e.getActionCommand());
			XemDSDocGia();
		}
	}

	/*
	 * các Chức năng chính
	 */
	public void tim() {
		showChucNang = "Tìm";
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Tìm")) {

			if (!this.view.getTfMaDocGia().getText().equals("")) {
				String s = this.view.getTfMaDocGia().getText().trim();
				List<Object> find = model.timKiemTheoID(s);
				List<KhachHang> result = chuyenDoiDanhSach(find);
				System.out.println("tìm theo id" + s + " result:" + result.toString());
				if (result.size() == 1) {
					ShowDSKhachHang(result);
				} else {
					JOptionPane.showMessageDialog(view, "Không tìm thấy Đọc Giả có ID: \n\t\t" + s, "Lỗi",
							JOptionPane.ERROR_MESSAGE);
				}

			} else if (!this.view.getTfTenDocGia().getText().equals("")) {
				String s = this.view.getTfTenDocGia().getText().trim();
				List<Object> find = model.timKiemTheoTen(s);
				List<KhachHang> result = chuyenDoiDanhSach(find);
				System.out.println("tìm theo ten" + s + " result:" + result.toString());
				if (result.size() >= 1) {
					ShowDSKhachHang(result);
				} else {
					JOptionPane.showMessageDialog(view, "Không tìm thấy Đọc Giả có tên: \n\t\t" + s, "Lỗi",
							JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(view, "Vui lòng nhập ID hoặc Tên Đọc Giả", "Lỗi",
						JOptionPane.ERROR_MESSAGE);
			}
		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
	}

	public void them() {
		showChucNang = "Thêm";
		String id = this.model.createID("");
		System.out.println(showChucNang);
		// chuc nang hien tai co phai them hay khong
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Thêm")) {
			// tao id moi cho kh

			String ten = this.view.getTfTenDocGia().getText();
			String sdt = this.view.getTfSoDienThoai().getText();
			String email = this.view.getTfEmail().getText();

			// khach hang phai co ten moi dc them vao
			if (!ten.equals("")) {
				KhachHang kh = new KhachHang(id, ten, sdt, email);
				model.them(kh);
				JOptionPane.showMessageDialog(view, "Thêm Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(view, "Thêm không Thành Công", "Lỗi", JOptionPane.ERROR_MESSAGE);

			}

		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);

		}
		resetThem(id);
	}

	private void capNhat() {
		showChucNang = "Cập Nhật";
		System.out.println(showChucNang);
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Cập Nhật")) {

			String id = this.view.getTfMaDocGia().getText();
			String name = this.view.getTfTenDocGia().getText();
			String sdt = this.view.getTfSoDienThoai().getText();
			String email = this.view.getTfEmail().getText();

			model.capNhat(id + "name:" + name + "sdt:" + sdt + "email:" + email);
			JOptionPane.showMessageDialog(view, "Cập nhật Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
		resetCapNhat();
	}

	private void xoa() {
		showChucNang = "Xóa";
		System.out.println(showChucNang);
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Xóa")) {
			//
			if (this.view.getTfMaDocGia().getText().isEmpty()) {
				JOptionPane.showMessageDialog(view, "Vui lòng chọn đọc giả cần xóa hoặc \n nhập id Đọc giả cần xóa",
						"Lỗi", JOptionPane.ERROR_MESSAGE);
			} else {
				String str = view.getTfMaDocGia().getText();
				model.xoa(str);
				JOptionPane.showMessageDialog(view, "Xóa Thành Công", "Thông Báo", JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
		resetXoa();
	}

	private void XemDSDocGia() {
		showChucNang = "Xem Ds Độc Giả";
		System.out.println(showChucNang);
		ShowDSKhachHang(model.getListKhachHang());
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Xem Ds Độc Giả")) {
			//

		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
	}

	/*
	 * reset view
	 */
	private void resetTim() {
		this.view.reresetTim();
	}

	private void resetThem(String id) {
		this.view.resetThem(id);

	}

	private void resetCapNhat() {
		this.view.resetCapNhat();
	}

	private void resetXoa() {
		this.view.resetXoa();
	}

	/*
	 * hàm hổ trợ
	 */
	private List<KhachHang> chuyenDoiDanhSach(List<Object> input) {
		if (input == null) {
			return null;
		}
		List<KhachHang> result = new ArrayList<>();
		for (Object obj : input) {
			if (obj instanceof KhachHang) {
				result.add((KhachHang) obj);
			}
		}
		return result;
	}

	public void ShowDSKhachHang(List<KhachHang> dsKhachHang) {
		clearTableKhachHang();
		this.view.ShowDSKhachHang(dsKhachHang);
	}

	// xoa toan bo hang trong bang
	public void clearTableKhachHang() {
		this.view.clearTableKhachHang();
	}

	// dang ky observer
	public void initObserver() {
		model.addObserver(view);
	}

	// chay dau tien khi run app
	public void run() {
		// them action
		this.view.getBtTim().addActionListener(this);
		this.view.getBtThem().addActionListener(this);
		this.view.getBtXoa().addActionListener(this);
		this.view.getBtCapNhat().addActionListener(this);
		this.view.getBtXemDSDocGia().addActionListener(this);
		
		this.loadData();
		
		this.view.getTbDocGia().getSelectionModel().addListSelectionListener(selectionListener());
		ShowDSKhachHang(model.getListKhachHang());
	}

	private void loadData() {
		// TODO Auto-generated method stub
		model.loadData(data.listKH);
	}

	private ListSelectionListener selectionListener() {
		ListSelectionListener result = new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (showChucNang.equals("Cập Nhật") || showChucNang.equals("Xóa")) {
					if (!e.getValueIsAdjusting()) {
						int selectedRow = view.getTbDocGia().getSelectedRow();
						if (selectedRow != -1) {
							Object id = view.getTbDocGia().getValueAt(selectedRow, 0);
							Object name = view.getTbDocGia().getValueAt(selectedRow, 1);
							Object sdt = view.getTbDocGia().getValueAt(selectedRow, 2);
							Object email = view.getTbDocGia().getValueAt(selectedRow, 3);

							view.getTfMaDocGia().setText((String) id);
							view.getTfTenDocGia().setText((String) name);
							view.getTfSoDienThoai().setText((String) sdt);
							view.getTfEmail().setText((String) email);
						}
					}

				}
			}
		};
		return result;
	}

}
