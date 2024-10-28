package Sprint3.SwingDemoPP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEventPPDemo extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JTextField text1 = new JTextField(20);
    JLabel label1 = new JLabel("Label 1  xxxx");

    public SwingEventPPDemo() {

        add(panel);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(label1);
        panel.add(text1);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(new ListenerPPDemo(label1));
        text1.addActionListener(this);

        setTitle("SwingDemoPP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingEventPPDemo demo = new SwingEventPPDemo();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("i actionPerformed");
        if (e.getSource() == button1) {
            label1.setText("Button 1");
            button1.setText("CLicked");
        }
        else if (e.getSource() == button2) {
            label1.setText("Button 2");
            button2.setText("CLicked");
        }
        else if (e.getSource() == button3) {
            label1.setText("Button 3");
            button3.setText("CLicked");
        }
        else if (e.getSource() == text1) {
            if (text1.getText().equals("ok")) {
                label1.setText("you wrote ok");
            }
            else {
                label1.setText("textfield got text");
            }
            text1.setText("");
        }
    }
}
