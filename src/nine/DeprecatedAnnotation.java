package nine;

public class DeprecatedAnnotation {
    public static void main(String[] args){
        Info info = new Info();
        System.out.println(info.getInfo());
    }

}

class Info{
    @Deprecated
    public String getInfo(){
        return "Hello World";
    }
}