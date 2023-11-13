package seven;

interface BookTF01{
    public String getTitle();
}

class MathBookTF implements BookTF01{
    public String getTitle(){
        return "数学图书类";
    }
}

class ComputerBook implements BookTF01{
    @Override
    public String getTitle(){
        return "计算机类图书";
    }
}

class FactoryTF{
    public static BookTF01 getInstance(String className){
        BookTF01 book = null;
        try{
            book = (BookTF01)Class.forName(className).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return book;
    }
}

// 使用反射机制的工厂模式
public class TestFactory01 {
    public static void main(String[] args)throws Exception{
        BookTF01 book = FactoryTF.getInstance("seven.ComputerBook");
        System.out.println(book.getTitle());
    }
}
