package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Observer;
import model.PhieuMuon;
import model.QLPhieuMuonTra;
import view.ViewQLPhieuMuon;



	public class QLPhieuMuonController implements ActionListener {
		private QLPhieuMuonTra model;
		private ViewQLPhieuMuon view;
		private String chucNang;

		public QLPhieuMuonController(QLPhieuMuonTra model, ViewQLPhieuMuon view) {
			super();
			this.model = model;
			this.view = view;
			chucNang = "";
			start();
			initObservers();
		}
		
		public void start() {
//			if( view.btnTimPhieu != null || view.btnThemPhieu != null ||  view.btnXoaPhieu != null || view.btnCapNhat != null) {
				view.btnDSPhieu.addActionListener(this);
				view.btnTimPhieu.addActionListener(this);
				view.btnThemPhieu.addActionListener(this);		
				view.btnXoaPhieu.addActionListener(this);
				view.btnCapNhat.addActionListener(this);
//				view.displayPhieu(model.getListPhieuMuon());
//			}
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
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			switch(e.getActionCommand()) {
				case "Danh sách phiếu":
				view.displayPhieu(model.getListPhieuMuon());
				break;
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
					break;
								
				case "Cập nhật phiếu":
					if(view.values == null) {
						JOptionPane.showMessageDialog(null, "Chưa chọn phiếu cần cập nhật", "Thông báo", JOptionPane.ERROR_MESSAGE);
						return;
					}
					String id = view.txtID.getText();
					String maKH = view.txtKH.getText();
					String[] mang = view.txtSach.getText().split(",");
					List<String> tenSach = new ArrayList<>();
					for(String string: mang) {
						tenSach.add(string);
					}
					String ngayMuon = view.txtNgayMuon.getText();
					String ngayTra = view.txtNgayTra.getText();				
					model.capNhat(id, maKH,PhieuMuon.tinhTienMuonSach(tenSach) , ngayMuon, ngayTra, tenSach);
					reset();
					view.values = null;
					JOptionPane.showMessageDialog(null, "Cập nhật phiếu mượn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					break;
			}
		}
	}


