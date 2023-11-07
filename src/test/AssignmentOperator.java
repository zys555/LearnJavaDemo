package test;

public class AssignmentOperator {

    public static void main( String args[] ){
        int num = 22;
        System.out.println("第一次赋值后，num="+ num);
        num= ~num;

        System.out.println("改变之后的值， num="+num);
        method(5);

    }
    private static void method(int k){
        k++;
        for (int o = 0; o < 10; o++){
            System.out.println("mmm" + k+o);
        }

    }
}
