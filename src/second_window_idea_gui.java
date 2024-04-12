package Project.Student_database;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class second_window_idea_gui extends JFrame implements ActionListener {
    protected JFrame window_frame;
    protected String form_name, form_road, form_post_office, form_zilla;
    protected int form_id = 0;
    protected boolean is_student = true;

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

    protected Database database;

    public second_window_idea_gui() {
        window_frame = new JFrame();
        window_frame.setTitle("Data Manipulation Form");
        window_frame.setVisible(true);
        window_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window_frame.setSize(500, 500);
        window_frame.setContentPane(Main_Panel);

        database = new Database();

        ButtonGroup personStuButton = new ButtonGroup();
        personStuButton.add(personRadioButton);
        personStuButton.add(studentRadioButton);
        studentRadioButton.setSelected(true); // Probably, making issues


        // addActionListener block
        personRadioButton.addActionListener(this);
        studentRadioButton.addActionListener(this);
//        personRadioButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Person Button got selected");
//                Stu_id_textField1.setVisible(false);
//                is_student = false;
//            }
//        });
//
//        studentRadioButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                System.out.println("Student Button got selected");
//                Stu_id_textField1.setVisible(true);
//                is_student = true;
//            }
//        });

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });


        // CONSTRUCTOR END
    }

    public static void main(String[] args) {
        new second_window_idea_gui();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        form_name = NAME_textField2.getText();
        form_road = road_textField3.getText();
        form_post_office = post_office_textField4.getText();
        form_zilla = zilla_textField5.getText();
        Address new_address_entry = new Address(form_road, form_post_office, form_zilla);


        // Radio Button
        if (actionEvent.getSource() == personRadioButton) {
            System.out.println("Person Button got selected");
            Stu_id_textField1.setVisible(false);
            is_student = false;
        } else {
            System.out.println("Student Button got selected");
            Stu_id_textField1.setVisible(true);
            is_student = true;
        }


        // Add Button
        if (actionEvent.getSource() == addButton) {

            String temp = "0";
            temp = Stu_id_textField1.getText();
            form_id = Integer.parseInt(temp);

            Person new_entry = null;

            if (is_student) {
                new_entry = new Student(form_id, form_name, new_address_entry);
                database.add_to_Database(new_entry);
            } else {
                new_entry = new Person(form_name, new_address_entry);
                database.add_to_Database(new_entry);
            }
//            System.out.println(new_entry);
        }


        // Delete Button
        if (actionEvent.getSource() == deleteButton) {

            String temp = "0";
            temp = Stu_id_textField1.getText();
            form_id = Integer.parseInt(temp);

            Person new_entry = null;

            if (is_student) {
                new_entry = new Student(form_id, form_name, new_address_entry);
                database.remove_from_database(new_entry);
            } else {
                new_entry = new Person(form_name, new_address_entry);
                database.remove_from_database(new_entry);
            }
//            System.out.println(new_entry);
        }


    }
}
