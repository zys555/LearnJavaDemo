package seven;

class BookTRD {
    String title;
    double price;
    public void printInfo() {
        System.out.println("title:"+this.title);
        System.out.println("price:"+this.price);
    }
}

public class TestRefDemo02 {
    public static void main(String args[]) {
        BookTRD bookA=new BookTRD();//实例化一个对象
        BookTRD bookB=new BookTRD();
        bookA.title="Java程序设计";//设置了类中的title属性
        bookA.price=40;//设置price属性
        System.out.println("引用传递前对象bookA：");
        bookA.printInfo();//对象bookA调用方法printInfo
        bookB.title="Java WEB开发";
        bookB.price=60;
        bookB=bookA;//引用传递
        bookB.title="Android开发";
        System.out.println("引用传递后对象bookA：");
        bookA.printInfo();//对象bookA调用方法printInfo
    }
}
