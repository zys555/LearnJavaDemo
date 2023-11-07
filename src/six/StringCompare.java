package six;

public class StringCompare {
    public static void main(String[] args){
        String str1 = "This is a string";
        String str2 = new String("this is a string");
        int result = str1.compareTo("That is another string");
        int result1 = str1.compareTo("This is a string");
        int result2 = str1.compareTo(str2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
