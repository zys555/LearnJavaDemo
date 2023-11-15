package demo.java.d;

class Singleton{
    static Singleton instance = new Singleton();
    private Singleton(){}
    public void print(){
        System.out.println("Hello World");
    }
}

public class TestSingleton {
    public static void main(String[] args){
        Singleton instance = null;
        instance = Singleton.instance;
        instance.print();
    }
}
