package controller;

import model.ThuVien;
import view.View;

public class Controller {
	protected View view;
	protected ThuVien model;

	public Controller(View view, ThuVien model) {
		this.view = view;
		this.model = model;
	}

}
