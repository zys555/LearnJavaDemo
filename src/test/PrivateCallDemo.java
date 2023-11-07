package test;

class PrivateDemo{
    PrivateDemo(){};
    public void print(){
        System.out.println("hello java");
    }

}

public class PrivateCallDemo {
    public static void main(String[] args){
        PrivateDemo demo = null;
        demo = new PrivateDemo();
        demo.print();
    }

}
