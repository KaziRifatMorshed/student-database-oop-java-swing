package Student_database;

import java.io.Serializable;
import java.util.ArrayList;

public class Database implements Serializable{
    ArrayList<Person> arrayListDatabase = null;

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
// !!!!!
    }

    public int get_index(Person p) {
        return arrayListDatabase.indexOf(p);
    }

    public int total_count() {
        return arrayListDatabase.size();
    }
}
