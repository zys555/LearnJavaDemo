package two;

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void speak(){
        System.out.println("我的名字叫做" + name +  "我" + age +"岁");
    }
}

class Student extends Person{

    String school;
    Student(String name, int age, String school){
        super(name, age);
        this.school = school;
    }

    void speak(){
        System.out.println("我的名字叫做" + name + "我今年" + age + "岁");
    }
    void study(){
        System.out.println("我在 " +school +"读书");
    }


}

public class LeadInherit {

    public static void main(String[] atgs){
        Person per =new Person("张三", 50);
        per.speak();
        Student stu = new Student("李晓敏", 18, "大连市第五中学");
        stu.speak();
        stu.study();
    }
}
