package four;

class StaticInnerClassTest{
    private int prop1 = 5;
    private static int prop2 = 9;
    void display(){
        StaticInnerClass in = new StaticInnerClass();
        in.display();
    }

    static class StaticInnerClass{
        private static int age;
        public void display(){
            System.out.println(prop2);
        }
    }
}

public class ObjectStaticDemo {
    public static void main(String[] args){
        StaticInnerClassTest sa = new StaticInnerClassTest();
        sa.display();
    }
}
