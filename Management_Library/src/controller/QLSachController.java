package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import model.QLSach;
import model.Sach;
import view.QuanLySach;


public class QLSachController implements ActionListener{

	
	 private QLSach model;
	    private QuanLySach view;

	    public QLSachController(QLSach model, QuanLySach view) {
	        this.model = model;
	        this.view = view;
	    }

	    public void getSach() {
	        List<Sach> listSach = model.getListSach();
	        view.displaySach(listSach);
	    }
	   
	    @Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand()=="Thêm sách") {
				String id = view.txtId.getText();
				String tenSach =view.txtTenSach.getText();
				String tacGia =view.txtTacGia.getText();
				String theLoai = view.txtTheLoai.getText();
				String nxb =view.txtNXB.getText();
				int sl =Integer.parseInt(view.txtSL.getText());
				double gia = Double.parseDouble(view.txtGia.getText());
				System.out.println(sl);
				model.them(new Sach(id,tenSach,tacGia,theLoai,nxb, sl,0,gia));
				getSach();
				view.txtId.setText("");
				view.txtTenSach.setText("");
				view.txtTacGia.setText("");
				view.txtTheLoai.setText("");
				view.txtNXB.setText("");
				view.txtSL.setText("");
				view.txtGia.setText("");
			}
			
		}

		
}
