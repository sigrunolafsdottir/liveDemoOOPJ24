package Sprint3.SwingDemoPP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxDemo extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JCheckBox red = new JCheckBox("rött");
    JCheckBox blue = new JCheckBox("blått");
    JCheckBox yellow = new JCheckBox("gul");
    JLabel text = new JLabel(" ");

    public CheckboxDemo() {

        add(panel);
        panel.setLayout(new GridLayout(4,1));
        panel.add(red);
        panel.add(blue);
        panel.add(yellow);
        panel.add(text);
        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        text.setOpaque(true);

        setTitle("CheckboxDemo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        CheckboxDemo checkboxDemo = new CheckboxDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (red.isSelected() && !blue.isSelected() && !yellow.isSelected()) {
            text.setText("röd");
            text.setBackground(Color.RED);
        }
        else if (!red.isSelected() && blue.isSelected() && !yellow.isSelected()) {
            text.setText("blå");
            text.setBackground(Color.BLUE);
        }
        else if (!red.isSelected() && !blue.isSelected() && yellow.isSelected()) {
            text.setText("gul");
            text.setBackground(Color.YELLOW);
        }

        else if (red.isSelected() && blue.isSelected() && !yellow.isSelected()) {
            text.setText("lila");
            text.setBackground(Color.MAGENTA);
        }
        else if (!red.isSelected() && blue.isSelected() && yellow.isSelected()) {
            text.setText("grön");
            text.setBackground(Color.GREEN);
        }
        else if (red.isSelected() && !blue.isSelected() && yellow.isSelected()) {
            text.setText("orange");
            text.setBackground(Color.ORANGE);
        }
        else if (!red.isSelected() && !blue.isSelected() && !yellow.isSelected()) {
            text.setText("ingen vald");
            text.setBackground(Color.LIGHT_GRAY);
        }
        else {
            text.setText("brun");
            text.setBackground(Color.BLACK);
        }
    }
}
