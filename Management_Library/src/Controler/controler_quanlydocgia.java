package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.view_QuanLyDocGia;

public class controler_quanlydocgia implements ActionListener{
	view_QuanLyDocGia view ;

	
	public controler_quanlydocgia(view_QuanLyDocGia view) {
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		if(src.equals("Find")) {
			this.view.tim_docGia();
		}else if(src.equals("Add")) {
			this.view.them_docGia();
		}else if(src.equals("Fix")) {
			this.view.xoa_docGia();
		}else if(src.equals("Delete")) {
			this.view.sua_docGia();
		}
	}
	
	
}
