package anissir_studentdatabase;

import java.io.Serializable;

public class Student extends Person implements Serializable{
    protected int Id;
    
    public Student(int i, String n, Address ad) {
        super(n,ad);
        this.Id=i;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public void setAd(Address ad) {
        this.ad = ad;
    }
    
    public int getId(){
        return Id;
    }
    @Override
    public String toString(){
        String result="Id="+Id+"\n";
       result+=super.toString(); 
       return result;
    }
}
