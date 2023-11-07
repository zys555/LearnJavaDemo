package four;

class Person2{
    private String name;
    private int age;
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

}

public class ObjectDemo03 {
    public static void main(String[] args){
        Person2 p1 = new Person2("漳卅", 26);
        Person2 p2 = new Person2("桌卅", 22);

        System.out.println(p1.equals(p2) ? "是同一个人" : "不是同一个人");
    }
}
