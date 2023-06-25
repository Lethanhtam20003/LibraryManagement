package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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
			if(e.getActionCommand().equals("Thêm sách")) {
				String id = ((QuanLySach) this.view).txtId.getText();
				String tenSach =((QuanLySach) this.view).txtTenSach.getText();
				String tacGia =((QuanLySach) this.view).txtTacGia.getText();
				String theLoai = ((QuanLySach) this.view).txtTheLoai.getText();
				String nxb =((QuanLySach) this.view).txtNXB.getText();
				int sl =Integer.parseInt(((QuanLySach) this.view).txtSL.getText());
				double gia = Double.parseDouble(((QuanLySach) this.view).txtGia.getText());
				System.out.println(sl);
				model.them(new Sach(id,tenSach,tacGia,theLoai,nxb, sl,0,gia));
				((QuanLySach) this.view).txtId.setText("");
				((QuanLySach) this.view).txtTenSach.setText("");
				((QuanLySach) this.view).txtTacGia.setText("");
				((QuanLySach) this.view).txtTheLoai.setText("");
				((QuanLySach) this.view).txtNXB.setText("");
				((QuanLySach) this.view).txtSL.setText("");
				((QuanLySach) this.view).txtGia.setText("");
				((Observable) model).notifyChanged();
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
