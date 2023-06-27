package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import controller.QLSachController;
import model.QLSach;

public class MyPanel extends JPanel{
	 JPanel quanLySach, mainGui, thongKe;
	 CardLayout cardLayout;
	 QLSachController controller;
	 public MyPanel() {
		 cardLayout = new CardLayout();
		 mainGui = new JPanel(cardLayout);
		 setLayout(new BorderLayout());
		 
		 quanLySach = new QuanLySach();
		 controller = new QLSachController(new QLSach(), (QuanLySach) quanLySach);
		 thongKe = new ThongKe();
		 mainGui.add(quanLySach, "Quản lý sách");
		 mainGui.add("Quản lý thống kê", thongKe);
		 add(mainGui, BorderLayout.CENTER);
		controller.getSach();
		 }
	 public void change(String actionCommand) {
		 cardLayout.show(mainGui, actionCommand);
		 
		 if(actionCommand.equals("Quản lý sách")) {
			     controller.getSach();			   
		 }
	 }
}
