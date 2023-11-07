package test;

public class ObjectDemo {
    public static void main(String args[]){
        Person p1 = new Person();
        p1.age = 23;
        p1.name = "张大甩";
        System.out.println(p1.name);
        System.out.println(p1.age);
        p1.talk();
    }
}

class Person{
    String name;
    int age;
    void talk(){
        System.out.println("我是" + name + "今年" + age + "岁");
    }
}
