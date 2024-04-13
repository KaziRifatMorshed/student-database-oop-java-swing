package anissir_studentdatabase;

import java.io.Serializable;

public class Person implements Serializable{
    protected String name;
    protected Address address;

    public Person(String s1, Address ad) {
        name = s1;
        address = ad;
    }

    public String getName() {
        return name;
    }

    public Address getAdd() {
        return address;
    }
    
    // public int getStu_id(){};

    @Override
    public String toString() {
        return "name=" + name + "\n" + address;
//        return STR."name=\{name}\n\{address}";
    }
}
