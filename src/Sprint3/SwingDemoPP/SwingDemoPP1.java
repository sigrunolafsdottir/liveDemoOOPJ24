package Sprint3.SwingDemoPP;

import javax.swing.*;
import java.awt.*;

public class SwingDemoPP1 extends JFrame {

    JPanel panel = new JPanel();
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JLabel label1 = new JLabel("Label 1");
    JLabel label2 = new JLabel("Label 2");
    JLabel label3 = new JLabel("Label 3");
    JPanel southPanel = new JPanel();

    public SwingDemoPP1() {
        //panel.setLayout(new FlowLayout());
        //panel.setLayout(new GridLayout(2,3));
        panel.setLayout(new BorderLayout());
        label3.setOpaque(true);
        label3.setForeground(Color.red);
        label3.setBackground(Color.blue);
        add(panel);
        panel.add(southPanel, BorderLayout.SOUTH);
        panel.add(label1, BorderLayout.WEST);
        panel.add(button1, BorderLayout.NORTH);
        panel.add(label2, BorderLayout.EAST);
        southPanel.add(button3);
        southPanel.add(label3);
        panel.add(button2, BorderLayout.CENTER);

        setTitle("SwingDemoPP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(100, 100);
        //pack();
        setLocationRelativeTo(null);
        //this.setLocation(100, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingDemoPP1 swd = new SwingDemoPP1();
    }

}
