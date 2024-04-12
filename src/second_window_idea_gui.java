package Project.Student_database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class second_window_idea_gui extends JFrame {
    protected JFrame window_frame;

    private JRadioButton personRadioButton;
    private JRadioButton studentRadioButton;
    private JTextField Stu_id_textField1;
    private JTextField NAME_textField2;
    private JTextField road_textField3;
    private JTextField post_office_textField4;
    private JTextField zilla_textField5;
    private JButton ff_button1;
    private JButton before_button2;
    private JTextField index_textField6;
    private JButton after_button3;
    private JButton last_button4;
    private JButton addButton;
    private JButton updateButton;
    private JButton sortButton1;
    private JButton deleteButton;
    private JButton closeButton;
    private JPanel Main_Panel;


    public second_window_idea_gui() {
        window_frame = new JFrame();
        window_frame.setTitle("Data Manipulation Form");
        window_frame.setVisible(true);
        window_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window_frame.setSize(500, 500);
        window_frame.setContentPane(Main_Panel);


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new second_window_idea_gui();
    }
}
