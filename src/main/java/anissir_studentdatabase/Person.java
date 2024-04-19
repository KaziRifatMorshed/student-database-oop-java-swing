package anissir_studentdatabase;

import java.io.Serializable;

public class Person implements Serializable, Comparable<Person> {

    protected String name;
    protected Address ad;

    public Person(String a, Address ad) {
        this.name = a;
        this.ad = ad;
    }
    
    public String getName(){
        return name;
    }
    
    public Address getad(){
        return ad;
    }

    @Override
    public String toString() {
        String result = "name=" + name + "\n";
        result += ad;
        return result;
    }
    
    @Override
    public int compareTo(Person o){
        return this.name.compareTo(o.name);
//        throw new UnsupportedOperationException("Not supported yet");
    }
}

