package View;

import javax.swing.*;
import java.awt.*;

public class d extends JFrame {
    public d() {
        super("BorderLayout Example");

        setLayout(new BorderLayout());

        JLabel label1 = new JLabel("Label 1");
        add(label1, BorderLayout.PAGE_START);

        JLabel label2 = new JLabel("Label 2");
        add(label2, BorderLayout.LINE_START);

        JLabel label3 = new JLabel("Label 3");
        add(label3, BorderLayout.CENTER);

        JLabel label4 = new JLabel("Label 4");
        add(label4, BorderLayout.LINE_END);

        JLabel label5 = new JLabel("Label 5");
        add(label5, BorderLayout.PAGE_END);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new d();
    }
}
