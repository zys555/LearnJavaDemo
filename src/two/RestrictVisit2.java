package two;

class Person2{
    private String name;
    private int age;
    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
    void setVar(String name, int age){
        this.name = name;
        this.age = age;
    }
    void print(){
        System.out.println("I am" + name + "I am" + age + "years old");
    }
}

class Student2 extends Person2{
    Student2(String name, int age){
        super(name, age);
    }
//    void Test(){
//        System.out.println("I am" + name);
//    }
}


public class RestrictVisit2 {
    public static void main(String [] args){
        Student2 s = new Student2("漳卅", 60);
        s.print();
        s.setVar("tom", 120);
        s.print();
    }
}
