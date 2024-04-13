package anissir_studentdatabase;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Second_Window extends javax.swing.JFrame {

    protected Database database = null;
    private boolean is_student = true;
    protected String text_form_name, text_form_road, text_form_post_office, text_form_zilla;
    protected int text_form_id = 0, total_count = 0, current_index = -1;
    private String savefile_path = "./savefile/test.ser";

    public Second_Window() {
        initComponents();
        database = new Database();

        deserilizer();
        // end of CONSTRUCTOR
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        form_post_office = new javax.swing.JTextField();
        form_district = new javax.swing.JTextField();
        form_road = new javax.swing.JTextField();
        form_name = new javax.swing.JTextField();
        form_id = new javax.swing.JTextField();
        person_radio_button = new javax.swing.JRadioButton();
        student_radio_button = new javax.swing.JRadioButton();
        item_first = new javax.swing.JButton();
        item_previous = new javax.swing.JButton();
        next_item = new javax.swing.JButton();
        last_item = new javax.swing.JButton();
        add_button = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        sort_button = new javax.swing.JButton();
        update_button = new javax.swing.JButton();
        close_button = new javax.swing.JButton();
        show_current_index = new javax.swing.JLabel();

        buttonGroup1.add(person_radio_button);
        buttonGroup1.add(student_radio_button);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Data Manupulation Form");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Person or Student :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Road:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("PostOffice:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("District:");

        form_post_office.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        form_post_office.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                form_post_officeActionPerformed(evt);
            }
        });

        form_district.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        form_road.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        form_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        form_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        person_radio_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        person_radio_button.setText("Person");
        person_radio_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_radio_buttonActionPerformed(evt);
            }
        });

        student_radio_button.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        student_radio_button.setText("Student");
        student_radio_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_radio_buttonActionPerformed(evt);
            }
        });

        item_first.setText("|<");
        item_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_firstActionPerformed(evt);
            }
        });

        item_previous.setText("<<");
        item_previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_previousActionPerformed(evt);
            }
        });

        next_item.setText(">>");
        next_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_itemActionPerformed(evt);
            }
        });

        last_item.setText(">|");
        last_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                last_itemActionPerformed(evt);
            }
        });

        add_button.setText("Add");
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        delete_button.setText("Delete");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
            }
        });

        sort_button.setText("Sort");

        update_button.setText("Update");
        update_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_buttonActionPerformed(evt);
            }
        });

        close_button.setText("Close");
        close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_buttonActionPerformed(evt);
            }
        });

        show_current_index.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        show_current_index.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6)))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(person_radio_button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(student_radio_button))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(form_id, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(form_name, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                                        .addComponent(form_road)
                                        .addComponent(form_post_office)
                                        .addComponent(form_district))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sort_button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item_first)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(item_previous)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(show_current_index, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(next_item)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(last_item))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(update_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(close_button)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(person_radio_button)
                    .addComponent(student_radio_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(form_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(form_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(form_road, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(form_post_office, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(form_district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(item_first)
                        .addComponent(item_previous)
                        .addComponent(next_item)
                        .addComponent(last_item))
                    .addComponent(show_current_index, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button)
                    .addComponent(delete_button)
                    .addComponent(sort_button)
                    .addComponent(update_button)
                    .addComponent(close_button))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void form_post_officeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_form_post_officeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_form_post_officeActionPerformed

    private void update_current_index_showing() {
        total_count = database.total_count();
        show_current_index.setText("[ " + (current_index + 1) + " / " + total_count + " ]");
    }


    private void close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_buttonActionPerformed
        System.out.println("Closing...");
        System.exit(0);
    }//GEN-LAST:event_close_buttonActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // ADD button 
        text_form_name = form_name.getText();
        text_form_road = form_road.getText();
        text_form_post_office = form_post_office.getText();
        text_form_zilla = form_district.getText();
        Address new_address_entry = new Address(text_form_road, text_form_post_office, text_form_zilla);

        String temp = form_id.getText();
        if (temp.isEmpty()) {
            temp = "0"; // this was done to avoid error
        }
        text_form_id = Integer.parseInt(temp);

        Person new_entry = null;

        if (is_student) {
            new_entry = new Student(text_form_id, text_form_name, new_address_entry);
            database.add_to_Database(new_entry);
        }
        if (!is_student) {
            new_entry = new Person(text_form_name, new_address_entry);
            database.add_to_Database(new_entry);
        }
        total_count = database.total_count();
        current_index++;

        System.out.println("ADDED:\n" + new_entry + "\n");
        JOptionPane.showMessageDialog(null, text_form_name + " has been Added!");


    }//GEN-LAST:event_add_buttonActionPerformed

    private void person_radio_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_radio_buttonActionPerformed
        is_student = false;
        form_id.setVisible(false);
        System.out.println("Person Button got selected");
        blank_text_box();
    }//GEN-LAST:event_person_radio_buttonActionPerformed


    private void student_radio_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_radio_buttonActionPerformed
        is_student = true;
        form_id.setVisible(true);
        System.out.println("Student Button got selected");
        blank_text_box();
        form_id.setVisible(true);
    }//GEN-LAST:event_student_radio_buttonActionPerformed

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_buttonActionPerformed
        // DELETE
        try {

            Person delete_entry = database.get_object(current_index);
            database.remove_from_database(delete_entry);

            total_count = database.total_count();

            System.out.println("REMOVED:\n" + delete_entry + "\n");
            JOptionPane.showMessageDialog(null, text_form_name + " Deleted!");
            blank_text_box();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("ENTRY NOT FOUNT");
            e.printStackTrace();

        }


    }//GEN-LAST:event_delete_buttonActionPerformed

    private void update_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_buttonActionPerformed
        try {
            serilizer();
            JOptionPane.showMessageDialog(null, "file has been saved to: " + savefile_path);
        } catch (Exception ex) {
            Logger.getLogger(Second_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_buttonActionPerformed

    private void item_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_firstActionPerformed
        total_count = database.total_count();
        current_index = 0;
        if (total_count > 0) {
            populate_text_box(database.get_object(0));
            System.err.println("first entry is showing in GUI window");
        } else {
            System.err.println("NO ENTRY");
            JOptionPane.showMessageDialog(null, "NO ENTRY");
        }
    }//GEN-LAST:event_item_firstActionPerformed

    private void last_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_last_itemActionPerformed
        total_count = database.total_count();

        if (total_count > 0) {
            current_index = total_count - 1;
            populate_text_box(database.get_object(current_index));
            System.err.println("last entry is showing in GUI window");
        } else {
            System.err.println("NO ENTRY");
            JOptionPane.showMessageDialog(null, "NO ENTRY");
        }
    }//GEN-LAST:event_last_itemActionPerformed

    private void item_previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_previousActionPerformed
        total_count = database.total_count();

        if (total_count > 0) {

            if (current_index >= 0 && current_index < total_count) {
                current_index--;
            }

            populate_text_box(database.get_object(current_index));
            System.err.println(current_index + "th entry is showing in GUI window");
        } else {
            System.err.println("NO ENTRY");
            JOptionPane.showMessageDialog(null, "NO ENTRY");
        }
    }//GEN-LAST:event_item_previousActionPerformed

    private void next_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_itemActionPerformed
        total_count = database.total_count();

        if (total_count > 0) {

            if (current_index >= 0 && current_index < total_count) {
                current_index++;
            }

            populate_text_box(database.get_object(current_index));
            System.err.println(current_index + "th entry is showing in GUI window");
        } else {
            System.err.println("NO ENTRY");
            JOptionPane.showMessageDialog(null, "NO ENTRY");
        }
    }//GEN-LAST:event_next_itemActionPerformed

    public void blank_text_box() {
        this.form_id.setText("");
        this.form_district.setText("");
        this.form_name.setText("");
        this.form_road.setText("");
        this.form_post_office.setText("");
    }

    public void populate_text_box(Person p) {

//        this.form_id.setText(Integer.toString(p.getStu_id()));// ???
        this.form_name.setText(p.getName());
        this.form_road.setText(p.getAdd().getRoad());
        this.form_post_office.setText(p.getAdd().getUpazilla());
        this.form_district.setText(p.getAdd().getZilla());

        if (p instanceof Student) {
            form_id.setVisible(true);
            Student temp = (Student) p;
            this.form_id.setText(Integer.toString(temp.getStu_id()));
        } else {
            form_id.setVisible(false);
        }
    }

    public void serilizer() throws Exception {
        total_count = database.total_count();
        try {
            FileOutputStream file1 = new FileOutputStream(savefile_path);
            ObjectOutputStream oos = new ObjectOutputStream(file1);

            for (int i = 0; i < total_count; i++) {
                oos.writeObject(database.get_object(i));
            }
            oos.close();
            file1.close();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception();
        }

    }

    public void deserilizer() {
        Person inputted_person = null;
        try {
            FileInputStream file2 = null;
            file2 = new FileInputStream(savefile_path);
            ObjectInputStream ois = new ObjectInputStream(file2);

            // while (ois.readObject() != null) { // ফার্স্ট অবজেক্ট কে এই লাইনের পড়ে নিচ্ছে
            while (true) { // ERROR HERE
                try {
                    inputted_person = (Person) ois.readObject();

                    if (inputted_person instanceof Student) {
                        inputted_person = (Student) ois.readObject();
                    }

                    database.add_to_Database(inputted_person);

                } catch (EOFException e) {
                    break;
                }
            } // YAHOO

            System.out.println("\n prev data loading DONE");
            JOptionPane.showMessageDialog(null, "Previous data has been loaded from \"" + savefile_path + "\" Successfully.");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Second_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Second_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Second_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Second_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton close_button;
    private javax.swing.JButton delete_button;
    private javax.swing.JTextField form_district;
    private javax.swing.JTextField form_id;
    private javax.swing.JTextField form_name;
    private javax.swing.JTextField form_post_office;
    private javax.swing.JTextField form_road;
    private javax.swing.JButton item_first;
    private javax.swing.JButton item_previous;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton last_item;
    private javax.swing.JButton next_item;
    private javax.swing.JRadioButton person_radio_button;
    private javax.swing.JLabel show_current_index;
    private javax.swing.JButton sort_button;
    private javax.swing.JRadioButton student_radio_button;
    private javax.swing.JButton update_button;
    // End of variables declaration//GEN-END:variables

}
