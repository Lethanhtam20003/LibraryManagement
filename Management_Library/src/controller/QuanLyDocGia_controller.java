package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.KhachHang;
import model.QLKhachHang;
import model.QuanLyThuVien;
import view.KhachHangPanel;
import view.ShowDSKH_Panel;

public class QuanLyDocGia_controller implements ActionListener {
	private KhachHangPanel view;
	private QLKhachHang model;
	private String showChucNang;

	public QuanLyDocGia_controller(KhachHangPanel viewkh, QLKhachHang qlkh) {
		this.model = qlkh;
		this.view = viewkh;
		run();
		initObserver();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Tìm")) {
			clearTableKhachHang();
			tim();
			resetTim();
		} else if (e.getActionCommand().equals("Thêm")) {
			clearTableKhachHang();
			them();
			resetThem();
		} else if (e.getActionCommand().equals("Cập nhật")) {
			capNhat();
		} else if (e.getActionCommand().equals("Xóa")) {
			xoa();
		} else if (e.getActionCommand().equals("Xem Phiếu Mượn")) {
			XemPhieuMuon();
		} else if (e.getActionCommand().equals("Xem Ds Độc Giả")) {
			XemDSDocGia();
		}
	}

	public void tim() {
		showChucNang = "Tìm";
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Tìm")) {

			if (!this.view.getTfMaDocGia().getText().equals("")) {
				String s = this.view.getTfMaDocGia().getText().trim();
				List<Object> find = model.timKiemTheoID(s);
				List<KhachHang> result = chuyenDoiDanhSach(find);
				System.out.println("tìm theo id" + s + " result:" + result.toString());
				ShowDSKhachHang(result);

			} else if (this.view.getTfTenDocGia().getText() != "") {
				String s = this.view.getTfTenDocGia().getText().trim();
				List<Object> result = model.timKiemTheoTen(s);
				List<KhachHang> r = chuyenDoiDanhSach(result);
				System.out.println("tìm theo ten" + s + " result:" + result.toString());
				if (r != null) {
					ShowDSKhachHang(r);
				}
			}

		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
			resetTim();
		}
	}

	public void them() {
		showChucNang = "Thêm";
		System.out.println(showChucNang);
		if (this.view.getLbShow_ChucNangDangThucHien().getText().equals("Thêm")) {

			String id = this.model.createID(model.getListKhachHang().get(model.getListKhachHang().size() - 1).getiD());

			String ten = this.view.getTfTenDocGia().getText();
			String sdt = this.view.getTfSoDienThoai().getText();
			String email = this.view.getTfEmail().getText();
			if (!ten.equals("")) {
				KhachHang kh = new KhachHang(id, ten, sdt, email);
				model.them(kh);
				XemDSDocGia();
			}

//			resetThem();

		} else {
			this.view.getLbShow_ChucNangDangThucHien().setText(showChucNang);
//			resetThem();

		}
	}

	private void xoa() {
		// TODO Auto-generated method stub
		showChucNang = "Xóa";
		System.out.println(showChucNang);
	}

	private void capNhat() {
		// TODO Auto-generated method stub
		showChucNang = "Cập Nhật";
		System.out.println(showChucNang);
	}

	private void XemPhieuMuon() {
		// TODO Auto-generated method stub
		showChucNang = "Xem Phiếu Mượn";
		System.out.println(showChucNang);
	}

	private void XemDSDocGia() {
		// TODO Auto-generated method stub
		ShowDSKhachHang(model.getListKhachHang());
	}

	private void resetTim() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
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
		// TODO
		this.view.getPnDuoi().ShowDSKhachHang(dsKhachHang);
	}

	public void clearTableKhachHang() {
		// TODO
		this.view.getPnDuoi().clearTableKhachHang();
		// this.view.clearTableKhachHang();
	}

	public void createShowDSPhieuMuon_panel() {

	}

	public void initObserver() {
		model.addObserver(view);
		model.addObserver(view.getPnDuoi());
		model.addObserver(view.getPnTren_Phai());
	}

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
