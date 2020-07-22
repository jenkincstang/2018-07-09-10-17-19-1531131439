package practice11;

import java.util.List;

public class Teacher extends Person {

    private List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes){
        super(id,name,age);
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if(getClasses().size() == 0){
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
}

