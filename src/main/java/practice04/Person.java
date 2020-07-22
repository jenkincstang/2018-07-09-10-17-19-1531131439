package practice04;

public class Person {
    protected String name;
    protected int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return  basicIntroduce();
    }

    public String basicIntroduce(){
        return  "My name is " + name + ". I am " + age + " years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
