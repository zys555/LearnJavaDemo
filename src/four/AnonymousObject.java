package four;

class PersonAO{
    private String name = "张三";
    private int age = 25;
    public String talk(){
        return "我是"+name +"今年"+age;
    }

}

public class AnonymousObject {
    public static void main(String[] args){
        System.out.println(new PersonAO().talk());
    }
}
