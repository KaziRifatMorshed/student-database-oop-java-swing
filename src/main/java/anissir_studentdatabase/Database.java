package anissir_studentdatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Database implements Serializable {
    
    ArrayList<Person> arrayListDatabase = null;
//    protected String savefile_path_for_loading = null;

    public Database() {
        arrayListDatabase = new ArrayList<>();
    }
    
    public void add_to_Database(Person p) {
        arrayListDatabase.add(p);
    }
    
    public void remove_from_database(Person p) {
        arrayListDatabase.remove(p);
    }
    
    public void sort_database() {
        Collections.sort(arrayListDatabase);
    }
    
    public int get_index_of(Person p) {
        return arrayListDatabase.indexOf(p); // REMEMBER
    }
    
    public Person get_object(int i) {
        return arrayListDatabase.get(i);
    }
    
    public int total_count() {
        return arrayListDatabase.size();
    }
}
