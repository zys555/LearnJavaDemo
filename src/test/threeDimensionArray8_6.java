package test;

import javax.print.DocFlavor;

public class threeDimensionArray8_6 {
    public static void main(String args[]){
        int sum = 0;
        int [][][]num = {
                {
                        {5,6},{7,8}
                },
                {
                        {5,7},{4,8}
                }
        };
        for(int i =0; i< num.length; ++i){
            for (int j = 0; j<num[i].length; ++j){
                for(int k = 0; k < num[i][j].length; ++k){
                    System.out.println(num[i][j][k]);
                    sum += num[i][j][k];
                }
            }
        }
        System.out.println(sum);
    }
}
