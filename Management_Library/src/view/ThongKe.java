package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ThongKe extends JPanel{
	private JLabel labelSoLuongSachTheoTheLoai;
    private JLabel labelSoLuongSachMuonTheoDocGia;
    private JLabel labelSoLuongSachTonKho;
    
    public ThongKe() {
//    	 setTitle("Thống kê quản lý thư viện");
         setSize(400, 300);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLocationRelativeTo(null);
         
         labelSoLuongSachTheoTheLoai = new JLabel("Số lượng sách theo thể loại:");
         labelSoLuongSachMuonTheoDocGia = new JLabel("Số lượng sách mượn theo độc giả:");
         labelSoLuongSachTonKho = new JLabel("Số lượng sách tồn kho:");
       
         
         setLayout(new GridLayout(4, 1));
         
         add(labelSoLuongSachTheoTheLoai);
         add(labelSoLuongSachMuonTheoDocGia);
         add(labelSoLuongSachTonKho);
        
         
         
    }
    private void thongKeSoLuongSachTheoTheLoai() {
        
    }
    private void thongKeSoLuongSachMuonTheoDocGia() {
        
    }
    private void thongKeSoLuongSachTonKho() {
        
    }
//    public static void main(String[] args) {
//    	 SwingUtilities.invokeLater(new Runnable() {
//             @Override
//             public void run() {
//                 ThongKe thongKeGUI = new ThongKe();
//                 thongKeGUI.setVisible(true);
//             }
//         });
//	}
    
}
