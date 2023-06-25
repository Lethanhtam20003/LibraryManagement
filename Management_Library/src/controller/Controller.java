package controller;

import model.QuanLyThuVien;
import view.View;

public class Controller {
	protected View view;
	protected QuanLyThuVien model;

	public Controller(View view, QuanLyThuVien model) {
		this.view = view;
		this.model = model;
	}

}
