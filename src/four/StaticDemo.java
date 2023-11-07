package four;

class PersonSD{
    String name;
    String city;
    int age;
    public PersonSD(String name, String city, int age){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String talk(){
        return "我是" + this.name + ". 今年：" + this.age + "来自" + this.city;
    }
}

public class StaticDemo {
    public static void main(String[] args){
        PersonSD p1 = new PersonSD("张三", "中国", 25);
        PersonSD p2 = new PersonSD("李三", "中国", 30);
        PersonSD p3 = new PersonSD("王五", "中国", 35);

        System.out.println(p1.talk());
        System.out.println(p2.talk());
        System.out.println(p3.talk());
    }
}
