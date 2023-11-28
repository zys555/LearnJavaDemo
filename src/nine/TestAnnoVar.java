package nine;

@interface AnnotationVar{
    public String key();
    public String value();
}


public class TestAnnoVar {
    @AnnotationVar(key = "var1", value = "test")
    public static void main(String[] args){
        System.out.println("hello world");
    }
}
