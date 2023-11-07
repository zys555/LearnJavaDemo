package four;

class PersonTSD{
    public PersonTSD(){
        System.out.println("1.public Person()");
    }
    static {
        System.out.println("2.Person类的静态代码块被调用");
    }
}


public class TestStaticDemo {

    static {
        System.out.println("3.testStaticDemo 类的静态代码块被调用");
    }

    public static void main(String[] args){
        System.out.println("4.程序开始执行");
        new PersonTSD();
        new PersonTSD();

    }
}
