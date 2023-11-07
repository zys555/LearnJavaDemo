package test;

public class breakDemo7_8 {
    public static void main(String args[]){
        int i = 0;
        for(i = 1; i< 10; ++i){
            if(i%3 == 0)
                break;
                System.out.println("i="+i);

        }
        System.out.println("循环中断：" + i);
    }
}
