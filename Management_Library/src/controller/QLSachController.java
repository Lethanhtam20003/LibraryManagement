package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Observable;
import model.Observer;
import model.QLSach;
import model.QuanLyThuVien;
import model.Sach;
import view.QuanLySach;


public class QLSachController extends Controller implements ActionListener{

	    public QLSachController(QuanLyThuVien model, QuanLySach view) {
	    	super(view, model);
	        this.view = view;
	        initObservers();
	    }

	    public void getSach() {
	        List<Sach> listSach = ((QLSach) model).getListSach();
	        ((QuanLySach) this.view).displaySach(listSach);
	    }
	    
	   
	    @Override
		public void actionPerformed(ActionEvent e) {
	    	switch (e.getActionCommand()) {
			case "Thêm sách":
				String id = ((QuanLySach) this.view).txtId.getText();
				String tenSach =((QuanLySach) this.view).txtTenSach.getText();
				String tacGia =((QuanLySach) this.view).txtTacGia.getText();
				String theLoai = ((QuanLySach) this.view).txtTheLoai.getText();
				String nxb =((QuanLySach) this.view).txtNXB.getText();
				// Kiểm tra các trường nhập vào là null
		        
				
				if (id.isEmpty() || tenSach.isEmpty() || tacGia.isEmpty() || theLoai.isEmpty() || nxb.isEmpty() || ((QuanLySach) this.view).txtSL.getText().isEmpty() || ((QuanLySach) this.view).txtGia.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
				 
				int sl;
				double gia;
				try {
					sl =Integer.parseInt(((QuanLySach) this.view).txtSL.getText());
					gia = Double.parseDouble(((QuanLySach) this.view).txtGia.getText());
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Số lượng hoặc giá phải là số", "Lỗi", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
				model.them(new Sach(id,tenSach,tacGia,theLoai,nxb, sl,0,gia));
				
				((QuanLySach) this.view).txtId.setText("");
				((QuanLySach) this.view).txtTenSach.setText("");
				((QuanLySach) this.view).txtTacGia.setText("");
				((QuanLySach) this.view).txtTheLoai.setText("");
				((QuanLySach) this.view).txtNXB.setText("");
				((QuanLySach) this.view).txtSL.setText("");
				((QuanLySach) this.view).txtGia.setText("");
				((Observable) model).notifyChanged();
				JOptionPane.showMessageDialog(null, "Thêm sách thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "Xóa" :
				String idXoa = (String) ((QuanLySach) this.view).values.get(0);
				System.out.println(idXoa);
				model.xoa(idXoa);
				((QuanLySach) this.view).txtId.setText("");
				((QuanLySach) this.view).txtTenSach.setText("");
				((QuanLySach) this.view).txtTacGia.setText("");
				((QuanLySach) this.view).txtTheLoai.setText("");
				((QuanLySach) this.view).txtNXB.setText("");
				((QuanLySach) this.view).txtSL.setText("");
				((QuanLySach) this.view).txtGia.setText("");
				((Observable) model).notifyChanged();
				JOptionPane.showMessageDialog(null, "Xóa sách thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
				break;
			case "Lưu thay đổi" :
				
			default:
				break;
			}
		}
	    
	    public void initObservers() {
	    	ArrayList<Observer> observerView = new ArrayList<>();
	    	
	    	observerView.add((Observer) this.view);
	    	for(Observer view : observerView) {
	            ((Observable) model).add(view);
	        }
	    }

		
}
