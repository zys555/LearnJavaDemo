package two;

class A{
    public void print(){
        System.out.println("******--父类A：public void print(){}");
    }
}

class B extends A{
    public void print(){
        System.out.println("#####--子类B：public void print(){}");
    }
    public void getB(){
        System.out.println("####--子类B：public void getB(){} B类扩充方法");
    }
}

public class NewMethodTest {
    public static void main(String[] args){
        A a= new B();
        a.print();
    }
}
