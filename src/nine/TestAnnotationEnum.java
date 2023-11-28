package nine;

@interface AnnotationEnum{
    public Color color();
}

enum Color{
    RED,GREEN,BLUE
}

public class TestAnnotationEnum {
    @AnnotationEnum(color = Color.BLUE)
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}
