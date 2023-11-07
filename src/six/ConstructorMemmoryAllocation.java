package six;

public class ConstructorMemmoryAllocation {
    public static void main(String[] args){
        String strA = "Hello";
        String strB = new String("Hello").intern();
        String strC = "Hello";
        String strD = new String("Hello");
        System.out.println(strA == strB);
        System.out.println(strA == strC);
        System.out.println(strB == strC);
        System.out.println(strA == strD);
    }
}
