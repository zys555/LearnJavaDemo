package test;

public class ShortCircuitLogical6_5_2 {
    public static void main(String args[]){
        if(1==2&&1/0==0){
            System.out.println("1:条件满足！");
        }
//        if(1==2& 1/0==0){
//            System.out.println("2:条件满足！");
//        }
//        if (1==1||1//0==0) {
//        }
    }
}
