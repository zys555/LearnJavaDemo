package six;

public class StringByte {
    public static void main(String[] args){
        String str = "hellojava";
        byte data[] = str.getBytes();
        for(int x = 0; x < data.length; x++){
            data[x] -= 32;
        }
        System.out.println(new String(data));
        System.out.println(new String(data, 5,4));
    }
}
