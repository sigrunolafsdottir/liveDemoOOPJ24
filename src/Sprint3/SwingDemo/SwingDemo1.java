package Sprint3.SwingDemo;

import javax.swing.*;
import java.awt.*;

public class SwingDemo1 extends JFrame{

    JPanel panel = new JPanel();
    JPanel westpanel = new JPanel();
    JLabel label1 = new JLabel("Text");
    JLabel label2 = new JLabel("qqqqq");
    JLabel label3 = new JLabel("wwwww");
    JButton button1 = new JButton("Klicka här1");
    JButton button2 = new JButton("Klicka här2");
    JButton button3 = new JButton("Klicka här3");

    public SwingDemo1() {

        //panel.setLayout(new FlowLayout());
        panel.setLayout(new BorderLayout());
        westpanel.setLayout(new GridLayout(2,1));
        add(panel);
        panel.add(westpanel, BorderLayout.WEST);
        westpanel.add(button1);
        westpanel.add(label2);
        panel.add(label3, BorderLayout.NORTH);
      //  panel.add(button1, BorderLayout.EAST);
        panel.add(button2, BorderLayout.EAST);
        panel.add(button3, BorderLayout.CENTER);

        setTitle("SwingDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setSize(200, 200);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingDemo1 demo = new SwingDemo1();
    }

}
