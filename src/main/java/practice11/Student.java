package practice11;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass){
        super(id, name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if(getKlass() != null && getKlass().getLeader().getId() == getId()){
            return super.introduce() + " I am a Student. I am Leader of " + getKlass().getDisplayName() + ".";
        }else{
            return super.introduce() + " I am a Student. I am at " + getKlass().getDisplayName() + ".";
        }
    }
}
