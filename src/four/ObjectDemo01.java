package four;

class Person extends Object{
    String name;
    int age = 25;
}

public class ObjectDemo01 {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println(p);
        System.out.println(p.toString());
    }
}
