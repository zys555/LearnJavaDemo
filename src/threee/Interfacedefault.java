package threee;

interface InterfaceA{
    public static String INFO ="static final";
    public void print();
    default public void otherprint(){
        System.out.println("print default1 methods InterfaceA!");
    }
}

class InterfaceAB implements InterfaceA{
    public void print(){
        System.out.println("print abstract methods InterfaceA");
        System.out.println(INFO);
    }
}

public class Interfacedefault {
    public static void main(String[] args){
        InterfaceAB in = new InterfaceAB();
        in.print();
        in.otherprint();
        System.out.println(InterfaceA.INFO);
    }
}
