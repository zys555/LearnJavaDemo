package test;

class PersonO{
    String name;
    int age;
    public PersonO(String name, int age){
        this.name=name;
        this.age = age;
    }
    public String talk(){
        return "我是" + name + "今年" + age;
    }
}

public class ObjectArray {
    public static void main(String args[]){
        PersonO p[] = {
                new PersonO("张三", 25),
                new PersonO("何嘉敏三", 15),
                new PersonO("王硕", 22),
        };
        for(int i = 0; i < p.length; ++i){
            System.out.println(p[i].talk());
        }
    }
}
