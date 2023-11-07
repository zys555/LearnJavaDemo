package four;

class PersonTCD{
    String name;
    int age;
    PersonTCD(String name, int age){
        this.name = name;
        this.age = age;
    }

    boolean compare(PersonTCD p){
        if(this.name.equals(p.name) && this.age == p.age){
            return true;
        }else {
            return false;
        }
    }
}

public class ThisCompareDemo {
    public static void main(String[] args){
        PersonTCD p1 = new PersonTCD("张三", 30);
        PersonTCD p2 = new PersonTCD("张三", 30);

        System.out.println(p1.compare(p2) ? "相等" : "不相等");
    }

}
