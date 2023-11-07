package two;

class Person4{
    public void fun1(){
        System.out.println("*****---fun1() 我来自父类person");
    }

    public void fun2(){
        System.out.println("*****fun()2我来自父类person");
    }
}

class Student4 extends Person4{
    public void fun1(){
        System.out.println("#####fun()1 我来自子类Student");
    }
    public void fun3(){
        System.out.println("######fun3我来自子类Student");
    }
}

public class Poly {
    public static void main(String[] args){
        Person4 p = new Student4();
        p.fun1();
        p.fun2();
    }
}
