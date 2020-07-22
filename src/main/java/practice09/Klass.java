package practice09;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    private int number;
    private Person leader;
    private List<Student> students = new LinkedList<>();

    public Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Person getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student){
        if (students.contains(student)){
            this.leader = student;
        }else {
            System.out.println("It is not one of us.");
        }

    }

    public void appendMember(Student student){
        students.add(student);
    }
}
