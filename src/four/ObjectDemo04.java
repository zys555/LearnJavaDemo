package four;

class Person4{
    private String name;
    private int age;
    public Person4(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o){
        boolean temp = true;
        Person4 p1 = this;

        if(o instanceof Person4){
            Person4 p2 = (Person4) o;
            if(!(p1.name.equals(p2.name) && p1.age == p2.age)){
                temp = false;
            }
        }else {
            temp = false;
        }
        return temp;
    }
}

public class ObjectDemo04 {
    public static void main(String[] args){
        Person4 t_p1 = new Person4("张三", 25);
        Person4 t_p2 = new Person4("张三", 25);

        System.out.println(t_p1.equals(t_p2) ? "是同一个" : "不是同一个");
    }
}
