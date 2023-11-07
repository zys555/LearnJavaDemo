package two;

import java.lang.ref.SoftReference;

class Book{
    String info = "Hello world";
}

class ComputerBook extends Book{
    int info = 100;
    public void print(){
        System.out.println(info);
        System.out.println(super.info);
    }

}

public class OverrideData {
    public static void main(String[] args){
        ComputerBook cb = new ComputerBook();
        cb.print();
    }
}
