package six;

public class StringSplit {
    public static void main(String[] args){
        String str = "hello world hello java";
        String data[] = str.split(" ");
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        System.out.println("---------");
        String data1[] = str.split(" ",3);
        for (int i = 0; i < data1.length; i ++){
            System.out.println(data1[i]);
        }
    }
}
