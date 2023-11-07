package four;

public class ObjectArray05 {
    public static void main(String[] args){
        int temp[] = {1,3,5,7,9};
        Object obj = temp;
        print(obj);
    }

    public static void print(Object o){
        if(o instanceof int []){
            int x[] = (int []) o;
            for(int i = 0;i<x.length; i++){
                System.out.println(x[i] + "\t");
            }
        }
    }
}
