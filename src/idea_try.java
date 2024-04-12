package Project.Student_database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class idea_try {
    private JRadioButton personRadioButton;
    private JRadioButton studentRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton button1;
    private JButton button2;
    private JTextField textField6;
    private JButton button3;
    private JButton button4;
    private JButton addButton;
    private JButton updateButton;
    private JButton sortButton1;
    private JButton deleteButton;
    private JButton closeButton;

    public idea_try() {
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
