package demo.java.d;

// 单例设计模式

class SingletonTS{
    private static SingletonTS instance = new SingletonTS();
    private SingletonTS(){};
    public static SingletonTS getInstance(){
        return instance;
    }
    public void print(){
        System.out.println("Hello World");
    }
}
public class TestSingleton01 {
    public static void main(String[] args){
        SingletonTS instance = null;
        instance = SingletonTS.getInstance();
        instance.print();
    }
}
