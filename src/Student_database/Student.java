package Student_database;

import java.io.Serializable;

public class Student extends Person implements Serializable{
    protected int stu_id;

    public Student(int id, String name, Address add) {
        super(name, add); // আগে সুপার কম করতে হবে
        stu_id = id;
    }

    public int getStu_id() {
        return stu_id;
    }

    @Override
    public String toString() {
        return "Id:" + stu_id + "\n" + super.toString();
//        return STR."Id:\{stu_id}\n\{super.toString()}";
    }
}
