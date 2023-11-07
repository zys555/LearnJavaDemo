package test;

public class arrayMaxMin8_4 {
    public static void main(String args[]){
        int []a = {74,56,88,96};
        int max = a[0];
        int min = a[0];
        System.out.println("数组a的元素包括：");
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]+"");
            if(a[i] > max){
                max = a[i];
            }else if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("数组的最大元素是" + max);
        System.out.println("数组的最小元素是" + min);
    }
}
