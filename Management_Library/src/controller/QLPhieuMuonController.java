package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.PhieuMuon;
import model.QLKhachHang;
import model.QLPhieuMuonTra;
import model.QLSach;
import model.Sach;
import view.ViewQLPhieuMuon;
import model.KhachHang;
import model.Observable;
import model.Observer;

public class QLPhieuMuonController implements ActionListener {
	private QLPhieuMuonTra model;
	private ViewQLPhieuMuon view;
	private String chucNang;
	private QLKhachHang qlKH;
	private QLSach qlSach;
	
	public QLPhieuMuonController(QLPhieuMuonTra model, ViewQLPhieuMuon view) {
		super();
		this.model = model;
		this.view = view;
		chucNang = "";
		start();
		initObservers();
		qlKH = new QLKhachHang();
		qlSach = new QLSach();
	}
	
	public void start() {	
			view.btnTimPhieu.addActionListener(this);
			view.btnThemPhieu.addActionListener(this);		
			view.btnXoaPhieu.addActionListener(this);
			view.btnCapNhat.addActionListener(this);
			view.btnThuPhieu.addActionListener(this);
			view.displayPhieu(model.getListPhieuMuon());
	}
	public void initObservers() {
		// TODO Auto-generated method stub
		ArrayList<Observer> observerView = new ArrayList<>();

		observerView.add((Observer) this.view);
		for (Observer view : observerView) {
			 model.add(view);
		}
	}
	public void reset() {
		view.txtID.setText("");
		view.txtKH.setText("");
		view.txtSach.setText("");
		view.txtNgayMuon.setText("");
		view.txtNgayTra.setText("");
		view.txtTinhTrang.setText("");
	}
	
	public boolean testInputMaKH(String idKhachHang) {
		for(KhachHang kh : qlKH.getListKhachHang()) {
			if(kh.getiD().equalsIgnoreCase(idKhachHang)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean testInputSach(List<String> sach) {
		for(Sach s : qlSach.getListSach()) {
			for(String tenSach : sach) {
				if(s.getTen().equalsIgnoreCase(tenSach)) {
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
			case "Tìm phiếu":
				
			case "Thêm phiếu":
			
			case "Xóa phiếu":
				if(view.values == null) {
					JOptionPane.showMessageDialog(null, "Chưa chọn phiếu cần xóa", "Thông báo", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String idXoa = (String) view.values.get(0);
				System.out.println(idXoa);
				model.xoa(idXoa);
				reset();
				view.values = null;
				JOptionPane.showMessageDialog(null, "Xóa phiếu mượn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				view.displayPhieu(model.getListPhieuMuon());
				break;
							
			case "Cập nhật phiếu":
				if(view.values == null) {
					JOptionPane.showMessageDialog(null, "Chưa chọn phiếu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else {
					String id = view.txtID.getText();
					String maKH = view.txtKH.getText();
					String[] mang = view.txtSach.getText().split(",");
					List<String> tenSach = new ArrayList<>();
					for(String string: mang) {
						tenSach.add(string);
					}
					String ngayMuon = view.txtNgayMuon.getText();
					String ngayTra = view.txtNgayTra.getText();		
					String tinhTrang = view.txtTinhTrang.getText();
					if(!testInputMaKH(maKH)) {
						JOptionPane.showMessageDialog(null, "Mã khách hàng không tồn tại ", "Thông báo", JOptionPane.ERROR_MESSAGE);
					}
					else if(!testInputSach(tenSach)) {
						JOptionPane.showMessageDialog(null, " Các sách mượn không tồn tại ", "Thông báo", JOptionPane.ERROR_MESSAGE);
					}
					else {					
						model.capNhat(id, maKH,PhieuMuon.tinhTienMuonSach(tenSach), ngayMuon, ngayTra, tenSach, tinhTrang);
						reset();
						view.values = null;
						JOptionPane.showMessageDialog(null, "Cập nhật phiếu mượn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
						view.displayPhieu(model.getListPhieuMuon());
					}
				}
				break;

			case "Thu phiếu" :
				if(view.values == null) {
					JOptionPane.showMessageDialog(null, "Chưa chọn phiếu cần thu", "Thông báo", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if(view.values.get(6).equals("Đã trả sách")) {
					JOptionPane.showMessageDialog(null, "Phiếu này đã được thu", "Thông báo", JOptionPane.ERROR_MESSAGE);
					
				}
				else {
				String idThu = (String) view.values.get(0);
				model.thuPhieu(idThu);
				reset();
				view.values = null;
				JOptionPane.showMessageDialog(null, "Thu phiếu mượn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				view.displayPhieu(model.getListPhieuMuon());
				}
				break;
			default:
				break;
		}
	}
}
