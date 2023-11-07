package four;

class PersonSD2{
    String name;
    static String city = "中国";
    int age;
    public PersonSD2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String talk(){
        return "我是" + this.name + ". 今年：" + this.age + "来自" + city;
    }
}

public class StaticDemo2 {
    public static void main(String[] args){
        PersonSD2 p1 = new PersonSD2("张三", 25);
        PersonSD2 p2 = new PersonSD2("李四", 30);
        PersonSD2 p3 = new PersonSD2("王五", 35);

        System.out.println("修改之前的信息" + p1.talk());
        System.out.println("修改之前的信息" + p2.talk());
        System.out.println("修改之前的信息" + p3.talk());

        PersonSD2.city = "美国";

        System.out.println("修改之后的信息" + p1.talk());
        System.out.println("修改之后的信息" + p2.talk());
        System.out.println("修改之后的信息" + p3.talk());

    }
}
