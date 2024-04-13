package anissir_studentdatabase;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Welcome_Window implements ActionListener {

    JFrame window1;
    JMenuBar menuBar1;
    JMenu file_menu, edit_menu, help_menu;
    JMenuItem load_item, save_item, exit_item, edit_item;

    public Welcome_Window() {

        window1 = new JFrame();
        window1.setSize(400, 400);
        window1.setVisible(true);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar1 = new JMenuBar();
        window1.setJMenuBar(menuBar1);
//        menuBar1.setVisible(true);
        window1.setLayout(new GridLayout());

        file_menu = new JMenu("File");
        edit_menu = new JMenu("Edit");
        help_menu = new JMenu("Help");
        menuBar1.add(file_menu);
        menuBar1.add(edit_menu);
        menuBar1.add(help_menu);

        load_item = new JMenuItem("Load");
        save_item = new JMenuItem("Save");
        exit_item = new JMenuItem("Exit");
//        file_menu.add(load_item);
//        file_menu.add(save_item);
        file_menu.add(exit_item);

        edit_item = new JMenuItem("Edit Data");
        edit_menu.add(edit_item);

        // Adding Action Listener to make these menu buttons work
        file_menu.addActionListener(this);
        edit_menu.addActionListener(this);
        help_menu.addActionListener(this);
        load_item.addActionListener(this);
        save_item.addActionListener(this);
        exit_item.addActionListener(this);
        edit_item.addActionListener(this);

        // new syntax
        file_menu.setMnemonic(KeyEvent.VK_F);
        edit_menu.setMnemonic(KeyEvent.VK_E);
        help_menu.setMnemonic(KeyEvent.VK_H);

        load_item.setMnemonic(KeyEvent.VK_L); //  l == load
        save_item.setMnemonic(KeyEvent.VK_S);
        exit_item.setMnemonic(KeyEvent.VK_X);
        edit_item.setMnemonic(KeyEvent.VK_E);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == exit_item) {
            System.out.println("Exiting");
            System.exit(0);
        }
        if (actionEvent.getSource() == edit_item) {

            new Second_Window().setVisible(true);

        }
        if (actionEvent.getSource() == load_item) {
            // empty now
        }
    }
}
