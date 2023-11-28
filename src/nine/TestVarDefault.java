package nine;

@interface VarDefault{
    public String key()default "var1";
    public String value()default "test";
}

public class TestVarDefault {
    @VarDefault()
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
