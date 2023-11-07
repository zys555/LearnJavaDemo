package four;

class Outer{
    int score = 95;
    void inst(){
        Inner in = new Inner();
        in.display();
    }

    public class Inner{
        String name = "张三";
        void display(){
            System.out.println("成绩：score="+score);
        }

    }

}


public class ObjectInnerDemo {

    public static void main(String[] args){
        Outer o = new Outer();
        o.inst();
    }
}
