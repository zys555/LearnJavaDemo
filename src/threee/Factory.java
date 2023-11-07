package threee;

interface FruitA{
    public void eat();
}

class AppleA implements FruitA{
    public void eat(){
        System.out.println("吃苹果");
    }
}

class OrangeA implements FruitA{
    public void eat(){
        System.out.println("吃橘子");
    }
}

class Factory1{
    public static FruitA getInstance(String className){
        if("apple".equals(className)){
            return new AppleA();
        }
        if("orange".equals(className)){
            return new OrangeA();
        }

        return null;
    }
}

public class Factory {
    public static void main(String args[]){
        FruitA f= Factory1.getInstance("orange");
        f.eat();
    }
}
