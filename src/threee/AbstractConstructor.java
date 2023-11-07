package threee;

import java.util.SplittableRandom;

abstract class Person1{
    String name;
    int age;
    String occupation;
    public Person1(String name, int age, String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public abstract String talk();
}

class Student1 extends Person1{
    public Student1(String name, int age, String occupation){
        super(name, age, occupation);
    }
    public String talk(){
        return "学生 --》" + this.name + "年龄 "+ this.age + "职业" + this.occupation;
    }
}

public class AbstractConstructor {
    public static void main(String[] args){
        Student1 s = new Student1("李鹏飞", 15,"学生");
        System.out.println(s.talk());
    }
}
