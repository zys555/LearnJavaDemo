package two;

public class TestCat3 {
    public static void main(String[] args){
        MyCat aCat = new MyCat();
        aCat.SetWeight(102.0f);

        float temp = aCat.GetWeight();
        System.out.println("the weight of a cat is:"+ temp);
    }
}

class MyCat{
    private float weight;
    public void SetWeight(float wt){
       if(wt > 0){
           weight = wt;
       }else {
           System.out.println("weight 设置非法（应该 > 0）.\n 采用默认值");
           weight = 10.0f;
       }
    }
    public float GetWeight(){
        return weight;
    }
}
