package two;

import java.util.SplittableRandom;

class Person3{
    String name;
    int age;
    public String talk(){
        return "I am" + this.name + "I am "+ this.age + "years old";
    }
}

class Student3 extends Person3{
    String school;
    public Student3(String name, int age, String school){
        super.name = name;
        super.age = age;
        this.school = school;
    }
    public String talk(){
        return super.talk() + " \nI an from" + this.school;
    }
}

public class Override {
    public static void main(String[] args){
        Student3 s = new Student3("张三", 102, "北京大学");
        System.out.println(s.talk());
    }
}
