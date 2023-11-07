package two;

class MyCat5{
    private float weight;
    private float height;
    public MyCat5(float height, float weight){
        SetHeight(height);
        SetWeight(weight);
    }

    private void SetWeight(float wt){
        if(wt > 0){
            weight = wt;
        }else {
            System.out.println("weight 设置非法 \n 采用默认值 10.0");
            weight = 10.0f;
        }
    }

    private void SetHeight(float ht){
        if(ht > 0){
            height = ht;
        }else {
            System.out.println("height 设置非法 \n 采用默认值 10.0");
            height = 20.0f;
        }
    }

    public float GetWeight(){
        return weight;
    }

    public float GetHeight(){
        return height;
    }

}

public class TestEncapsulation {

    public static void main(String[] args){
        MyCat5 aCat = new MyCat5(12, -5);
        float ht = aCat.GetHeight();
        float wt = aCat.GetWeight();
        System.out.println("this height is --->" + ht);
        System.out.println("this weight is --->" + wt);
    }

}
