package Sprint3.SwingDemoPP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerPPDemo implements ActionListener {

    JLabel label;

    public ListenerPPDemo(JLabel myLabel){
        label=myLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("IN ListenerPPDemo");
        label.setText("IN ListenerPPDemo");
    }
}
