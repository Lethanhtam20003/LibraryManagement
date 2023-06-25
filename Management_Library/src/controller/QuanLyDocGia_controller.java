package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import model.KhachHang;
import model.QuanLyThuVien;
import view.KhachHangPanel;
import view.View;

public class QuanLyDocGia_controller extends Controller implements ActionListener {

	private String showChucNang;

	public QuanLyDocGia_controller(KhachHangPanel view, QuanLyThuVien model) {
		super(view, model);
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("Tìm")) {

		} else if (e.getActionCommand().equals("Thêm")) {

			them();
		} else if (e.getActionCommand().equals("Cập nhật")) {

		} else if (e.getActionCommand().equals("Xóa")) {

		} else if (e.getActionCommand().equals("Xem Phiếu Mượn")) {

		}
	}

	public void tim() {
		showChucNang = "Tìm";
		if (((KhachHangPanel) this.view).getLbShow_ChucNangDangThucHien().getText().equals("Tìm")) {
			if (((KhachHangPanel) this.view).getTfMaDocGia().getText() != "") {
				String s = ((KhachHangPanel) this.view).getTfMaDocGia().getText();
				Object result = model.timKiemTheoID(s);
			}
			if (((KhachHangPanel) this.view).getTf_TenDocGia().getText() != "") {
				String s = ((KhachHangPanel) this.view).getTf_TenDocGia().getText();
				List<Object> result = model.timKiemTheoTen(s);
			}
		} else {
			((KhachHangPanel) this.view).getLbShow_ChucNangDangThucHien().setText(showChucNang);
		}
	}

	public void them() {
		showChucNang = "Thêm";
		if (((KhachHangPanel) this.view).getLbShow_ChucNangDangThucHien().getText().equals("Thêm")) {
			String id = ((KhachHangPanel) this.view).getTfMaDocGia().getText();
			String ten = ((KhachHangPanel) this.view).getTf_TenDocGia().getText();
			String sdt = ((KhachHangPanel) this.view).getTfSoDienThoai().getText();
			String email = ((KhachHangPanel) this.view).getTfEmail().getText();

			KhachHang kh = new KhachHang(id, ten, sdt, email);

			model.them(kh);
			((KhachHangPanel) this.view).getTbDocGia().setModel(new DefaultTableModel(
					new Object[][] { { id, ten, sdt, email }, { null, null, null, null }, { null, null, null, null },
							{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
							{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
							{ null, null, null, null }, { null, null, null, null }, { null, null, null, null },
							{ null, null, null, null }, { null, null, null, null }, },
					new String[] { "M\u00E3 \u0110\u1ECDc Gi\u1EA3", "T\u00EAn \u0110\u1ECDc Gi\u00E3",
							"\u0110\u1ECBa Ch\u1EC9", "S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i" }));

		} else {
			((KhachHangPanel) this.view).getLbShow_ChucNangDangThucHien().setText(showChucNang);

			((KhachHangPanel) this.view).getTf_TenDocGia().setEditable(true);
			((KhachHangPanel) this.view).getTf_TenDocGia().setBackground(Color.white);

			((KhachHangPanel) this.view).getTfEmail().setEditable(true);
			((KhachHangPanel) this.view).getTfEmail().setBackground(Color.white);

			((KhachHangPanel) this.view).getTfSoDienThoai().setEditable(true);
			((KhachHangPanel) this.view).getTfSoDienThoai().setBackground(Color.white);
		}
	}
}
