package test;

class PersonT{
    String name;
    int age;
    void talk(){
        System.out.println("我是" + name + "今年" + age);
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
}

public class PersonTest {
    public static void main(String args[]){
        PersonT p1 = new PersonT();
        p1.setAge(20);
        p1.setName("张雨生");
        p1.talk();
    }
}
