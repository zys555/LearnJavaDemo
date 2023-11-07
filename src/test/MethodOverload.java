package test;

public class MethodOverload {
    // 计算两个整数之和
    public int add(int a, int b){
        return a+b;
    }
    // 计算两个单精度浮点数之和
    public float add(float a, float b){
        return a+b;
    }
    // 计算三个整数之和
    public int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        int result;
        float result_f;
        MethodOverload test = new MethodOverload();
        //调用计算两个整数之和
        result = test.add(5,6 );
        System.out.println("计算两个整数之和"+ result);
        result_f = test.add(1.2f,2.6f);
        System.out.println("计算两个单精度浮点数之和"+ result_f);
        result = test.add(5,6,9);
        System.out.println("计算仨个整数之和"+ result);
    }

}
