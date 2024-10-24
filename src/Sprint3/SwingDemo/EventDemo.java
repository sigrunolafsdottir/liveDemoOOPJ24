package Sprint3.SwingDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("special event handling");
    }
}
