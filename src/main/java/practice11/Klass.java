package practice11;

import java.util.LinkedList;

public class Klass {
    private int number;
    private Person leader;
    private LinkedList<Student> students;

    public Klass(int number){
        this.number = number;
        students = new LinkedList<>();
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
        if (students != null && students.contains(student)){
            this.leader = student;
        }else {
            System.out.print("It is not one of us.\n");
        }

    }

    public boolean isIn(Student student){
        if(students.contains(student)){
            return true;
        }else {
            return false;
        }
    }

    public void appendMember(Student student){
        students.add(student);

    }
}


