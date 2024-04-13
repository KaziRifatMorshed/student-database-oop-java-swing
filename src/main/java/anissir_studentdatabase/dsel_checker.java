package anissir_studentdatabase;

import java.io.*;
// import javax.swing.*; // Unused import

public class dsel_checker {

    protected static Database database = new Database(); // Made database static
    protected static String savefile_path = "./savefile/test.ser";

    public static void main(String[] args) {
        try (FileInputStream file2 = new FileInputStream(savefile_path);
             ObjectInputStream ois = new ObjectInputStream(file2)) {

            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Student) {
                        database.add_to_Database((Student) obj);
                    }
                    else if (obj instanceof Person) {
                        database.add_to_Database((Person) obj);
                    } 
                    
                    
                    else {
                        break; // Exit loop if not a Person object
                    }
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
            
            int size = database.total_count();
            System.out.println("Total count = " + size);
            
            for (int i = 0; i < size; i++) {
                System.out.println(database.get_object(i));
            }

            System.out.println("\nPrevious data loading DONE");
            // JOptionPane.showMessageDialog(null, "Previous data has been loaded from \"" + savefile_path + "\" Successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND, sadly");
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
