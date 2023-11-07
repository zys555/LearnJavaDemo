package test;

public class breakDemo7_9 {
    public static void main(String args[]){
        for (int i = 0; i<2; i++){
            System.out.println("最外层循环"+i);
            loop:
            for (int j = 0; j < 2;j++){
                System.out.println("中间层循环"+j);
                for(int k = 0; k<2; k++){
                    System.out.println("最内层循环"+k);
                    break loop;
                }
            }
        }
    }
}
