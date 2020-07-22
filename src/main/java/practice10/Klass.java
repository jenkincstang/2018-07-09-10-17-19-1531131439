package practice10;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    private int number;
    private Person leader;
    private List<Student> students;

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

    public List<Student> getStudents() {
        return students;
    }

    public void assignLeader(Student student){
        if (students != null && students.contains(student)){
            this.leader = student;
        }else {
            System.out.print("It is not one of us.\n");
        }

    }

    public boolean isIn(Student student){
        if(students == null || students.size() == 0){
            return false;
        }

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

