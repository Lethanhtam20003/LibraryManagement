import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class da extends JFrame {
	public da() {
		
		
		JDialog d = new JDialog(this,"",false);
		d.setLayout(new FlowLayout());
		d.add(new AddProduct());
		
		JButton b = new JButton("OK");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setVisible(true);
			}
		});
		d.add(b);
		d.setSize(800, 800);
		d.setVisible(false);
		
		JPanel p = new JPanel();
		p.add(b);
		this.getContentPane().add(p);
		this.setVisible(true);
		this.setSize(new Dimension(500,500));
		
	}
	public static void main(String[] args) {
		new da();
	}
}
