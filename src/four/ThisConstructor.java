package four;

class PersonTC{
    String name;
    int age;
    public PersonTC(){
        System.out.println("1.public Person()");
    }

    public PersonTC(String name, int age){
        this();
        this.name = name;
        this.age = age;
        System.out.println("2.public Person(String name, int age)");
    }
}

public class ThisConstructor {
    public static void main(String[] args){
        new PersonTC("张三", 25);
    }
}
