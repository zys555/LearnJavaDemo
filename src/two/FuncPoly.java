package two;

public class FuncPoly {
    void sum(int i){
        System.out.println("数字和为：" + i);
    }
    void sum(int i, int j ){
        System.out.println("数字和为：" + (i+j));
    }

    public static void main(String[] args){
        FuncPoly demo  = new FuncPoly();
        demo.sum(1);
        demo.sum(2,5);
    }
}
