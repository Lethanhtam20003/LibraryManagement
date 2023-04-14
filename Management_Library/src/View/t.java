package View;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class t extends JFrame implements ActionListener {

    private CardLayout cardLayout;
    private JPanel cardPanel;
    private JButton firstButton;
    private JButton secondButton;
    private JButton thirdButton;

    public t() {
        setTitle("CardLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel with CardLayout
        cardPanel = new JPanel();
        cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        // Add three JPanels to the cardPanel
        JPanel firstPanel = new JPanel();
        firstPanel.setBackground(Color.BLUE);
        JLabel firstLabel = new JLabel("This is the first panel");
        firstPanel.add(firstLabel);
        cardPanel.add(firstPanel, "first");

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.GREEN);
        JLabel secondLabel = new JLabel("This is the second panel");
        secondPanel.add(secondLabel);
        cardPanel.add(secondPanel, "second");

        JPanel thirdPanel = new JPanel();
        thirdPanel.setBackground(Color.YELLOW);
        JLabel thirdLabel = new JLabel("This is the third panel");
        thirdPanel.add(thirdLabel);
        cardPanel.add(thirdPanel, "third");

        // Create buttons to switch between panels
        firstButton = new JButton("First");
        firstButton.addActionListener(this);
        secondButton = new JButton("Second");
        secondButton.addActionListener(this);
        thirdButton = new JButton("Third");
        thirdButton.addActionListener(this);

        // Add buttons and cardPanel to the frame
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(firstButton);
        buttonPanel.add(secondButton);
        buttonPanel.add(thirdButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(cardPanel, BorderLayout.CENTER);

        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == firstButton) {
            cardLayout.show(cardPanel, "first");
        } else if (e.getSource() == secondButton) {
            cardLayout.show(cardPanel, "second");
        } else if (e.getSource() == thirdButton) {
            cardLayout.show(cardPanel, "third");
        }
    }

    public static void main(String[] args) {
        t example = new t();
    }
}
