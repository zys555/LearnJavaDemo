package threee;

interface InterfaceF{
    public static final String INFO = "HELLO WORLD";
    public abstract void print();
}

interface InterfaceG{
    public abstract void get();
}

class X implements InterfaceF,InterfaceG{
    public void print() {
        System.out.println(INFO);
    }
    public void get(){
        System.out.println("你好");
    }
}

public class InterfaceDemo {
    public static void main(String[] args){
        X x = new X();
        InterfaceF F = x;
        InterfaceG G = x;
        F.print();
        G.get();
    }
}
