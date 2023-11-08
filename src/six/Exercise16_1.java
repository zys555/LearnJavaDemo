package six;

public class Exercise16_1 {
    public static void main(String[] args){
           String a="ab";
             String b="a"+"b";
             System.out.println(a==b); // true
             String a1="ab";
             String b1="cd";
             String c="abcd";
             String d=a1+b1;
             System.out.println(c.equals(d)); // true
    }
}
