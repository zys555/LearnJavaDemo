package four;

class PersonThis{
    private String name;
    private int age;
    public PersonThis(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String talk(){
        return "我是" + name +"今年"+age;
    }
}

public class ThisDemo {
    public static void main(String[] args){
        PersonThis p = new PersonThis("张三", 25);
        System.out.println(p.talk());
    }
}
