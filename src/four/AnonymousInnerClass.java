package four;


abstract class Bird{
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public abstract int fly();
}

public class AnonymousInnerClass {
    public void test(Bird bird){
        System.out.println(bird.getName() + "最高能飞"+bird.fly() + "米");
    }

    public static void main(String[] args){
        AnonymousInnerClass test = new AnonymousInnerClass();
        test.test(new Bird() {
            @Override
            public int fly() {
                return 1000;
            }

            public String getName(){
                return "小鸟";
            }
        });

    }
}
