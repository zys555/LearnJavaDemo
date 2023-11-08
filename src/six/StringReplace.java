package six;

public class StringReplace {
    public static void main(String[] args){
        String str = "hellowrld";
        System.out.println(str.replaceAll("o", "***"));
        System.out.println(str.replaceFirst("l", "_"));
    }
}
