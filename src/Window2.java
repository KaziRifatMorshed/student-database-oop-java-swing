package Project.Student_database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window2 implements ActionListener {
    // this is the second window where we can manipulate data
    JFrame window2;


    public Window2() {
        window2 = new JFrame();
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window2.setSize(600, 600);
        window2.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
