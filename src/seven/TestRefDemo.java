package seven;

class Person{
    String name;
    int age;
}

public class TestRefDemo {
    public static void main(String[] args){
        Person p1 = null;
        Person p2 = null;
        p1 = new Person();
        p1.age = 20;
        p1.name = "Kimi";
        p2 = p1;
        System.out.println("姓名：" + p2.name);
        System.out.println("年龄：" + p2.age);

        p1= null;
    }
}
