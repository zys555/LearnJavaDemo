package four;

class PersonSM{
    String name;
    private static String city = "中国";
    int age;

    public PersonSM(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String talk(){
        return "我是" + this.name + ". 今年：" + this.age + "来自" + city;
    }

    public static void setCity(String c){
        city = c;
    }
}

public class StaticMethod {
    public static void main(String[] args){
        PersonSM p1 = new PersonSM("张三", 25);
        PersonSM p2 = new PersonSM("李四", 30);
        PersonSM p3 = new PersonSM("王五", 35);

        System.out.println("修改之前的信息："+ p1.talk());
        System.out.println("修改之前的信息："+ p2.talk());
        System.out.println("修改之前的信息："+ p3.talk());

        System.out.println("********修改之后的信息********");

        PersonSM.setCity("神国");

        System.out.println("修改之后的信息" + p1.talk());
        System.out.println("修改之后的信息" + p2.talk());
        System.out.println("修改之后的信息" + p3.talk());

    }
}
