package Sprint3.SwingDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo2 extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Text");
    JButton button1 = new JButton("Klicka här1");
    JButton button2 = new JButton("Klicka här2");
    JButton button3 = new JButton("Klicka här3");
    JTextField textField1 = new JTextField(10);

    public SwingDemo2() {
        panel.setLayout(new FlowLayout());

        add(panel);
        panel.add(label1);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(textField1);
        button1.addActionListener(this);
        button2.addActionListener(new EventDemo());
        button3.addActionListener(this);
        textField1.addActionListener(this);

        setTitle("SwingDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingDemo2 demo = new SwingDemo2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("Knapp 1 klickad på");
            button1.setEnabled(false);
        }
        else if (e.getSource() == button2) {
            System.out.println("Knapp 2 klickad på");
            button1.setEnabled(false);
        }
        else if (e.getSource() == textField1) {
            System.out.println("ActionEvent from TextField "+textField1.getText());
            textField1.setText("");
        }
        else  {
            System.out.println("Knapp 3 klickad på");
            button1.setEnabled(false);
        }
    }
}
