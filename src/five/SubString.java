package five;

public class SubString {
    public static void main(String[] args){
        String str = "a1b22c333d4444edsss555855asd585as";
        String regx = "[0-9]+";
        System.out.println(str.replaceAll(regx,""));
    }
}
