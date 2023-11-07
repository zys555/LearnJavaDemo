package test;

public class TestConstruct {
    public static void main(String [] args){
        PersonC p = new PersonC(12);
        p.show("构造方法使用演示");
    }
}

class PersonC{
    public PersonC(int x){
        a=x;
        System.out.println("构造方法被调用");
        System.out.println("a=" + a);
    }
    public void show(String msg){
        System.out.println(msg);
    }
    private int a;
}
