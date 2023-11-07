package test;

public class ShortCircuitLogical6_5 {
    public static void  main(String args[]){
        int i = 5;
        boolean flag = (i < 3) &&(i<4);
        System.out.println(flag);
        flag = ( i> 4 ) || (i> 3 );
        System.out.println(flag);

    }
}
