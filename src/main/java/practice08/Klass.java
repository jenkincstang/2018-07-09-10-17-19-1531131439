package practice08;

public class Klass {
    private int number;
    private Person leader;

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
        this.leader = student;
    }

    public void appendMember(Student student){

    }
}
