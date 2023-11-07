package four;

class PersonHas{
    int id;
    String name;
    public PersonHas(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int hashCode(){
        return id*(name.hashCode());
    }
    public boolean equals(Object o){
        PersonHas p = (PersonHas) o;
        return (this.id == p.id)&&(this.name.equals(p.name));
    }
}

public class ObjectHashCode {
    public static void main(String[] args){
        PersonHas p1 = new PersonHas(1, "小白");
        PersonHas p2 = new PersonHas(1, "小白");
        PersonHas p3 = new PersonHas(3, "小菲");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
