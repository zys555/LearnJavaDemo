package four;

interface A{
    public String getInfo();
}

class B implements A{
    public String getInfo(){
        return "Hello world";
    }

}

public class ObjectInterface06 {
    public static void main(String[] args){
        A a = new B();
        Object obj = a;
        A x = (A)obj;
        System.out.println(x.getInfo());
    }
}
