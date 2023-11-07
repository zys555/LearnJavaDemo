package two;

public class TestCat4 {
    public static void main(String [] args){
        MyCat4 aCat = new MyCat4();
        aCat.SetWeight(-100f);
        float temp = aCat.GetWeight();
        System.out.println("ssdas=====>>>" + temp);
        aCat.MakeSound();
    }
}


class MyCat4{
    private float weight;
    public void SetWeight(float wt){
        if(wt > 0){
            weight = wt;
        }else {
            System.out.println("非法的 weight 将采用默认值 10.0");
            weight = -10.0f;
        }
    }
    public float GetWeight(){
        return weight;
    }

    public void MakeSound(){
        System.out.println("方法输出"+ weight);
    }
}