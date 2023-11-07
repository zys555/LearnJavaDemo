package test;

public class TestCat {
    public static void main(String[] args){
        MyCat aCat = new MyCat();
        aCat.weight = 10.0f;
        float temp = aCat.weight;
        System.out.println("this weight of a cat is:" + temp);
    }
}

class MyCat{
    public float weight;
    MyCat(){}
}