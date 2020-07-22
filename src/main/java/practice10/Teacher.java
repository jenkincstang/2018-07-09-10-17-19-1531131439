package practice10;

import java.util.List;

public class Teacher extends Person {

    private List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes){
        super(id,name,age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age){
        super(id,name,age);
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if(getClasses() != null && getClasses().size() == 0){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else {
            return super.introduce() + " I am a Teacher. I teach " + getClasses().toString() + ".";
        }

    }

    public boolean isTeaching(Student student){
        for (Klass klass:getClasses()) {
            if(klass.isIn(student)){
                return true;
            }
        }
        return false;
    }

    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}
