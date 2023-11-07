package four;

class InnerClassTest{
    int score = 95;
    void inst(){
        class Inner{
            void display(){
                System.out.println("成绩：score="+score);
            }
        }

        Inner in = new Inner();
        in.display();
    }
}

public class ObjectInnerClass {

    public static void main(String[] args){
        InnerClassTest outer = new InnerClassTest();
        outer.inst();
    }
}
