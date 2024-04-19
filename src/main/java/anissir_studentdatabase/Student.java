package anissir_studentdatabase;

import java.io.Serializable;

public class Student extends Person implements Serializable{
    protected int Id;
    
    public Student(int i, String n, Address ad) {
        super(n,ad);
        this.Id=i;
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
