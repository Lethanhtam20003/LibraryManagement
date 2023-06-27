package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import model.KhachHang;
import model.QLKhachHang;
import view.KhachHangPanel;

public class QuanLyKhachHang_controller implements ActionListener {
	private KhachHangPanel view;
	private QLKhachHang model;
	private String showChucNang;
	private String dicription;

	public QuanLyKhachHang_controller(KhachHangPanel viewkh, QLKhachHang qlkh) {
		this.model = qlkh;
		this.view = viewkh;
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

	public void tim() {
		showChucNang = "Tìm";
		dicription = "nhập id hoặc nhập tên độc giả";
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Tìm")) {

			if (!this.view.getTfMaDocGia().getText().equals("")) {
				String s = this.view.getTfMaDocGia().getText().trim();
				List<Object> find = model.timKiemTheoID(s);
				List<KhachHang> result = chuyenDoiDanhSach(find);
				System.out.println("tìm theo id" + s + " result:" + result.toString());
				if (result.size() == 1) {
					ShowDSKhachHang(result);
					dicription = "tìm thành công";
					showDicription(dicription);
				}

			} else if (!this.view.getTfTenDocGia().getText().equals("")) {
				String s = this.view.getTfTenDocGia().getText().trim();
				List<Object> find = model.timKiemTheoTen(s);
				List<KhachHang> result = chuyenDoiDanhSach(find);
				System.out.println("tìm theo ten" + s + " result:" + result.toString());
				if (result.size() == 1) {
					ShowDSKhachHang(result);
					dicription = "tìm thành công";
					showDicription(dicription);
				}
			} else {

				dicription = "tìm không thành công";
				showDicription(dicription);
			}
		} else {
			showDicription(dicription);
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
	}

	private void showDicription(String dicription2) {
		this.view.getLbShow_ChuThich().setText(dicription2);
	}

	public void them() {
		showChucNang = "Thêm";
		dicription = "nhập thông tin độc giả";
		showDicription(dicription);
		System.out.println(showChucNang);
		// chuc nang hien tai co phai them hay khong
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Thêm")) {
			// tao id moi cho kh
			String id = this.model.createID(model.getListKhachHang().get(model.getListKhachHang().size() - 1).getiD());

			String ten = this.view.getTfTenDocGia().getText();
			String sdt = this.view.getTfSoDienThoai().getText();
			String email = this.view.getTfEmail().getText();

			// khach hang phai co ten moi dc them vao
			if (!ten.equals("")) {
				KhachHang kh = new KhachHang(id, ten, sdt, email);
				model.them(kh);
				// XemDSDocGia();
				dicription = "Thêm thanh công";
				showDicription(dicription);
			}

		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
			showDicription(dicription);

		}
		resetThem();
	}

	private void xoa() {
		showChucNang = "Xóa";
		System.out.println(showChucNang);
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Xóa")) {
			//
			String str = view.getTfMaDocGia().getText();
			model.xoa(str);

		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
		resetXoa();
	}

	private void resetXoa() {
		view.getTfMaDocGia().setEditable(true);
		view.getTfMaDocGia().setText("");
		view.getTfTenDocGia().setBackground(Color.white);

		view.getTfTenDocGia().setEditable(false);
		view.getTfEmail().setEditable(false);
		view.getTfSoDienThoai().setEditable(false);

		view.getTfTenDocGia().setBackground(Color.LIGHT_GRAY);
		view.getTfEmail().setBackground(Color.LIGHT_GRAY);
		view.getTfSoDienThoai().setBackground(Color.LIGHT_GRAY);

	}

	private void capNhat() {
		showChucNang = "Cập Nhật";
		System.out.println(showChucNang);
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("")) {
			//

		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
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

	private void resetTim() {
		this.view.getTfMaDocGia().setText("");
		this.view.getTfTenDocGia().setText("");
		this.view.getTfSoDienThoai().setText("");
		this.view.getTfEmail().setText("");

		this.view.getTfMaDocGia().setEditable(true);
		this.view.getTfTenDocGia().setEditable(true);
		this.view.getTfSoDienThoai().setEditable(false);
		this.view.getTfEmail().setEditable(false);

		this.view.getTfMaDocGia().setBackground(Color.white);
		this.view.getTfTenDocGia().setBackground(Color.white);
		this.view.getTfSoDienThoai().setBackground(Color.LIGHT_GRAY);
		this.view.getTfEmail().setBackground(Color.LIGHT_GRAY);
	}

	private void resetThem() {
		this.view.getTfMaDocGia().setEditable(false);
		this.view.getTfMaDocGia().setBackground(Color.LIGHT_GRAY);

		this.view.getTfTenDocGia().setEditable(true);
		this.view.getTfTenDocGia().setBackground(Color.white);
		this.view.getTfTenDocGia().setText("");

		this.view.getTfEmail().setEditable(true);
		this.view.getTfEmail().setBackground(Color.white);
		this.view.getTfEmail().setText("");

		this.view.getTfSoDienThoai().setEditable(true);
		this.view.getTfSoDienThoai().setBackground(Color.white);
		this.view.getTfSoDienThoai().setText("");

		String id = this.model.createID(model.getListKhachHang().get(model.getListKhachHang().size() - 1).getiD());
		this.view.getTfMaDocGia().setText(id);

	}

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
		this.view.getPnDuoi().ShowDSKhachHang(dsKhachHang);
	}

	// xoa toan bo hang trong bang
	public void clearTableKhachHang() {
		this.view.getPnDuoi().clearTableKhachHang();
	}

	// dang ky observer
	public void initObserver() {
		model.addObserver(view);
		model.addObserver(view.getPnDuoi());
	}

	// chay dau tien khi run app
	public void run() {

		// them action
		this.view.getBtTim().addActionListener(this);
		this.view.getBtThem().addActionListener(this);
		this.view.getBtXoa().addActionListener(this);
		this.view.getBtCapNhat().addActionListener(this);
		this.view.getBtXem().addActionListener(this);
		this.view.getBtHienThiDS().addActionListener(this);

		ShowDSKhachHang(model.getListKhachHang());
	}

}