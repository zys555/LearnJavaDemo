package seven;


// 普通工厂类
interface BookTF{
    public String getTitle();
}

class MathBook implements BookTF{
    @Override
    public String getTitle(){
        return "数学类图书";
    }
}

class Factory{
    public static BookTF getInstance(String className){
        if("mathbook".equals(className)){
            return new MathBook();
        }
        return null;
    }
}

public class TestFactory {
    public static void main(String[] args){
        BookTF book = Factory.getInstance("mathbook");
        System.out.println(book.getTitle());
    }
}
