package example;

class Person{
    String name;
    String addr;
    String sex;
    int age;
    public String talk(){
        return "我的名字叫做" + name + "我家住 " + addr + "我是" + sex + "孩" + "我今年" + age+"岁";
    }
}

class Student extends Person{
    float Math;
    float English;

    public Student(String name, String addr, String sex, int age, float Math, float English){

    }
}

public class School {
}
