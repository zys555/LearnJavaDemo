package threee;

interface Fruit{
    public void eat();
}

class Apple implements Fruit{
    public void eat(){
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit{
    public void eat(){
        System.out.println("吃橘子");
    }
}

public class SimpleFactory {
    public static void main(String args[]){
        Fruit f = new Apple();
        f.eat();
    }
}
